import t.Roll;

import java.util.stream.Stream;

public class BigDiceGame {
    public static final Scorer[] SCORERS = {new ScorerPair(), new ScorerTwoPair(), new ScorerFullHouse(), new ScorerFiveOfAKind()};

    public static int CalculateScore(ScoringType scoringType, Roll roll) {
        return Stream.of(SCORERS)
                .filter(scorer -> scorer.canCalculate(scoringType))
                .findFirst()
                    .map(scorer -> scorer.calculate(roll))
                .orElse(0);

    }

}