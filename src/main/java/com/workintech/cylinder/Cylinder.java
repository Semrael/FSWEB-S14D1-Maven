package com.workintech.cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius,double height){
        super(radius);
        this.height=height<0?0:height;
    }
    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }//supersiz  yazmanın dezavantajı önce kendi içindeini çağırır sonra parenttakine bakar

    @Override
    public String toString() {

        return   super.toString() + "Cylinder{" +
                "height=" + height +
                '}';
    }
}
