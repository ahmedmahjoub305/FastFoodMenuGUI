import javax.swing.*;
import java.awt.*;

public class FoodOrderTester{

	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.add(new FoodOrder());
		frame.setSize(new Dimension(600, 400));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
