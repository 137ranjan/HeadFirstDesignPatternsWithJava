package CaffeineBeverage;

public abstract class CaffeineBeverage {
    // template method
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pour into a cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
