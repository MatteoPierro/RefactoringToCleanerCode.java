import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class PinningTest {

    @Test
    public void pinEverything() {
        Integer[] dice = new Integer[]{1, 2, 3, 4, 5, 6};
        ScoringType[] scoringTypes = ScoringType.values();

        CombinationApprovals.verifyAllCombinations(
                BigDiceGame::CalculateScore,
                scoringTypes,
                dice,
                dice,
                dice,
                dice,
                dice
        );
    }
}
