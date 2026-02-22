import java.util.Arrays;

public class NotRepeat {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,1,2,5};
        /*Works for Unsorted Array
        int unique = 0;

        for(int element : arr) {
            unique ^= element;
        }

        System.out.println("unique element : " + unique);*/


        Arrays.sort(arr);
        // index    :   [0,1,2,3,4,5,6]
        // elements :   [1,1,2,2,4,5,5]
        // every pairs starts at even index but it reverses after unique element, starts at odd.

        int l=0, u = arr.length-1;
        while(l<u){
            int mid = l+ (u-l)/2;

            if(mid%2 ==1){
                mid--;
            }

            if(arr[mid]== arr[mid+1]){ 
                l = mid + 2;
            }
            else{
                u = mid;
            }
        }

        System.out.println("Unique Element: " + arr[l]);
    }
}