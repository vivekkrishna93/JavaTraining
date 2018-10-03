package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//<applet code="applet_1.class" height=200 width=200></applet>
public class applet_1 extends Applet implements ActionListener {

	Label l;
	Label l1;
	Label l2;
	Button b;
	int sec = 0;
	int hrs = 0;
	int min = 0, hrscount = 0, seccount = 0;

	public void init() {
		l = new Label("00");
		l1 = new Label("00");
		l2 = new Label("00");
		b = new Button("Click");
		add(l);
		add(l1);
		add(l2);
		add(b);
		b.addActionListener(this);
		setLayout(null);
		l.setBounds(50, 50, 70, 30);
		l1.setBounds(50, 70, 70, 30);
		l2.setBounds(50, 90, 70, 30);
		b.setBounds(50, 150, 70, 30);
	}

	public void actionPerformed(ActionEvent e1) {
		// TODO Auto-generated method stub
		int x = 0;
		if (e1.getSource() == b) {
			while (sec <= 5)
			{
				try {
					thread.sleep(200);
				} catch (Exception e) {

				}
				if(sec==5)
				{
					sec=0;
					seccount=seccount+1;
					String s1 = Integer.toString(seccount);
					l1.setText(s1);
					
				}
				if(seccount==5)
				{
					seccount=0;
					hrscount=hrscount+1;
					String s3 = Integer.toString(hrscount);
					l2.setText(s3);
				}
				String s = Integer.toString(sec);
				sec++;
				l.setText(s);
				x++;
			
			}

		}
	}

}
