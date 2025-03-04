import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
    private final List<IShape> shapes =new ArrayList<>();
    public void addShape(IShape shape){
        shapes.add(shape);
    }
    public void delShape(IShape shape){
        shapes.remove(shape);
    }
    public void drawShapes(){
        for (IShape shape:shapes){
            shape.draw();
        }
    }
}
