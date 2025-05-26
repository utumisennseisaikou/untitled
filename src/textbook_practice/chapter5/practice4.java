package textbook_practice.chapter5;

public class practice4 {
    public static void main(String[] args) {
        double bottom = 10.0;
        double height = 5.0;
        calcTriangleArea(bottom,height);
        double radius = 5.0;
        calcCircleArea(radius);

    }
    public static void calcTriangleArea(double bottom, double height) {
        System.out.println("三角形の底辺の長さが"+bottom+"cm、高さが"+height+"の場合、面積は"+bottom*height/2+"です。");
    }
    public static void calcCircleArea(double radius) {
        System.out.println("円の半径が"+radius+"cmの場合、面積は"+radius*radius+"平方cm");
    }
}
