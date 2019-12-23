package query;

public class Sort {

    //快速排序
    public void quickSort(int[] values){
        quick(values,0,values.length-1);
    }

    //冒泡排序
    public void bubbleSort(int[] values){
        int index = 0;
        int swapNum = -1;
        while(swapNum != 0) {
            swapNum = 0;
            index += 1;
            for(int i = 0;i < values.length-1-index;i++){
                if(values[i]>values[i+1]) {
                    swap(values, i, i + 1);
                    swapNum++;
                }
            }
        }
    }

    //选择排序
    public void selectSort(int[] values){
        int offset;
        for(int i = 0;i<values.length;i++) {
            offset = i;
            for (int j = i+1; j < values.length; j++) {
                if (values[j] < values[offset])
                    offset = j;
            }
            swap(values,i,offset);
        }
    }

    //插入排序
    public void insertSort(int[] values){
        for(int i = 1;i<values.length;i++){
            while(i-1>=0 && values[i]<values[i-1])
                swap(values,i,--i);

        }
    }

    //希尔排序
    public void shellSort(int[] values){
        for(int increment = values.length/2;increment>1; increment/=2){
            for(int i = increment;i<values.length;i++){
                if(values[i]<values[i-increment])
                    swap(values,i,i-increment);
            }
        }
        insertSort(values);
    }

    //归并排序
    public void mergeSort(int[] values,int start,int end){
        if(start<end) {
            int medium = (start + end) / 2;
            mergeSort(values, start, medium);
            mergeSort(values, medium + 1, end);
            merge(values,start,medium,end);
        }
    }

    //堆排序
    public void heapSort(int[] values){
        int length = values.length;
        buildHeap(values,length);
        while(length>0) {
            swap(values, 0, length - 1);
            length--;
            buildHeap(values,length);
        }

    }

    //基数排序





    public void buildHeap(int[] values,int length){
        for(int i = 1;i<length;i++){
            while(i>0 && values[i] > values[(i-1)/2]){
                swap(values,i,(i-1)/2);
                i = (i-1)/2;
            }
        }
    }

    public void merge(int[] values,int start,int medium,int end){
        int[] temp = new int[values.length];
        int left = start;
        int right = medium+1;
        int offset = start;
        while(left<=medium && right <=end){
            if(values[left]<values[right])
                temp[offset++]=values[left++];
            else
                temp[offset++]=values[right++];
        }
        while(left<=medium) temp[offset++]=values[left++];
        while(right<=end) temp[offset++]=values[right++];
        for(int i = start;i<=end;i++){
            values[i] = temp[i];
        }
    }

    public void quick(int[] values,int start,int end){
        if(start>=end) return ;
        int left = start+1;
        int right = end;
        while(left<right){
            while(values[right]>values[start] && left<right) right--;
            while(values[left]<=values[start] && left<right) left++;
            swap(values,left,right);
        }
        if(values[right]<values[start]) swap(values,start,right);
        quick(values,start,right-1);
        quick(values,right,end);
    }

    public void swap(int[]values,int a,int b){
        int c = values[a];
        values[a] = values[b];
        values[b] = c;
    }

}
