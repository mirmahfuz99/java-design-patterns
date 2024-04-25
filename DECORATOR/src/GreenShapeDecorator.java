public class GreenShapeDecorator extends ShapeDecorator{
    public GreenShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setGreenBorder(shape);
        
    }

    private void setGreenBorder(Shape shape) {
        System.out.println("Border is Green");
    }
}
