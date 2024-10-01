package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        printUntilNumber(number);
    }
    public static void printUntilNumber(int number) {
        for (int i = 1; i < number+1; i++) {
            System.out.println(i);
        }
    }      
}