package main;

import java.util.Scanner;

import metod.Util;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String  name = sc.next();
		System.out.println("Enter surname");
		String surname = sc.next();
		System.out.println("Enter address");
		String address = sc.next();
		System.out.println("Enter age");
		Integer age = sc.nextInt();
		Util u = new Util();
		String [] info= u.nameMetod(name,surname,address,age);
		
		for (int i = 0; i < info.length; i++) {
			if(i==0)
			System.out.println("User name : "+info[i]);
			if(i==1)
			System.out.println("User surname : "+info[i]);
			if(i==2)
			System.out.println("User address : "+info[i]);
			if(i==3)
			System.out.println("User age : "+info[i]);

		}
	}

}
