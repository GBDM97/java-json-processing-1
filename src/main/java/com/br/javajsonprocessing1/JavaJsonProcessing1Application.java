package com.br.javajsonprocessing1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.javajsonprocessing1.AnnotationsTest.Serv;

import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;


@SpringBootApplication
public class JavaJsonProcessing1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaJsonProcessing1Application.class, args);
		try {
			JSONParser parser = new JSONParser();
			File file = new File("src/main/java/com/br/json/data.json");
			Object obj = parser.parse(new FileReader(file));
			JSONObject js0 = (JSONObject) obj;
			JSONObject js1 = (JSONObject) js0.get("world");
			JSONArray js2 = (JSONArray) js1.get("calvaryFriends");
			JSONObject js3 = (JSONObject) js2.get(3);
			JSONArray js4 = (JSONArray) js3.get("otherInfo");
			JSONObject js5 = (JSONObject) js4.get(0);
			JSONArray js6 = (JSONArray) js5.get("brother");
			JSONObject js7 = (JSONObject) js6.get(0);
			String js8 = (String) js7.get("country");
		

			// JSONArray js3 = (JSONArray) js2.get("Aaron");
			// String js3 = (String) js1.get("name");



			System.out.println("=======>" + js8);
		} catch (Exception e) {
			System.out.println("=======>" + e);
		}
	}
}
