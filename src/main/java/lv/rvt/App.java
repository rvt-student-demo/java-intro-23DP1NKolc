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
    DecreasingCounter counter = new DecreasingCounter(1);
    counter.increaseValue(2);
    counter.increaseValue();
    counter.increaseValue();
    System.out.println(counter.getValue());
}
}