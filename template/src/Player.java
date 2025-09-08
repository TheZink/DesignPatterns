public class Player {
    private int playerId;
    private int playerScore;

    public Player(int playerId, int playerScore){
        this.playerId = 0;
        this.playerScore = 0;
    }

    public void setPlayer(int id) {
        playerId = id;
    }

    public int getPlayer(){
        return playerId;
    }

    public void setScore(int points){
        playerScore += points;
    }

    public int getScore(){
        return playerScore;
    }
}
