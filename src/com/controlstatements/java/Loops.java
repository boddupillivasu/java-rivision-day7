package com.controlstatements.java;

public class Loops {

    public static void main(String[] args) {


        int printNumbers = 0;

        // while loop
        while (printNumbers < 10) {

            System.out.println(printNumbers + ":hello world");
            printNumbers++;//it exicutes the hello world in 9 times
            //printNumbers--;// it exicutes the 4 byte data value from negative
        }

        // do while(it exicutes the code atleast once when the condition wrong)

        int val = 50;

        do {
            System.out.println(val + ":welcome to java  fundamentals");

            val++;
        } while (val < 10);

//for loop
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                System.out.println("java fundamentals:" + i);
                break;
            } else if (i % 2 == 0) {
                System.out.println("java fundamentals:" + i);
                continue;

            }
        }
    }
}

