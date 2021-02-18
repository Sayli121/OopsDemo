class Employee1{
  private String name, address;
  private int year;
  public Employee1(String n, int y,  String add){
    name = n;
    year = y;
    
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  
  public String getAddress(){
    return address;
  }
}
class Emp1{
  public static void main(String[] args){
    Employee1 e1 = new Employee1("Robert", 1994, "64C- WallsStreet");
    Employee1 e2 = new Employee1("Sam", 2000,  "68d- WallsStreet");
    Employee1 e3 = new Employee1("John", 1999,  "26B- WallsStreet");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getAddress());  
    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getAddress());
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getAddress());  
  }
}