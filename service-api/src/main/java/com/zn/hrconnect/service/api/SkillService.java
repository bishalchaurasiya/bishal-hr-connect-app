package com.zn.hrconnect.service.api;

import java.util.List;

import com.zn.hrconnect.domain.entity.SkillMaster;

import sample.multimodule.domain.entity.Account;

public interface SkillService {


    String test();
    public List<SkillMaster> getAllSkills();
}
