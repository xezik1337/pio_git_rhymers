package edu.kis.vh.nursery;

/**
 *Klasa implementuje prostą strukturę stosu liczb całkowitych o stałej pojemności
 */
public class DefaultCountingOutRhymer {

    private static final int FAILURE_CODE = -1;
    private static final int EMPTY_INDICATOR = -1;
    private static final int FULL_INDICATOR = 11;
    private static final int CAPACITY = 12;
    private final int[] numbers = new int[CAPACITY];

    private int total = -1;

    /**
     * Zwraca aktualny indeks szczytu stosu
     *
     * @return bieżący indeks szczytu (liczony od 0), lub -1 jeśli stos jest pusty
     */
    public int getTotal() {
        return total;
    }

    /**
     * Jeśli stos nie jest pełny, dodaje liczbę całkowitą na stos
     *
     * @param in liczba do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty
     *
     * @return true, jeśli stos jest pusty, w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == EMPTY_INDICATOR;
    }

    /**
     * Sprawdza, czy stos jest pełny
     *
     * @return true, jeśli stos jest pełny, w przeciwnym razie false
     */
    public boolean isFull() {
        return total == FULL_INDICATOR;
    }

    /**
     * Zwraca wartość ze szczytu stosu bez jej usuwania
     *
     * @return wartość ze szczytu stosu lub -1, jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return FAILURE_CODE;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca wartość ze szczytu stosu
     *
     * @return usunięta wartość lub -1, jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return FAILURE_CODE;
        return numbers[total--];
    }

}
