package org.factorypattern.shape;

public class ShapeFactory {
    public IShape shape(Shape type) {
        if (type == null) {
            return null;
        }
        return switch (type) {
            case circle -> new Circle();
            case square -> new Squre();
            case triangle -> new Triangle();
            default -> throw new IllegalArgumentException("not supported Type");
        };
    }
}
