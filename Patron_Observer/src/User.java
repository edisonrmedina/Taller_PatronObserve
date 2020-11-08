import javax.swing.JButton;

public class User extends JButton implements Observer {

	public User(String color) {
		super(color);
	}
	@Override
	public void informar(String color) {
		System.out.println("Se ha cambiado el color de la ventana a " + color);
	}


}
