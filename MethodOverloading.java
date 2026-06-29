public class Method {
     public void add(int a,int b){
     
     System.out.println(a+b);
     }
    public void add(double a,double b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    
    }
    public void add(){
    System.out.println("NO show value");
    }
}
public class MethodOverloading {

    public static void main(String[] args) {
        Method ob1=new Method();
        ob1.add(5,11);
        ob1.add(7.5,8.5);
        ob1.add(7,8,12);
        Method ob2=new Method();
        ob2.add(10,20);
        ob2.add(27,30,98);
        ob2.add(0.5,2.5);
        

        
        System.out.println("Hello World!");
    }
}
