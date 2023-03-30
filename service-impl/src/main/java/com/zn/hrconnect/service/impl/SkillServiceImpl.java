package com.zn.hrconnect.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.zn.hrconnect.domain.entity.SkillMaster;
import com.zn.hrconnect.domain.repository.SkillMasterRepo;
import com.zn.hrconnect.service.api.SkillService;

//
@Service
@Configuration
@EnableJpaRepositories("com.zn.hrconnect.domain.repository,com.zn.hrconnect.domain.entity")
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillMasterRepo skillMasterRepo;

	public SkillServiceImpl() {
		System.out.println("---------------SkillServiceImpl()--------------------");
	}
	
	@Override
	public String test() {
		System.out.println("----------------- SkillServiceImpl-----------");
		return "SkillServiceImpl";
	}


	@Override
	public List<SkillMaster> getAllSkills() {
		List<SkillMaster> lisOfSkills = skillMasterRepo.findAll();

		if (lisOfSkills != null) {
			System.out.println("-------lisOfSkills------------" +lisOfSkills.size());
			return lisOfSkills;
		} else {
			System.out.println("-----null--lisOfSkills------------");
			return null;
		}
	}

}
