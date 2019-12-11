package Test6.edu.hue.jk;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        File f = new File("testset/dir1/file1.txt");

        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(f));
            String line;
            while((line = reader.readLine()) != null){
                String[] xinxi = line.split(" ");
                String id = xinxi[0];
                String name = xinxi[1];
                boolean sex = xinxi[2].equals("1");  // 1为女 0 为男
                int score = new Integer(xinxi[3]);
                int deptno = new Integer(xinxi[4]);
                Student ss = new Student(id,name,sex,score,deptno);
                a.add(ss);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // 读取file1.txt文件，每一行创建一个Student对象实例。实例列表存放在ArrayList容器中。
        
        File f1 = new File("testset/dir2/file2.txt");
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter(f1));
            for(Student i : a){
                writer.write(i.toString());
                writer.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }//遍历ArrayList容器，并将输出写入到一个新的文件file2.txt中。file2.txt文件位于dir2目录中。
    }
}
