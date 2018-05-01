package com.dubber.pattern.prototype.simple;

/**
 * Created by dubber on 2018/5/1.
 */

/**
 *  这种方法是浅赋值的，赋值对象中所有的属性，变量，引用变量的值、地址都是一样的，不科学，没有什么意义。
 */
public class ProtoTest {

    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        System.out.println(prototype.a);
        try {
            Prototype prototypeClone = (Prototype) prototype.clone();
            System.out.println(prototypeClone.a);

            System.out.println(prototype == prototypeClone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
