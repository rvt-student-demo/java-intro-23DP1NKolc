package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
       
       System.out.println("Value of the gift?");
       int number1 = Integer.valueOf(scanner.nextLine());

if (number1 < 5000) {
    System.out.println("No tax!");
}
else if (number1 >= 5000 && number1 < 25000) {
    double tax1 = (100 + (number1-5000) * 0.08);
    System.out.println("Tax: "+ tax1 );
} 
else if (number1 >= 25000 && number1 < 55000) {
    double tax1 = (1700 + (number1-25000) * 0.10);
    System.out.println("Tax: "+ tax1);
} 
else if (number1 >= 55000 && number1 < 200000) {
    double tax1 = (4700 + (number1-55000) * 0.12);
    System.out.println("Tax: "+ tax1);
    }
else if (number1 >= 200000 && number1 < 1000000) {
    double tax1 = (22100 + (number1-200000) * 0.15);
    System.out.println("Tax: "+ tax1);
}
else if (number1 >= 1000000) {
    double tax1 = (142100 + (number1-1000000) * 0.17);
    System.out.println("Tax: "+ tax1);
}
    }
}