public class Main{
    public static void main(String arg[]){
        System.out.println("Main has started");
        
        Player player1= new Player();
        player1.setName("player1");
        Player player2= new Player();
        player1.setName("player2");

        player1.setThread(player2);
        player1.setThread(player1);

        player1.start();
        player2.start();

        System.out.println("Main has ended");

    }
}