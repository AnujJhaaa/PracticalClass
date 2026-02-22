public class MovePositive {
    public static void main(String[] args) {
        int[] arr ={-1,12,13,0,-19,15,-10};
        System.out.print("Array : ");
        for(int i : arr){
            System.out.print(i +", ");
        }
        System.out.println();
        
        int slow = 0, fast = 0;
        for(;fast<arr.length;fast++) {
            if(arr[fast]<0){
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast]= temp;           
                slow++; 
            }
        }

        System.out.print("Array : ");
        for(int i : arr){
            System.out.print(i +", ");
        }
        System.out.println();
    }
}
