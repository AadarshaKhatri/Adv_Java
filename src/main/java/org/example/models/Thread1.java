package org.example.models;
import org.example.models.Multiple_sync;
public class Thread1 extends Thread {
    public synchronized void run(int n){

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

