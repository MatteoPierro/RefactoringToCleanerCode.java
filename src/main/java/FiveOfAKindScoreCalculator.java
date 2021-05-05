public class FiveOfAKindScoreCalculator {
    int calculateScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
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

    boolean isSomething(ScoringType scoringType) {
        return scoringType == ScoringType.FiveOfAKind;
    }
}
