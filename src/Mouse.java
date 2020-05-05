public class Mouse extends Animal {
    public Mouse() {
        System.out.println("A mouse appears");
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }

    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }

    public String squeak() {
        return "A mouse squeaks...";
    }
}
