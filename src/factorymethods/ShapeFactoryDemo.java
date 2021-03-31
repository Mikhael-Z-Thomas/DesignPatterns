package factorymethods;

public class ShapeFactoryDemo {

    public static void main(String args[])
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Trapezium");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape3.draw();

        Shape shape4 = shapeFactory.getShape("Circle");




    }

}
