package outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 叶嘉卫
 * @date 2022/11/14/19:00
 * @Description:
 */
public class test {
    public static void main(String[] args) throws IOException {

        try( FileInputStream fileInputStream = new FileInputStream("E:/test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("E:/11.txt")){
            byte[] bytes = new byte[100];
            int read;
            while((read = fileInputStream.read(bytes))!=-1){
            }
            fileOutputStream.write(bytes);
        }


    }
}
