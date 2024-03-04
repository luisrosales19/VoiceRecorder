import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VoiceRecorder extends JFrame {
    private final RoundedButton recordButton;
    private boolean isRecording = false;


    public VoiceRecorder() {
        super();
        setTitle("Voice Recorder");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel(new GridBagLayout());
        contentPane.setBackground(Color.BLACK);
        setContentPane(contentPane);

        recordButton = new RoundedButton();
        recordButton.setForeground(Color.RED);
        recordButton.setFont(new Font("Arial", Font.BOLD, 16));
        recordButton.setFocusPainted(false);


        recordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isRecording = !isRecording;

                if(isRecording) {
                    recordButton.setInnerButtonColor(Color.WHITE);

                } else {
                    recordButton.setInnerButtonColor(null); // Reset inner button color to null (remove inner button)
                }
                recordButton.repaint();
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        contentPane.add(recordButton, gbc);


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