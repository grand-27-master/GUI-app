import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private double total=0.0;
    private double total2=0.0;
    private char math_operator;

    private JPanel JavaCalculator;
    private JTextField textBox;
    private JButton button2;
    private JButton button3;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button1;
    private JButton a8Button;
    private JButton button8;
    private JButton button9;
    private JButton a6Button;
    private JButton a9Button;
    private JButton CLEARButton;
    private JButton button13;
    private JButton xButton;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a0Button;

    private void getOperator(String btnText)
    {
        math_operator=btnText.charAt(0);
        total=total+Double.parseDouble(textBox.getText());
        textBox.setText("");
    }

    public JavaCalculator() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textBox.getText() + a1Button.getText();
                textBox.setText(btnOneText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String btnTwoText = textBox.getText() + a2Button.getText();
                    textBox.setText(btnTwoText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        String btnThreeText = textBox.getText() + a3Button.getText();
                        textBox.setText(btnThreeText);
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String btnFourText = textBox.getText() + a4Button.getText();
                    textBox.setText(btnFourText);
            }
        });
        a5Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        String btnFiveText =textBox.getText() + a5Button1.getText();
                        textBox.setText(btnFiveText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String btnSixText =textBox.getText() + a6Button.getText();
                    textBox.setText(btnSixText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textBox.getText() + a7Button.getText();
                textBox.setText(btnSevenText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textBox.getText() + a8Button.getText();
                textBox.setText(btnEightText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textBox.getText() + a9Button.getText();
                textBox.setText(btnNineText);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textBox.getText() + a0Button.getText();
                textBox.setText(btnZeroText);
            }
        });



        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                total=total+Double.parseDouble(textBox.getText());
//                textBox.setText("");
                   String buttonText=button9.getText();
                   getOperator(buttonText);
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText=button13.getText();
                getOperator(buttonText);
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText=xButton.getText();
                getOperator(buttonText);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText=button3.getText();
                getOperator(buttonText);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator)
                {
                    case '+':
                        total2=total+Double.parseDouble(textBox.getText());
                        break;
                    case '-':
                        total2=total-Double.parseDouble(textBox.getText());
                        break;
                    case 'X':
                        total2=total*Double.parseDouble(textBox.getText());
                        break;
                    case '/':
                        total2=total/Double.parseDouble(textBox.getText());
                        break;
                }
                textBox.setText(Double.toString(total2));
                total=0;
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textBox.getText().equals(""))
                {
                    textBox.setText("0.");
                }
                else if(textBox.getText().contains("."))
                {
                    button8.setEnabled(false);
                }
                else
                {
                    String btnPoint=textBox.getText() + button8.getText();
                    textBox.setText(btnPoint);
                }
                button8.setEnabled(true);
            }
        });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                textBox.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
