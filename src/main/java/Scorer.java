public interface Scorer {
    boolean canCalculate(ScoringType st);

    int calculate(Roll roll);
}
