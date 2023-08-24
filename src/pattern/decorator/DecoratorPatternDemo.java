package pattern.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DecoratorPatternDemo {
    public static void main(String[] args) throws Exception{
//        Circle circle = new Circle();
//
//        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
//        redShapeDecorator.draw();
//
//        GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator(redShapeDecorator);
//        greenShapeDecorator.draw();

        Shape shape = new GreenShapeDecorator(new RedShapeDecorator(new Ractangle()));
        shape.draw();

        InputStream in = new DataInputStream(new FileInputStream("a.txt"));
    }
}
