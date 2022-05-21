package com.company;

public class Metod {
    public int side1, side2, side3, side4, side5, side6;

    public void Rectangle() {
    }

    //Является ли прямоугольник квадратом
    public int squareOrRectangle(int num1, int num2, int num3, int num4) {
        side3 = (num1 + num2 + num3 + num4) / 4;

        if (side3 != num1) {
            System.out.println("стороны не совпадают");
        }
        if (side3 != num2 ) {
            System.out.println("стороны не совпадают");
        }
        if (side3 != num3 ) {
            System.out.println("стороны не совпадают");
        }
        if (side3 != num4 ) {
            System.out.println("стороны не совпадают");
        }


        return side3;
    }

    //Формула для нахождения площади
    public int areaCalculator(int num1, int num2) {
        side1 = (num1 * num2);
        return side1;
    }

    //Формула для нахождения периметра прямоугольника
    public double perimeterCalculator(int num1, int num2) {
        side2 = (num1 + num2) * 2;
        return side2;
    }

    public void viewResult() {
        System.out.println("Площадь прямоугольника: " + side1);
        System.out.println("Периметра прямоугольника: " + side2);
        System.out.println("Прямоугольник не является квадратом так как не все его стороны равны "+side3);
    }
}
