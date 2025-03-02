public class Circle implements IShape{
    public Point ptCenter;
    public int radius;

    public Circle(Point center,int r){
        this.ptCenter=new Point(center);
        this.radius=r;
    }

    public double perimeter() {
        return 2*Math.PI*radius;
    }

    public double area() {
        return Math.PI*radius*radius;
    }

    public void draw() {
        System.out.println("绘制圆形中心（"+ptCenter.x+","+ptCenter.y+") 半径："+radius);
    }
}
