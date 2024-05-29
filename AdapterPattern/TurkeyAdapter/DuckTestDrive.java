public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck tukeyAdapter = new TurkeyAdapter(turkey);

        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\n The TurkeyAdapter says...");
        tukeyAdapter.quack();
        tukeyAdapter.fly();

        System.out.println("\n The DuckAdapter says ...");
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
