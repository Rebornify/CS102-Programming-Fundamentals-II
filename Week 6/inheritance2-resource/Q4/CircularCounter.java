public class CircularCounter extends Counter {
    private int limit;

    public CircularCounter(int limit) {
        super(0);
        this.limit = limit;
    }

    public void decrement() {
        int currentValue = getValue();

        if (currentValue > 0) {
            setValue(--currentValue);
        } else {
            setValue(limit);
        }
    }

    public void increment() {
        int currentValue = getValue();

        if (currentValue < limit) {
            setValue(++currentValue);
        } else {
            setValue(0);
        }
    }
}
