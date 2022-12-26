package com.br.javajsonprocessing1;

import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

public class jParse {{

    try {
        JSONParser parser = new JSONParser();
        File file = new File("data.json");
        Object obj = parser.parse(new FileReader(file));
        System.out.println("=======>" + obj);
    } catch (Exception e) {
        System.out.println("=======>" + e);
    }
    
}}
