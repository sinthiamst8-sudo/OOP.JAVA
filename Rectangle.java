public class Reactangle {
    int a;
    int b;
  
      Reactangle(int a,int b){
    this.a=a;
    this.b=b;
     
     }
}
 class Reactanglearea{
 Reactangle react;
 
Reactanglearea(Reactangle r){
    this.react=r;
}
void Areareactangle(){
int reasult=react.a*react.b;
System.out.println("area of react:"+reasult);
}
 }
public class Rectangle {

    public static void main(String[] args) {
        Reactangle r1=new Reactangle(7,5);
        Reactanglearea ac=new Reactanglearea(r1);
        ac.Areareactangle();
        System.out.println("Hello World!");
    }
}
