package org.example.models;

public class Multiple_sync {
    synchronized void Multi(int n ){
        try{
            for(int i = 0 ; i <10 ; i++){
                System.out.println(n*i);
            }
            Thread.sleep(200);
        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
