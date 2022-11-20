package zuoye.item2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 叶嘉卫
 * @date 2022/11/18/20:20
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        File file = new File(s);
        listDir(file.getCanonicalFile());
    }


    static int depth=0;
    static void listDir(File dir) {
        // TODO: 递归打印所有文件和子文件夹的内容
        File[] fs = dir.listFiles();
        String blank = "\t";
        blank = blank.repeat(depth);
        if (fs != null) {
            for (File f : fs) {
                if(f.isDirectory()) {
                    System.out.println(blank+f.getName()+"/");
                    depth++;
                    listDir(f);
                    depth--;
                }else {
                    System.out.println(blank+f.getName());
                }
            }
        }
    }
}
