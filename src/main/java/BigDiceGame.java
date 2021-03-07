public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        switch (st) {
            case Pair: {
                return something(dice1, dice2, dice3, dice4, dice5);
            }

            case TwoPair: {
                return SomethingTwoPair.calculateScoreForTwoPair(dice1, dice2, dice3, dice4, dice5);
            }

            case FullHouse: {
                return SomethingFullHouse.somethingFullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            case FiveOfAKind: {
                return SomethingFiveOfAKind.somethingFiveOfAKind(dice1, dice2, dice3, dice4, dice5);
            }
        }

        return 0;
    }

    private static int something(int dice1, int dice2, int dice3, int dice4, int dice5) {
        int value = 2;
        int[] tallies1;
        tallies1 = new int[6];
        tallies1[dice1 - 1]++;
        tallies1[dice2 - 1]++;
        tallies1[dice3 - 1]++;
        tallies1[dice4 - 1]++;
        tallies1[dice5 - 1]++;
        for (var i = 6 - 1; i >= 0; i--) {
            if (tallies1[i] >= value) {
                return (i + 1) * value;
            }
        }

        return 0;
    }
}