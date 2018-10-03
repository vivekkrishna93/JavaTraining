package Interface_example;

import java.awt.*;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Awt_example extends Frame implements ActionListener {

	TextField t;
	Button b;

	Awt_example() {
		b = new Button("Result");
		t = new TextField();
		add(t);
		add(b);
			b.addActionListener(this);
		setLayout(null);
		b.setBounds(50, 50, 70, 30);
		t.setBounds(50, 100, 150, 30);
		setSize(300, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == b) {
			Poly_examp ex = new Poly_examp();
			t.setText(ex.gh());
		}
	}

	public static void main(String[] args) {
		Awt_example s = new Awt_example();

	}

}
