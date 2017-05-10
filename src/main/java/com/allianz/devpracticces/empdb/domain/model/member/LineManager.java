package com.allianz.devpracticces.empdb.domain.model.member;

public class LineManager {
	
	private String type;
	private String lineManagerId;
	private String lineManagerName;
	
	public LineManager(String type, String lineManagerId, String lineManagerName) {
		super();
		this.type = type;
		this.lineManagerId = lineManagerId;
		this.lineManagerName = lineManagerName;
	}

	public String getType() {
		return type;
	}

	public String getLineManagerId() {
		return lineManagerId;
	}

	public String getLineManagerName() {
		return lineManagerName;
	}
	
}
