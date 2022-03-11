import java.io.*;
import java.util.Scanner;

class Kathirvel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split("\\s");
        for(String w:word){
            str = w;
        }
        String str1 = sc.nextLine();
        String[] words = str1.split("\\s");
        for(String m:words){
            str1 = m;
        }
         if(str.equals(str1)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
        
    }
}
