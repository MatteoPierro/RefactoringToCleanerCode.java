import javax.swing.text.html.Option;
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

        if (pairFace.isEmpty() || threeOfAKindFace.isEmpty()) {
            return 0;
        }

        return pairFace.get() * 2 + threeOfAKindFace.get() * 3;
    }

    private Optional<Integer> findThreeOfAKindFace(int[] tallies) {
        var threeOfAKindFace = 0;
        for (var face = 1; face <= 6; face += 1) {
            if (tallies[face - 1] == 3) {
                threeOfAKindFace = face;
            }
        }
        if(threeOfAKindFace == 0) return Optional.empty();
        return Optional.of(threeOfAKindFace);
    }

    private Optional<Integer> findPairFace(int[] tallies) {
        var pairFace = 0;
        for (var face = 1; face <= 6; face += 1) {
            if (tallies[face - 1] == 2) {
                pairFace = face;
            }
        }
        if (pairFace == 0) {
            return Optional.empty();
        }
        return Optional.of(pairFace);
    }
}
