
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
		btn1.addActionListener(new ButtonListener());
		btn2.addActionListener(new ButtonListener());
		btn3.addActionListener(new ButtonListener());
		
	}
	
	private class ButtonListener implements ActionListener
	   {
	      public void actionPerformed (ActionEvent event)
	      {
	    	   
              Object buttObj = event.getSource();
              
              if (buttObj == btn1) {
            	  setBackground(Color.YELLOW);
              }else if(buttObj == btn2) {
            	  setBackground(Color.PINK);
              }else {
            	  setBackground(Color.GREEN);
              }
				  
				  
	      }//end of Acti
	
}
}
