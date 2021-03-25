public interface Scorer {
    boolean canCalculate(ScoringType scoringType);

    int calculate(Roll roll);
}
