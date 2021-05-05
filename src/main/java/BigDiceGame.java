import java.util.Arrays;

public class BigDiceGame {

    public static final ScoreCalculator[] SCORERS = {new TwoPairScoreCalculator(), new FullHouseScoreCalculator(), new PairScoreCalculator(), new FiveOfAKindScoreCalculator()};

    public static int CalculateScore(ScoringType scoringType, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        return Arrays.stream(SCORERS)
                .filter(calculator -> calculator.canBeAppliedFor(scoringType))
                .findFirst()
                .map(calculator -> calculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie))
                .orElse(0);
    }

}