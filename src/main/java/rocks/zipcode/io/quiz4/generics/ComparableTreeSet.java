package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<E> extends TreeSet<E> implements Comparable<E> {





    public ComparableTreeSet(E... arr) {
       super();
        for(E e: arr){
            add(e);
        }
       // System.out.println(treeSet);

    }

    public ComparableTreeSet() {
        //this.treeSet = new TreeSet<>();

    }

    public int compareTo(ComparableTreeSet<E> e) {
//        E first = treeSet.first();
//        E second = null;
//        System.out.println(first.hashCode());

        int comp = 0;
        comp = this.toString().compareTo(e.toString());
//
//        comp=treeSet.compareTo(e);
//        for (E o : e) {

            System.out.println(comp);

        return comp;


        }


    @Override
    public int compareTo(E o) {

        return this.compareTo((ComparableTreeSet<E>)o);
    }
//    public  int Comparator(E a, E b){
//       return 0;
//    }

//    @Override
//    public String toString() {
//        return ""+ treeSet;
//    }
}
