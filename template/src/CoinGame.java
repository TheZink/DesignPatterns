public class CoinGame extends Game {


    private Player[] players;
    private int turns;
    private int maxTurns = 5;

    @Override
    public void initializeGame(int numberOfPlayers){
        players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player(i, 0);
        }
        turns = 0;
        System.out.println("Coin Flip Game Initialized with " + numberOfPlayers + " players.");
    }

    @Override
    public void playSingleTurn(int player){
        System.out.println("Player " + player + " flips the coin...");
        boolean heads = Math.random() < 0.5;
        if (heads) {
            System.out.println("It's heads! Player " + player + " gets a point.");
            players[player].setScore(1);
        } else {
            System.out.println("It's tails! No point for Player " + player + ".");
        }
        turns++;
    }

    @Override
    public void displayWinner(){
        int winner = 0;
        int highScore = players[0].getScore();
        for (int i = 1; i < players.length; i++) {
            if (players[i].getScore() > highScore) {
                highScore = players[i].getScore();
                winner = i;
            }
        }
        System.out.println("Player " + winner + " wins with " + highScore + " points!");
    }

    @Override
    public boolean endOfGame(){
        return turns >= maxTurns;
    }





}
