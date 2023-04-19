public class TestEX1 {
    public static void main(String[] args) {
        SortedLinkPriorityQueue<Integer, Integer> slpq = new SortedLinkPriorityQueue();
        slpq.insert(3, 3);
        slpq.insert(5, 5);
        slpq.insert(2, 2);
        slpq.insert(4, 4);
        slpq.insert(1, 1);
        System.out.print("SortedLinkPriorityQueue ");
        while (!slpq.isEmpty()) {
            System.out.print(slpq.removeMin().getValue());
        }

        System.out.println();
        UnsortedLinkedPriorityQueue<Integer, Integer> ulpq = new UnsortedLinkedPriorityQueue();
        ulpq.insert(3, 3);
        ulpq.insert(5, 5);
        ulpq.insert(2, 2);
        ulpq.insert(4, 4);
        ulpq.insert(1, 1);
        System.out.print("UnsortedLinkedPriorityQueue ");
        while (!ulpq.isEmpty()) {
            System.out.print(ulpq.removeMin().getValue());
        }

        System.out.println();
        UnsortedArrayPriorityQueue<Integer, Integer> uapq = new UnsortedArrayPriorityQueue<>();
        uapq.insert(3, 3);
        uapq.insert(5, 5);
        uapq.insert(2, 2);
        uapq.insert(4, 4);
        uapq.insert(1, 1);
        System.out.print("UnsortedArrayPriorityQueue ");
        while (!uapq.isEmpty()) {
            System.out.print(uapq.removeMin().getValue());
        }

        System.out.println();
        SortedArrayPriorityQueue<Integer, Integer> sapq = new SortedArrayPriorityQueue();
        sapq.insert(3, 3);
        sapq.insert(5, 5);
        sapq.insert(2, 2);
        sapq.insert(4, 4);
        sapq.insert(1, 1);
        System.out.print("SortedArrayPriorityQueue ");
        while (!sapq.isEmpty()) {
            System.out.print(sapq.removeMin().getValue());
        }

        SortedLinkPriorityQueue<Integer, String> slpq1 = new SortedLinkPriorityQueue();
        slpq1.insert(300, "phone");
        slpq1.insert(500, "laptop");
        slpq1.insert(200, "book");
        slpq1.insert(400, "pen");
        slpq1.insert(100, "pencil");
        System.out.println("SortedLinkPriorityQueue ");
        while (!slpq1.isEmpty()) {
            Entry<Integer, String> entry = slpq1.removeMin();
            System.out.println(entry.getValue() + ":" + entry.getKey());
        }

        UnsortedLinkedPriorityQueue<Integer, String> ulpq1 = new UnsortedLinkedPriorityQueue();
        ulpq1.insert(300, "phone");
        ulpq1.insert(500, "laptop");
        ulpq1.insert(200, "book");
        ulpq1.insert(400, "pen");
        ulpq1.insert(100, "pencil");
        System.out.println("UnsortedLinkedPriorityQueue ");
        while (!ulpq1.isEmpty()) {
            Entry<Integer, String> entry = ulpq1.removeMin();
            System.out.println(entry.getValue() + ":" + entry.getKey());
        }

        UnsortedArrayPriorityQueue<Integer, String> uapq1 = new UnsortedArrayPriorityQueue<>();
        uapq1.insert(300, "phone");
        uapq1.insert(500, "laptop");
        uapq1.insert(200, "book");
        uapq1.insert(400, "pen");
        uapq1.insert(100, "pencil");
        System.out.println("UnsortedArrayPriorityQueue ");
        while (!uapq1.isEmpty()) {
            Entry<Integer, String> entry = uapq1.removeMin();
            System.out.println(entry.getValue() + ":" + entry.getKey());
        }
        System.out.println();

        SortedArrayPriorityQueue<Integer, String> sapq1 = new SortedArrayPriorityQueue();
        sapq1.insert(300, "phone");
        sapq1.insert(500, "laptop");
        sapq1.insert(200, "book");
        sapq1.insert(400, "pen");
        sapq1.insert(100, "pencil");
        System.out.println("SortedArrayPriorityQueue ");
        while (!sapq1.isEmpty()) {
            Entry<Integer, String> entry = sapq1.removeMin();
            System.out.println(entry.getValue() + ":" + entry.getKey());
        }

        SortedLinkPriorityQueue<String, String> slpq2 = new SortedLinkPriorityQueue();
        slpq2.insert("300", "phone");
        slpq2.insert("500", "laptop");
        slpq2.insert("200", "book");
        slpq2.insert("400", "pen");
        slpq2.insert("100", "pencil");
        System.out.println("SortedLinkPriorityQueue ");
        while (!slpq2.isEmpty()) {
            Entry<String, String> entry = slpq2.removeMin();
            System.out.println(entry.getValue() + ":" + entry.getKey());
        }

        UnsortedLinkedPriorityQueue<String, String> ulpq2 = new UnsortedLinkedPriorityQueue();
        ulpq2.insert("300", "phone");
        ulpq2.insert("500", "laptop");
        ulpq2.insert("200", "book");
        ulpq2.insert("400", "pen");
        ulpq2.insert("100", "pencil");
        System.out.println("UnsortedLinkedPriorityQueue ");
        while (!ulpq2.isEmpty()) {
            Entry<String, String> entry = ulpq2.removeMin();
            System.out.println(entry.getValue() + ":" + entry.getKey());
        }

        UnsortedArrayPriorityQueue<String, String> uapq2 = new UnsortedArrayPriorityQueue<>();
        uapq2.insert("300", "phone");
        uapq2.insert("500", "laptop");
        uapq2.insert("200", "book");
        uapq2.insert("400", "pen");
        uapq2.insert("100", "pencil");
        System.out.println("UnsortedArrayPriorityQueue ");
        while (!uapq2.isEmpty()) {
            Entry<String, String> entry = uapq2.removeMin();
            System.out.println(entry.getValue() + ":" + entry.getKey());
        }

        SortedArrayPriorityQueue<String, String> sapq2 = new SortedArrayPriorityQueue();
        sapq2.insert("300", "phone");
        sapq2.insert("500", "laptop");
        sapq2.insert("200", "book");
        sapq2.insert("400", "pen");
        sapq2.insert("100", "pencil");
        System.out.println("SortedArrayPriorityQueue ");
        while (!sapq2.isEmpty()) {
            Entry<String, String> entry = sapq2.removeMin();
            System.out.println(entry.getValue() + ":" + entry.getKey());

        }
    }
}
