public class Dog {
     public String name="elon mask";
 public String food;
 public String color;
  
 public void Pass(){
 System.out.println(name);
 System.out.println(food);
 System.out.println(color);
 }
 public void m1(String n,String m){
 this. color=n;
 this. color=m;
 }
    
}
public class Perametar {

    public static void main(String[] args) {
        Dog d1=new Dog();
       
        d1.food="meet";
        d1.color="white";
        d1.Pass();
        Dog d2=new Dog();
       
        d2.food="chiken";
        d2.color="red";
        d2.Pass();
        d1.m1("jumping","handling");
        System.out.println("Hello World!");
    }
}
