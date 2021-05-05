public class BigDiceGame {
    public static int CalculateScore(ScoringType scoringType, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        {
            PairScoreCalculator calculator = new PairScoreCalculator();
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }
        {
            if (TwoPairScoreCalculator.isSomething(scoringType)) {
                return TwoPairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }
        {
            if (FullHouseScoreCalculator.isSomething(scoringType)) {
                return FullHouseScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }
        {
            if (FiveOfAKindScoreCalculator.isSomething(scoringType)) {
                return FiveOfAKindScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }

        return 0;
    }

}