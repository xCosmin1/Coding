package designpattern.creational.factory;

public class CircleGenerator implements ShapeFactory {
    @Override
    public Shape create() {
        return new Circle();
    }
}
