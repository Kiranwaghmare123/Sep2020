class Employee{
  private int empId;
  private String empName;
  private static int total;//static variable

    void set(int Id, String name, int t){
       empId = Id;
       empName = name;
	total=t;
    }
    void display(){
        System.out.println("Id="+empId+" "+" Name= "+empName+" Total "+total);
    }
}

class EmployeeTest1{
    public static void main(String args[]){
        Employee e1 = new Employee();
	e1.set(111,"Shubham",2);
	e1.display();
	
	e1.set(113,"Neha",1);
	e1.display();

	Employee e2 = new Employee();
	e2.set(112,"Pankaj",3);
	e2.display();
	
        
    }
}