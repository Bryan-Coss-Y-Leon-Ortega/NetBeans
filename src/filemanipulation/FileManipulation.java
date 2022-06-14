/*
 * This file is to show case how to write into a file
 * and bring all the content of that file into Netbeans output
 * It takes in inputs of lines of strings and outputs them into a file.
 * then that file is taken back into the progam shown its contents
 */
package filemanipulation;

import static com.sun.tools.attach.VirtualMachine.list;
import com.sun.tools.attach.VirtualMachineDescriptor;
import static java.awt.PageAttributes.MediaType.C;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.swing.JFileChooser;

/**
 *
 * TODO: input file name new input per file new files. new introduction to the
 * file new introduction to each individual file create codes into methods
 * creates make sure it runs ok.
 *
 */
public class FileManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String fileName;
        int opt = 0;
        ArrayList<String> S = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a following digit for a file option.");
        System.out.println("1. Allows you to create a simple file and add text.");
        System.out.println("2. Allows you to open a file and see the contents.");
        System.out.println("3. Allows you to see the files available.");
        System.out.println("4. Return to options");
        System.out.println("5. Ends the program");
        try {
            opt = scan.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a number mate");
        }
        //opt = scan.nextInt();

        switch (opt) {
            case 1:
                System.out.println("You are entering the File creation zone.");
                //fileName = scan.nextLine();

                //fileCreation(fileName, S);
                fileCreation();

                break;
            case 2:
                //System.out.println("Enter the file name you would like to mess with.");
                //fileName = scan.nextLine();

                fileReader();

                break;
            case 3:
                fileEditor();
                //listFiles();
                break;
            case 4:
                break;
            case 5:
                break;

        }

        //fileCreation(fileName, S);
        //fileReader(fileName);
        // fileEditor(fileName, S);
        System.out.println("All Done");

    }

    //private static void fileCreation(String fileName, ArrayList<String> S) {
    private static void fileCreation() {

        String fileName;
        ArrayList<String> S = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a Good file name.");
        fileName = scan.nextLine();
        String test;// = scan.nextLine();
        System.out.println("Please enter lines of strings to be entered into a file:");
        do {
            test = scan.nextLine();
            S.add(test);

        } while (!test.equals("STOP"));

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt"));
            writer.write("The following content is written to a file.\n");
            writer.write("What you may read now may disturb you.\n");
            for (int i = 0; i < S.size() - 1; i++) {
                writer.write(S.get(i) + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //private static void fileReader(String fileName) {
    private static void fileReader() {

        String fileName;
        Scanner scan = new Scanner(System.in);
        List<VirtualMachineDescriptor> dir = list();
        System.out.println(dir);

        System.out.println("Enter the file name you would like to mess with.");

        fileName = scan.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName + ".txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileEditor() {
        
        new MyFrame();
        
        
        

    }
}

    
