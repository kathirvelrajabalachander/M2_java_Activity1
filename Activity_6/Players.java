import java.util.*;

class Player {
    private String name;
    private long score;
    public Player(String name, long score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public long getScore() {
        return score;
    }
    @Override
    public String toString() {
       return name + " " + score;
    }
}

public class Players {

    public static void main(String[] args) {
        int x;
        List<Player> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please provide the no of players: ");
        x = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=x;i++){
            System.out.println("Enter the name of the player "+i);
            String str = sc.nextLine();
            System.out.println("Enter the score of the player"+i);
            int y = sc.nextInt();
            players.add(new Player(str, y));
            sc.nextLine();
        }
        players.sort(Comparator.comparingLong(Player::getScore).reversed());
        System.out.println("Player Details by Score(High to Low)");
        for(Player player : players) {
            System.out.println( player);
        }
    }
}
