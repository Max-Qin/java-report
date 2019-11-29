package Test3.com.pet.animal;

import Test3.com.pet.food.*;

public class Dog {

    public int eat(Food food, int money) {
        return money - food.needMoney();
    }

}
