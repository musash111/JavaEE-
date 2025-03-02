public class Rectangle implements IShape {
    public Point ptTopLeft;
    public Point ptTopRight;
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Point ptTopLeft, int width, int height) {
        this.ptTopLeft = new Point(ptTopLeft);
        this.width = width;
        this.height = height;
        this.ptTopRight=new Point(ptTopLeft.x+width,ptTopLeft.y+height);
    }

    public double perimeter(){
        return (width+height)*2;
    }
    public double area(){
        return width*height;
    }
    public void draw(){
        System.out.println("绘制矩形左上角（"+ptTopLeft.x+","+ptTopLeft.y+") 高度："+height+" 宽度："+width+" 图像右下角（"+ptTopLeft.x+","+ptTopLeft.y+")");
    }
}
