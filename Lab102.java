class CountingThread extends Thread {
    private boolean isUpCounting;

    CountingThread(boolean isUpCounting) {
        this.isUpCounting = isUpCounting;
    }

    public void run() {
        try {
            if (isUpCounting) {
                for (int i = 1; i <= 30; i++) {
                    System.out.println("Upcounting: " + i);
                    Thread.sleep(1000);
                }
            } else {
                for (int i = 30; i >= 1; i--) {
                    System.out.println("Downcounting: " + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Lab102 {
    public static void main(String[] args) {
        CountingThread upCountingThread = new CountingThread(true);
        CountingThread downCountingThread = new CountingThread(false);

        upCountingThread.start();
        downCountingThread.start();
    }
}
