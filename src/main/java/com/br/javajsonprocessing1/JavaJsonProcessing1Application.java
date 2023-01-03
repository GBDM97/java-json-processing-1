package com.br.javajsonprocessing1;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JavaJsonProcessing1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaJsonProcessing1Application.class, args);
		String s1 = jParse.jParser();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key search : ");
		String search = sc.nextLine();
		sc.close();  
		try {
			for (int fi = findFi(0); fi < s1.length();) {
					int ei = s1.lastIndexOf("\"", fi - 1) + 1;
					String out = s1.substring(ei, fi);
					if (out.indexOf(search) != -1){System.out.println(out);};
					fi = findFi(fi + 2);
			}	
		} catch (Exception e) {
			System.out.println("=======>" + e);
		}
	System.out.println("=======> ended");
	}

	private static int findFi(int index) {
		String s1 = jParse.jParser();
		int fi = s1.indexOf(":", index);
		if (fi == -1){return s1.length();}
		fi = s1.lastIndexOf("\"", fi);
		return fi;
	}
}
