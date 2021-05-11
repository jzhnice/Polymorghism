package DEMO04;

import java.lang.module.Configuration;
import java.sql.Connection;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-11 10:23
 */
//多态性的举例

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }

    public void func(Animal animal) {  //          Animal animal1 = new Dog();

        animal.eat();
        animal.shout();
    }
    public void func(Dog dog){
        dog.eat();
        dog.shout();
    }
    public void func(Cat cat){
        cat.eat();
        cat.shout();
    }
}

    class Animal {
        public void eat() {
            System.out.println("动物，进食");
        }

        public void shout() {
            System.out.println("动物，叫");
        }
    }

    class Dog extends Animal {

        @Override
        public void eat() {
            System.out.println("狗吃狗粮");
        }

        @Override
        public void shout() {
            System.out.println("动汪汪汪");
        }
    }

    class Cat extends Animal {

        @Override
        public void eat() {
            System.out.println("猫吃鱼");
        }

        @Override
        public void shout() {
            System.out.println("喵喵喵");
        }
    }
    //距离二:
class Order{
    public void method(Object obj){

    }
    }

    class   Driver{
    public void doData(Connection conn){ // conn= new MYSQIConnection()
        //规范的操作数据
//

    }
    }