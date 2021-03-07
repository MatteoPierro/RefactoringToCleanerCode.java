public class SomethingFiveOfAKind {
    static int calculate(int dice1, int dice2, int dice3, int dice4, int dice5) {
        int[] dices = {dice1, dice2, dice3, dice4, dice5};
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

    static boolean isFiveOfAKind(ScoringType st) {
        return st == ScoringType.FiveOfAKind;
    }
}
