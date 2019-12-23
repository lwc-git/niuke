package collection;

import java.util.Comparator;

public class ComparatorUData implements Comparator<UData>{
    @Override
    public int compare(UData o1, UData o2) {
        if(o1.getAge()>o2.getAge()){
            return 1;
        }
        if(o1.getAge()<o2.getAge()){
            return -1;
        }
        return 0;
    }
}
