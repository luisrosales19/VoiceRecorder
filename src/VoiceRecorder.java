import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


public class VoiceRecorder extends JFrame {

    private final RoundedButton recordButton;
    private boolean isRecording = false;


    public VoiceRecorder() {
        super();
        setTitle("Voice Recorder");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLACK);
        recordButton = new RoundedButton();
        recordButton.setForeground(Color.RED);
        recordButton.setFont(new Font("Arial", Font.BOLD, 16));
        recordButton.setFocusPainted(false);
        buttonPanel.add(recordButton);

        add(buttonPanel, BorderLayout.CENTER);

        recordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isRecording) {
                    isRecording = true;

                } else {
                    isRecording = false;

                }
                recordButton.repaint();
            }
        });

        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VoiceRecorder();
            }
        });
    }
}
