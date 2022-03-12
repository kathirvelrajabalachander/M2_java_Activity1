public class Cricket{
        public String name;
        public String innings;
        public int score;
        
   public void display(){

       System.out.println("Name: "+name);
       System.out.println("Innings: "+innings);
       if(innings.equalsIgnoreCase("First"))
        score = score+1;
       else
         System.out.println("Match Ended");
          System.out.println("Score: "+score);
}
}
