package com.company;

import java.io.*;

public class SerializationDemo {
    public static void writeDemo()throws Exception{
        StudentInfo s1 =new StudentInfo(211,"ravi");

        FileOutputStream fout=new FileOutputStream("studentInfo.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);

        out.writeObject(s1);
        out.flush();
        System.out.println("success");
    }
    public static void readDemo() throws Exception {

        ObjectInputStream in=new ObjectInputStream(new FileInputStream("studentInfo.txt"));
        StudentInfo s=(StudentInfo)in.readObject();
        System.out.println("ID: " + s.id+", name: "+s.name);

        in.close();
    }
}


class StudentInfo implements Serializable{
    int id;
    String name;
    public StudentInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }
}