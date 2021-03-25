public interface Scorer {
    boolean canCalculate(ScoringType st);

    int calculate(int dice1, int dice2, int dice3, int dice4, int dice5);
}
