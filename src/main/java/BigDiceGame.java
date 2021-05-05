public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        switch (st) {
            case Pair: {
                return somethingForPair(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case TwoPair: {
                return somethingForTwoPair(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case FullHouse: {
                return somethingForFullHouse(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case FiveOfAKind: {
                return somethingForFiveOfAKind(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }

        return 0;
    }

    private static int somethingForFiveOfAKind(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
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

    private static int somethingForFullHouse(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
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

    private static int somethingForTwoPair(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        var counts1 = new int[6];
        counts1[firstDie - 1]++;
        counts1[secondDie - 1]++;
        counts1[thirdDie - 1]++;
        counts1[fourthDie - 1]++;
        counts1[fifthDie - 1]++;
        var n = 0;
        var score = 0;
        for (var i = 0; i < 6; i += 1) {
            if (counts1[6 - i - 1] >= 2) {
                n++;
                score += 6 - i;
            }
        }

        if (n == 2) {
            return score * 2;
        }

        return 0;
    }

    private static int somethingForPair(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        int value = 2;
        int[] tallies1;
        tallies1 = new int[6];
        tallies1[firstDie - 1]++;
        tallies1[secondDie - 1]++;
        tallies1[thirdDie - 1]++;
        tallies1[fourthDie - 1]++;
        tallies1[fifthDie - 1]++;
        for (var i = 6 - 1; i >= 0; i--) {
            if (tallies1[i] >= value) {
                return (i + 1) * value;
            }
        }

        return 0;
    }
}