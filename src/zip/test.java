package zip;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @author 叶嘉卫
 * @date 2022/11/14/20:16
 * @Description: 打包zip和读取
 */
public class test {
    public static void main(String[] args) throws IOException {
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream("test.zip"))) {
            File[] files = new File[]{new File("a.txt"), new File("b.txt")};
            for (File file : files) {
                if (file.createNewFile()) {
                    System.out.println("true");
                }
                zip.putNextEntry(new ZipEntry(file.getName()));
                System.out.println(file.getName());
                zip.write(Files.readAllBytes(file.toPath()));
                zip.closeEntry();
            }
        }

        try (ZipInputStream input = new ZipInputStream(new FileInputStream("./test.zip"))) {
            ZipEntry entry = null;
            while ((entry = input.getNextEntry()) != null) {
                String s;
                String name = entry.getName();
                if (!entry.isDirectory()) {
                    int n;
                    StringBuilder sb = new StringBuilder();
                    while ((n = input.read()) != -1) {
                        sb.append((char) n);
                    }
                    s = sb.toString();
                    System.out.println(s);
                }

            }


        }
    }
}