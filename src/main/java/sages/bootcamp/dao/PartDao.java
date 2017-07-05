package sages.bootcamp.dao;

import sages.bootcamp.werchouse.Part;

import java.util.List;

/**
 * Created by lary8 on 04.07.2017.
 */
public interface PartDao {
    void addPart(String name, int price, int catalogNumber);

    Part findPpartById(int id);

    Part findPpartByCatalogNumber(int catalogNumber);

    Part findPart(String name);

    List<Part> findAll();
}
