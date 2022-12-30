package com.br.javajsonprocessing1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.javajsonprocessing1.AnnotationsTest.Serv;

@RestController
public class C1 {
    @Autowired
    Serv serv;
    @GetMapping("/str")
    public ResponseEntity<String> getsomething(){
        return ResponseEntity.ok(serv.fileee(" World"));
    };
}
