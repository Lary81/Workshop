package sages.bootcamp.werchouse;

/**
 * Created by lary8 on 04.07.2017.
 */
public class Part {

    int id;
    String namePart;
    int catalogNumber;
    int price;

    public String getNamePart() {
        return namePart;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public int getPrice() {
        return price;
    }

    public Part(int id, String namePart, int catalogNumber, int price) {

        this.id = id;
        this.namePart = namePart;
        this.catalogNumber = catalogNumber;
        this.price = price;
    }
}
