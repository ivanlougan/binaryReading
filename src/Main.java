import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{

        String filePath = "C:\\Users\\Robert\\Desktop\\files\\robertinioZdebinio\\pliczek.txt";
        int number = 0;
        DataInputStream inputStream = null;


        try {
            inputStream = new DataInputStream(new FileInputStream(filePath));
            number = inputStream.readInt();
        } finally {
            if (inputStream != null)
                inputStream.close();
            System.out.println(number);
        }



    }
}
