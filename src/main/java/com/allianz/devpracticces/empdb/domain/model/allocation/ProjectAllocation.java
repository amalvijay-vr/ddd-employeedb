package com.allianz.devpracticces.empdb.domain.model.allocation;

import java.util.Date;

public class ProjectAllocation {

	private String type;
	private int id;
	private Date startDate;
	private Date endDate;
	private float allocationPercentage;
	private Project project;
	
	public ProjectAllocation(String type, int id, Date startDate, Date endDate,
			float allocationPercentage, Project project) {
		super();
		this.type = type;
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.allocationPercentage = allocationPercentage;
		this.project = project;
	}

	public String getType() {
		return type;
	}

	
	public int getId() {
		return id;
	}

	
	public Date getStartDate() {
		return startDate;
	}

	
	public Date getEndDate() {
		return endDate;
	}

	
	public float getAllocationPercentage() {
		return allocationPercentage;
	}
	
	public Project getProject() {
		return project;
	}
			
}
