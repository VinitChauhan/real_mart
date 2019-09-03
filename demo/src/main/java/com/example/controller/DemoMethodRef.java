package com.example.controller;

interface Print {
    public String getText(String str);
}

class Converter {
    public static String convert(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }
}

class MyPrint {
    public void pringMe(String str, Print p) {
        str = p.getText(str);
        System.out.print(str);
    }
}

public class DemoMethodRef {

    public static void main(String[] args) {

        String str = "Vin";
        MyPrint mp = new MyPrint();

        mp.pringMe(str, (Converter::convert));
    }
}
