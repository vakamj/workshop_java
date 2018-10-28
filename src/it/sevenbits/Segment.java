package it.sevenbits;

public class Segment {
    private Point a;
    private Point b;

    //Создаем объекты класса Segment
    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    private Segment() {
    }

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
    public double segmentLength(Segment seg1) {

        return Math.sqrt(Math.pow((seg1.getA().getXx() - seg1.getB().getXx), 2) + Math.pow((seg1.getA().getYy() - seg1.getB().getYy()), 2);
    }
}