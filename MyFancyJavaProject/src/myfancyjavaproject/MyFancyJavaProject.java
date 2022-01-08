
package myfancyjavaproject;

private class MyFancyJavaProject {

    private static MyFancyJavaProject student;
    int roll;
    int age;
    
    private MyFancyJavaProject(int roll, int age){
        
        this.roll = roll;
        this.age = age;
        
    }
    
    
  
//    public static void main(String[] args) {
//
//        //MyFancyJavaProject student = new MyFancyJavaProject(12,15);
//
//        //System.out.println("roll:"+student.roll+"__________"+"age:"+student.age);
//
//
//
//    }

    private static get student(int roll,int age)
    {
        if (student==NULL)
        {
            student=new MyFancyJavaProject(roll,age);
        }
        return student();

    }
    
}
