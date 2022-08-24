package searchList;

import java.util.ArrayList;

public class Search<T> {
	
	/* For generic method, you define the type parameter in angular brackets, 
    	before the return type
    */	
	public int linearSearch(ArrayList<T> rrr, T wordnum) {
        for (int i=0; i < rrr.size(); i++) {
            if (wordnum.equals(rrr.get(i))) {
                return i;
            }
        }
        return -1;
    }

}
