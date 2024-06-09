package org.example.models;
import org.example.models.Enumss;

import java.lang.reflect.Method;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws  Exception {
        //Ennums
        /*
        Enumss e1 = Enumss.Black;
        System.out.println(e1.getValue());

        for(Enumss i : Enumss.values()){
            System.out.println("Ennum Value: " +i.getValue());
            System.out.println("ENNUM NAME:"+ i.name());
        }

         */

        // Annotations
        /*
        Main one = new Main();
        Method method_anno = one.getClass().getMethod("Hello");
        Custom_anno anno = method_anno.getAnnotation(Custom_anno.class);
        System.out.println(anno.value());

        Main two = new Main();
        Method method_anno2 = two.getClass().getMethod("Hello2");
        Custom_anno2 anno2 = method_anno2.getAnnotation(Custom_anno2.class);
        System.out.println(anno2.number());

         */

        
    }
    @Custom_anno(value = 7)
    public void Hello(){
        System.out.println("Custom annotations: ");
    }

    @Custom_anno2(number = 10)
    public void Hello2(){
        System.out.println("Custom annotations 2 ");
    }

}