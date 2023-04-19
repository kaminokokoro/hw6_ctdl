public class TestEX2 {
    public static void main(String[] args) {
        MinHeapPriorityQueue<Integer, Integer> mhpq = new MinHeapPriorityQueue();
        mhpq.insert(3, 3);
        mhpq.insert(5, 5);
        mhpq.insert(2, 2);
        mhpq.insert(4, 4);
        mhpq.insert(1, 1);
        System.out.print("MinHeapPriorityQueue ");
        while (!mhpq.isEmpty()) {
            System.out.print(mhpq.removeMin().getValue());
        }
    }
}
