package com.br.javajsonprocessing1;

import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jParse {

public static String jParser() {
    
    try {
        JSONParser parser = new JSONParser();
		File file = new File("src/main/java/com/br/json/data.json");
		Object obj = parser.parse(new FileReader(file));
		JSONObject js0 = (JSONObject) obj;
		JSONObject js1 = (JSONObject) js0.get("world");
		JSONArray js2 = (JSONArray) js1.get("calvaryFriends");
		JSONObject js3 = (JSONObject) js2.get(3);
		JSONArray js4 = (JSONArray) js3.get("otherInfo");
		var s1 = js4.toString();
        return s1;
    } catch (Exception e) {
        System.out.println("=======>" + e);
        return " ";
    }
}
    
}
