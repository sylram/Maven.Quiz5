package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    ArrayList<String> arr;

    Character delimiter;

    public StringAssembler(Character delimeter) {
        this.delimiter = delimeter;
        arr = new ArrayList<>();
    }

    public StringAssembler append(String str) {
            arr.add(str);
            arr.add(delimiter.toString());

        return this;
    }

    public String assemble() {
        String string ="";
        for(String s :arr){
            string +=s;
        }
        return string.substring(0,string.length()-1);
    }
}
