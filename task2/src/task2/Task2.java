
package task2;

import java.util.ArrayList;

public class Task2 {




    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(ShapeFactory.createShape("CIRCLE"));
        shapes.add(ShapeFactory.createShape("SQUARE"));
        shapes.add(ShapeFactory.createShape("SQUARE"));
        shapes.add(ShapeFactory.createShape("TRIANGLE"));

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
