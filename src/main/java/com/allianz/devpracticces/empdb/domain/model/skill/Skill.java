package com.allianz.devpracticces.empdb.domain.model.skill;


import com.allianz.devpracticces.empdb.domain.model.EntityIdentifier;

public class Skill {
	
	private String type;
	private EntityIdentifier skillId;
	private String skillName;
	public Skill(String type, EntityIdentifier skillId, String skillName) {
		super();
		this.type = type;
		this.skillId = skillId;
		this.skillName = skillName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public EntityIdentifier getSkillId() {
		return skillId;
	}
	public void setSkillId(EntityIdentifier skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
}
