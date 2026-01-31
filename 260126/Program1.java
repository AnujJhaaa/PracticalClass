import java.util.Scanner;

class Program1 {
    static int findLargest(int num) {
        int largest =0;
        
        while(num > 0) {
            int lastDigit = num % 10;
            if(largest < lastDigit) {
                largest = lastDigit;
            }

            num/=10;
        }

        return largest;
    }

    static int findSmallest(int num) {
        int smallest = num % 10;

        while(num > 0) {
            int lastDigit = num % 10;
            if(smallest > lastDigit) {
                smallest = lastDigit; 
            }

            num/=10;
        }

        return smallest; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        int largesDigit = findLargest(num);
        int smallestDigit = findSmallest(num); 

        System.out.println("Number = " + num);
        System.out.println("Lagest digit present " + largesDigit);
        System.out.println("Smallest digit present " + smallestDigit);
    }
}
