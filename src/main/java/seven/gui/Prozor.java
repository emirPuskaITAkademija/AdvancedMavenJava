package seven.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prozor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nedimov prozor");
        frame.setSize(300, 200);
        JButton button = new JButton("Nedimov dugmic");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kliknuo neko Nedimov dugmic...");
            }
        });
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
