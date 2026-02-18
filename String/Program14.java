import java.util.Scanner;

public class Program14 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string : ");
        String s = scanner.nextLine();
        s = s + " ";

        System.out.print("enter a string : ");
        String s2 = scanner.nextLine();
        
        int count= 0;
        int index = 0;

        while((index = s.indexOf(s2,index))!=-1){
            count++;
            index = index + s2.length();
        }
        
        /*String word = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' ') {
                word = word+ch;
            }
            else{
                if(word.equalsIgnoreCase(s2)){
                    count++;
                }
                word = "";
            }
        }*/

        System.out.println(s2 + " count : " + count);
    }
}
