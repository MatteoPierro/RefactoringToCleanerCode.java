public class ScorerPair implements Scorer {

    @Override
    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }

    @Override
    public int calculate(Roll roll) {
        int value = 2;
        int[] tally = new int[6];

        for (int die: new int[]{roll.getDie1()}) {
            tally[die - 1]++;
        }
        tally[roll.getDie2() - 1]++;
        tally[roll.getDie3() - 1]++;
        tally[roll.getDie4() - 1]++;
        tally[roll.getDie5() - 1]++;

        for (var i = 6 - 1; i >= 0; i--) {
            if (tally[i] >= value) {
                return (i + 1) * value;
            }
        }

        return 0;
    }
}
