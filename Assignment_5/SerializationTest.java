import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import p1.*;

class SerializationTest implements java.io.Serializable  {

    public static void main(String[] args) 
    {
        Student one = new Student("Anshul","26/09/2000","Indore","MP",452009,"India");
        Student two = new Student("Anurag","30/10/2002","Dewas","MP",452010,"India");
        Student three = new Student("Aarav","19/09/2001","Indore","MP",452018,"India");
        Student four = new Student("Aalok","07/12/2002","Indore","MP",452018,"India");

        ArrayList<Student> lis = new ArrayList<>();
        lis.add(one);
        lis.add(two);
        lis.add(three);
        lis.add(four);

        try 
        {
            FileOutputStream file = new FileOutputStream("D:\\Assignment_Java\\Assignment_5\\output2.ser");
            try (ObjectOutputStream ob = new ObjectOutputStream(file)) {
                for(int i=0;i<lis.size();i++)
                {
                    ob.writeObject(lis.get(i));
                }
            } 
            System.out.println("Serialization complete...");
        }catch(IOException e){
            System.out.println("Error!!");
            e.printStackTrace();
        }    
    }    
}