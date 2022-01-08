package Files.session11;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan;
        File file;
        String filename;

        filename = JOptionPane.showInputDialog("Enter the name of the file");

        try {
            file = new  File(filename);
            System.out.printf(file.getAbsolutePath());
            scan = new Scanner(file);

            JOptionPane.showMessageDialog(null,"The file was found "+file.length());

        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "File not found");
        }
        JOptionPane.showMessageDialog(null,"Done");
        System.exit(0);
    }

}
