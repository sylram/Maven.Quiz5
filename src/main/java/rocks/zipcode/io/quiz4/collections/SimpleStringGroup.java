package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String>{
    ArrayList<String> arrayList;

    public SimpleStringGroup() {
        this.arrayList = new ArrayList<>();
//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return arrayList.size();
    }

    public void insert(String string) {
        arrayList.add(string);
    }

    public Boolean has(String string) {
        return arrayList.contains(string);
    }

    public String fetch(int indexOfValue) {

        return arrayList.get(indexOfValue);
    }

    public void delete(String string) {
        arrayList.remove(string);
    }

    public void clear() {
        arrayList.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return arrayList.iterator();
    }
}
