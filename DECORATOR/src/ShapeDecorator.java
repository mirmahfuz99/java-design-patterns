public class ShapeDecorator implements Shape{

    protected Shape shape;

    ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        //do nothing
    }
    
}
