package com.allianz.devpracticces.empdb.domain.model.member;


import com.allianz.devpracticces.empdb.domain.model.EntityIdentifier;
import java.util.List;


public class PracticeMember {
	private String type;
	private EntityIdentifier memberId;
	private String employeId;
	private String firstName;
	private String lastName;
	
	private LineManager lineManager;
	private EntityIdentifier practiceId;
	private List<EmployeeSkill> employeeSkills;	
	private MemberSkillCollection skillCollection;
	
	public PracticeMember(String type, EntityIdentifier memberId,
                          String employeId, String firstName, String lastName,
                          LineManager lineManager, EntityIdentifier practiceId,
                          List<EmployeeSkill> employeeSkills) {
		super();
		this.type = type;
		this.memberId = memberId;
		this.employeId = employeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lineManager = lineManager;
		this.practiceId = practiceId;
		this.employeeSkills = employeeSkills;
	}

	public String getType() {
		return type;
	}

	public EntityIdentifier getMemberId() {
		return memberId;
	}

	public String getEmployeId() {
		return employeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LineManager getLineManager() {
		return lineManager;
	}

	public EntityIdentifier getPracticeId() {
		return practiceId;
	}

	public List<EmployeeSkill> getEmployeeSkills() {
		return employeeSkills;
	}

	public MemberSkillCollection getSkillCollection() {
		return skillCollection;
	}

	public void addSkill(EmployeeSkill employeeSkill){
		this.getEmployeeSkills().add(employeeSkill);
	}
	
	public void assignPractice(EntityIdentifier practiceId) {
		this.practiceId = practiceId;
	}

	
	
}

