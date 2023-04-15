/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulation;

/**
 *
 * @author geovannaparraga
 */
    class Employee
    {
        private int empno;
        private String name;
        private double salary;
        
        public int getempno()
        {        
            return empno;  
        }
    
        public String getname()
        {
           return name;  
        }

        public double getsalary()
        {
           return salary;  
        }
        
        public void setempno(int a)
        {
            empno=a;
        }
        
        public void setname(String b)
        {
           name=b;  
        }
        
        public void setsalary(double c)
        {
           this.salary=c;  
        }
    }

   class Payroll 
   {
        private double payRate;
        private String payPeriod;
        private double deductions;

        public double getPayRate() 
        {
            return payRate;
        }
        
        public String getPayPeriod() 
        {
            return payPeriod;
        }
        
        public double getDeductions() 
        {
            return deductions;
        }
        
        public void setPayRate(double d) 
        {
         this.payRate = d;
        }

        public void setPayPeriod(String e) 
        {
            this.payPeriod = e;
        }
        
        public void setDeductions(double f) 
        {
         this.deductions = f;
        }
    }

    class Department 
    {
        private int deptID;
        private String deptName;

        public int getDeptID() 
        {
            return deptID;
        }

        public String getDeptName() 
        {
            return deptName;
        }

        
        public void setDeptID(int g) 
        {
            this.deptID = g;
        }

        
        public void setDeptName(String h) 
        {
            this.deptName = h;
        }

    }


public class Encapsulation {
    
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee();
        emp1.setempno(52145);
        emp1.setname("john");
        emp1.setsalary(100000);
        System.out.println("Employee No:"+emp1.getempno()
        +"\tEmployee Name:"+emp1.getname()+"\tEmployee Salary:"+emp1.getsalary()
        );
        
        Employee emp2 = new Employee();
        emp2.setempno(65214);
        emp2.setname("david");
        emp2.setsalary(250000);
        System.out.println("Employee No:"+emp2.getempno()
        +"\tEmployee Name:"+emp2.getname()+"\tEmployee Salary:"+emp2.getsalary()
        );
    
        Payroll  emp1 = new Payroll();
        emp1.setPayRate(21);
        emp1.setPayPeriod( "8");
        emp1.setDeductions(500);
        
         System.out.println("Employee PayRate:"+emp1.getPayRate()
        +"\tEmployee Period:"+emp1.getPayPeriod()+"\tEmployee Deduction:"
                +emp1.getDeductions());
         
        Payroll emp2 = new Payroll();
        emp2.setPayRate(17);
        emp2.setPayPeriod( "10");
        emp2.setDeductions(200);
        
         System.out.println("\tEmployee Deduction:"+emp2.getDeductions()
                 +"Employee PayRate:"+emp2.getPayRate()
                 +"\tEmployee Period:"+emp2.getPayPeriod());
    
         
        Department  emp1 = new Department();
        emp1.setDeptID(56687);
        emp1.setDeptName("administration");
        
         System.out.println("Employee Department ID:"+emp1.getDeptID()
        +"\tEmployee Department Name:"+emp1.getDeptName());
         
        Department  emp2 = new Department();
        emp2.setDeptID(13350);
        emp2.setDeptName("finances");
        
         System.out.println("Employee Department ID:"+emp2.getDeptID()
        +"\tEmployee Department Name:"+emp2.getDeptName());
}
    
