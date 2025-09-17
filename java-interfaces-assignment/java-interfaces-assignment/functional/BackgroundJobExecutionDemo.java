package functional;

public class BackgroundJobExecutionDemo {
    public static void main(String[] args) {
        Runnable job = () -> {
            for (int i = 1; i <= 3; i++) {
                try { Thread.sleep(200); } catch (InterruptedException ignored) {}
                System.out.println("Background step " + i);
            }
            System.out.println("Background job done.");
        };
        Thread worker = new Thread(job, "Worker-1");
        worker.start();
        System.out.println("Main continues...");
        try { worker.join(); } catch (InterruptedException ignored) {}
    }
}
