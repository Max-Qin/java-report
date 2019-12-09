package Test5.hue.edu.no5;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o2.score - o1.score);
    }//创建比较器ScoreComparator，实现按照score降序排列
}
