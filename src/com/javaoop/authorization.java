package com.javaoop;

import java.util.Scanner;

public class authorization {

    public static void auth(String[] args){

        Scanner scann = new Scanner(System.in);
        System.out.print("Input your login: ");
        String login = scann.nextLine();
        System.out.print("Input your password: ");
        String pass = scann.nextLine();

        if (login.equals("Admin") && pass.equals("123456")){
            System.out.println("Successful Authorization");
        }
        else{
            System.out.println("Incorrect password or login");
        }


    }

}