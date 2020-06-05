package java9.interfaces;

public interface FoodActions {
    void prepareFood();

    private void describeFood() { //private default method
        System.out.println("Hi food");
    }
}
