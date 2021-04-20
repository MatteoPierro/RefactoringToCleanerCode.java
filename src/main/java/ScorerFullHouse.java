public class ScorerFullHouse implements Scorer {

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.FullHouse;
    }

    public int calculate(Roll roll) {
        var tally = roll.tally();

        return calculateScore(tally);
    }

    private int calculateScore(int[] tallies) {
        var foundPair = false;
        int i;
        var _2_at = 0;
        var foundThreeOfAKind = false;
        var _3_at = 0;


        for (i = 0; i != 6; i += 1) {
            if (tallies[i] == 2) {
                foundPair = true;
                _2_at = i + 1;
            }
        }

        for (i = 0; i != 6; i += 1) {
            if (tallies[i] == 3) {
                foundThreeOfAKind = true;
                _3_at = i + 1;
            }
        }

        if (foundPair && foundThreeOfAKind) {
            return _2_at * 2 + _3_at * 3;
        }

        return 0;
    }
}
