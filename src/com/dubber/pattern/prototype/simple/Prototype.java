package com.dubber.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dubber on 2018/5/1.
 */
public class Prototype implements Cloneable{

    public String name = "ces";
    public List<String> list = new ArrayList<String>();

    public A a = new A();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return "name: " + name + list.toString();
    }
}

class A{}
