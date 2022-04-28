package p1;

public class Student implements java.io.Serializable 
{
    String firstName;
    String dateOfBirth;
    Address address = null;

    Student(String n,String d,String ci,String st,int pc,String ct)
    {
        firstName = n;
        dateOfBirth = d;
        address = new Address(ci,st,pc,ct);
    }
}