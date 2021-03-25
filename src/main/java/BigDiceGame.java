import java.util.stream.Stream;

public class BigDiceGame {
    public static final Scorer[] SCORERS = {new ScorerPair(), new ScorerTwoPair(), new ScorerFullHouse(), new ScorerFiveOfAKind()};

    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        return Stream.of(SCORERS)
                .filter(scorer -> scorer.canCalculate(st))
                .findFirst()
                    .map(scorer -> scorer.calculate(dice1, dice2, dice3, dice4, dice5))
                .orElse(0);

    }

}