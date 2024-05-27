package org.asodev;

public class Ev {
    private double price;
    private double area;
    private int roomCount;
    private int floorCount;

    public Ev(double price, double area, int roomCount, int floorCount) {
        this.price = price;
        this.area = area;
        this.roomCount = roomCount;
        this.floorCount = floorCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
}
