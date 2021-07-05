package com.bathbristol.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bathbristol.datamodel.MainBean;

@Repository
public interface MainBeanRepository extends JpaRepository<MainBean, Integer>{

}
