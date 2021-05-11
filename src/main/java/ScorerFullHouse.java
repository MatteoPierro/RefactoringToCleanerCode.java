import java.util.Optional;

public class ScorerFullHouse implements Scorer {

    public boolean canCalculate(ScoringType scoringType) {
        return scoringType == ScoringType.FullHouse;
    }

    public int calculate(Roll roll) {
        var tally = roll.tally();

        return calculateScore(tally);
    }

    private int calculateScore(int[] tallies) {
        var pairFace = findPairFace(tallies);
        var threeOfAKindFace = findThreeOfAKindFace(tallies);

        if (isFullHouse(pairFace, threeOfAKindFace)) {
            return calculateFullHouseScore(pairFace.get(), threeOfAKindFace.get());
        }
        return 0;
    }

    private boolean isFullHouse(Optional<Integer> pairFace, Optional<Integer> threeOfAKindFace) {
        return pairFace.isPresent() && threeOfAKindFace.isPresent();
    }

    private int calculateFullHouseScore(Integer pairFace, Integer threeOfAKindFace) {
        return pairFace * 2 + threeOfAKindFace * 3;
    }

    private Optional<Integer> findThreeOfAKindFace(int[] tallies) {
        for (var face = 1; face <= 6; face += 1) {
            if (tallies[face - 1] == 3) {
                return  Optional.of(face);
            }
        }

        return Optional.empty();
    }

    private Optional<Integer> findPairFace(int[] tallies) {
        for (var face = 1; face <= 6; face += 1) {
            if (tallies[face - 1] == 2) {
                return  Optional.of(face);
            }
        }

        return Optional.empty();
    }
}
