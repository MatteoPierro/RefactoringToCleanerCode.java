public class ScorerFiveOfAKind implements Scorer {

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
                final int bigScore = 50;
                return bigScore;
            }
        }

        return 0;
    }
}
