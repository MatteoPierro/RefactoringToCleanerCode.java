public class BigDiceGame {
    public static int CalculateScore(ScoringType scoringType, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        for (ScoreCalculator calculator : new ScoreCalculator[]{ new PairScoreCalculator(), new TwoPairScoreCalculator(), new FullHouseScoreCalculator(), new FiveOfAKindScoreCalculator()}) {
            if (calculator.isSomething(scoringType)) {
                return calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }

        return 0;
    }

}