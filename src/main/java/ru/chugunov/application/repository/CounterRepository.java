package ru.chugunov.application.repository;

import org.springframework.stereotype.Component;
import ru.chugunov.application.domain.Storage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrei Chugunov
 */
@Component
public class CounterRepository {

    public List getListProcessingStrings() {
        ArrayList<Storage> storages = new ArrayList<>();
        storages.add(new Storage("test row1", 1));
        storages.add(new Storage("row", 0));
        return storages;
    }
}