package com.allianz.devpracticces.empdb.application.utils.member;

import com.allianz.devpracticces.empdb.domain.model.EntityIdentifier;
import com.allianz.devpracticces.empdb.domain.model.member.EmployeeSkill;
import com.allianz.devpracticces.empdb.domain.model.member.LineManager;
import com.allianz.devpracticces.empdb.domain.model.member.PracticeMember;
import com.allianz.devpracticces.empdb.domain.model.member.PracticeMemberRepository;
import com.allianz.devpracticces.empdb.interfaces.member.CreatePracticeMemberCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by t1user on 9/5/17.
 */
@Component
public class PracticeMemberServiceImpl implements PracticeMemberService {
    @Autowired
    private PracticeMemberRepository practiceMemberRepository;
    @Override
    public void createPracticeMember(CreatePracticeMemberCommand createPracticeMemberCommand) {
        System.out.println("id= " + createPracticeMemberCommand.getEmployeeId());

        EntityIdentifier memIdentifier = new EntityIdentifier(UUID.randomUUID().toString()+":"+createPracticeMemberCommand.getEmployeeId());
        LineManager lineManager = new LineManager("LineManager", createPracticeMemberCommand.getLineManagerId(), createPracticeMemberCommand.getLineManagerName());
        EntityIdentifier practiceId = new EntityIdentifier(createPracticeMemberCommand.getPracticeId());
        List<EmployeeSkill> employeeSkills = new ArrayList<EmployeeSkill>();
        for (com.allianz.devpracticces.empdb.interfaces.member.EmployeeSkill eskill : createPracticeMemberCommand.getEmployeeSkills()) {
            employeeSkills.add(new EmployeeSkill("EmployeeSkill", new EntityIdentifier(eskill.getSkillId()), eskill.getExperienceInMonths(), eskill.isCurrentSkill(), eskill.isPrimarySkill()));
        }

        PracticeMember member = new PracticeMember("PracticeMember", memIdentifier, createPracticeMemberCommand.getEmployeeId(), createPracticeMemberCommand.getFirstName(), createPracticeMemberCommand.getLastName(), lineManager, practiceId, employeeSkills);
        practiceMemberRepository.save(member);


    }
}
