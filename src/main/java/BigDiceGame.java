public class BigDiceGame {
    public static int CalculateScore(ScoringType scoringType, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (isPair(scoringType)) {
            return PairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }
        if (isTwoPair(scoringType)) {
            return TwoPairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }
        if (isFullHouse(scoringType)) {
            return FullHouseScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }
        if (isFiveOfAKind(scoringType)) {
            return FiveOfAKindScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }

        return 0;
    }

    private static boolean isFiveOfAKind(ScoringType scoringType) {
        return scoringType == ScoringType.FiveOfAKind;
    }

    private static boolean isFullHouse(ScoringType scoringType) {
        return scoringType == ScoringType.FullHouse;
    }

    private static boolean isTwoPair(ScoringType scoringType) {
        return scoringType == ScoringType.TwoPair;
    }

    private static boolean isPair(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }

}