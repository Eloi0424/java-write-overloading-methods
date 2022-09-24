package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

     public static int add(int i, int i1) {
        return i + i1;
    }
    public static int add(int i, int i1, int i2) {
        return i + i1 + i2;
    }
    public static int add(int i, int i1, int i2, int i3) {
        return i + i1 + i2 + i3;
    }
    public static String add(String i, String i1, String i3) {
        return i + i1 + i3;
    }
}
