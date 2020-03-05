
package lab1input;

import java.util.Scanner;

public class mainclass {

    public static void main(String[] args) {
        String name="";
        String id="";
        String department="";
        do
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        id=sc.nextLine();
        if(id.equals("exit")){break;}
        System.out.println("enter name");
        name=sc.nextLine();
        if(name.equals("exit")){break;}
         System.out.println("enter department");
        department=sc.nextLine();
        if(department.equals("exit")){break;}
        
   
       
       Student s=new Student(id,name,department);
       s.printinfo();
    }
        while(true);
    }
    
}
