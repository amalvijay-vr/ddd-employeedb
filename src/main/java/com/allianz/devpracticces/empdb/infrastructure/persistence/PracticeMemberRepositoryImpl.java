package com.allianz.devpracticces.empdb.infrastructure.persistence;

import com.allianz.devpracticces.empdb.application.utils.ObjectSerializer;
import com.allianz.devpracticces.empdb.domain.model.member.PracticeMember;
import com.allianz.devpracticces.empdb.domain.model.member.PracticeMemberRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by t1user on 9/5/17.
 */
@Repository
public class PracticeMemberRepositoryImpl implements PracticeMemberRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(PracticeMember practiceMember) {
        try {
            String urn = practiceMember.getMemberId().getUrn();
            String data = ObjectSerializer.serialize(practiceMember);
            jdbcTemplate.update("insert into practice_member_model values ('"+urn+"','"+data+"')");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }



    }
}
