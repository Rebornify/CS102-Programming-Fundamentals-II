public class MinMaxCounter extends Counter {
    private int min;
    private int max;

    public MinMaxCounter(int min, int max) {
        super(min);
        this.min = min;
        this.max = max;
    }

    public void decrement() {
        int currentValue = getValue();

        if (currentValue > min) {
            setValue(--currentValue);
        }
    }

    public void increment() {
        int currentValue = getValue();

        if (currentValue < max) {
            setValue(++currentValue);
        }
    }
}
