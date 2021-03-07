public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        if (SomethingPair.isSomethingPair(st)) {
            return SomethingPair.something(dice1, dice2, dice3, dice4, dice5);
        }
        if (SomethingTwoPair.isSomethingTwoPair(st)) {
            return SomethingTwoPair.calculateScoreForTwoPair(dice1, dice2, dice3, dice4, dice5);
        }
        if (SomethingFullHouse.isSomethingFullHouse(st)) {
            return SomethingFullHouse.somethingFullHouse(dice1, dice2, dice3, dice4, dice5);
        }
        if (SomethingFiveOfAKind.isFiveOfAKind(st)) {
            return SomethingFiveOfAKind.somethingFiveOfAKind(dice1, dice2, dice3, dice4, dice5);
        }

        return 0;
    }

}