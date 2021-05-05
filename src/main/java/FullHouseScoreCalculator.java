public class FullHouseScoreCalculator {
    static int calculateScoreForFullHouse(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        int[] tallies;
        var _2 = false;
        int i;
        var _2_at = 0;
        var _3 = false;
        var _3_at = 0;


        tallies = new int[6];
        tallies[firstDie - 1] += 1;
        tallies[secondDie - 1] += 1;
        tallies[thirdDie - 1] += 1;
        tallies[fourthDie - 1] += 1;
        tallies[fifthDie - 1] += 1;

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
