package Frame_oops;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Jframe_exp extends JFrame implements ItemListener {

	JComboBox jc;
	JTextField tf;

	Jframe_exp() {

		jc = new JComboBox();
		tf = new JTextField();
		add(jc);
		add(tf);
		setLayout(null);
		jc.addItemListener(this);
		jc.setBounds(50, 50, 100, 30);
		jc.addItem("Select");
		jc.addItem("Interface & abstract");
		jc.addItem("Inhertience and abstract");
		tf.setBounds(50, 150, 200, 30);
		setVisible(true);
		setSize(300, 300);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == e.SELECTED) {
			if (jc.getSelectedItem().equals("Interface & abstract")) {
				Interface_abstract i2 = new Interface_abstract();
				i2.calculate(50, 60, 70);
				
			}
			

			else if (jc.getSelectedItem().equals("Inhertience and abstract")) {
				inherit_abstract exp= new inherit_abstract();
				tf.setText(exp.show());
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jframe_exp jf = new Jframe_exp();
	}

}
