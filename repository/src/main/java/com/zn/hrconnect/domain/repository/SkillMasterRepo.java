package com.zn.hrconnect.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zn.hrconnect.domain.entity.SkillMaster;


import antlr.collections.List;


@Repository
public interface SkillMasterRepo extends JpaRepository<SkillMaster, Integer> {


	
}
