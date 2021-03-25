public class ScorerTwoPair implements Scorer {

    public boolean canCalculate(ScoringType st) {
        return st == ScoringType.TwoPair;
    }

    public int calculate(Roll roll) {
        var counts1 = new int[6];
        counts1[roll.getDice1() - 1]++;
        counts1[roll.getDice2() - 1]++;
        counts1[roll.getDice3() - 1]++;
        counts1[roll.getDice4() - 1]++;
        counts1[roll.getDice5() - 1]++;
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
