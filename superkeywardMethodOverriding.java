public class siam{
void show(){
    System.out.println("i am eating rice");
}
}
class abir extends siam{
void show(){
super.show();
    System.out.println("he is eating gaza");
}
 }
  class taster{
public static void main (String[]args){
    abir a1=new abir();
    a1.show();
}


 }
