package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable{

    ArrayList<SomeType> arrayList;
    public MyStack() {
       this.arrayList = new ArrayList<>();
    }

    public Boolean isEmpty() {
       return arrayList.isEmpty();
    }

    public void push(SomeType i) {
        arrayList.add(0,i);
    }

    public SomeType peek() {
        SomeType type = null;
        if(!arrayList.isEmpty()){
            type = arrayList.get(0);
        }
       return type;
    }

    public SomeType pop() throws EmptyStackException {
        SomeType type= null;
        if(!arrayList.isEmpty()) {
            type = arrayList.get(0);
            arrayList.remove(0);
        } else throw new  EmptyStackException();
       return type;
    }

    @Override
    public Iterator iterator() {
        return arrayList.iterator();
    }
}
