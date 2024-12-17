package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.css.Counter;
public class App
{
public static void main(String[] args)  throws Exception {      
PaymentTerminal unicafeExactum = new PaymentTerminal();
    System.out.println(unicafeExactum);

    PaymentCard annesCard = new PaymentCard(2);

    System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

    boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
    System.out.println("there was enough money: " + wasSuccessful);

    unicafeExactum.addMoneyToCard(annesCard, 100);

    wasSuccessful = unicafeExactum.eatHeartily(annesCard);
    System.out.println("there was enough money: " + wasSuccessful);

    System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

    System.out.println(unicafeExactum);
    
}
}