package query;

public class Test {
    public static void main(String[] args){
        Sort sort = new Sort();
        int[] values = {3,5,3,2,3,6,20,78,95,58,0,0,69,-2,-1,90};
        //sort.quickSort(values);
        //sort.bubbleSort(values);
        //sort.selectSort(values);
        //sort.shellSort(values);
        //sort.mergeSort(values,0,values.length-1);
        sort.heapSort(values);
        for (int value: values) {
            System.out.print(value+" ");
        }
    }
}
