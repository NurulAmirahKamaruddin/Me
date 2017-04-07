package javaapplication1;

import java.io.FileReader;
import java.io.IOException;

public class FirstTextRead {
    public static void main (String [] args) {
        
        System.out.println("Welcome to the Tetx File Reader A to Z");
        System.out.println();
        
        try {
            FileReader ReadABC = new FileReader ("First.txt");
            int abc = 0;
            
            while ((abc = ReadABC.read()) != -1) {
                System.out.print ((char) abc);
            }
            ReadABC.close();
        }catch (IOException f) {
            f.printStackTrace();
        }
    }
}
