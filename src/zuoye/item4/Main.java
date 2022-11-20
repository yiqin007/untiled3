package zuoye.item4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 叶嘉卫
 * @date 2022/11/18/22:58
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try(FileWriter fileWriter = new FileWriter("./Hello.txt")) {
            fileWriter.write("HelloHavaWorld你好世界");
        }

    }
}
