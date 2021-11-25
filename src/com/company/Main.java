package com.company;

public class Main {

    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        double totalDistance = Math.sqrt((second.getX() - first.getX()) * (second.getX() - first.getX()) +
            (second.getY() - first.getY()) * (second.getY() - first.getY()));

        System.out.println("The distance between these 2 points is " + totalDistance);

        System.out.println(test(599));
    }

    public static int test(int num) {
        if(num < 0) {
            System.out.println("Number is less than 0");
            return 0;
        } else {
            System.out.println("Your number is " + num);
            return num;
        }
    }
}

/*
1. Assign x and y values of points
2. Store individual points
3. Run formula which will return the distance between the 2 points
 */
