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

    boolean containsPairFor(int face) {
        return faceOccurrences(face) >= 2;
    }

    boolean containsFiveOfAKind() {
        for (var faceOccurrence : value()) {
            if (faceOccurrence == 5) {
                return true;
            }
        }
        return false;
    }
}
