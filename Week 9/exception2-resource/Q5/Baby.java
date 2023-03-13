public class Baby {
    private boolean isHungry;

    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public void eat(String foodDescription) throws NotHungryException {
        if (isHungry) {
            System.out.println("eating " + foodDescription);
        } else {
            throw new NotHungryException("rejects " + foodDescription);
        }
    }
}
