package com.br.javajsonprocessing1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.javajsonprocessing1.AnnotationsTest.Serv;

import org.json.simple.parser.ParseException;
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
	// 	try {
	// 		JSONParser parser = new JSONParser();
	// 		File file = new File("src/data.json");
	// 		Object obj = parser.parse(new FileReader(file));
	// 		System.out.println("=======>" + obj);
	// 	} catch (Exception e) {
	// 		System.out.println("=======>" + e);
	// 	}
	// }
}}
