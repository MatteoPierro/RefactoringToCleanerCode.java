public class ScorerTwoPair implements Scorer {

    public boolean canCalculate(ScoringType st) {
        return st == ScoringType.TwoPair;
    }

    public int calculate(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var counts1 = new int[6];
        counts1[dice1 - 1]++;
        counts1[dice2 - 1]++;
        counts1[dice3 - 1]++;
        counts1[dice4 - 1]++;
        counts1[dice5 - 1]++;
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
