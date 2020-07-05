package com.at.guigu.java;

import java.util.ArrayList;

/**
 * @author lilibo
 * @create 2020-07-04 9:06 PM
 *
 * 1.IDEA中代码模板所处的位置:setting - Editor - Live Templates / Postfix Complection
 * 2.常用模板
 */
public abstract class TemplateTest {

    //模板6: prsf: 可生成private static final
    private static final Integer count = new Integer(0);
    // 变形: psf
    public static final int NUM = 0;
    // 变形: psfi / psfs
    public static final int COUNT = 1;
    public static final String country = "china";


    //模板1: psvm
    public static void main(String[] args) {
        //模板2: sout
        System.out.println("hello");
        // 变形: soutp /soutm /soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        int num = 10;
        System.out.println("num = " + num);
        int num1 =20;
        System.out.println(num);

        //模板3: fori
        String[] array = new String[]{"he", "lili", "xiaozhu"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //  变形: iter
        for (String s : array) {
            System.out.println(s);
        }
        // 变形: itar
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            System.out.println("args = [" + args + "]");
        }

        //模板4:list for
        ArrayList<Object> list = new ArrayList<>();
        list.add(124);
        list.add(456);
        for (Object o : list) {
            System.out.println(o);
        }
        // 变形: list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println("args = [" + args + "]");
        }
        // 变形: list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("args = [" + args + "]");
        }
    }

    public void method(){
        System.out.println("TemplateTest.method");
        ArrayList list = new ArrayList();
        list.add(124);
        list.add(456);
        list.add(789);
        //模板5: ifn
        if (list == null) {
            System.out.println("list == null");
        }
        // 变形inn
        if (list != null) {
            System.out.println("list!=null");
        }
        // 变形: xxx.null / xxx.nn
        if (list == null) {
            System.out.println("list == null");
        }
        if (list != null) {
            System.out.println("list!=null");
        }
    }

}
