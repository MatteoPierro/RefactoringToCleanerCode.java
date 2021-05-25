public class Tally {
    private final int[] tally;

    public Tally(int[] tally) {
        this.tally = tally;
    }

    public int[] value() {
        return tally;
    }

    int faceOccurrences(int face) {
        return value()[face - 1];
    }
}
