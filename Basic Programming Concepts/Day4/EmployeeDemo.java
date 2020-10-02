class Employee{
    private int empId;
    private String empName;
    void set(int id, String name){
        empId = id;
        empName = name;
    }
    void show(){
        System.out.println(empId+" "+empName);
    }
}
class EmployeeDemo{
    public static void main(String args[]){
        Employee e = new Employee();
        e.set(101,"ram");
        e.show();
        e.set(102,"shiv");
        e.show();
    }
}