import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Game Tebak Gambar");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Pusatkan di tengah layar

        // Panel utama
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 204)); // Warna background frame
        panel.setLayout(null); // Layout manual

        // Label Judul
        JLabel titleLabel = new JLabel("Game Tebak Gambar");
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        titleLabel.setBounds(100, 30, 250, 30);
        panel.add(titleLabel);

        // Tombol PLAY
        JButton playButton = new JButton("PLAY");
        playButton.setBounds(130, 90, 120, 40);
        playButton.setBackground(new Color(144, 238, 144)); // Warna hijau muda
        playButton.setFocusPainted(false);
        panel.add(playButton);

        // Tombol EXIT
        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(130, 150, 120, 40);
        exitButton.setBackground(new Color(255, 99, 71)); // Warna merah tomat
        exitButton.setFocusPainted(false);
        panel.add(exitButton);

        // Aksi tombol PLAY
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TebakGambarJFrame().setVisible(true); // Panggil JFrame soal
                dispose(); // Tutup MainMenu
            }
        });
        
        // Aksi tombol EXIT
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Terima kasih telah bermain game tebak gambar");
                System.exit(0);
            }
    });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
    }
}
