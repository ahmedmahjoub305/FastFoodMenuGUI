import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class FoodOrder extends JPanel{
  public FoodOrder(){
    HashSet<MenuItem> set = new HashSet<MenuItem>();
    JLabel notifyLabel = new JLabel("Order your favorites !");

    MenuItem Burger = new MenuItem("Burger", 16.40, 257);
    MenuItem Fried_Chicken = new MenuItem("Fried_Chicken", 16.90, 435);
    MenuItem Fries = new MenuItem("Fries", 16.40, 257);
    MenuItem Coleslaw = new MenuItem("Coleslaw", 3.00, 152);
    MenuItem Soft_drink = new MenuItem("Soft_drink", 2.50, 41);
    MenuItem Hot_beverage = new MenuItem("Hot_beverage", 5.90, 187);

    JComboBox<MenuItem> mainItemBox = new JComboBox<MenuItem>();
    mainItemBox.addItem(Burger);
    mainItemBox.addItem(Fried_Chicken);

/*
		mainCombo.addItem(empty);
		mainCombo.addItem(main_1);
		mainCombo.addItem(main_2);

		mainCombo.setSelectedIndex(0);
*/
    JComboBox<MenuItem> sideItemBox = new JComboBox<MenuItem>();
    sideItemBox.addItem(Fries);
    sideItemBox.addItem(Coleslaw);

    JComboBox<MenuItem> bevrageItemBox = new JComboBox<MenuItem>();
    bevrageItemBox.addItem(Soft_drink);
    bevrageItemBox.addItem(Hot_beverage);

    JButton addBtn = new JButton("Add");
		JButton removeBtn = new JButton("Remove");
		JButton doneBtn = new JButton("Done!");

    addBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				MenuItem selectedmainItem = (MenuItem)mainItemBox.getSelectedItem();
				set.add(selectedmainItem);
				notifyLabel.setText(selectedmainItem.getName() + " has been added");

        MenuItem selectedsideItem = (MenuItem)sideItemBox.getSelectedItem();
        set.add(selectedsideItem);
        notifyLabel.setText(selectedsideItem.getName() + " has been added");

        MenuItem selectedbevrageItem = (MenuItem)bevrageItemBox.getSelectedItem();
        set.add(selectedbevrageItem);
        notifyLabel.setText(selectedbevrageItem.getName() + " has been added");
			}
		});

		removeBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        MenuItem selectedmainItem = (MenuItem)mainItemBox.getSelectedItem();
        set.remove(selectedmainItem);
        notifyLabel.setText(selectedmainItem.getName() + " has been removed");

        MenuItem selectedsideItem = (MenuItem)sideItemBox.getSelectedItem();
        set.remove(selectedsideItem);
        notifyLabel.setText(selectedsideItem.getName() + " has been removed");

        MenuItem selectedbevrageItem = (MenuItem)bevrageItemBox.getSelectedItem();
        set.remove(selectedbevrageItem);
        notifyLabel.setText(selectedbevrageItem.getName() + " has been removed");
			}
		});

		doneBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame frame = new JFrame();
				JTextArea orderfield = new JTextArea();
				orderfield.setEditable(false);
				String title = "Order:" + "\n" + "List of added menu items:";
				String str_price = "Total price: ";
				String finalList = title + "\n"  + "\n" + str_price;
				orderfield.setText(finalList);
				frame.add(orderfield);
				frame.setSize(new Dimension(400, 400));
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
    JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout());
		btnPanel.add(addBtn);
		btnPanel.add(removeBtn);
		btnPanel.add(doneBtn);

		setLayout(new BorderLayout());
		add(mainItemBox, BorderLayout.NORTH);
    add(sideItemBox, BorderLayout.NORTH);
    add(bevrageItemBox,BorderLayout.NORTH);

		add(btnPanel, BorderLayout.CENTER);
		add(notifyLabel, BorderLayout.SOUTH);
  }

}
