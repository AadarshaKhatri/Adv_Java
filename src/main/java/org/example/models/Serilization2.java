package org.example.models;

import java.io.*;

public class Serilization2 implements Serializable  {
    String message;
    public String  Values(){
        return "Hello, Everyone";
    }

    public static void main(String[] args) throws Exception {
        Serilization2 data = new Serilization2();
        data.message = "This message is going to be serialized! ";
        File f = new File("Serializing.txt");
        try {


            FileOutputStream fs = new FileOutputStream(f);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(data);
            System.out.println("The value has been serialized");
        }catch (Exception e){
            System.out.println("There is an error!");
        }
        try {
            Serilization2 data2 = new Serilization2();
            FileInputStream fws = new FileInputStream(f);
            ObjectInputStream Ows = new ObjectInputStream(fws);
            data2 = (Serilization2) Ows.readObject();
            System.out.println("Message:" + data2.message);
        }catch (Exception e ){
            System.out.println("Errorrrrrrrrrrrrrrrrrrrrrrr! ");
        }



    }

}
