package sages.bootcamp.werchouse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lary8 on 04.07.2017.
 */
public class Werchouse {
    public Werchouse(int partWerchouseCapacity, String partName) {
        this.partWerchouseCapacity = partWerchouseCapacity;
        this.partName = partName;
    }

    int partWerchouseCapacity;
    String partName;
    List<Part> parts = new ArrayList<Part>();


}
