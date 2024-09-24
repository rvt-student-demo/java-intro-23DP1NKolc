package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        int number = 0;
        int sk = 0;
        
       while(true){
        System.out.println("Give a number:");
        number = Integer.valueOf(scanner.nextLine());
        summa = number + summa;
        sk+=1;

        if(number==0){
            break;
        }


       }
       System.out.println("Number of numbers: "+(sk-1));
       System.out.println("Sum of the numbers: "+summa);

       
    }
}