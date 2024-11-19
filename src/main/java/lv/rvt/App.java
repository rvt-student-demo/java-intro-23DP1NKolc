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
    Product tapeMeasure = new Product("Tape measure");
Product plaster = new Product("Plaster", "home improvement section");
Product tyre = new Product("Tyre", 5);

System.out.println(tapeMeasure);
System.out.println(plaster);
System.out.println(tyre);
}
}