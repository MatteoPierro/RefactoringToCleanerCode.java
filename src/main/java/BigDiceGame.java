public class BigDiceGame {
    public static int CalculateScore(ScoringType scoringType, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        {
            ScoreCalculator calculator = new PairScoreCalculator();
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }
        {
            ScoreCalculator calculator = new TwoPairScoreCalculator();
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }
        {
            ScoreCalculator calculator = new FullHouseScoreCalculator();
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }
        {
            ScoreCalculator calculator = new FiveOfAKindScoreCalculator();
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }

        return 0;
    }

}