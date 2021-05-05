public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        switch (st) {
            case Pair: {
                return PairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case TwoPair: {
                return TwoPairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case FullHouse: {
                return FullHouseScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case FiveOfAKind: {
                return calculateScoreForFiveOfAKind(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }

        return 0;
    }

    private static int calculateScoreForFiveOfAKind(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        int[] dice1 = {firstDie, secondDie, thirdDie, fourthDie, fifthDie};
        var counts2 = new int[6];
        for (int die : dice1) {
            counts2[die - 1]++;
        }

        for (var i1 = 0; i1 != 6; i1++) {
            if (counts2[i1] == 5) {
                return 50;
            }
        }

        return 0;
    }

}