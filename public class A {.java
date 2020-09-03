public class A {
    
    final void meth() {
        System.out.println("This is a final method.");
    }
}
public class B extends A {
    
    // Erro! não pode sobrepor
    void meth() {
        System.out.println("Illegal!");
    }
}