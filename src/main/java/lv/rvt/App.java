package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        int i=1;
        int result=0;
        while(i!=(number+1)){
            result = result + i;
            i++;
        }
        System.out.println("The sum is: "+result); 
    }
}