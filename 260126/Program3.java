import java.util.Scanner; 

class Program3 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        spyNumber(num);
    }

    static void spyNumber(int num) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        int copy = num;

        while(copy > 0) {
            int lastDigit = copy % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            productOfDigits = productOfDigits * lastDigit;
            copy/=10;
        }

        if(sumOfDigits == productOfDigits) {
            System.out.println(num + " is a Spy number.");
        }
        else {
            System.out.println(num + " is not a Spy number.");
        }
    }
}