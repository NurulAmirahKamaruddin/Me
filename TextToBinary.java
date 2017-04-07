

package javaapplication1;

import java.io.*;

public class TextToBinary {
    
public static void main (String[] args) throws Exception {
    FileInputStream input = null;
    
    try {
        input = new FileInputStream("First.txt");
        FileOutputStream txtbinary = new FileOutputStream ("second.bin");
        int b;
        
        while ((b = input.read()) != -1) {
            System.out.printf("%02x", b);
            txtbinary.write(b);
        }
    }
    finally {
        if (input !=null)
            input.close();
    }
}
    
}
