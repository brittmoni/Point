package com.company;

public class Point {

  private int x;
  private int y;

  public Point() {
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double distance() {
    double totalDistance = Math.sqrt((-this.getX()) * (-this.getX()) +
        (-this.getY()) * (-this.getY()));
    return totalDistance;
  }

  public double distance(int x, int y) {
    double totalDistance = Math.sqrt((x - this.getX()) * (x - this.getX()) +
        (y - this.getY()) * (y - this.getY()));
    return totalDistance;
  }

  public double distance(Point second) {
    double totalDistance = Math.sqrt((second.getX() - this.getX()) * (second.getX() - this.getX()) +
        (second.getY() - this.getY()) * (second.getY() - this.getY()));
    return totalDistance;
  }
}
