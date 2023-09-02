package designpattern.creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeType type = ShapeType.SQUARE;
        ShapeFactory factory;

        switch (type) {
            case CIRCLE:
                factory = new CircleGenerator();
                break;
            case SQUARE:
                factory = new SquareGenerator();
                break;
            default:
                factory = new CircleGenerator();
        }
        Shape shape = factory.create();
        shape.draw();

    }
}
