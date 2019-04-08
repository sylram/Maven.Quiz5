package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> implements Comparator<T> {

    ArrayList<T> arrayList;

    public SortedGroup(){
       this.arrayList = new ArrayList<>();


    }

    public void insert(T value) {
        arrayList.add(value);
//        Collections<T>.sort();
    }


    public void delete(T value) {
       arrayList.remove(value);
    }

    public Integer indexOf(T value) {
        System.out.println(arrayList.indexOf(value));
        return arrayList.indexOf(value);
    }

    public  <T extends Comparable<T>> void sort(ArrayList<T> arrayList){
        T currentvalue = null;
        int index = 0;
        for (int i=0; i<arrayList.size();i++){
            if(arrayList.get(i).compareTo(arrayList.get(i+1))>0){
                currentvalue = arrayList.get(i+1);
                index = i;
            }
           if(arrayList.get(index) != arrayList.get(i)) {

           }
        }

    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}
