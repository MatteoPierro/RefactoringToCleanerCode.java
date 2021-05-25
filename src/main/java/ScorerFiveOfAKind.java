public class ScorerFiveOfAKind implements Scorer {

    public static final int FIVE_OF_A_KIND_SCORE = 50;

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.FiveOfAKind;
    }

    public int calculate(Tally tally) {
        var containsFiveOfAKind = false;

        for (var faceOccurrence : tally.value()) {
            if (faceOccurrence == 5) {
                containsFiveOfAKind = true;
                break;
            }
        }

        if(containsFiveOfAKind) return FIVE_OF_A_KIND_SCORE;

        return 0;
    }

}
