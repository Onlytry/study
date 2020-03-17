package org.example.test;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/10 15:34
 */
public class Test {
    static double height = 100;
    static double distance = 100;
     public static void main(String[] args) {
          for(int i=1; i<2; i++) {
               distance = distance + height;
               height = height / 2;
              }

          System.out.println("路程：" + distance);
          System.out.println("高度：" + height / 2);
       }
}
