
package lab1input;


public class Student {
    private String id="";
    private String name="";
    private String department="";
    public Student()
    {
        
    }
    public Student(String i,String n,String d)
    {
        this.id=i;
        this.name=n;
        this.department=d;
    }
    
    public void printinfo(){
        System.out.println("\nID: "+this.id);
         System.out.println("\nname: "+this.name);
          System.out.println("\nDepartment: "+this.department);
        
        
    }
}
