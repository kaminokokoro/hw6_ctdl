public class HeapSort {
    private int[] array;
    private MinHeapPriorityQueue<Integer,Integer> heap;

    public HeapSort(int[] array) {
        this.array = array;
        heap = new MinHeapPriorityQueue();
        final long startTime = System.nanoTime();
        heapSort();
        final long endTime = System.nanoTime();
        while (!heap.isEmpty()) {
            System.out.print(heap.removeMin().getValue()+" ");
        }
        System.out.println();
        System.out.println("Total execution time: " + (endTime - startTime) + "ns");
    }

    private void heapSort() {
        for(int i = 0; i < array.length; i++) {
            heap.insert(array[i], array[i]);
        }
    }
}
