package com.example.demo1.trials.mapper;

import com.example.demo1.trials.mapper.models.MovieSummary;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class MapMapper {

    public static void main(String[] args) throws JsonProcessingException, ParseException {

        MovieSummary movieSummary = new MovieSummary("M10", "GI JOE", "Action");

        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> map = mapper.convertValue(movieSummary, Map.class);
        System.out.println(map.get("id"));
        String s = mapper.writeValueAsString(movieSummary);

        MovieSummary movieSummary2 = mapper.convertValue(map, MovieSummary.class);

        InputStream inputStream = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
        JSONParser jsonParser = new JSONParser(JSONParser.MODE_JSON_SIMPLE);
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        ObjectMapper objectMapper = new ObjectMapper();
        MovieSummary movieSummary1 = objectMapper.readValue(jsonObject.toString(), MovieSummary.class);
        System.out.println(movieSummary1);
        System.out.println(convert(map, MovieSummary.class));

    }

    static <T> T convert(Object o, Class<T> tClass) {
        return new ObjectMapper().convertValue(o, tClass);
    }

}