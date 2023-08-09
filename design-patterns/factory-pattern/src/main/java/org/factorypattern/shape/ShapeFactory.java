package org.factorypattern.shape;

public class ShapeFactory {
    public IShape shape(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return switch (type) {
            case "Circle" -> new Circle();
            case "Square" -> new Squre();
            case "Triangle" -> new Triangle();
            default -> throw new IllegalArgumentException("not supported Type");
        };
    }
}
