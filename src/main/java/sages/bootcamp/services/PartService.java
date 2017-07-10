package sages.bootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sages.bootcamp.dao.PartDao;
import sages.bootcamp.werchouse.Part;

import java.util.List;

/**
 * Created by lary8 on 05.07.2017.
 */@Service
public class PartService {
    @Autowired
    PartDao partDao;



    public void addPart(String partName, int numer,int price ,int ilosc) {
        addPart(new Part(0, "partName", 2,price,ilosc));
    }

    public void addPart(Part part) {
        partDao.addPart();
    }
    public void addPart(String partName, int price){
        addPart(new Part(partName,price));
    }

    public Part findPart(int id) {
        return partDao.findPpartById(id);
    }

    public Part findPart(String name) {
        return partDao.findPartByName(name);
    }

    public List<Part> findAll() {
        return partDao.findAll();
    }

}
