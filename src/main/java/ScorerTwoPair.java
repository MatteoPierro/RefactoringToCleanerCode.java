public class ScorerTwoPair implements Scorer {

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.TwoPair;
    }

    public int calculate(Roll roll) {
        var counts1 = roll.tally();
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
