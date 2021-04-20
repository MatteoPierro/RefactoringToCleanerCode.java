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
        for (var i1 = 0; i1 != 6; i1++) {
            if (tally[i1] == 5) {
                return FIVE_OF_A_KIND_SCORE;
            }
        }

        return 0;
    }
}
