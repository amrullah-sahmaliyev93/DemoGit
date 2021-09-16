package main;

import java.util.Scanner;

import metod.Util;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String  str = sc.next();
		Util u = new Util();
		String name = u.nameMetod(str);
		System.out.println("User name : "+name);
	}

}
