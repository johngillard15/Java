package com.company;

import java.io.*;
import java.util.*;

public class Main {
    
    public static void readFileBuffer(File file) throws IOException{
        System.out.println("\nBufferedReader");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while((line = br.readLine()) != null)
            System.out.println(line);

        br.close();
    }
    public static void readFileScanner(File file) throws FileNotFoundException{
        System.out.println("\nScanner");

        Scanner scan = new Scanner(file);

        String line;
        while(scan.hasNextLine()){
            line = scan.nextLine();
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        String fileName = "src/com/company/FileReaderTest.txt"; // can also read file directly
        File fileObj = new File(fileName);

        try {
            readFileBuffer(fileObj);
            readFileScanner(fileObj);
        }
        catch(FileNotFoundException e) {
            System.out.printf("File \"%s\" not found%n", fileName);
        }
        catch(IOException e){
            System.out.println("Invalid I/O");
        }
        finally{
            System.out.println("\nFinished file reading test.");
        }
    }
}
