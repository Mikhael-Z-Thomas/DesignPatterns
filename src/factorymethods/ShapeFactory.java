package factorymethods;

public class ShapeFactory {

    public Shape getShape(String shapeType)
    {
        if(shapeType.equalsIgnoreCase("Square"))
            return new Square();
        else if(shapeType.equalsIgnoreCase("Trapezium"))
            return new Trapezium();
        else if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else
            return null;
    }


}
