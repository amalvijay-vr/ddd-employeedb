package com.allianz.devpracticces.empdb.domain.model.member;

import java.util.List;

public class MemberSkillCollection {

	private List<EmployeeSkill> empSkillList;
	
    public MemberSkillCollection(List<EmployeeSkill> newSkillList) {
        this.empSkillList = newSkillList;
    }

    public List<EmployeeSkill> getMemberSkillList() {
        return empSkillList;
    }
	
}
