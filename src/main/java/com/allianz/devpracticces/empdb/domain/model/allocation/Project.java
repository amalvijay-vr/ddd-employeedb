package com.allianz.devpracticces.empdb.domain.model.allocation;

public class Project {
	
	private String type;
	private int planViewId;
	private String projectName;
	
	public Project(String type, int planViewId, String projectName) {
		super();
		this.type = type;
		this.planViewId = planViewId;
		this.projectName = projectName;
	}

	public String getType() {
		return type;
	}

	public int getPlanViewId() {
		return planViewId;
	}

	public String getProjectName() {
		return projectName;
	}

	
}
