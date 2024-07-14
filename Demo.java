import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo extends JFrame implements MouseListener {
	private JPanel panel;
	private JButton button;
	private int count;

	Demo() {
		button = new JButton("Click Me");
		button.setBackground(Color.black);
		button.setBounds(175, 200, 300, 50);
		button.setForeground(Color.yellow);
		button.setFont(new Font("Verdana", Font.BOLD, 20));
		button.addMouseListener(this);

		panel = new JPanel();
		panel.setSize(500, 400);
		panel.setLayout(null);
		panel.add(button);
		button.setFocusable(false);
		panel.setBackground(Color.cyan);

		this.add(panel);
		this.setTitle("Swing project");
		this.setLayout(null);
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		count++;
		if (count == 7) {
			button.setBounds(100, 300, 300, 50);
			button.setText("let me help you");
			--count;

		} else if (count % 2 == 0) {
			button.setBounds(100, 100, 300, 50);
			button.setText("Catch Me if you can");
		} else {
			button.setBounds(0, 0, 300, 50);
			button.setText("Catch Me if you can");
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		count++;
		if (count % 2 == 0) {
			panel.setBackground(Color.DARK_GRAY);
		}else {
			 
		}
	}

}
