package Test5.hue.edu.no5;

import java.util.*;

public class ClassA {
    Student Tom = new Student("Tom", 14, 88.5);
    Student Jack = new Student("Jack", 16, 33);
    Student Mary = new Student("Mary", 35, 58);
    // 创建ClassA类，并在其中定义三个Student实例（Tom, Jack, Mary)。
    
    public void method1(){
        ArrayList<Student> a = new ArrayList<>();
        a.add(Tom);
        a.add(Jack);
        a.add(Mary);
        for(Student i : a) System.out.println(i);
    }// method1：使用ArrayList集合放置三个Student实例，并遍历输出。
    
    public void method2(){
        HashSet<Student> a = new HashSet<>();
        a.add(Tom);
        a.add(Jack);
        a.add(Mary);
        for(Student i : a) System.out.println(i);
    }// method2：使用HashSet集合放置三个Student实例，并遍历输出。
    
    public void method3(){
        SortedSet<Student> a = new TreeSet<>();
        a.add(Tom);
        a.add(Jack);
        a.add(Mary);
        Iterator<Student> it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }//method3：使用SortedSet集合放置三个Student实例，并实现按照年龄升序排列输出。
    
}
