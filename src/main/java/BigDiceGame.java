public class BigDiceGame {
    public static int CalculateScore(ScoringType st, int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        switch (st) {
            case Pair: {
                return PairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case TwoPair: {
                return TwoPairScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case FullHouse: {
                return FullHouseScoreCalculator.calculateScore(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }

            case FiveOfAKind: {
                return FiveOfAKindScoreCalculator.calculateScoreForFiveOfAKind(firstDie, secondDie, thirdDie, fourthDie, fifthDie);
            }
        }

        return 0;
    }

}