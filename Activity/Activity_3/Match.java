import java.util.Scanner;
public class Match{

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String str1 = sc.nextLine();
      int k = sc.nextInt();
      Cricket p = new Cricket();
      p.name=str;
      p.innings=str1;
      p.score=k;
      p.display();
}
}
