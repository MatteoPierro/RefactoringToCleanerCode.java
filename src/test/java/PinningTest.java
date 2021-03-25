import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class PinningTest {

    @Test
    public void pinEverything() {
        Integer[] dice = new Integer[]{1, 2, 3, 4, 5, 6};
        ScoringType[] scoringTypes = ScoringType.values();

        CombinationApprovals.verifyAllCombinations(
                (scoringType, dice1, dice2, dice3, dice4, dice5) -> BigDiceGame.CalculateScore(scoringType, new BigDiceGame.Roll(dice1, dice2, dice3, dice4, dice5)),
                scoringTypes,
                dice,
                dice,
                dice,
                dice,
                dice
        );
    }
}
