public interface Scorer {
    boolean canCalculate(ScoringType scoringType);

    int calculate(int[] tally);

    int calculateScore(int[] tally);
}
