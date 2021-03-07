public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        if (st == ScoringType.Pair) {
            return SomethingPair.something(dice1, dice2, dice3, dice4, dice5);
        }
        if (st == ScoringType.TwoPair) {
            return SomethingTwoPair.calculateScoreForTwoPair(dice1, dice2, dice3, dice4, dice5);
        }
        if (st == ScoringType.FullHouse) {
            return SomethingFullHouse.somethingFullHouse(dice1, dice2, dice3, dice4, dice5);
        }
        if (st == ScoringType.FiveOfAKind) {
            return SomethingFiveOfAKind.somethingFiveOfAKind(dice1, dice2, dice3, dice4, dice5);
        }

        return 0;
    }

}