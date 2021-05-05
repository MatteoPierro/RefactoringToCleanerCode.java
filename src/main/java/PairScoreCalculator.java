public class PairScoreCalculator {
    static int calculateScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
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

    boolean isSomething(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }
}
