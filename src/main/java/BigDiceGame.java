import t.Roll;

import java.util.stream.Stream;

public class BigDiceGame {
    public static final Scorer[] SCORERS = {new ScorerPair(), new ScorerTwoPair(), new ScorerFullHouse(), new ScorerFiveOfAKind()};

    public static int CalculateScore(ScoringType scoringType, int dice1, int dice2, int dice3, int dice4, int dice5) {
        return Stream.of(SCORERS)
                .filter(scorer -> scorer.canCalculate(scoringType))
                .findFirst()
                    .map(scorer -> scorer.calculate(new Roll(dice1, dice2, dice3, dice4, dice5)))
                .orElse(0);

    }

}