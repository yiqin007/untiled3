package file;

import java.io.File;
import java.io.IOException;

/**
 * @author 叶嘉卫
 * @date 2022/11/14/15:18
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        File file = new File(".");
        try {
            listDir(file.getCanonicalFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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


