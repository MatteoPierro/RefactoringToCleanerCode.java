import java.util.stream.Stream;

public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        return Stream.of(new SomethingPair(), new SomethingTwoPair(), new SomethingFullHouse(), new SomethingFiveOfAKind())
                .filter(something -> something.is(st))
                .findFirst()
                    .map(something -> something.calculate(dice1, dice2, dice3, dice4, dice5))
                .orElse(0);

    }

}