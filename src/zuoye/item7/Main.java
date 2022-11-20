package zuoye.item7;

import java.io.*;

/**
 * @author 叶嘉卫
 * @date 2022/11/20/10:45
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("./calcCharNum.txt")));
        String s;
        int line=0;
        while((s=reader.readLine())!=null){
                s=++line+":"+s;
            System.out.println(s);
        }
    }
}
