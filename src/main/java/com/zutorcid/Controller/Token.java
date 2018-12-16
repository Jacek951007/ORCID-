package com.zutorcid.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Token {
    private String token;
    public String getToken(){

        try (Scanner sc = new Scanner(new File("C:\\Users\\Tadzini\\IdeaProjects\\ORCID-\\src\\main\\resources\\token.txt"))) {

            token = sc.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        token.toString();

        return token;
    }
}
