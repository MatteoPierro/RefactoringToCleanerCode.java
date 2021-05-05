public class BigDiceGame {
    public static int CalculateScore(ScoringType scoringType, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (isFoo(scoringType)) {
            return PairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }
        if (scoringType == ScoringType.TwoPair) {
            return TwoPairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }
        if (scoringType == ScoringType.FullHouse) {
            return FullHouseScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }
        if (scoringType == ScoringType.FiveOfAKind) {
            return FiveOfAKindScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }

        return 0;
    }

    private static boolean isFoo(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }

}