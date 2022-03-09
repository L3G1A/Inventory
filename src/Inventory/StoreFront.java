package Inventory;

import java.awt.*;

public class StoreFront {

    StoreFront _storefront;

    public StoreFront getInstance(){
        if(_storefront == null) {
            _storefront = new StoreFront();
        }
        return _storefront;
    }

}
