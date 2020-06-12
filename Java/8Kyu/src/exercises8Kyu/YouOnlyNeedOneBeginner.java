package exercises8Kyu;

import java.util.ArrayList;
import java.util.List;

public class YouOnlyNeedOneBeginner {
    public static boolean check(Object[] a, Object x) {
        List<Object> objectArr = new ArrayList<Object>();
        for(Object o : a)
        {
        	objectArr.add(o);
        }
        if(objectArr.contains(x))
        {
        	return true;
        }
        return false;
    }
}
