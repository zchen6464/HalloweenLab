package com.company;

public class Runner {

    public static void main(String[] args) {
        String[][] face;
        face = new String[6][6];
        JackOLantern Halloween = new JackOLantern(face);
        String x = Halloween.makeFace();
        System.out.println(x);
    }
}
