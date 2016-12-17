package ru.chugunov.application.domain;

/**
 * Allows to represent string value from http-parameter and amount of symbols which we'll want to find
 *
 * @author Andrei Chugunov
 */
public class Storage {
    private String value;
    private int amount;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    //TODO
    @Override
    public boolean equals(Object o) {
        return false;
    }

    //TODO
    @Override
    public int hashCode() {
        return 0;
    }
}
