package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T>{

    ArrayList<T> arrayList;
    public Group() {
        this.arrayList = new ArrayList<>();
//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return arrayList.size();
    }
//
//    public void insert(T value) {
//        arrayList.add(value);
//    }
//
//    public Boolean has(T value) {
//        return null;
//    }

    public T fetch(int indexOfValue) {
        return arrayList.get(indexOfValue);
    }

    @Override
    public void insert(T string) {
        arrayList.add(string);

    }

    @Override
    public void delete(T valueToInsert) {
        arrayList.remove(valueToInsert);

    }


    @Override
    public Boolean has(T valueToInsert) {
        return arrayList.contains(valueToInsert);
    }



    public void clear() {
        arrayList.clear();
    }

    public Iterator<T> iterator() {
        return arrayList.iterator();
    }

    @Override
    public String toString() {
        return
                ""+arrayList;
    }
}
