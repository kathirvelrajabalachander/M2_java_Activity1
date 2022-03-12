import java.util.*;
class Team{
      private  String name;
      private long matches;
      public Team(String name, long matches){
       this.name = name;
       this.matches = matches;
        }
      public String getName(){
           return name;
          }
       public long getMatches(){
            return matches;
          }
       @Override
       public String toString(){
          return name+ " " + matches;
         }
   }

public class Teams {

    public static void main(String[] args) {
        int x;
        List<Team> teams = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no of Teams: ");
        x = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=x;i++){
            System.out.println("Enter the team "+ i +" detail ");
            System.out.println("Enter Name");
            String str = sc.nextLine();
            System.out.println("Enter the number of matches");
            int y = sc.nextInt();
            teams.add(new Team(str, y));
            sc.nextLine();
        }
        teams.sort(Comparator.comparingLong(Team::getMatches));
        System.out.println("Team list after sort by number of matches ");
        for(Team team : teams){
          System.out.println(team);
           }
      }
 }
