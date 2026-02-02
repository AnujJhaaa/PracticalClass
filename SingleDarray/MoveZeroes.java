import java.util.Scanner;

class MoveZeroes {
    static Scanner scanner = new Scanner(System.in);
    static int[] arr ;

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

    public static void swap(int i, int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }
    /*
    //brute force --> O(n2)

    public static void move() {
        for(int i = 0; i< arr.length-1; i++) {
            if(arr[i]== 0){
                for(int j=i; j< arr.length-1 ; j++){
                    swap(j,j+1);
                }
            }
        }
    }
    */

    // 2pointer method --> fast and slow pointer
    public static void move() {
        int slow = 0, fast;

        for(fast = 0; fast < arr.length; fast++) { 
            if(arr[fast]!=0){
                swap(slow, fast);
                slow++;
            }
        }
    }
    public static void main(String[] agrs) {
        arrayInput();
        printArray();

        move();
        printArray();
    }
}
