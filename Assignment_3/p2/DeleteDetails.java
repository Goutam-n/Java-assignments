package p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteDetails {
    public static void deleteDetails() throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter name of employee : ");
            String delete = sc.next();
            try (BufferedReader readfile = new BufferedReader(new FileReader("Employee.txt"))) {
                String str;
                boolean notfound = true;
                ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
                while ((str = readfile.readLine()) != null) {
                    boolean found = false;
                    String[] details = str.split(",  ");
                    if (details[0].contains(delete)) {
                        System.out.println(str);
                        found = true;
                        notfound = false;
                    }
                    ArrayList<String> detail = new ArrayList<>();
                    for (String temp : details) {
                        detail.add(temp);
                    }
                    if (found == false)
                        list.add(detail);
                }

                if (notfound == true)
                    System.out.println("Record not found");
                else {
                    System.out.println("Deleting Employee id ...");
                    BufferedWriter write = new BufferedWriter(new FileWriter("Employee.txt"));
                    for (ArrayList<String> l : list) {
                        for (String s : l)
                            write.write(s + ",  ");
                        write.newLine();
                    }
                    write.flush();
                    write.close();
                }
            }
        }
    }
}
