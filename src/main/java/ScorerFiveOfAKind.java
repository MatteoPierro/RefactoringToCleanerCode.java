public class ScorerFiveOfAKind implements Scorer {

    public static final int FIVE_OF_A_KIND_SCORE = 50;

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.FiveOfAKind;
    }

    public int calculate(Roll roll) {
        var tally = roll.tally();

        return calculateScore(tally);
    }

    private int calculateScore(int[] tally) {
        for (var face = 0; face != 6; face++) {
            if (tally[face] == 5) {
                return FIVE_OF_A_KIND_SCORE;
            }
        }

        return 0;
    }
}
