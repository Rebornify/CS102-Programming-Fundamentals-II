
public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 1;
        denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Rational add(Rational b) {
        Rational result = new Rational();

        int newNumerator = numerator * b.denominator + b.numerator * denominator;
        int newDenominator = denominator * b.denominator;

        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);

        return result;
    }

    public Rational subtract(Rational b) {
        Rational result = new Rational();

        int newNumerator = numerator * b.denominator - b.numerator * denominator;
        int newDenominator = denominator * b.denominator;

        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);

        return result;
    }

    public Rational multiply(Rational b) {
        Rational result = new Rational();

        int newNumerator = numerator * b.numerator;
        int newDenominator = denominator * b.denominator;

        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);

        return result;
    }

    public Rational divide(Rational b) {
        Rational result = new Rational();

        int newNumerator = numerator * b.denominator;
        int newDenominator = denominator * b.numerator;

        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);

        return result;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}