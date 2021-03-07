public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        {
            if (SomethingPair.is(st)) {
                return SomethingPair.calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }
        {
            if (SomethingTwoPair.is(st)) {
                return SomethingTwoPair.calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }
        {
            if (SomethingFullHouse.is(st)) {
                return SomethingFullHouse.calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }
        {
            if (SomethingFiveOfAKind.is(st)) {
                return SomethingFiveOfAKind.calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }

        return 0;
    }

}