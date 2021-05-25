public class ScorerTwoPair implements Scorer {

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.TwoPair;
    }

    public int calculate(Tally tally) {
        var numberOfPairsFound = 0;
        var score = 0;

        for (var face = 6; face >= 1; face--) {
            if (isPair(tally.faceOccurrences(face))) {
                numberOfPairsFound++;
                score += face * 2;
            }
        }

        if (numberOfPairsFound == 2) {
            return score;
        }

        return 0;
    }

    private boolean isPair(int faceOccurrences) {
        return faceOccurrences >= 2;
    }
}
