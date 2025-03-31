package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int FAILURE_CODE = -1;
    private static final int EMPTY_INDICATOR = -1;
    private static final int FULL_INDICATOR = 11;
    private static final int CAPACITY = 12;
    private final int[] numbers = new int[CAPACITY];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL_INDICATOR;
    }

    protected int peekaboo() {
        if (callCheck())
            return FAILURE_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return FAILURE_CODE;
        return numbers[total--];
    }

}
