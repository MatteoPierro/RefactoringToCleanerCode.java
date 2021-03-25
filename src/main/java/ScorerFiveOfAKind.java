public class ScorerFiveOfAKind implements Scorer {

    public boolean canCalculate(ScoringType st) {
        return st == ScoringType.FiveOfAKind;
    }

    public int calculate(Roll roll) {
        int[] dices = {roll.getDie1(), roll.getDie2(), roll.getDie3(), roll.getDie4(), roll.getDie5()};
        var counts2 = new int[6];
        for (int die : dices) {
            counts2[die - 1]++;
        }

        for (var i1 = 0; i1 != 6; i1++) {
            if (counts2[i1] == 5) {
                final int bigScore = 50;
                return bigScore;
            }
        }

        return 0;
    }
}
