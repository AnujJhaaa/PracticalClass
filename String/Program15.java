import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Program15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string : ");
        String s = scanner.nextLine();
        s+= " ";

        int index = 0;
        int start =0;
        String longest = "";
        
        while((index = s.indexOf(" ",start))!=-1){
            String word = s.substring(start,index);
            //System.out.println(word);
            
            longest = (longest.length()<word.length())? word :longest;
            start = index + 1;
        }

        System.out.println("longest word :  " + longest);
    }
}
