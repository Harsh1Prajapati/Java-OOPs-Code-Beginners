class MultiplicationTable extends Thread {
    int number;

    MultiplicationTable(int number) {
        this.number = number;
    }

    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Lab101 {
    public static void main(String[] args) {
        MultiplicationTable tableOfThree = new MultiplicationTable(3);
        MultiplicationTable tableOfFive = new MultiplicationTable(5);

        tableOfThree.start();
        tableOfFive.start();
    }
}
