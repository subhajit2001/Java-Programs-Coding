package com.oppe_practise;

import java.util.*;
class Employee{
    String name;
    String[] projects; 
//***** Define constructor(s) here
    public Employee(String name,String[] projects)
    {
    	this.name = name;
    	this.projects = projects;
    }
    public Employee(Employee e)
    {
    	this.name = null;
    	this.projects = new String[e.projects.length];
    	for(int i=1;i<e.projects.length;i++)
    	{
    		this.projects[i] = e.projects[i];
    	}
    }
    public void setName(String n) {
        name = n;
    }
    public void setProject(int index, String proj) {
        projects[index] = proj;
    }
    public String getName() {
        return name;
    }
    public String getProject(int indx) {
        return projects[indx];
    }
}
public class Employee_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] proj =  {"PJ1", "PJ2", "PJ3"};
        Employee e1 = new Employee("Surya", proj);
        Employee e2 = new Employee(e1);
        e2.setName(sc.next());
        e2.setProject(0, sc.next());
        System.out.println(e1.getName() + ": " + e1.getProject(0));
        System.out.println(e2.getName() + ": " + e2.getProject(0));
    }
}