package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
	int number1=0;
    int number2=1;
    int sum=1;
    
    System.out.println(number1);
	System.out.println(number2);
		
	for (int i = 0; i < 30; i++) {
		sum=number1+number2;
	System.out.println(sum);
	if(number1<number2) {
		number1=sum;
	}else {
		number2=sum;
	}
	}
	
		
		
		
		
	}
	
	
	
	
	
}
