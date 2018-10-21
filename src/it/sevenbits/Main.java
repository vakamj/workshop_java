package it.sevenbits;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//Создаем массив с элементами типа Segment
        Segment[] array = new Segment[4];
        //создаем объект класса Random
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = new Segment(new Point(rand.nextInt(10), rand.nextInt(10)), new Point(rand.nextInt(10), rand.nextInt(10)));
            System.out.println(array[i].segmentLength(array[i]));
        }

    }

}