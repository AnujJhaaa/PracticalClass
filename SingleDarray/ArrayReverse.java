import java.util.Scanner;

class ArrayReverse {
    static Scanner scanner = new Scanner(System.in);
    static int[] arr ;
    public static void main(String[] args) {       
        arrayInput();
        printArray();

        reverseArray();
        printArray();

    }

    public static void swap(int i, int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }

    public static void reverseArray() {
        for(int i=0,j=arr.length-1; i<j; i++,j--){
            swap(i,j); 
        }
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

    public static void printArray() {
        System.out.print("Array = [ ");
        for(int element : arr) {
            System.out.print(element + ",");
        }
        System.out.print(" ]");
        System.out.println();
    }
}