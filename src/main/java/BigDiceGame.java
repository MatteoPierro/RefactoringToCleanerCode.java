public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        {
            if (new SomethingPair().is(st)) {
                return new SomethingPair().calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }
        {
            if (new SomethingTwoPair().is(st)) {
                return new SomethingTwoPair().calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }
        {
            if (new SomethingFullHouse().is(st)) {
                return new SomethingFullHouse().calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }
        {
            if (new SomethingFiveOfAKind().is(st)) {
                return new SomethingFiveOfAKind().calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }

        return 0;
    }

}