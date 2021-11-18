package br.com.sample.sealedtypes;

/**
 * Permits must always be declared, unless the subclasses are in the same file as the superclass.
 * In this case, there is no need to declare it.
 */
public abstract sealed class Product {

    public abstract String getName();
}

non-sealed class CheapProduct extends Product {

    private final String name;

    public CheapProduct(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

non-sealed class ExpensiveProduct extends Product {

    private final String name;

    public ExpensiveProduct(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
