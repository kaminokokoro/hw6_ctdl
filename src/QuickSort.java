public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
        final long startTime = System.nanoTime();
        quickSort(0, array.length - 1);
        final long endTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Total execution time: " + (endTime - startTime) + "ns");
    }

    private void quickSort(int left, int right) {
        if (left < right) {
            int pivot = partition(left, right);
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i]+" ");
//            }
//            System.out.println();
            quickSort(left, pivot - 1);
            quickSort(pivot + 1, right);
        }
    }

    private int partition(int left, int right) {
        int pivot = array[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (array[i] <= pivot && i < right) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(i, j);

            }
        }
        array[left] = array[j];
        array[j] = pivot;
        return j;
    }

    private void swap(int i, int j) {
//        System.out.println("Swapping " + array[i] + " with " + array[j]);
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
