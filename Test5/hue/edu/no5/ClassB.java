package Test5.hue.edu.no5;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ClassB {
    Student Tom = new Student("Tom", 14, 88.5);
    Student Jack = new Student("Jack", 16, 33);
    Student Mary = new Student("Mary", 35, 58);
    //创建ClassB类，并在其中定义三个Student实例（Tom, Jack, Mary)。
    
    public void method4(){
        SortedSet<Student> a = new TreeSet<>(new ScoreComparator());
        a.add(Tom);
        a.add(Jack);
        a.add(Mary);
        Iterator<Student> it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    // 在ClassB中创建method4方法，使用SortedSet集合放置三个Student实例，并实现按照score降序输出。
}
