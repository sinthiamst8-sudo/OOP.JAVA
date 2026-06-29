public class Student {
    public String name;
    public int id;
    public int roll;
    
    public void m1(){
    System.out.println("the name is:"+name);
     
    System.out.println("the roll is:"+roll);
    
    System.out.println("the id is:"+id);
    
    
    }
    
    
}

public class Classmethod {

    public static void main(String[] args) {
        Student s1=new Student();
        
        s1.name="siam";
        s1.id= 36;
        s1.roll=6;
        s1.m1();
        System.out.println("Hello World!");
        
        Student s2=new Student();
        
        s2.name="abir";
        s2.id=56;
        s2.roll=37;
        s2.m1();
        System.out.println("ALHAMDULLAH FOR EVERYTHING . ALLAHA IS ALMIGHTY");
    }
}
