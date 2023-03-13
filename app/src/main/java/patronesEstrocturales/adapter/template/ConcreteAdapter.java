package patronesEstrocturales.adapter.template;

public class ConcreteAdapter implements IAdapter{
     // agregar al objeto que se necesitamos adaptar como attribute

     private Adapter adapter;

     public ConcreteAdapter(Adapter adapter){
         this.adapter= new Adapter();
     }
 
     @Override
     public void method1() {
         this.adapter.getAttribute1();
         this.adapter.operation1();
     }
 
     @Override
     public void method2() {
         this.adapter.operation2();
     }
 
     @Override
     public void method3() {
         this.adapter.operation3();
     }
 
     @Override
     public void operation() {
         // logica antes
 
         this.adapter.setAttribute1("abc");
         this.adapter.method();
 
         // logica despues
     }
}
