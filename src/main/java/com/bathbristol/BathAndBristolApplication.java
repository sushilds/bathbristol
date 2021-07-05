package com.bathbristol;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bathbristol.datamodel.JsonBean;
import com.bathbristol.service.FileUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class BathAndBristolApplication implements ApplicationRunner {

	@Autowired
	private FileUtil file;
	
	public static void main(String[] args) {
		SpringApplication.run(BathAndBristolApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JsonBean jsonBean = mapper.readValue(new String(Files.readAllBytes(Paths.get("src/main/resources/data.json"))),
				JsonBean.class);
		String writeValueAsString = mapper.writeValueAsString(jsonBean);
		System.out.println("Calling savejsontoDB initiated");
		file.saveJsonToDb(jsonBean);
		System.out.println("Saving json to DB completed successfully");
	}

}
