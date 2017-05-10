package com.allianz.devpracticces.empdb.application.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by t1user on 9/5/17.
 */
public class ObjectSerializer {
    public static String serialize(Object object) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }

    public static <T>T deSerialize(String jsonString,Class clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonString, (Class<T>) clazz);
    }
}
