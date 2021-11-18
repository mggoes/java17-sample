package br.com.sample;

import br.com.sample.sealedtypes.*;

public class Main {

    public static void main(String[] args) {
        User user = new RegularUser();
        user.printDescription();

        user = new SpecialUser();
        user.printDescription();

        Furniture chair = new Item("Chair");
        System.out.println(chair.name());

        Furniture table = new Item("Table");
        System.out.println(table.name());

        /*
         * Pattern matching
         */
        switch (user) {
            case RegularUser u -> {
                System.out.println("Regular user says...");
                u.printDescription();
            }
            case SpecialUser u -> {
                System.out.println("Special user says...");
                u.printDescription();
            }
        }
    }
}
