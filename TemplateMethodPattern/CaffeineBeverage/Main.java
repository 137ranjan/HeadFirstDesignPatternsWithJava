package CaffeineBeverage;

public class Main {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        Coffee myCoffee = new Coffee();

        System.out.println("\nMaking tea...");
        myTea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        myCoffee.prepareRecipe();
    }
}
