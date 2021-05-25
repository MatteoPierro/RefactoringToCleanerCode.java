public class ScorerFiveOfAKind implements Scorer {

    public static final int FIVE_OF_A_KIND_SCORE = 50;

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.FiveOfAKind;
    }

    public int calculate(Roll roll) {
        var tally = roll.tally();

        return calculateScore(tally);
    }

    public int calculateScore(int[] tally) {
        for (var faceOccurrence : tally) {
            if (faceOccurrence == 5) {
                return FIVE_OF_A_KIND_SCORE;
            }
        }

        return 0;
    }
}
