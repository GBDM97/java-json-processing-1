package com.br.javajsonprocessing1.AnnotationsTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.String;
import lombok.RequiredArgsConstructor;

@Service

public class Serv {
    @Autowired
    Filee filee;
    
    public String fileee(String s){System.out.println(filee.filee()); return filee.filee() + s;};
}
