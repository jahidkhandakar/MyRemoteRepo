
package myfancyjavaproject;

public class MyFancyJavaProject {
    
    
    int roll;
    int age;
    String name;
    String address;
    
    MyFancyJavaProject(int roll, int age,String name, String address){
        
        this.roll = roll;
        this.age = age;
        this.name = name;
        this.address = address;
        
    }
    
    
  
    public static void main(String[] args) {
        
        MyFancyJavaProject student = new MyFancyJavaProject(12,15,"spider","NewYork");
        
        System.out.println("roll:"+student.roll+"__________"+"age:"+student.age+"_____"+"name:"+student.name+"_____"+"address:"+student.address);
       
    }
    
}
