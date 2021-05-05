public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        switch (st) {
            case Pair: {
                return PairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case TwoPair: {
                return TwoPairScoreCalculator.calculateScoreForTwoPair(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case FullHouse: {
                return calculateScoreForFullHouse(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
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

    private static int calculateScoreForFullHouse(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        int[] tallies;
        var _2 = false;
        int i;
        var _2_at = 0;
        var _3 = false;
        var _3_at = 0;


        tallies = new int[6];
        tallies[firstDie - 1] += 1;
        tallies[secondDie - 1] += 1;
        tallies[thirdDie - 1] += 1;
        tallies[fourthDie - 1] += 1;
        tallies[fifthDie - 1] += 1;

        for (i = 0; i != 6; i += 1) {
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i + 1;
            }
        }

        for (i = 0; i != 6; i += 1) {
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i + 1;
            }
        }

        if (_2 && _3) {
            return _2_at * 2 + _3_at * 3;
        }

        return 0;
    }

}