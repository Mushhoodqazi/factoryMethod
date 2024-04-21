/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;


import java.util.ArrayList;

public class Task1 {




    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        CircleGeometry circleGeometry = new CircleGeometry();
        SquareGeometry squareGeometry = new SquareGeometry();
        TriangleGeometry triangleGeometry = new TriangleGeometry(); 

        shapes.add(circleGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(triangleGeometry.createShape()); 

        for (Shape s : shapes) {
            s.draw();
        }

    }

}

