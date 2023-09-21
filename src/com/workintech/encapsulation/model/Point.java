package com.workintech.encapsulation.model;

public class Point {
    private int x,y;
    public Point(int x,int y){
        this.x = x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y ){
        this.y=y;
    }
    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double distance(Point p){
        if (p!=null){
        int x2 = x-p.x;
        int y2 = y-p.y;
        return Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
    }
        return distance();
    }
    public double distance(int a,int b){
        int x2 = x-a;
        int y2 = y-b;
        return Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));

    }

}
