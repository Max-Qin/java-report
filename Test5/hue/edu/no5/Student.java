package Test5.hue.edu.no5;

public class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;
    //创建Student类，设置name(String), age(int), score(double)三个属性。
    
    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Student){
            if(obj.hashCode() == this.hashCode())return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + score;
    }

    @Override
    public int hashCode() {
        int sum = 0;
        return this.name.hashCode() * age;
    }
    // 实现Student类的构造函数，equals，hashCode，toString函数。


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
    
    public Student(String name, int age, double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
