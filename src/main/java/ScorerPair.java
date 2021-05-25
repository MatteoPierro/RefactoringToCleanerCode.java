public class ScorerPair implements Scorer {

    @Override
    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }

    @Override
    public int calculate(Tally tally) {
        for (var face = 6; face >= 1; face--) {
            if (tally.containsPairFor(face)) {
                return face * 2;
            }
        }

        return 0;
    }

    private boolean isPair(int faceOccurrences) {
        return faceOccurrences >= 2;
    }

}
