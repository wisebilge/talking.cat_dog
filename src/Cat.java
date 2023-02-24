public class Cat extends Mypet {

    Cat(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("Miyav miyav...");
    }
}
