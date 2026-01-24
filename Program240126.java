import java.util.Scanner;

class Program240126 {
	
	public static int prime(int num) { 
		
		if (num ==1) {
			return 0;
		}

		int factors = 2; //1 and number itself are already factors;
		for (int i=2; i<=num/2; i++) {
			if (num%i == 0) {
				factors = factors + 1;
			}
		}

		if(factors > 2) {
			return 0;
		}
		else {
			return 1;
		}
	}

	public static int factorial(int num) {
		int fact = 1;
		
		for (int i=1;i<=num;i++) {
			fact = fact * i ;
		}
		
		return fact;
	}

	public static int armstrong(int num) {
		int copy = num;
		int countDigits = 0;
		
		while( copy != 0) {
			int lastDigit = copy % 10;
			countDigits++;
			copy/=10;
		}
		
		int arm = 0 ;
		copy = num;
		
		while( copy != 0) {
			int lastDigit = copy % 10;
			arm = arm + (int)Math.pow(lastDigit, countDigits);
			countDigits--;
			copy/=10;
		}
		
		if(num == arm) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static int gcd(int num1, int num2) {
		
		while(num2 != 0) {
			int temp = num2;
			num2 = num1 % num2 ; 
			num1 = temp;
		}
		
		return num1;
	}
	
	public static int palindrome(int num) {
		int copy = num;
		int reverse = 0;

		while( copy != 0) {
			int lastDigit = copy % 10;
			reverse = reverse * 10 + lastDigit;
			copy/=10;
		}
		
		if(num == reverse) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static int sumofDigits(int num) {
		int sum=0;
		
		while( num != 0) {
			int lastDigit = num % 10;
			sum = sum + lastDigit;
			num/=10;
		}
	
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Choice : ( 1:Prime, 2:Factorial, 3:Armstrong, 4:GCD, 5: Paliindrome, 6:SumofDigits) ");
		int choice = scanner.nextInt();
		int num1, num2 ;
		switch(choice) {
			 case 1 : 
				System.out.print("Enter number : ");
				num1 = scanner.nextInt();
				
				if ( prime(num1) == 1) {
					System.out.println(num1 + " is a Prime Number.");
				}
				else {
					System.out.println(num1 + " is not a Prime Number.");
				}
				
				break;

			 case 2 : 
				System.out.print("Enter number : ");
				num1 = scanner.nextInt();
				
				System.out.println(num1 + " factorial = " + factorial(num1));
				
				break;


			 case 3 : 
				System.out.print("Enter number : ");
				num1 = scanner.nextInt();
				
				if ( armstrong(num1) == 1) {
					System.out.println(num1 + " is an Armstrong Number.");
				}
				else {
					System.out.println(num1 + " is not an Armstrong Number.");
				}
				
				break;


			 case 4 : 
				System.out.print("Enter number 1 : ");
				num1 = scanner.nextInt();
				System.out.print("Enter number 2 : ");
				num2 = scanner.nextInt();
				
				System.out.println("Greatest common divisor between " + num1 + " and " + num2 + " is " + gcd(num1,num2));
				
				break;


			 case 5 : 
				System.out.print("Enter number : ");
				num1 = scanner.nextInt();
				
				if ( palindrome(num1) == 1) {
					System.out.println(num1 + " is a Palindrome Number.");
				}
				else {
					System.out.println(num1 + " is not a Palindrome Number.");
				}
				
				break;


			 case 6 : 
				System.out.print("Enter number : ");
				num1 = scanner.nextInt();
				
				System.out.println("Sum of Digits of " + num1 + " = " + sumofDigits(num1));
				
				break;

			default : 
				System.out.println("INVALID Choice.");
		}
	}
}

