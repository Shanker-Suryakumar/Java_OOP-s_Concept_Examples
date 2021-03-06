package Interface;

interface Drawables {
    void draws();
}

class Circles implements Drawables {
    @Override
    public void draws() {
        System.out.println("Circles!");
    }

    // InterfaceChecker
    public static void main(String[] args) {
        Drawables circle = new Circles();
        circle.draws();
    }
}
