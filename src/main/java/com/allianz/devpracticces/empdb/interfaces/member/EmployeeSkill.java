package com.allianz.devpracticces.empdb.interfaces.member;

/**
 * Created by t1user on 9/5/17.
 */
public class EmployeeSkill {
    private String type;
    private String skillId;
    private int experienceInMonths;
    private boolean currentSkill;
    private boolean primarySkill;

    public EmployeeSkill() {
    }

    public EmployeeSkill(String type, String skillId, int experienceInMonths, boolean currentSkill, boolean primarySkill) {
        this.type = type;
        this.skillId = skillId;
        this.experienceInMonths = experienceInMonths;
        this.currentSkill = currentSkill;
        this.primarySkill = primarySkill;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public int getExperienceInMonths() {
        return experienceInMonths;
    }

    public void setExperienceInMonths(int experienceInMonths) {
        this.experienceInMonths = experienceInMonths;
    }

    public boolean isCurrentSkill() {
        return currentSkill;
    }

    public void setCurrentSkill(boolean currentSkill) {
        this.currentSkill = currentSkill;
    }

    public boolean isPrimarySkill() {
        return primarySkill;
    }

    public void setPrimarySkill(boolean primarySkill) {
        this.primarySkill = primarySkill;
    }
}
