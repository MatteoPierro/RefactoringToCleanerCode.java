public class Roll {
    private final int die1;
    private final int die2;
    private final int die3;
    private final int die4;
    private final int die5;

    public Roll(int die1, int die2, int die3, int die4, int die5) {
        this.die1 = die1;
        this.die2 = die2;
        this.die3 = die3;
        this.die4 = die4;
        this.die5 = die5;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public int getDie3() {
        return die3;
    }

    public int getDie4() {
        return die4;
    }

    public int getDie5() {
        return die5;
    }
}
