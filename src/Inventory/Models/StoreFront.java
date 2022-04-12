package Inventory.Models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StoreFront {


    /*

        This is a singleton implementation of the storefront class

        To use the class you must access via the getInstance Method

        StoreFront storeFront = StoreFront.getInstance();
     */
    private static StoreFront _storefront;

    //Database
    private StoreDB db;

    public StoreDB accessDB(){
        if(this.db == null){
            this.db = new StoreDB();

        }
        return this.db;
    }

    //Methods
    public static  StoreFront getInstance(){
        if(_storefront == null) {
            _storefront = new StoreFront();
        }
        return _storefront;
    }

}
