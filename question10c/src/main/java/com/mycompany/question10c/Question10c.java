package com.mycompany.question10c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question10c {

    public static void main(String[] args)
    {
        Scanner n=new Scanner(system.in);
        System.out.print("Enter the file path: ");
        String filePath = n.nextLine();

        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            System.out.println("File content:");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found! Please check the file path and try again.");
        }
        
    }
}
