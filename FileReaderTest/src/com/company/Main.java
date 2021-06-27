package com.company;

import java.io.*;
import java.util.*;

/**
 * <h1>File Reader Test</h1>
 *
 * <p>Testing reading files using BufferedReader and Scanner.</p>
 *
 * <br>
 *
 * @since 26/6/2021
 * @author John Gillard
 */

public class Main {

    /**
     *
     * @param file
     * @throws IOException
     */
    public static void readFileBuffer(File file) throws IOException{
        System.out.println("\nBufferedReader");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while((line = br.readLine()) != null)
            System.out.println(line);

        br.close();
    }

    /**
     *
     * @param file
     * @throws FileNotFoundException
     */
    public static void readFileScanner(File file) throws FileNotFoundException{
        System.out.println("\nScanner");

        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }

        scan.close();
    }

    public static void main(String[] args) {
        String filePath = "src/com/company/FileReaderTest.txt"; // can also read file directly
        File fileObj = new File(filePath);

        try {
            readFileBuffer(fileObj);
            readFileScanner(fileObj);
        }
        catch(FileNotFoundException e) {
            System.out.printf("File \"%s\" not found%n", fileObj.getName());
        }
        catch(IOException e){
            System.out.println("Invalid I/O");
        }
        finally{
            System.out.println("\nFinished file reading test.");
        }
    }
}
