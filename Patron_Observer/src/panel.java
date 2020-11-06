
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class panel extends JPanel {

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	public panel() {
		btn1 = new JButton("Amarillo");
		btn2 = new JButton("Rosa");
		btn3 = new JButton("Verde");
		
		add(btn1);
		add(btn2);
		add(btn3);
	}
	
}
