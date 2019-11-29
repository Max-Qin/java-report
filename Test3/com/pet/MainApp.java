package Test3.com.pet;

import Test3.com.pet.animal.*;
import Test3.com.pet.food.*;
import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {
        Dog dog = new Dog();
        
        Food[] a = { new Meat(), new Bone(), new Bone(), new Meat(), new Meat(), new Bone()} ;
        
        int money = 200;
        for(Food i  :  a) {
            money = dog.eat(i,money);
            System.out.println("今天吃了：" + i + "还剩：" + money + "元");
        }
    }
}
