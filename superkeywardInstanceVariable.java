public class siam{
int x=10;
}
class abir extends siam{
int x=20;
void show(){

    System.out.println("x="+super.x);
}
 }
  class taster{
public static void main (String[]args){
    abir a1=new abir();
    a1.show();
}


  }
