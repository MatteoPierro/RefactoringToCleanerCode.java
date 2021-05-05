public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (st == ScoringType.Pair) {
            return PairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        } else if (st == ScoringType.TwoPair) {
            return TwoPairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        } else if (st == ScoringType.FullHouse) {
            return FullHouseScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        } else if (st == ScoringType.FiveOfAKind) {
            return FiveOfAKindScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
        }

        return 0;
    }

}