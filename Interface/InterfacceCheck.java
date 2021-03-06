package Interface;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Circle!");
    }
}

public class InterfacceCheck {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();
    }
}
