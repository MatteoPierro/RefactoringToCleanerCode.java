public class ScorerPair implements Scorer {

    @Override
    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }

    @Override
    public int calculate(Roll roll) {
        int[] tally = tally(roll);

        for (var i = 6 - 1; i >= 0; i--) {
            if (tally[i] >= 2) {
                return (i + 1) * 2;
            }
        }

        return 0;
    }

    private int[] tally(Roll roll) {
        int[] tally = new int[6];

        for (int die: roll.dice()) {
            tally[die - 1]++;
        }
        return tally;
    }

}
