import java.util.Scanner;

class Program2 {
    static int[] digits = new int[10];
    
    static void evenOdd(int num) {
        while(num > 0) {
            int lastDigit = num % 10;
            digits[lastDigit] += 1; 
            num/=10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        boolean flagEven = false, flagOdd = false;

        evenOdd(num);

        System.out.print("Even digits present are ");
        for(int i=0; i<10; i+=2) {
            if(digits[i]>=1) {
                flagEven = true;
                System.out.print(i + ", ");
            }
        }
        if(!flagEven){
            System.out.print("none.");
        }
        System.out.println();
        
        System.out.print("Odd digits present are ");
        for(int i=1; i<10; i+=2) {
            if(digits[i]>=1) {
                flagOdd = true;
                System.out.print(i + ", ");
            }
        }
        if(!flagOdd){
            System.out.print("none.");
        }
    }
}