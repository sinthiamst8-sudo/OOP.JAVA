public class Inheretance {
    public String name;
    public int id;
    
    public void siam(){
    System.out.println("iam eating rice");
    }
     public void abir(){
     System.out.println("name="+name);
     System.out.println("name="+id);
     
     }
}
 class Singleinheretence extends Inheretance{

public Singleinheretence(String a,int b){
name=a;
id=b;
}
}
public class SingleInheretance {


    public static void main(String[] args) {
        Singleinheretence a1=new Singleinheretence("siam",30 );
        a1.siam();
        a1.abir();
      
    }
    
}
