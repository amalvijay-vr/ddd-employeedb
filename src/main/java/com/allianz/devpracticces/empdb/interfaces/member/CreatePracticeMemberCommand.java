package com.allianz.devpracticces.empdb.interfaces.member;

import java.util.List;

/**
 * Created by t1user on 9/5/17.
 */
public class CreatePracticeMemberCommand {
    private String type;
    private String employeeId;
    private String firstName;
    private String lastName;
    private String lineManagerId;
    private String lineManagerName;
    private String practiceId;
    private List<EmployeeSkill> employeeSkills;

    public CreatePracticeMemberCommand() {
    }

    public CreatePracticeMemberCommand(String type, String employeeId, String firstName, String lastName, String lineManagerId, String lineManagerName, String practiceId, List<EmployeeSkill> employeeSkills) {
        this.type = type;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lineManagerId = lineManagerId;
        this.lineManagerName = lineManagerName;
        this.practiceId = practiceId;
        this.employeeSkills = employeeSkills;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLineManagerId() {
        return lineManagerId;
    }

    public void setLineManagerId(String lineManagerId) {
        this.lineManagerId = lineManagerId;
    }

    public String getLineManagerName() {
        return lineManagerName;
    }

    public void setLineManagerName(String lineManagerName) {
        this.lineManagerName = lineManagerName;
    }

    public String getPracticeId() {
        return practiceId;
    }

    public void setPracticeId(String practiceId) {
        this.practiceId = practiceId;
    }

    public List<EmployeeSkill> getEmployeeSkills() {
        return employeeSkills;
    }

    public void setEmployeeSkills(List<EmployeeSkill> employeeSkills) {
        this.employeeSkills = employeeSkills;
    }
}
