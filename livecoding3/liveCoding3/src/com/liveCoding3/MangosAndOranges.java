package com.liveCoding3;

public class MangosAndOranges extends Main{
	int mangos;
    int oranges;

    MangosAndOranges(int mangos, int oranges) {
        this.mangos = mangos;
        this.oranges = oranges;
    }

    int calcGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    void print() {
        int gcd = calcGCD(mangos, oranges);
        int boxes = gcd;
        int mangosInEachBox = mangos / gcd;
        int orangesInEachBox = oranges / gcd;

        System.out.println("Number of boxes: " + boxes);
        System.out.println("Number of mangos in each box: " + mangosInEachBox);
        System.out.println("Number of oranges in each box: " + orangesInEachBox);
    }
}    