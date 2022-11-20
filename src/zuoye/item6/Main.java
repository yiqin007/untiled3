package zuoye.item6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 叶嘉卫
 * @date 2022/11/18/23:12
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> Map = new HashMap<>();
        File file = new File("./calcCharNum.txt");
        try( FileInputStream fileInputStream = new FileInputStream(file);){

            int length=0;
            while((length=fileInputStream.read())!=-1)
            {
                char c=(char)length;
                int i=0;
                if(Map.get(c+"")!=null){
                     i = Map.get(c+"").intValue();
                }
                if((c<='Z'&&c>='A')||(c<='z'&&c>='a'))
                Map.put(c+"",i+1);
            }
        }
        for (java.util.Map.Entry entry:
             Map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
