import java.util.Scanner;

public class FindMissingNum {
    static Scanner scanner = new Scanner(System.in);
    static int[] arr;
     
    public static void arrayInput() {
        System.out.print("Enter the size of the array : ");
        int arrSize = scanner.nextInt();

        arr = new int[arrSize];
        for(int i=0; i<arrSize; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i]= scanner.nextInt();
        }
    }

    public static void printArray() {
        System.out.print("Array = [ ");
        for(int element : arr) {
            System.out.print(element + ",");
        }
        System.out.print(" ]");
        System.out.println();
    }
    
    public static void findMissingNum() {
        int xorFull = 0;
        int xorArray  = 0;

        for(int i=1;i<=arr.length+1;i++){
            xorFull ^= i;
        }

        for(int i : arr){
            xorArray ^=i;
        }

        int num = xorFull ^ xorArray;
        System.out.println("Missing number : " + num);

    }
    
    public static void main(String[] args) {
        arrayInput();
        printArray();

        findMissingNum();
    }
}
