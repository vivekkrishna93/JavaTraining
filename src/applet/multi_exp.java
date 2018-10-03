package applet;

import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class multi_exp extends JApplet implements ItemListener {

	JComboBox jc;
	TextField l;

	public void init() {
		jc = new JComboBox();
		l = new TextField();
		jc.addItem("select");
		jc.addItem("Sleep");
		jc.addItem("Start");
		jc.addItem("Suspend");
		jc.addItem("Resume");
		add(l);
		add(jc);

		jc.addItemListener(this);
		setLayout(null);
		l.setBounds(150, 150, 70, 30);
		jc.setBounds(50, 50, 70, 30);
	}

	public void itemStateChanged(ItemEvent e) {
		main_thread m1 = new main_thread();

		if (e.getStateChange() == e.SELECTED) {
			if (jc.getSelectedItem().equals("Sleep")) {

				try {
					m1.sleep(500);
				} catch (InterruptedException e1) {

				}
			} else if (jc.getSelectedItem().equals("Start")) {
				m1.run();

				/*
				 * char i = m1.i; String val = Character.toString(i);
				 * l.setText(m1.i);
				 */

			} else if (jc.getSelectedItem().equals("Suspend"))

			{
				m1.run();
				char i = m1.i;
				String val = Character.toString(i);
				l.setText(val);

			} else if (jc.getSelectedItem().equals("Resume")) {
				m1.resume();
			}
		}

	}

}
