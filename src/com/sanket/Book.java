package com.sanket;
import java.awt.*;

public class Book {
    public static void main(String[] args) {
//    	(we use primitive type for storing simple value,here in the below example there are two variables x and y which on different memory location and they are completely independent on each other i.e if i change the value of x ,"y" is not going to be affected,so x and y completely independent of each other)
        int x = 1;
        int y = x;
        long a=9;
        long b=a;
        char p='f';
        char q=p;
        a=5;
        x = 2;
//        (we use reference type for storing complex objects)
        Point point1 = new Point( x=1,y=1);
        Point point2 = point1;
        point1.x=2;
        System.out.println(point2);
        System.out.println(y);
        System.out.println(b);
        System.out.println(q);
    }
}


