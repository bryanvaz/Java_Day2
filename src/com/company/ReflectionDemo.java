package com.company;

import java.lang.reflect.*;

public class ReflectionDemo {
    public static void simpleReflection(){
        Simple s=new Simple();

        Test t=new Test();
        t.printName(s);
    }

    public static void classReflection () {
        Class c = boolean.class;
        System.out.println(c.getName());

        Class c2 = Test.class;
        System.out.println(c2.getName());
    }

    public static void fieldDemo(){
        Class s = Simple.class;
        Field[] fields = s.getFields();
        for(int i = 0; i< fields.length; i++) {
            System.out.println("Field Name: " + fields[i].getName());
            System.out.println("Field Type: " + fields[i].getType());
        }
    }

    public static void methodDemo() throws Exception {
        Class testClass = Test.class;
        Method method = null;

        method = testClass.getMethod("printName", Object.class);

        System.out.println("Method Sig: " + method.toString());

        Object newObj = testClass.newInstance();
        method.invoke(newObj,testClass);
    }
}

class Simple{
    public int aNumber = 9;
}

class Test{
    public void printName(Object obj){
        Class c=obj.getClass();
        System.out.println(c.getName());
    }
}