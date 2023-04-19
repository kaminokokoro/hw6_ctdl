public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
        final long startTime = System.nanoTime();
        selectionSort();
        final long endTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Total execution time: " + (endTime - startTime) + "ns");
    }

    private void selectionSort() {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(i, min);
        }
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
