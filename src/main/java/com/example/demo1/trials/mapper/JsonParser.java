package com.example.demo1.trials.mapper;

import com.example.demo1.trials.mapper.models.MovieSummary;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;

public class JsonParser {

    public static void main(String[] args) throws Exception {
        String apiKey="60d7f2b5e37a4d017311aad5d929f172";
        HttpClient client = HttpClient.newHttpClient();
        String sampleJson="{\"id\":\"2\", \"title\":\"sample\", \"overview\":\"sample overview\"}";
//        String sampleJson1="{\n" + "    \"cpus\": -8.88178419700125e-16,\n" + "    \"disk\": 0,\n" + "    \"mem\": 0\n" + "}";
        InputStream inputStream=new ByteArrayInputStream(sampleJson.getBytes(StandardCharsets.UTF_8));
        RestTemplate restTemplate= new RestTemplate();
        MovieSummary movieSummary =restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+"25"+"?api_key="+apiKey,MovieSummary.class);

        JSONParser jsonParser = new JSONParser(JSONParser.MODE_JSON_SIMPLE);
        JSONObject jsonObject = (JSONObject)jsonParser.parse(new InputStreamReader(inputStream,StandardCharsets.UTF_8));
        ObjectMapper mapper=new ObjectMapper();
        MovieSummary movieSummary1 = mapper.readValue(jsonObject.toString(), MovieSummary.class);
        System.out.println(movieSummary1);

    }
}
