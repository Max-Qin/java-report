package Test6.edu.hue.jk;

public class Student {
    public String id;
    public String name;
    public boolean sex;
    public int score;
    public int deptno;
    // 创建一个Student类，包结构如上所示。类中有5个属性：
    //id(String)，name(String)，sex(boolean), score(int), deptno(int)
    public Student(String id,String name,boolean sex,int score,int deptno) {
        this.id =id;
        this.name = name;
        this.sex = sex;
        this.score =score;
        this.deptno = deptno;
    }
    
    public String toString(){
        String Sex = this.sex ? "nan" : "nv";
        return id+ "\t" + name + "\t" + Sex + "\t" + score + "\t" + deptno;
    } // 创建toString函数，输出Student内容，以制表符分割。
}
