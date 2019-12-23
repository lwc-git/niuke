package solution2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils<T> {

    public static int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    public static int[][] matrix2 = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
    };

    public void printList2(List<List<T>> list){
        for(List l : list){
            System.out.println(l.toString());
        }
    }

}
