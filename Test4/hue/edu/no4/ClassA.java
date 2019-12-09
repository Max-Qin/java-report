package Test4.hue.edu.no4;

public class ClassA {
    public void method1() {
        throw new ExceptionA();
    }//method1中抛出异常ExceptionA

    public void method2() throws ExceptionB {
        throw new ExceptionB();
    }// method2中抛出异常ExceptionB

    public void method3() {
        try {
            method1();
        } catch (ExceptionA e) {
            // 捕获的ExceptionA，打印异常栈内容
            e.printStackTrace();
        }

        try {
            method2();
        } catch (ExceptionB e) {
            // 捕获的ExceptionB，重新抛出一个新的异常IllegalArgumentException
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.method3();
    }
}
