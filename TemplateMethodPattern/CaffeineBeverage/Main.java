package CaffeineBeverage;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage myTea = new Tea();
        CaffeineBeverage myCoffee = new Coffee();

        System.out.println("\nMaking tea...");
        myTea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        myCoffee.prepareRecipe();
    }
}
