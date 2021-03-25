public class ScorerTwoPair implements Scorer {

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.TwoPair;
    }

    public int calculate(Roll roll) {
        var counts1 = roll.tally();
        var numberOfPairsFound = 0;
        var score = 0;
        for (var i = 0; i < 6; i += 1) {
            if (counts1[6 - i - 1] >= 2) {
                numberOfPairsFound++;
                score += 6 - i;
            }
        }

        if (numberOfPairsFound == 2) {
            return score * 2;
        }

        return 0;
    }
}
