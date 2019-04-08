package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<E> extends TreeSet<E> implements Comparable<E> {

    TreeSet<E> treeSet;



    public ComparableTreeSet(E... arr) {

        this.treeSet = new TreeSet<>();

        for(E e: arr){
        treeSet.add(e);}

    }

    public ComparableTreeSet() {
        this.treeSet = new TreeSet<>();

    }

    public int compareTo(ComparableTreeSet<E> e) {

        int comp = 0;
        for (E o : e) {
            o.
            comp = this.first().compareTo(o);
            System.out.println(comp);
            break;



        }return comp;
    }


    public int compareTo(E o) {
        return this.compareTo(o);
    }
    public  int Comparator(E a, E b){
       return 0;
    }

    @Override
    public String toString() {
        return ""+ treeSet;
    }
}
