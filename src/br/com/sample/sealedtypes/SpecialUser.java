package br.com.sample.sealedtypes;

public non-sealed class SpecialUser extends User {

    @Override
    public void printDescription() {
        System.out.println("I'm a special user");
    }
}
