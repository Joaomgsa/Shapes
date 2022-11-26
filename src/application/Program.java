package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2.0));
        System.out.println("Total Area: "+ totalArea(myShapes));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.5));
        myCircles.add(new Circle(3.5));
        myCircles.add(new Circle(4.5));

        System.out.println("Total Area: "+ totalArea(myCircles));

    }


        /* curinga delimitado onde voce delimita quais tipos de objetos podem ser usados na lista usando a "herança"
           chamando extends para as implementações abaixo da interface
         */
    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}