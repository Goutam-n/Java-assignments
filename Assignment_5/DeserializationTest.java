import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import p1.*;

public class DeserializationTest {
    public static void main(String[] args) {
        ArrayList<Object> lis = new ArrayList<>();

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("output1.ser"));
            for(int i=0;i<lis.size();i++){
                Student ob = (Student)in.readObject();
                System.out.println(ob);
                lis.add(ob);
            }
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Error!!");
            e.printStackTrace();
        }
    }
}
