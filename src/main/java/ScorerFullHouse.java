public class ScorerFullHouse implements Scorer {

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.FullHouse;
    }

    public int calculate(Roll roll) {
        var tally = roll.tally();

        return calculateScore(tally);
    }

    private int calculateScore(int[] tallies) {
        var foundPair = false;
        var pairFace = 0;
        var foundThreeOfAKind = false;
        var threeOfAKindFace = 0;

        for (var face = 1; face <= 6; face += 1) {
            if (tallies[face - 1] == 2) {
                foundPair = true;
                pairFace = face;
            }
            if (tallies[face - 1] == 3) {
                foundThreeOfAKind = true;
                threeOfAKindFace = face;
            }
        }

        if (foundPair && foundThreeOfAKind) {
            return pairFace * 2 + threeOfAKindFace * 3;
        }

        return 0;
    }
}
