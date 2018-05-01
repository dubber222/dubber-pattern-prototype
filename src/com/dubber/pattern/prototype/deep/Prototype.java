package com.dubber.pattern.prototype.deep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dubber on 2018/5/1.
 */
public class Prototype implements Cloneable, Serializable {

    public String name = "ces";
    public List<String> list = new ArrayList<String>();
    public A a = new A();

   /* public Prototype() {
        this.a = new A();
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "name: " + name + list.toString();
    }

    /**
     * 用序列化、反序列化实现
     */

    public Object deepClone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
            oos.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
            Prototype prototype2 = (Prototype) ois.readObject();
            return prototype2;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}

class A implements Serializable {
}
