public class Tennis {

 

    private Player player1;
    private Player player2;

    public Jeu (Player player1, Player player2) {

        this.player1 = player1;

        this.player2 = player2;

    }

 

    public String getRank() {

        if (player1.getRank() >= 3 && player2.getRank() >= 3) {

            if (Math.abs(player2.getRank() - player1.getRank()) >= 2) {

                return getBestPlayer().getName() + " won";

            } else if (player1.getRank() == player2.getRank()) {

                return "deuce";

            } else {

                return "advantage " + getBestPlayer().getName();

            }

        } else {

            return player1.getRankDescription() + ", " + player2.getRankDescription();

        }

    }

 

    public Player getBestPlayer() {

        return (player1.geRank() > player2.getRank()) ? player1 : player2;

    }

 
}
