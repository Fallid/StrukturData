package DemoModul3.Java;

public class Kegiatan2 {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();

        queue.enqueue("10");
        queue.enqueue("10");
        queue.enqueue("10");
        queue.displayQueue();
        System.out.println(queue.size());
    }
}
