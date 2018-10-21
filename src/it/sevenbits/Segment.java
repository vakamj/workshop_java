package it.sevenbits;

public class Segment {
    private Point a;
    private Point b;
    //Создаем объекты класса Segment
    public Segment (Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    private Segment(){}
    //Получаем точку а нашего отрезка
    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }
    //метод класса, который считает длину отрезка
    //seg1 объект класса Segment
    //yy координата точки А объекта seg1
    public  double segmentLength (Segment seg1){

        int x1 = seg1.getA().getXx();
        int x2 = seg1.getB().getXx();
        int y1 = seg1.getA().getYy();
        int y2 = seg1.getB().getYy();
        double lenght =  Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return lenght;
    }
}