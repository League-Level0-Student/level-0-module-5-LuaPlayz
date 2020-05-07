package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeorNot {
public static void main(String[] args) {
	String number=JOptionPane.showInputDialog(null, "GIVE ME A NUMBER MY CHILD!");
	int n=Integer.parseInt(number);
	boolean E=false;
	for (int i = 2; i < n; i++) {
		if(n%i==0) {
			JOptionPane.showMessageDialog(null, "THE NUMBER YOU GAVE ME IS NOT PRIME MY CHILD!!!");
		}else {
			 E=true;
		} 
	}
	if(E==true) {
		JOptionPane.showMessageDialog(null, "THE NUMBER IS PRIME MY CHILD!!!");
	}
}
}
