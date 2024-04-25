public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Draw circle with Normal Border");
        Circle circle = new Circle();
        circle.draw();

        System.out.println("Draw circle with Green Border");


        GreenShapeDecorator greenShapeDecorator =new GreenShapeDecorator(circle);
        greenShapeDecorator.draw();

    }
}
