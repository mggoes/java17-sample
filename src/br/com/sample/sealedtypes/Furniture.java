package br.com.sample.sealedtypes;

/**
 * The modifier sealed can be user with interface and records.
 */
public sealed interface Furniture permits Item {

    String name();
}
