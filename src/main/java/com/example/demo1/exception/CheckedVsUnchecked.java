package com.example.demo1.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {

    public static void main(String[] args)  {
        readFile("file");
    }

    private static void readFile(String fileName)  {
        throw  new RuntimeException();
    }
}
