public class BigDiceGame {
    public static int CalculateScore(ScoringType scoringType, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (PairScoreCalculator.isPair(scoringType)) {
            return PairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }
        if (TwoPairScoreCalculator.isTwoPair(scoringType)) {
            return TwoPairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }
        if (FullHouseScoreCalculator.isFullHouse(scoringType)) {
            return FullHouseScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }
        if (FiveOfAKindScoreCalculator.isFiveOfAKind(scoringType)) {
            return FiveOfAKindScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }

        return 0;
    }

}