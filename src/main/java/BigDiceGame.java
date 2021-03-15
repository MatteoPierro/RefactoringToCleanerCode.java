public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        {
            for (Something something : new Something[] {new SomethingPair(), new SomethingTwoPair(), new SomethingFullHouse(), new SomethingFiveOfAKind()}) {
                if (something.is(st)) {
                    return something.calculate(dice1, dice2, dice3, dice4, dice5);
                }
            }
        }

        return 0;
    }

}