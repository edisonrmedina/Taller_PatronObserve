import javax.swing.JFrame;
public class test {

	public static void main(String[] args) {
	
		JFrame  mainFrame = new JFrame("Patron Observador");
		panel panelM = new panel();
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainFrame.getContentPane().add(panelM);
		
		mainFrame.pack();
		
		mainFrame.setVisible(true);
		
		
	}

}
