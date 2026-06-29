public class Teacher {
    String name;
    String color;
    int id;
    public void siam(){
    System.out.println("name is mahabub rahman siam");
    }
    public void showDisplay(){
    System.out.println("name:"+name);
    System.out.println("color:"+color);
    System.out.println("id:"+id);
    }
}
 class Student extends Teacher{

public Student(String n,String w,int i){
name=n;
color=w;
id=i;
}
}
public class Singleinheretance {

    public static void main(String[] args) {
        Student s1=new Student("mahabub","white",4250);
        s1.showDisplay();
        s1.siam();
        System.out.println("Hello World!");
    }
}
