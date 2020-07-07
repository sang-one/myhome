package demo.ex;

import org.apache.commons.lang3.StringUtils;
import org.apache.el.stream.Stream;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class MyException extends Exception {
    public String demoexception(String msg){

        return null;
    }

    public static void main(String[] args) {
        String dd = new String("C:\\Users\\sang\\Documents\\新建文本文档.txt");
        File file = new File(dd);
        int a[]={1,5,6,7};
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
        String sss[]={"123444422","沃尔沃","舒服舒服撒"};
       String y="fdsf.txt";
        String substring = y.substring(y.lastIndexOf('.')+1).toUpperCase();
        System.out.println(substring);
        try {
            Field name = rotate.class.getDeclaredField("name");
            System.out.println(name);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
