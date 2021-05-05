public class BigDiceGame {
    public static int CalculateScore(ScoringType scoringType, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        {
            PairScoreCalculator calculator = new PairScoreCalculator();
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }
        {
            TwoPairScoreCalculator calculator = new TwoPairScoreCalculator();
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }
        {
            FullHouseScoreCalculator calculator = new FullHouseScoreCalculator();
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }
        {
            FiveOfAKindScoreCalculator calculator = new FiveOfAKindScoreCalculator();
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }

        return 0;
    }

}