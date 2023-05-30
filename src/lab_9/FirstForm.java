package lab_9;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstForm extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    private JPanel contentPanel;

    public FirstForm(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,350,220);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        contentPanel.setLayout(null);

        setContentPane(contentPanel);

        JLabel label1 = new JLabel("Швидкість");

        textField1 = new JTextField();


        JLabel label2 = new JLabel("Радіус");

        textField2 = new JTextField();


        JLabel label3 = new JLabel("Прискорення тіла");

        textField3 = new JTextField();

        label1.setBounds(40,30,80,20);
        label2.setBounds(40,60,80,20);
        label3.setBounds(40,90,80,20);


        textField1.setBounds(150,30,150,20);
        textField2.setBounds(150,60,150,20);
        textField3.setBounds(150,90,150,20);

        textField3.setEnabled(false);

        contentPanel.add(label1);
        contentPanel.add(textField1);
        contentPanel.add(label2);
        contentPanel.add(textField2);
        contentPanel.add(label3);
        contentPanel.add(textField3);

        JButton btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(150,120,150,30);
        contentPanel.add(btnCalculate);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double v = Double.parseDouble(textField1.getText());
                double r = Double.parseDouble(textField2.getText());
                double a = v*v/r;
                textField3.setText(Double.toString(a));
            }
        });
        setVisible(true);
    }
}