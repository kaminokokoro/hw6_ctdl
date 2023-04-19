public class MergeSort {
    private int[] array;

    public MergeSort(int[] array) {
        this.array = array;
        final long startTime = System.nanoTime();
        mergeSort(0, array.length - 1);
        final long endTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Total execution time: " + (endTime - startTime) + "ns");
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(left, middle);
            mergeSort(middle + 1, right);
            merge(left, middle, right);
        }
    }

    private void merge(int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
                k++;
            } else {
                temp[k] = array[j];
                j++;
                k++;
            }
        }
        while (i <= middle) {
            temp[k] = array[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = array[j];
            j++;
            k++;
        }
        for (int l = left; l <= right; l++) {
            array[l] = temp[l - left];
        }
    }
}
