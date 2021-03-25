public class ScorerPair implements Scorer {

    @Override
    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }

    @Override
    public int calculate(Roll roll) {
        int[] tally = tally(roll);

        for (var face = 6; face >= 1; face--) {
            if (tally[face - 1] >= 2) {
                return face * 2;
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
