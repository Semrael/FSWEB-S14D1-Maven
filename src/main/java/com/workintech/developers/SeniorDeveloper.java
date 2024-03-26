package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id,String name,double salary){
        super(id,name,salary);
    }
    @Override
    public void work(){
        setSalary(70000);
        System.out.println(getName()+" Senior Developer starts to working"+" Salary: ");

    }
}
