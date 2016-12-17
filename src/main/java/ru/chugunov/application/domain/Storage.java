package ru.chugunov.application.domain;

/**
 * Allows to represent string value from http-parameter and amount of symbols which we'll want to find
 *
 * @author Andrei Chugunov
 */
public class Storage {

    Storage(){}

    public Storage(String value, int amount) {
        this.value = value;
        this.amount = amount;
    }

    private Long id;
    private String value;
    private int amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Storage{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", amount=" + amount +
                '}';
    }
}
