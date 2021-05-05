public interface ScoreCalculator {
    int calculateScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie);

    boolean canBeAppliedFor(ScoringType scoringType);
}
