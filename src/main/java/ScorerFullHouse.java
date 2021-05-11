public class ScorerFullHouse implements Scorer {

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.FullHouse;
    }

    public int calculate(Roll roll) {
        var tally = roll.tally();

        return calculateScore(tally);
    }

    private int calculateScore(int[] tallies) {
        int pairFace = findPairFace(tallies);

        int threeOfAKindFace = findThreeOfAKindFace(tallies);

        if (isPairFound(pairFace) && isThreeOfAKindFound(threeOfAKindFace)) {
            return pairFace * 2 + threeOfAKindFace * 3;
        }

        return 0;
    }

    private int findThreeOfAKindFace(int[] tallies) {
        var threeOfAKindFace = 0;
        for (var face = 1; face <= 6; face += 1) {
            if (tallies[face - 1] == 3) {
                threeOfAKindFace = face;
            }
        }
        return threeOfAKindFace;
    }

    private int findPairFace(int[] tallies) {
        var pairFace = 0;
        for (var face = 1; face <= 6; face += 1) {
            if (tallies[face - 1] == 2) {
                pairFace = face;
            }
        }
        return pairFace;
    }

    private boolean isThreeOfAKindFound(int threeOfAKindFace) {
        return threeOfAKindFace != 0;
    }

    private boolean isPairFound(int pairFace) {
        return pairFace != 0;
    }
}
