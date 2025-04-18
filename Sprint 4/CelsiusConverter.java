import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CelsiusConverter extends JFrame {

    private JTextField celsiusTextField;
    private JLabel fahrenheitLabel;
    
    public CelsiusConverter() {
        setTitle("Celsius Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

	celsiusTextField = new JTextField("Enter Celsius temp", 10);
        add(celsiusTextField);

        JButton convertButton = new JButton("Convert");
	add(convertButton);

        fahrenheitLabel = new JLabel("Fahrenheit: ");
        add(fahrenheitLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(celsiusTextField.getText());
                    double fahrenheit = celsius * 9 / 5 + 32;
                    fahrenheitLabel.setText("Fahrenheit: " + fahrenheit);
                } catch (NumberFormatException ex) {
                    fahrenheitLabel.setText("Invalid input");
                }
            }
        });

        pack();
        setVisible(true);
    }
}

