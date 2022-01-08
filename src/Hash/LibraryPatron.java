package Hash;

import java.util.ArrayList;
import java.util.Locale;

/**
 * This is the features created for every patron and an arraylist is created for the books borrowed.
 */
public class LibraryPatron {
    private String ID;
    private String name;
    private float fines;
    ArrayList<String> borr_names = new ArrayList<>();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<String> getBorr_names() {
        return borr_names;
    }

    public void setBorr_names(ArrayList<String> borr_names) {
        this.borr_names = borr_names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFines() {
        return fines;
    }

    public void setFines(float fines) {
        this.fines = fines;
    }

    public LibraryPatron(String ID, String name, float fines) {

        this.ID = ID;
        this.name = name;
        borr_names.add(name);
        this.fines = fines;
    }

    public void add(String add_Book) {
        borr_names.add(add_Book);
    }

    public void remove(String remove_Book) {
        borr_names.remove(remove_Book);
    }

    public String toString() {
        StringBuilder bookNames = new StringBuilder();
        for (String bookName : getBorr_names()) {
            bookNames.append(bookName).append(", ");
        }
        bookNames.replace(bookNames.lastIndexOf(","), bookNames.length() - 1, "");
        return "The ID is: " + getID() +
                "\nName is: " + getName() +
                "\n Total fine is: " + getFines() +
                "\nBorrowed books are: " + bookNames;
    }

    /**
     * Thid method overrides the hashcode method and converts the values to hexadecimal.
     * @return It will return the hash value.
     */
    @Override
    public final int hashCode() {
        int hash = 1;
        String temp = getID().toUpperCase();
        for (int i = 0; i < temp.length(); i++) {
            int value = temp.charAt(i);
            if (value >= 65 && value <= 90) {
                hash = hash * 26 + (value - 65);
            } else {
                hash = hash * 10 + (value - 48);
            }
        }
        return hash;
    }

    /**
     * The equals method in java is overrided and checked to see if both the objects hashcode is matching or not.
     * @param O
     * @return
     */
    @Override
    public final boolean equals(Object O) {
        return this.hashCode() == O.hashCode();
    }
}
