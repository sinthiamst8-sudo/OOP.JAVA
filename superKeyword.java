public class student{//parents class//
    String name;
    int roll;
public void doclass(){
System.out.println(" i do class regularly");
}
public void show(){
System.out.println("name:"+name);
System.out.println("id:"+roll);
}   
}
 class cse extends student {//parents class//
    public cse(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public  void nata(){
    System.out.println("siam is running");
    }
}
 class taster{
public static void main(String[]args){
cse c1=new cse("siam",18);
c1.show();
c1.nata();
c1.doclass();
}



 }
