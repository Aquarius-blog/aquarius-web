package com.example.aquariusweb;

import java.util.ArrayList;
import java.util.List;

public class Test {

    //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        String a = "这是堆内存溢出";
        while(true){//申请的内存过大
            a = a + a;
            list.add(a);
        }
    }



    //Exception in thread "main" java.lang.StackOverflowError
//    public static void main(String[] args) {
//        Test.test();
//    }
//    static void test() {
//
//        test();
//    }
}
