package com.frs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by frace on 2019/9/12 11:26
 */
public class RandomAccessFileDemo {

    File file = new File("");
    RandomAccessFile randomAccessFile;

    {
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(randomAccessFile.getFilePointer());
            randomAccessFile.write('a');
            randomAccessFile.write('b');
            int i=0x7fffffff;
            //write方法每次只能写一个字节，若写入i需要写四次
//            randomAccessFile.write(i>>>24);//高8位
//            randomAccessFile.write(i>>>16);
//            randomAccessFile.write(i>>>8);
//            randomAccessFile.write(i);
            //等同yu
            randomAccessFile.writeInt(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
