public class ScorerFiveOfAKind implements Scorer {

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.FiveOfAKind;
    }

    public int calculate(Roll roll) {
        var counts2 = roll.tally();

        for (var i1 = 0; i1 != 6; i1++) {
            if (counts2[i1] == 5) {
                final int bigScore = 50;
                return bigScore;
            }
        }

        return 0;
    }
}
