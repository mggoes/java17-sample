package br.com.sample.sealedtypes;

public abstract sealed class User permits RegularUser, SpecialUser {

    public abstract void printDescription();
}
