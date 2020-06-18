package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skillpractice {

public static void main(String[] args) {

skillpractice skills = new skillpractice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have

	String dimes=JOptionPane.showInputDialog(null, "HOW MANY DIMESSSS DO YOU HAVE???");
int d=Integer.parseInt(dimes);


// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null,"YOU HAVE "+ d*10+ " CENTS");


// Ask the user how tall they are (inches)

String inches=JOptionPane.showInputDialog("HOW TALL ARE YOU???");

int i=Integer.parseInt(inches);


// If they are shorter than 36 inches, tell them to eat their Wheaties

if (i<36) {
	JOptionPane.showMessageDialog(null, "EAT YOUR WHEATIESSSS!!!!");
}else {
	JOptionPane.showMessageDialog(null, "OK");
}


}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console

for (int i = 1; i < 31; i++) {
	if(i%3==0) {
		System.out.println(i);
	}
}





}

void skill3() { // Get a random number that is less than 20 and print it to the console

Random random=new Random ();
int n=random.nextInt(20);
System.out.println(n);

// Get another random number that is less than 10 and print it to the console
int r=random.nextInt(10);
System.out.println(r);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
JOptionPane.showMessageDialog(null, n-r);


}

void skill4() { // In a pop-up, ask the user for the city they live in
String city=JOptionPane.showInputDialog(null, "WHAT CITY DO YOU LIVE IN???");


// If they answered "San Diego", tell them good for you
if (city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "Good for you");
}else {
	JOptionPane.showMessageDialog(null, "Ok");
}


// Otherwise, tell them ok



// Create a variable - cars - and initialize it to the number of cars your family has. 
int cars=2;
// If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
if (cars==0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation!");
}else if(cars==1) {
	JOptionPane.showMessageDialog(null, "MY CAR MODEL IDK");
}else {
	JOptionPane.showMessageDialog(null, cars*4);
}

// If there is 1 car, use a pop-up to display the make/model of the car


// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



}

void skill5() { // In a pop-up, ask the user for the name of their school



// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



}
}



