import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.*;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {


    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("**************************Developers***************************************");
        JuniorDeveloper j1=new JuniorDeveloper(1,"Semra",0);
        JuniorDeveloper j2=new JuniorDeveloper(2,"Nehir",0);
        System.out.println(j1);
        System.out.println(j2);
        j1.work();
        j2.work();

        MidDeveloper m1=new MidDeveloper(1,"Semra",0);
        System.out.println(m1);
        m1.work();

        SeniorDeveloper s1=new SeniorDeveloper(1,"Hakan",0);
        SeniorDeveloper s2=new SeniorDeveloper(2,"Berivan",0);
        SeniorDeveloper s3=new SeniorDeveloper(3,"Cihan",0);
        SeniorDeveloper s4=new SeniorDeveloper(4,"Furkan",0);
        s1.work();
        s2.work();
        s3.work();
        s4.work();

        HRManager hr1=new HRManager(1,"Hava",0,new JuniorDeveloper[10],new MidDeveloper[6],new SeniorDeveloper[2]
                );
        hr1.work();
        System.out.println(hr1.getSalary());
        hr1.addEmployee(0,j1);
        hr1.addEmployee(1,j2);
        hr1.addEmployee(0,m1);
        hr1.addEmployee(0,s1);
        hr1.addEmployee(0,s2);
        hr1.addEmployee(9,s3);




    }




}