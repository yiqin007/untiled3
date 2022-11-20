package zuoye.item5;

import java.io.*;

/**
 * @author 叶嘉卫
 * @date 2022/11/18/23:01
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try(FileInputStream ips = new FileInputStream("D:/Capture001.png");
            FileOutputStream ops = new FileOutputStream("./Capture001.png");
        ){
            int length;
            byte[] bytes = new byte[1024];
            while((length=ips.read(bytes))!=-1){
                ops.write(bytes,0,length);
            }

        }
    }
}
