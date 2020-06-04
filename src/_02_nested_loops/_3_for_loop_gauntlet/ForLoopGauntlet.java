package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class ForLoopGauntlet {
public static void main(String[] args) {
	
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	
	for (int i = 100; i >-1; i--) {
		System.out.println(i);
	}
	
	for (int i = 2; i < 101; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	
	for (int i = 1; i < 100; i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
	
	for (int i = 1; i < 501; i++) {
		if(i%2==1) {
			System.out.println(i+"odd");
		}else {
			System.out.println(i+"even");
		}
	}
	
	for (int i = 0; i < 778; i++) {
		if(i%7==0){
			System.out.println(i);
		}
	}
	int year=2009;
	for (int i = 0; i < 12; i++) {
		System.out.println("In "+year+" I was "+i+" years old.");
			year++;
	}
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(i+" "+j);
		}
		
	}
	
	for (int i = 1; i < 9; i+=3) {
		for (int j = i; j < i+3; j++) {
			System.out.print(j);
			
		}
		System.out.println();
	}
	
	for (int i = 1; i < 100; i+=10) {
		for (int j = i; j < i+10; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	for (int i = 1; i < 7; i++) {
		System.out.println("*");
		}
	}
	
}
}
