package two.exception;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Detekcija i obrada grešaka : Exception handling
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Halo...");
        int number = 23;
        //2.1 RuntimeException
        int result = number/0;
        System.out.println("Unesi ime fajla:");
        String imeFajla = new Scanner(System.in).nextLine();
        //2.2 FileNotFound ->    {     }    {   }
        try{
            readFile(imeFajla);
        }catch (FileNotFoundException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }


        //  {     }   {   }
        try{
            Reader reader = new Reader();
        }catch (IOException e){

        }


        System.out.println("Učitali smo gfajl..");
    }

    static void readFile(String name) throws FileNotFoundException {

    }
}
