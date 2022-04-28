package p1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddDetails {

    public static void addDetails() throws IOException {
        Scanner sc = new Scanner(System.in);
        String name, email, dob, age;
        ArrayList<String> detailslist = new ArrayList<String>();

        // GETTING NAME OF EMPLOYEE
        System.out.print(" Enter Name :- ");
        name = sc.nextLine();

        // GETTING DOB OF EMPLOYEE
        System.out.println("Enter Date of Birth in dd/mm/yyyy format :- ");
        dob = sc.next();

        // GETTING AGE OF EMPLOYEE
        System.out.println(" Enter age :- ");
        age = sc.next();

        // GETTING MAIL OF EMPLOYEE
        System.out.println(" Enter Email Id :- ");
        email = sc.next();
        if (email.contains("@") && email.contains("."))
            email = email.toLowerCase();

        detailslist.add(name);
        detailslist.add(dob);
        detailslist.add(age);
        detailslist.add(email);

        try (FileWriter write = new FileWriter("Employee.txt", true)) {
            for (String s : detailslist) {
                write.write(s + ",  ");
            }
            write.write("\n");
        } finally {
            sc.close();
        }
    }
}