public class Dog {
    public String name;
    public String food;
    public String gender;
    public String color;
    
    public void display(){
    System.out.println("name:"+name);
    System.out.println("food:"+food);
    System.out.println("gender:"+gender);
    System.out.println("color:"+color);
    
    }
    
    
}
public class Method {

    public static void main(String[] args) {
        
        Dog d1=new Dog();
        
        d1.name="buddy";
        d1.food="meet";
        d1.gender="male";
        d1.color="white";
        
        d1.display();
        
         Dog d2=new Dog();
        
        d2.name="kiddy";
        d2.food="meet";
        d2.gender="women";
        d2.color="black";
        
        d2.display();
        
         Dog d3=new Dog();
        
        d3.name="pikku";
        d3.food="meet";
        d3.gender="male";
        d3.color="red";
        
        d3.display();
        System.out.println("Hello World!");
    }
}
