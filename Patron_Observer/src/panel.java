
	import java.awt.*;
	import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class panel extends JPanel implements observable  {

	private User btn1;
	private User btn2;
	private User btn3;
	private ArrayList<Observer> users = new ArrayList<Observer>();
	
	
	public panel() {
		btn1 = new User("Amarillo");	
		users.add(btn1);
		btn2 =new User("Rosa");
		users.add(btn2);
		btn3 = new User("Verde");
		users.add(btn3);
		
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
            	  notifyObserver(nombresColores.COLORESCONNOMBRE.get(color1),btn1);
              }else if(buttObj == btn2) {
            	  setBackground(color2);
            	  System.out.println(nombresColores.COLORESCONNOMBRE.get(color2));
            	  notifyObserver(nombresColores.COLORESCONNOMBRE.get(color2),btn2);
              }else {
            	  setBackground(color3);
            	  System.out.println(nombresColores.COLORESCONNOMBRE.get(color3));
            	  notifyObserver(nombresColores.COLORESCONNOMBRE.get(color3),btn3);
              }
				  
				  
	      }//end of Action
	
}

	@Override
	public void notifyObserver(String color, Object user) {
		
		for (Observer obs: users) {
			if (obs == user ) {
				obs.informar(color);
			}
		}
		
	}


	
}
