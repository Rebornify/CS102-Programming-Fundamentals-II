public abstract class Counter {
    private int value;

    public abstract void decrement();

    public abstract void increment();

    protected Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
