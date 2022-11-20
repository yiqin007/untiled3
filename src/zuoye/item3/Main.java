package zuoye.item3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author 叶嘉卫
 * @date 2022/11/18/22:52
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try( FileReader fileReader = new FileReader("./a.txt", StandardCharsets.UTF_8)){
            char[] chars = new char[100];
            int read;
            while ( (read = fileReader.read(chars))!=-1) {
            }
            System.out.println(chars);
        }
    }
}
