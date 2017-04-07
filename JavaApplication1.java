/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Imran-Nurul
 */
import java.io.FileReader;
import java.io.IOException;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileReader ReadABC = new FileReader ("First.txt");
            int abc = 0;
            
            while ((abc = ReadABC.read()) != -1) {
            System.out.print ((char) abc);
            }
            
            ReadABC.close();
        }   catch (IOException f) {
            f.printStackTrace();
        }
    }
    
}
