package com.company.chapter3;

import java.io.IOException;

public class Ex1 {

    public static void main(String[] args) throws IOException {
        char stopChar, countChar, readChar;
        int count = 0;
        stopChar = '.';
        countChar = ' ';
        do {
            readChar = (char) System.in.read();
            if (readChar == countChar) count++;
        } while (readChar != stopChar);
        System.out.println("Count of whitespaces = "+count);
    }
}
