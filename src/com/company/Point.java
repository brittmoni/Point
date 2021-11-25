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
    double totalDistance = Math.sqrt((getX() - getX()) * (getX() - getX()) +
        (getY() - getY()) * (getY() - getY()));
    return totalDistance;
  }

  public double distance(int x, int y) {
    double totalDistance = Math.sqrt((getX() - getX()) * (getX() - getX()) +
        (getY() - getY()) * (getY() - getY()));
    return totalDistance;
  }

  public double distance(Point Point) {
    double totalDistance = Math.sqrt((getX() - getX()) * (getX() - getX()) +
        (getY() - getY()) * (getY() - getY()));
    return totalDistance;
  }
}
