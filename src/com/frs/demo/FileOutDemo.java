package com.frs.demo;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by frace on 2019/9/17 15:19
 */
public class FileOutDemo {
    public static void main(String[] args) {

        try {//存在删除后重建，不存在创建
            FileOutputStream fileOutputStream = new FileOutputStream("out.bat");
            try {
                fileOutputStream.write('A');
                fileOutputStream.write('B');
                int a=10;
                fileOutputStream.write(a>>>24);
                fileOutputStream.write(a>>>16);
                fileOutputStream.write(a>>>8);
                fileOutputStream.write(a);
                byte[] gbk="坤奇".getBytes("gbk");
                fileOutputStream.write(gbk);
                fileOutputStream.close();



            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
