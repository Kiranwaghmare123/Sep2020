package Day4;
/*Ex:
//Class 1
Employee
-empId:int
-empName:String

+set(empId:int,empName:String):void
+display():void

//Class 2
EmployeeTest
+main()
*/
class Employee
{
    private int empId;
    private String empName;
    
    void set(int empId,String empName)
    {
        empId = empId;
        empName = empName;
    }
    
    void display()
    {
        System.out.println("Id= "+empId+" Name= "+empName);
    }
    
}

class EmployeeTest
{
    public static void main(String args[])
    {
        Employee e = new Employee();
        e.set(551, "Roshani");
        e.display();
    }
}