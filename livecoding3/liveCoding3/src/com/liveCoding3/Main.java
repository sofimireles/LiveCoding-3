package com.liveCoding3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of mangos: ");
        int mangos = sc.nextInt();

        System.out.print("Enter the number of oranges: ");
        int oranges = sc.nextInt();

        MangosAndOranges fruits = new MangosAndOranges(mangos, oranges);

        fruits.print();
        sc.close();
        
	}

}
