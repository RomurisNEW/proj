package com.stepup.proj;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        Point point1 = new Point(1,5);
        Point point2 = new Point(2,8);
        Point point3 = new Point(5,3);
        Point point4 = new Point(8,9);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point3);
        Line line3 = new Line(point3, point4);

        System.out.println("Все точки без изменений: ");
        Point[] points = {point1,point2,point3,point4};
        PolyLine dlinaPolyLine = new PolyLine(points);
        System.out.println(dlinaPolyLine);
        System.out.println("Массив линий: " + Arrays.toString(dlinaPolyLine.getLines()));

        double sumPolyLine = dlinaPolyLine.getLength();
        System.out.println("Сумма длин отрезков ломанной: "
                + String.format("%.2f", sumPolyLine));
        double sumMassivLine = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Сумма длин массива линий: " + String.format("%.2f", sumMassivLine));

        System.out.println("Сравнение длины Ломаной и массива Линий: " + (sumMassivLine == sumPolyLine));

        point2.x = 12;
        System.out.println("");
        System.out.println("Точка 2 была измнена с 2 на 12. Далее изменения: ");
        System.out.println(dlinaPolyLine);
        System.out.println("Массив линий: " + Arrays.toString(dlinaPolyLine.getLines()));

        //если нужен был подсчет отрезков ломанной и линий в массиве линий
        System.out.println("");
        int countSegmentPoly = points.length-1;
        int countLinesInMass = dlinaPolyLine.getLines().length;
        if (countSegmentPoly==countLinesInMass) System.out.println("Кол-во элементов в массиве Ломанной = ["
                + countSegmentPoly + "] и кол-во линий в массиве линий = [" +  countLinesInMass + "], они равны -  ["
                + (countSegmentPoly==countLinesInMass) + ']');
        else System.out.println("Кол-во элементов в массивах не равно");
    }
}
