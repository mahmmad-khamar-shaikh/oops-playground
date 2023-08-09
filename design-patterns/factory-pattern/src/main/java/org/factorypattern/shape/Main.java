package org.factorypattern.shape;

public class Main {
    public static void main(String args[]) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shape = shapeFactory.shape("Circle");
        System.out.println( shape.draw());
        shape= shapeFactory.shape("Triangle");
        System.out.println( shape.draw());
        shape= shapeFactory.shape("Polygon");
        shape.draw();
    }


}
