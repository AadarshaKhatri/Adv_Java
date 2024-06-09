package org.example.models;

import java.io.*;

public class Seriei implements Serializable {
    int i;
    public static void main(String[] args) throws Exception{
        Seriei object = new Seriei();
        object.i = 4;

        //serilization
        File f = new File("C:\\Users\\user\\IdeaProjects\\Adv_Java\\demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(object);

        //deserialization
        Seriei object2 = new Seriei();
        FileInputStream fws = new FileInputStream(f);
        ObjectInputStream ows = new ObjectInputStream(fws);
        object2 = (Seriei)ows.readObject();
        System.out.println(object2.i);




    }
}
