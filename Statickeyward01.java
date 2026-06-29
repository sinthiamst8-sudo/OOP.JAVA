public class Student {
    public String name;
    public int roll;
 static String univercity="pundra univercity";
    public int id;
    
    Student(String n,int m,int l){
    name=n;
    roll=m;
    id=l;
    
    }
    public void display(){
    System.out.println("name:"+name);
    System.out.println("roll:"+roll);
    System.out.println("univercity:"+univercity);
    System.out.println("id:"+id);
}
}
    
public class StaticVariable {

    public static void main(String[] args) {
        Student s1=new Student("siam",6,2222);
        s1.display();
        Student s2=new Student("abir",7,2222);
        s2.display();
        System.out.println("Hello World!");
    }
}
