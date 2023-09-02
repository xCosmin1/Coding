package designpattern.creational.factory;

public class SquareGenerator implements ShapeFactory {
    @Override
    public Shape create() {
        return new Square();
    }
}
