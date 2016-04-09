package swingLearning;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MySwingWindow extends JFrame {

  private JLabel myLabel;
  private JTextField myTextField;
  private JButton myButton;

  private JLabel getJLabel() {
    if (myLabel == null) {
      myLabel = new JLabel();
      myLabel.setBounds(5, 1, 250, 30);
      myLabel.setText("Hello! Welcom to shiyanlou.com");
    }
    return myLabel;
  }

  private JTextField getJTextField() {
    if (myTextField == null) {
      myTextField = new JTextField();
      myTextField.setBounds(5, 45, 200, 30);
      myTextField.setText("Shi Yan Lou");
    }
    return myTextField;
  }

  private JButton getJButton() {
    if (myButton == null) {
      myButton = new JButton();
      myButton.setBounds(5, 80, 100, 40);
      myButton.setText("Click me!");
      myButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent arg0) {

          myLabel.setForeground(Color.RED);
          myTextField.setBackground(Color.BLUE);
        }
      });
    }
    return myButton;
  }

  public MySwingWindow() {
    super();
    this.setSize(400, 300);
    this.getContentPane().setLayout(null);
    this.setTitle("My First Swing Window");

    this.add(getJLabel(), null);
    this.add(getJTextField(), null);
    this.add(getJButton(), null);
  }

  public static void main(String[] args) {

    MySwingWindow window = new MySwingWindow();
    window.setVisible(true);
  }

}
