package sages.bootcamp.werchouse;



/**
 * Created by lary8 on 04.07.2017.
 */
public class Part {

    int id;

    String namePart;

    int catalogNumber;

    int price;

//    @Override
//    public String toString() {
//        return "Part{" +
//                "available_quantity=" + available_quantity
//                '}';
//    }

    int available_quantity;

    public Part(String partName, int price) {

    }
    public Part() {

    }

    public String getNamePart() {
        return namePart;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public int getPrice() {
        return price;
    }

    public int getAvailable_quantity() {
        return available_quantity;
    }

    public Part(int id, String namePart, int catalogNumber, int price, int available_quantity) {

        this.id = id;
        this.namePart = namePart;
        this.catalogNumber = catalogNumber;
        this.price = price;
        this.available_quantity = available_quantity;
    }

    public int getId() {
        return id;
    }
}
