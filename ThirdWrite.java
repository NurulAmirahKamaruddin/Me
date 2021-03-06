/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.io.FileInputStream;
import java.io.*;


public class ThirdWrite {
    
    public int[] readaByte(File_file) throws IOException {
        FileInputStream sourceData = new FileInputStream(_file);
        int currentByte = sourceData.available();
        int readCount = 0;
        
        int byteContainer[] = new int[currentByte];
        while(readCount < currentByte) {
            byteContainer[readCount] = sourceData.read();
            readCount++;
        
        }
        sourceData.close();
        return byteContainer;     
    }
    
    public void printReverse(int[] fileContent){
        for(int byt=fileContent.length -1; byt >= 0 ;byt--){
            
            System.out.print((char) fileContent[byt]);
        }
    }
    
    public static void main(String[] args) throws IOException {
        File fileToRead = new File ("second.bin");
        
        ThirdWrite a = new ThirdWrite ();
        int[] readBytes = a.readaByte(fileToRead);
        System.out.println("Reverse word A to Z");
        System.out.println();
        a.printReverse(readBytes);
    }
}
