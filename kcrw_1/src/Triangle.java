public class Triangle implements IShape{
    public Point ptA;
    public Point ptB;
    public Point ptC;
    private final double edgeA;
    private final double edgeB;
    private final double edgeC;

    public Triangle(Point ptA, Point ptB, Point ptC) {
        this.ptA = ptA;
        this.ptB = ptB;
        this.ptC = ptC;
        edgeA=Math.sqrt((ptB.x-ptA.x)*(ptB.x-ptA.x)+(ptB.y-ptA.y)*(ptB.y-ptA.y));
        edgeB=Math.sqrt((ptC.x-ptB.x)*(ptC.x-ptB.x)+(ptC.y-ptB.y)*(ptC.y-ptB.y));
        edgeC=Math.sqrt((ptA.x-ptC.x)*(ptA.x-ptC.x)+(ptA.y-ptC.y)*(ptA.y-ptC.y));
    }

    public double perimeter() {
        return edgeA+edgeB+edgeC;
    }


    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - edgeA) * (s - edgeB) * (s - edgeC));
    }

    public void draw() {
        System.out.println("绘制三角形 A("+ptA.x+","+ptA.y+") B("+ptB.x+","+ptB.y+") C("+ptC.x+","+ptC.y+")");
    }
}
