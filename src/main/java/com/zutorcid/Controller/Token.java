package com.zutorcid.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Token {
    private String token;
    public String getToken(){
        token = "d4814364-cc7d-4b39-9ecf-aff054e70bf5";
       /* try (Scanner sc = new Scanner(new File("C:\\Users\\Jacek\\IdeaProjects\\ORCID\\src\\main\\resources\\token.txt"))) {
token = "dsd"
            token = sc.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        token.toString();*/



        return token;
    }
}
