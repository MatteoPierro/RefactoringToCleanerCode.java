public class TwoPairScoreCalculator {
    static int calculateScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
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
}
