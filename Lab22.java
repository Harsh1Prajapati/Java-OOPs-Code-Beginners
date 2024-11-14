public class Ballon {
    public static void main(String[] args) {
        System.out.printf("%-10s %-20s\n", "Time (h)", "Height (m)");
        for (int t = 0; t <= 48; t++) {
            double h = 0.12 * Math.pow(t, 4) + 12 * Math.pow(t, 3) - 380 * Math.pow(t, 2) + 4100 * t + 220;
            System.out.printf("%-10d %-20.2f\n", t, h);
        }
    }
}
