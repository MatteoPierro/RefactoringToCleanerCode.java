public class SomethingPair {
    static int something(int dice1, int dice2, int dice3, int dice4, int dice5) {
        int value = 2;
        int[] tallies1;
        tallies1 = new int[6];
        tallies1[dice1 - 1]++;
        tallies1[dice2 - 1]++;
        tallies1[dice3 - 1]++;
        tallies1[dice4 - 1]++;
        tallies1[dice5 - 1]++;
        for (var i = 6 - 1; i >= 0; i--) {
            if (tallies1[i] >= value) {
                return (i + 1) * value;
            }
        }

        return 0;
    }
}
