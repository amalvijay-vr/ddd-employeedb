package com.allianz.devpracticces.empdb.domain.model.practice;


import com.allianz.devpracticces.empdb.domain.model.EntityIdentifier;

public class Practice {

	private String type;
	private EntityIdentifier practiceId;
	private String practiceName;
	private String practiceArea;
	private String practiceDescription;
	
	public Practice(String type, EntityIdentifier practiceId,
                    String practiceName, String practiceArea, String practiceDescription) {
		super();
		this.type = type;
		this.practiceId = practiceId;
		this.practiceName = practiceName;
		this.practiceArea = practiceArea;
		this.practiceDescription = practiceDescription;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EntityIdentifier getPracticeId() {
		return practiceId;
	}

	public void setPracticeId(EntityIdentifier practiceId) {
		this.practiceId = practiceId;
	}

	public String getPracticeName() {
		return practiceName;
	}

	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

	public String getPracticeArea() {
		return practiceArea;
	}

	public void setPracticeArea(String practiceArea) {
		this.practiceArea = practiceArea;
	}

	public String getPracticeDescription() {
		return practiceDescription;
	}

	public void setPracticeDescription(String practiceDescription) {
		this.practiceDescription = practiceDescription;
	}
	
	
}
