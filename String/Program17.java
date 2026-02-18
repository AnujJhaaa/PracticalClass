import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string : ");
        String s = scanner.nextLine();
        s = " " + s;
        

        int index = 0;
        String rev = "";
            
        while((index = s.lastIndexOf(" "))!=-1){
            String word = s.substring(index+1);
            rev = rev + word+ " ";
            //System.out.println(word);
            s = s.substring(0,index);                
        }

        System.out.println("reverse string : " + rev);
    }
}
