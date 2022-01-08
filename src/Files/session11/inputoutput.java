package Files.session11;

import javax.swing.*;
import java.io.*;

public class inputoutput {
    public static void writeString(String[] arr,String name) throws IOException {
        File file = new File(name);
        FileWriter write = new FileWriter(file);
        PrintWriter pw = new PrintWriter(write);
        for (String s : arr) {
            pw.println(s);
        }
        write.close();
        pw.close();
    }
    public static String[] readString(String name) throws IOException {

        FileReader read = new FileReader(name);
        BufferedReader reader = new BufferedReader(read);
        String[] arr = new String[name.length()];
        int i=0;
        try{
            while(reader.readLine()!=null){
                arr[i++]=reader.readLine();
            }
            JOptionPane.showMessageDialog(null,"There is no exception");
        } catch(IOException e){
            JOptionPane.showMessageDialog(null,"There is an exception");
        } finally {
            reader.close();
            read.close();
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        String[] arr;

        arr= new String[]{"Apple", "","Banana Monkey"};
        try {
            writeString(arr,"Ronaldo.txt");
            System.out.print("There is no exception");
        } catch(IOException e){
            e.printStackTrace();
            throw new IOException("There ia an Exception while writing");
        }
        String filename=JOptionPane.showInputDialog("Enter the name of the file");
        try{
            readString(filename);
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null,"There ia an exception");
        }

        System.exit(1);
    }
}
