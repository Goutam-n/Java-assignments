import p1.*;
import p2.*;
import p3.*;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        System.out.println("Enter your choice");
        System.out.println("1 -> Add : To create a profile for employee");
        System.out.println("2 -> Delete : To delete profile of employee");
        System.out.println("3 -> Search : To search information of employee");
        System.out.println("4 -> Exit ");

        try (Scanner sc = new Scanner(System.in)) {
            int i = sc.nextInt();

            switch (i) {
                case 1:
                    System.out.println("You have selected Add");
                    System.out.println("Now you have to Enter employee details to create employee id");
                    try {
                        AddDetails.addDetails();
                        System.out.println("Employee Registered in Record");
                    } catch (IOException e) {
                        System.out.println(" Error Occured ! ");
                    }
                    break;

                case 2:
                    try {
                        DeleteDetails.deleteDetails();
                    } catch (IOException e) {
                        System.out.println("Some Error Occured !! ");
                    }
                    break;

                case 3:
                    try {
                        SearchDetails.searchdetails();
                    } catch (IOException e) {
                        System.out.println(e);
                        System.out.println("Error !! ");
                    }
                    break;

                case 4:
                    System.out.println("Exiting !! \n");
                    break;

                default:
                    System.out.println("Invalid input !");
                    break;
            }
        }
    }
}
