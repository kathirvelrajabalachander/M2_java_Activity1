import java.util.*;

class Kathir{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 =sc.nextLine();
            String words[]=str.split("\\s");  
    String capitalizeWord="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        capitalizeWord+=first.toUpperCase()+afterfirst.toLowerCase()+" ";
        }
        System.out.println(capitalizeWord.trim()+" "+ str1.toUpperCase());  
    }  
    
} 