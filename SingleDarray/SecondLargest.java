import java.util.Scanner;

public class SecondLargest {
    static Scanner scanner = new Scanner(System.in);
    static int[] arr;

    public static void main(String[] args){
        arrayInput();
        printArray();
        
        int maxSecond = secondMaxElement();
        System.out.println("Second largest element = " + maxSecond);
    }
    public static void arrayInput() {
        System.out.print("Enter the size of the array : ");
        int arrSize = scanner.nextInt();

        arr = new int[arrSize];
        for(int i=0; i<arrSize; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i]= scanner.nextInt();
        }
    }

    public static int secondMaxElement(){
        int max = 0; int max2nd = 0;
        for( int element : arr){
            if(element>max) {
                max2nd = max;
                max = element;
            }
            else if(element>max2nd) {
                max2nd = element;
            }
        }
        return max2nd;
    }

    public static void printArray() {
        System.out.print("Array = [ ");
        for(int element : arr) {
            System.out.print(element + ",");
        }
        System.out.print(" ]");
        System.out.println();
    }
}
