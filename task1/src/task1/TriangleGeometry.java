package task1;


public class TriangleGeometry extends Geometry {

    @Override
    public Shape createShape() {
        return new Triangle();
    }

}
