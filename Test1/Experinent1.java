package Test1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * 实验目的
 * 1. 编写、编译并运行简单Java应用程序
 * 2. 了解java.lang包的基本使用
 * 3. 掌握Java基础操作：选择、循环、数组的遍历
 *
 *
 * 实验内容
 * 1. 在Eclipse中创建Java工程
 * 2. 将Example33、Example32、Example23、Example22、Example19代码手工敲入电脑，并运行通过。
 * 3. 学习在调试环境下设置断点，单步执行这些代码。
 */
public class Experinent1 {
    private int el;
    private int[] a = new int[10];

    public void select(int a, int b){
       el = a > b ? a : b;
    } 
    
    public void cycle() {
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
            this.a[i] = in.nextInt();
        }
    }
    
    public void traversing() {
        for (int i :a){
            System.out.println("i");
        }
    }
    
}
