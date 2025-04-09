import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewCelsiusConverter extends JFrame implements Runnable {

    private JTextField celsiusTextField;
    private JLabel fahrenheitLabel;
    private JButton convertButton;
    
    public NewCelsiusConverter() {
    }
    public void setCelsius(int t) {
	celsiusTextField.setText(String.valueOf(t));	
    }
    public void doClick() {
	convertButton.doClick();
    }
    public void run() {
        setTitle("Celsius Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

	celsiusTextField = new JTextField("", 10);
        add(celsiusTextField);

        convertButton = new JButton("Convert");
	// don't "add" this button so it remains "hidden" from view

        fahrenheitLabel = new JLabel("Fahrenheit: ");
        add(fahrenheitLabel);

        JButton resetButton = new JButton("Reset");
	add(resetButton);
	
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
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		celsiusTextField.setText("");
		fahrenheitLabel.setText("Fahrenheit: ");
            }
        });

        pack();
        setVisible(true);
    }
}

