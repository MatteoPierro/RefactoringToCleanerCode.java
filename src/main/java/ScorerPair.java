public class ScorerPair implements Scorer {

    @Override
    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }

    @Override
    public int calculate(Roll roll) {
        int[] tally = tally(roll);

        return calculateScore(tally);
    }

    private int calculateScore(int[] tally) {
        for (var face = 6; face >= 1; face--) {
            if (isPair(tally[face - 1])) {
                return face * 2;
            }
        }

        return 0;
    }

    private boolean isPair(int faceOccurrences) {
        return faceOccurrences >= 2;
    }

    private int[] tally(Roll roll) {
        int[] tally = new int[6];

        for (int die : roll.dice()) {
            tally[die - 1]++;
        }
        return tally;
    }

}
