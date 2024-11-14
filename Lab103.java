import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

class NumberPrinter implements Runnable {
    private String threadName;
    private StyledDocument doc;
    private Style style;

    NumberPrinter(String threadName, StyledDocument doc, Style style) {
        this.threadName = threadName;
        this.doc = doc;
        this.style = style;
    }

    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {
                doc.insertString(doc.getLength(), threadName + ": " + i + "\n", style);
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Lab103 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Number Printer");
            JTextPane textPane = new JTextPane();
            JScrollPane scrollPane = new JScrollPane(textPane);
            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            StyledDocument doc = textPane.getStyledDocument();
            Style style1 = textPane.addStyle("Thread 1", null);
            StyleConstants.setForeground(style1, Color.RED);
            Style style2 = textPane.addStyle("Thread 2", null);
            StyleConstants.setForeground(style2, Color.BLUE);

            Thread thread1 = new Thread(new NumberPrinter("Thread 1", doc, style1));
            Thread thread2 = new Thread(new NumberPrinter("Thread 2", doc, style2));

            thread1.start();
            thread2.start();
        });
    }
}
