package com.company.chapter3;

import java.io.IOException;

public class Ex10 {
    public static void main(String[] args) throws IOException {
        char stopChar,  readChar, fixedChar;
        int count = 0;
        stopChar = '.';
        do {
            readChar = (char) System.in.read();
            if (readChar > 64 && readChar < 91) {
                count++;
                fixedChar = (char)(readChar + (char)32);
                System.out.println("fixed char = "+fixedChar);
            }
            if (readChar > 96 && readChar < 123) {
                count++;
                fixedChar = (char)(readChar - (char)32);
                System.out.println("fixed char = "+fixedChar);
            }
        } while (readChar != stopChar);
        System.out.println("Count of fixed chars = "+count);
    }
}
