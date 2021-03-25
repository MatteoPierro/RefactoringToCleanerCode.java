public class ScorerFullHouse implements Scorer {

    public boolean canCalculate(ScoringType st) {
        return st == ScoringType.FullHouse;
    }

    public int calculate(int dice1, int dice2, int dice3, int dice4, int dice5) {
        int[] tallies;
        var _2 = false;
        int i;
        var _2_at = 0;
        var _3 = false;
        var _3_at = 0;


        tallies = new int[6];
        tallies[dice1 - 1] += 1;
        tallies[dice2 - 1] += 1;
        tallies[dice3 - 1] += 1;
        tallies[dice4 - 1] += 1;
        tallies[dice5 - 1] += 1;

        for (i = 0; i != 6; i += 1) {
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i + 1;
            }
        }

        for (i = 0; i != 6; i += 1) {
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i + 1;
            }
        }

        if (_2 && _3) {
            return _2_at * 2 + _3_at * 3;
        }

        return 0;
    }
}
