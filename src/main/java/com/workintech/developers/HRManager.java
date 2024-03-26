package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDeveloper, MidDeveloper[] midDeveloper, SeniorDeveloper[] seniorDeveloper) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDeveloper;
        this.midDevelopers = midDeveloper;
        this.seniorDevelopers = seniorDeveloper;
    }

    public void addEmployee(int index,JuniorDeveloper juniorDeveloper){//5 indexli arraye 7. indexi verirsek arrayisoutofboundexception
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("İNDEX DOLU.....");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
            System.out.println("Array not found:" + index);
        }

    }
    public void addEmployee(int index,MidDeveloper midDeveloper){//5 indexli arraye 7. indexi verirsek arrayisoutofboundexception
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("İNDEX DOLU.....");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Array not found:" + index);
        }

    }
    public void addEmployee(int index,SeniorDeveloper seniorDeveloper){//5 indexli arraye 7. indexi verirsek arrayisoutofboundexception
        try {
         if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("İNDEX DOLU.....");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Array not found:" + index);
        }

    }

    @Override
    public void work() {
        setSalary(55000);
        System.out.println(getName()+ " hr manager starts to working");

    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDeveloper=" + Arrays.toString(juniorDevelopers) +
                ", midDeveloper=" + Arrays.toString(midDevelopers) +
                ", seniorDeveloper=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
