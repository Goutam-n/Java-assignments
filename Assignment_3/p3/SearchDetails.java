package p3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class SearchDetails {
    public static void searchdetails() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Detail of Employee (Ex : name,email,etc.) :- ");
        String search = sc.next();
        BufferedReader readfile = new BufferedReader(new FileReader("employee.txt"));
        String str;
        boolean found = false;

        while ((str = readfile.readLine()) != null) {
            String[] details = str.split(",  ");
            for (String in : details) {
                if (search.equals(in)) {
                    System.out.println(str);
                    found = true;
                }
            }
        }
        if (found == false) {
            System.out.println("Nothing matches with giver data ");
        } else {
            System.out.println("Similar records are...");
        }
    }
}