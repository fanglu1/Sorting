//Was able to do Counting Sort with int but not sure about String.

public class countingSort {
    int getMax(int[] a, int n){
        int max = a[0];
        for(int i = 1; i <n; i++){
            if(a[i] > max);
            max = a[i];
        }
        return max;
    }
    void countSort(int[] a, int n){
        int[] output = new int [n +1 ];
        int max = getMax(a, n);
        int[] count = new int[max + 1];
        for(int i = 0; i <= max; ++i){
            count[i] = 0;
        }
        for(int i = 0; i < n; i++){
            count[Integer.parseInt(String.valueOf(a[i]))]++;
        }
        for(int i = 1; i <= max; i++){
            count[i] += count[i-1];
        }
        for(int i = n-1; i>=0; i--){
            output[count[Integer.parseInt(String.valueOf(a[i]))] - 1] = Integer.parseInt(String.valueOf(a[i]));
            count[Integer.parseInt(String.valueOf(a[i]))]--;
        }
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(String.valueOf(output[i]));
        }
    }
    void printArray(int[] a, int n){
        int i;
        for(i = 0; i <n; i++){
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {4,2,7,9,5};
        int n = a.length;
        countingSort c1 = new countingSort();
        System.out.println("\n Input");
        c1.printArray(a, n);
        c1.countSort(a, n);
        System.out.println("\n Output");
        c1.printArray(a, n);
        System.out.println();
    }
}
