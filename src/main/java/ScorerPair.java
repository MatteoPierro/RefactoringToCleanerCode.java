import t.Roll;

public class ScorerPair implements Scorer {

    @Override
    public boolean canCalculate(ScoringType st) {
        return st == ScoringType.Pair;
    }

    @Override
    public int calculate(Roll roll) {
        int value = 2;
        int[] tallies1;
        tallies1 = new int[6];
        tallies1[roll.getDice1() - 1]++;
        tallies1[roll.getDice2() - 1]++;
        tallies1[roll.getDice3() - 1]++;
        tallies1[roll.getDice4() - 1]++;
        tallies1[roll.getDice5() - 1]++;
        for (var i = 6 - 1; i >= 0; i--) {
            if (tallies1[i] >= value) {
                return (i + 1) * value;
            }
        }

        return 0;
    }
}
