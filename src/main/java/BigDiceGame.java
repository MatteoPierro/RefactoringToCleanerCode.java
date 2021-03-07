public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        if (isSomethingPair(st)) {
            return SomethingPair.something(dice1, dice2, dice3, dice4, dice5);
        }
        if (isSomethingTwoPair(st)) {
            return SomethingTwoPair.calculateScoreForTwoPair(dice1, dice2, dice3, dice4, dice5);
        }
        if (isSomethingFullHouse(st)) {
            return SomethingFullHouse.somethingFullHouse(dice1, dice2, dice3, dice4, dice5);
        }
        if (st == ScoringType.FiveOfAKind) {
            return SomethingFiveOfAKind.somethingFiveOfAKind(dice1, dice2, dice3, dice4, dice5);
        }

        return 0;
    }

    private static boolean isSomethingFullHouse(ScoringType st) {
        return st == ScoringType.FullHouse;
    }

    private static boolean isSomethingTwoPair(ScoringType st) {
        return st == ScoringType.TwoPair;
    }

    private static boolean isSomethingPair(ScoringType st) {
        return st == ScoringType.Pair;
    }

}