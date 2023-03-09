package inheritance;

class PlayerRating {
    int playerPosition;
    String playerName;
    float criticOneRating;
    float criticTwoRating;
    float criticThreeRating;
    float averageRating;
    char category;

    // constructor
    public PlayerRating(int playerPosition, String playerName, float criticOneRating, float criticTwoRating) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
    }

    public float calculateAverageRating(float criticOneRating, float criticTwoRating) {
        return averageRating = (criticOneRating + criticTwoRating) / 2;
    }

    public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
        averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
    }

    public char calculateCategory() {
        if (averageRating > 8)
            return category = 'A';
        else if (averageRating > 5 && averageRating <= 8)
            return category = 'B';
        else
            return category = 'C';
    }

    public void display() {
        System.out.println("the player name is " + playerName);
        System.out.println("the player position is " + playerPosition);
        System.out.println("the average rating is " + calculateAverageRating(criticOneRating, criticTwoRating));
        System.out.println("the category is " + calculateCategory());
    }
}

public class Player {
    public static void main(String[] args) {
        PlayerRating playerRating = new PlayerRating(1, "Beckham", 9f, .9f);
        playerRating.display();
    }
}
