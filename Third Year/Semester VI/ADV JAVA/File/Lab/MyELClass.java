import java.util.LinkedList;

class Queue {
    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity = 10;

    public synchronized void produce(int item) throws InterruptedException {
        while (list.size() == capacity) {
            wait();
        }
        list.add(item);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (list.size() == 0) {
            wait();
        }
        int item = list.removeFirst();
        notifyAll();
        return item;
    }
}

class Producer extends Thread {
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                queue.produce(i);
                System.out.println("Produced: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                int item = queue.consume();
                System.out.println("Consumed: " + item);
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}
