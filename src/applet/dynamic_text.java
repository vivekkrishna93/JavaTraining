package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dynamic_text extends Applet implements ActionListener {
	TextField l;
	Button b;
	int y = 0;

	public void init() {
		l = new TextField("moving");
		b = new Button("move");
		add(l);
		add(b);
		b.addActionListener(this);
		setLayout(null);
		b.setBounds(50, 100, 40, 40);
		l.setBounds(50, 10, 70, 30);

	}

	public void actionPerformed(ActionEvent e1) {
		if (e1.getSource() == b) {
			for (int i = 1; i <= 5; i++) {
				y = y + 50;
				l.setBounds(50, y, 70, 30);
				y = y + 50;
				b.setBounds(50, y, 40, 40);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

}
