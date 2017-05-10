package com.allianz.devpracticces.empdb.domain.model.member;


import com.allianz.devpracticces.empdb.domain.model.EntityIdentifier;

public class EmployeeSkill {
	
	private String type; 
	private EntityIdentifier skillId;
	private int experienceInMonths;
	private boolean currentSkill;
	private boolean primaySkill;
	
	public EmployeeSkill(String type, EntityIdentifier skillId,
			int experienceInMonths, boolean currentSkill, boolean primaySkill) {
		super();
		this.type = type;
		this.skillId = skillId;
		this.experienceInMonths = experienceInMonths;
		this.currentSkill = currentSkill;
		this.primaySkill = primaySkill;
	}

	public String getType() {
		return type;
	}

	public EntityIdentifier getSkillId() {
		return skillId;
	}

	public int getExperienceInMonths() {
		return experienceInMonths;
	}

	public boolean isCurrentSkill() {
		return currentSkill;
	}

	public boolean isPrimaySkill() {
		return primaySkill;
	}

	
}
