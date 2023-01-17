public class CaloriesCalculatorTest {
    public static void main(String[] args) {
        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 82.5, 20);
        NewYearGoodie loveLetters = new NewYearGoodie("Loeve Letters", 82.5, 20);

        System.out.printf("%s more sinful than %s:%b%n", 
                tart.getName(), bakKwa.getName(), tart.isMoreSinful(bakKwa));
    }
}
