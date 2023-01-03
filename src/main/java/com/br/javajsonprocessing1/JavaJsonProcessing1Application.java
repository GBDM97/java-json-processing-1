package com.br.javajsonprocessing1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.javajsonprocessing1.AnnotationsTest.Serv;

import java.io.File;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@SpringBootApplication
public class JavaJsonProcessing1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaJsonProcessing1Application.class, args);
		String s1 = jParse.jParser();
		try {
			for (int fi = findFi(0); fi < s1.length();) {
				if (s1.substring(fi, fi + 1) == ","|| s1.substring(fi, fi + 1) == "[" || s1.substring(fi, fi + 1) == "{"){
					fi = s1.indexOf("\"", fi);
					int ei = s1.indexOf("\"", fi + 1);
					String out = s1.substring(fi, ei);
					System.out.println(out);
					fi = findFi(ei);
				}

			}	
		} catch (Exception e) {
			System.out.println("=======>" + e);
		}
	}

	private static int findFi(int index) {
		String s1 = jParse.jParser();
		if (s1.indexOf("{", index) > s1.indexOf("[", index)){
			int fi = s1.indexOf("{");
			return fi;
		} else {
			int fi = s1.indexOf("[", index);
			return fi;
		}
		
	}
}
