public class Dog {
    public String name;
    public String color;
    public String food;
    public int soon;
    
    Dog(){
    name= "passu";
    color="green";
    food="white rice";
    soon=10;
    }
    
    Dog(String m,String n,String o,int p){
    
    name=m;
    color=n;
    food=o;
    soon=p;
    
    }
    
    public void self(){
    
    System.out.println("name:"+name);
    System.out.println("color:"+color);
    System.out.println("food:"+food);
    System.out.println("soon:"+soon);
    }
    
}
public class DefaultConstructor {

    public static void main(String[] args) {
        Dog d1=new Dog("Hulkum","white","meet",5);
        d1.self();
        
         Dog d2=new Dog("hablu","black","chiken",7);   
         d2.self();
         Dog d3=new Dog();
         d3.self();
        System.out.println("Hello World!");
    }
           }
