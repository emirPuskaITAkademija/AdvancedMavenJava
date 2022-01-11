package three.io;

import two.io.decorator.Beverage;
import two.io.decorator.Esspreso;
import two.io.decorator.MilkDecorator;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        double suma = 0;
        try(Scanner scanner = new Scanner(new File("src/main/resources/destinacijaLinija.txt"))){
            scanner.useLocale(Locale.US);
            while (scanner.hasNext()){
                if(scanner.hasNextDouble()){
                    double ucitaniBroj = scanner.nextDouble();
                    suma = suma + ucitaniBroj;
                }else{
                    scanner.next();
                }
            }
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Suma = " + suma);
    }
}
