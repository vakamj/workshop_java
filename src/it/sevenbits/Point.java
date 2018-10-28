package it.sevenbits;

public class Point {
    //Координаты
    private int xx;
    private int yy;

    private Point() {
    }

    //Конструктор создает объект класса Point
    public Point(int xx, int yy) {
        this.xx = xx;
        this.yy = yy;
    }

    //Получаем координату хх
    public int getXx() {
        return xx;
    }

    //Задаем координату хх
    public void setXx(int xx) {
        this.xx = xx;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }
}