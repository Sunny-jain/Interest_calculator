package calculate_interest;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class interest_calculator {
	public static void main(String []args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
	{
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		new GUI();
	}
}
