public class MenuItem {
  /**
   * This class characterizes an individual menu item
   * We write a toString() method to easily return important information about the item
   * @author Mahrous-Amer & Ahmed-Ali
   *
   */
   // Don't use static here unless you want all of your MenuItems objects to have the same data
   String ItemName;
	 double ItemPrice;
   float ItemCalories;


	public MenuItem(String ItemName, double ItemPrice, float ItemCalories) {
    this.ItemName = ItemName;
    this.ItemPrice = ItemPrice;
    this.ItemCalories = ItemCalories;
	}

	public String getName(){
		return ItemName;
	}

	public double getPrice(){
		return ItemPrice;
	}

  public float getCalories(){
    return ItemCalories;
  }

	public String itemToString(){
		String info = "\n Name" + ItemName + "Price" + ItemPrice + "Calories" + ItemCalories;
		return info;
	}

}
