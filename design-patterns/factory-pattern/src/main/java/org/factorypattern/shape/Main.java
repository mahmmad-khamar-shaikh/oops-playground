package org.factorypattern.shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shape = shapeFactory.shape(Shape.circle);
        System.out.println( shape.draw());
        shape= shapeFactory.shape(Shape.triangle);
        System.out.println( shape.draw());
        shape= shapeFactory.shape(Shape.square);
        System.out.println(shape.draw());

    }


}
