public class TestEX3 {
    public static void main(String[] args) {
        final int[] arrayFinal={6,10,3,5,2,4,1,8,9,7};
        System.out.println("QuickSort: ");
        QuickSort qs=new QuickSort(arrayFinal);
        System.out.println("MergeSort: ");
        MergeSort ms=new MergeSort(arrayFinal);
        System.out.println("HeapSort: ");
        HeapSort hs=new HeapSort(arrayFinal);
        System.out.println("SelectionSort: ");
        SelectionSort ss=new SelectionSort(arrayFinal);

    }


}
