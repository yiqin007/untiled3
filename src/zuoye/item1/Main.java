package zuoye.item1;

import java.io.File;
import java.io.IOException;

/**
 * @author 叶嘉卫
 * @date 2022/11/18/19:52
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String s = new String("D:/HelloWorld.txt");
        File file = new File(s);
        if(file.createNewFile()){
            System.out.println("创建文件成功");
        }
        if(file.isFile()){
            System.out.println("是文件");
        }else if(file.isDirectory()){
            System.out.println("是目录");
        }
        File file1 = new File("D:\\IOTest");
        if(!file1.exists()){
            if(file1.mkdir()){
                System.out.println("创建目录成功");
            }
        }

        if(file.renameTo(new File(file1+"\\HelloWorld.txt"))){
            System.out.println("移动文件成功");
        }
        String[] list = file1.list();
        for (String name:
             list) {
            if(name!=null){
                System.out.println(name);
            }
        }

    }
}
