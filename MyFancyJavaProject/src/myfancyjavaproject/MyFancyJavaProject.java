
package myfancyjavaproject;

public class MyFancyJavaProject {
    
    
    int roll;
    int age;
    
    MyFancyJavaProject(int roll, int age){
        
        this.roll = roll;
        this.age = age;
        
    }
    
    
  
    public static void main(String[] args) {
        
        MyFancyJavaProject student = new MyFancyJavaProject(12,15);
        
        System.out.println("roll:"+student.roll+"__________"+"age:"+student.age);
       
    }
    
}
