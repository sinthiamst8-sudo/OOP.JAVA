public class House {
     public String name;
    public String woner;
    public int window;
    public int door;
    
     House(String n,String m,int o,int p){
    name=n;
    woner=m;
    window=o;
    door=p;
    
    }
    
    public void show(){
    System.out.println("bulding name :"+name);
    System.out.println("the woner is :"+woner);
    System.out.println("door :"+door);
    System.out.println("window :"+window);
    
    }
    
}
public class Constructor1 {

    public static void main(String[] args) {
        House h1=new House("siam vila","siam",6,5);
        h1.show();
        System.out.println("Hello World!");
    }
}
