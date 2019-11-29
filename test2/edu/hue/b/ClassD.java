package test2.edu.hue.b;

import test2.edu.hue.a.ClassA;
import test2.edu.hue.a.ClassB;

public class ClassD {
    
    public final int value = 4;
    
    public final void fuzhi(){
        System.out.println(this.value);
    }
    public static void main(String[] args) {
        ClassA a = new ClassA(); 
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        ClassD d = new ClassD();
    }
}
