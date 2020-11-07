
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
              Color color1=Color.yellow;
              Color color2=Color.pink;
              Color color3=Color.green;
           
              if (buttObj == btn1) {
            	  setBackground(color1);
            	  System.out.println(nombresColores.COLORESCONNOMBRE.get(color1));
              }else if(buttObj == btn2) {
            	  setBackground(color2);
            	  System.out.println(nombresColores.COLORESCONNOMBRE.get(color2));
              }else {
            	  setBackground(color3);
            	  System.out.println(nombresColores.COLORESCONNOMBRE.get(color3));
              }
				  
				  
	      }//end of Action
	
}
}
