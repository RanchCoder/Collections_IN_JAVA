//class will have heterogenous objects , 

//Our comparator class which will be implementing Comparator interface to define custom Comparator to SORT Employees
class MyComparator implements java.util.Comparator{
    
    public int compare(Object obj1,Object obj2){
        
        Employee e1 = (Employee)obj1;
        Employee e2 = (Employee)obj2;
        
        String name1 = e1.getName();
        String name2 = e2.getName();
        
        return name1.compareTo(name2);
        
        
    }
    
    
}


public class Employee implements java.lang.Comparable{
    
    private int eid;
    private String name;
    Employee(int eid, String name){
        this.eid = eid;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int compareTo(Object obj){
        
        int eid1 = this.eid;
        Employee e = (Employee) obj;
        int eid2 = e.eid;
        
        if(eid1 > eid2){
            return 1;
        }
        else if(eid1 < eid2){
            return -1;
        }
        else{
            return 0;
        }
        
    }
    
    public static void main(String[] args){
        //using default constructor to sort employees based on Employee id
        // java.util.TreeSet t1 = new java.util.TreeSet();
        // Employee e1 = new Employee(1,"vishal");
        // Employee e2 = new Employee(6,"robo6");
        // Employee e3 = new Employee(3,"robo3");
        // Employee e4 = new Employee(2,"robo2");
        // Employee e5 = new Employee(9,"robo9");
        // Employee e6 = new Employee(8,"robo8");
        
        
        
        //using custom Comparator to sort employees based on name
        java.util.TreeSet t1 = new java.util.TreeSet(new MyComparator());
        Employee e1 = new Employee(1,"vishal");
        Employee e2 = new Employee(6,"robo6");
        Employee e3 = new Employee(3,"robo3");
        Employee e4 = new Employee(2,"robo2");
        Employee e5 = new Employee(9,"robo9");
        Employee e6 = new Employee(8,"robo8");
        
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        t1.add(e6);
        
        for(Object eee : t1){
            Employee e = (Employee) eee;
            System.out.println(e.getName());
        }
    }
    
    
}
