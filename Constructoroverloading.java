public class JavaTeam {
    public String name;
    public String food;
    public String unifrom;
    public int code;
    
    JavaTeam(String n,String m, String o,int k){
        name=n;
        food=m;
        unifrom=o;
        code=k;
      }
    JavaTeam(String n,String m){ 
        name=n;
        food=m;
    }
    JavaTeam(int k){
        code=k;
    }
    public void show(){
    System.out.println("name:" +name);
    System.out.println("food:" +food);
    System.out.println("unifrom:" +unifrom);
    System.out.println("code:" +code);
}
}
public class ConstructorOverloading {

    public static void main(String[] args) {
        JavaTeam t1=new JavaTeam("sweet candy","burger"," blazer",2825);
        t1.show();
        JavaTeam t2=new JavaTeam("danger zone","pizza");
        t2.show();
        JavaTeam t3=new JavaTeam(1);
        t3.show();
        System.out.println("Hello World!");
    }
}
