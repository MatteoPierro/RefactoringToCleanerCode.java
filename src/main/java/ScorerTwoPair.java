public class ScorerTwoPair implements Scorer {

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.TwoPair;
    }

    public int calculate(Roll roll) {
        var tally = roll.tally();

        return calculateScore(tally);
    }

    private int calculateScore(int[] tally) {
        var numberOfPairsFound = 0;
        var score = 0;

        for (var face = 6; face >= 1; face--) {
            if (isPair(tally[face - 1])) {
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