package test2.edu.hue.b;

import test2.edu.hue.a.*;

//public class ClassC extends ClassA {
//    
//    int value;
//    
//    public void fuzhi(){
//        this.value = 3;
//    } // fuxie
//    
//    public void fuzhi(int value){
//        super.value = this.value + value;
//    }
//}

public class ClassC implements ClassA{
    int value;

    @Override
    public void fuzhi() {
        this.value = 3;
    }
}
