package ders27_immutableClasses_DateAndTime;

import java.time.LocalDateTime;

public class C06 {
    public static void main(String[] args) {

        LocalDateTime zaman= LocalDateTime.now();

        System.out.println(zaman);

        System.out.println(zaman.getDayOfYear());




    }
}
