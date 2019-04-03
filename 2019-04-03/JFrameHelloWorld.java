import javax.swing.*;
public class JFrameHelloWorld {
	public static void main(String[] args) {
		JFrame frame = new JFrame("132");
		JPanel pane = new JPanel();
		JLabel label = new JLabel("Hello Worls");
		pane.add(label);
		frame.setContentPane(pane);
		frame.setSize(500,300);
		frame.setVisible(true);
	}
}