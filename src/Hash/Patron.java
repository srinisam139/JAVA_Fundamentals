package Hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This is the class for storing the list of objects in the list, and we can add an object to the list
 * whenever we want by calling the add method, and we can also add the books by storing the values in the list of
 * the patron class and add fine method is used to store the fine.
 */
public class Patron {
    List<LibraryPatron> list = new ArrayList<>();

    void addPatron(LibraryPatron p) {
        list.add(p);
    }

    LibraryPatron getPatron(String ID){
        for (LibraryPatron libraryPatron : list) {
            if (Objects.equals(libraryPatron.getID(), ID)) {
                return libraryPatron;
            }
        }
        return null;
    }
    void addBook(String ID, String name){
        LibraryPatron temp=getPatron(ID);
        temp.add(name);
    }
    void addFine(String ID,float fine){
        LibraryPatron temp=getPatron(ID);
        temp.setFines(temp.getFines()+fine);
    }
}
