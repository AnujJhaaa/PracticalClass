import java.util.Arrays;

public class Product {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        /* Solution
        create 2 arrays to store prefix product and suffix product
        imput  = [1,2,3,4]
        prefix = [1,1->(1),2->(2x1),6->(3x2x1)]
        suffix = [24->(2x3x4),12->(3x4),4-(4),1]

        output[i] = prefix product[i] * suffix product[i] ;
                    [1*24,1*12,2*4,6*1]
        */
        
        int[] output = new int[nums.length];
        Arrays.fill(output,1);

        for(int i=1;i<output.length;i++){
            output[i] = output[i-1] * nums[i-1];
        }
        
        int right = nums[nums.length-1];
        
        for(int i = output.length-2; i>=0;i--) {
            output[i] *= right;
            right *= nums[i];
        }

        for(int i : output){
            System.out.print(i+ ", ");
        }
    }    
}
