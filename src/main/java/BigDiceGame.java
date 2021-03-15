public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int dice1, int dice2, int dice3, int dice4, int dice5) {
        {
            for (Something something : new Something[] {new SomethingPair(), new SomethingTwoPair()}) {
                if (something.is(st)) {
                    return something.calculate(dice1, dice2, dice3, dice4, dice5);
                }
            }
        }

        {
            SomethingFullHouse somethingFullHouse = new SomethingFullHouse();
            if (somethingFullHouse.is(st)) {
                return somethingFullHouse.calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }
        {
            SomethingFiveOfAKind somethingFiveOfAKind = new SomethingFiveOfAKind();
            if (somethingFiveOfAKind.is(st)) {
                return somethingFiveOfAKind.calculate(dice1, dice2, dice3, dice4, dice5);
            }
        }

        return 0;
    }

}