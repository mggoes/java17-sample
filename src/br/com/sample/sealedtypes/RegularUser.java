package br.com.sample.sealedtypes;

/**
 * Classes witch extends sealed classes must be final, sealed or non-sealed.
 * Classes witch extends sealed classes must be in the same package as the superclass.
 */
public non-sealed class RegularUser extends User {

    @Override
    public void printDescription() {
        System.out.println("I'm a regular user");
    }
}
