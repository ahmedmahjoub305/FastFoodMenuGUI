import java.util.ArrayList; // import the ArrayList class

public class Order{
  /**
   * This class characterizes total session
   * We write a getOrder() method to easily return important information about the item
   * implements an ArrayList of the class MenuItem
   * AddMenuItem(), double getFinalPrice()
   * @author Mahrous-Amer & Ahmed-Ali
   *
   */

    // add list of MenuItem
    private double fullPrice;
    private double totalCalories;
    private double Discount;
    private ArrayList<MenuItem> MenuItemList = new ArrayList<MenuItem>();
    private double FinalPrice;
    String out;

    public void Order(){
      MenuItem x = new MenuItem();
      this.MenuItemList.add(x);
    }

    public void Reset(){
      this.fullPrice = 0;
      this.totalCalories = 0;
      this.Discount = 0;
      this.FinalPrice = 0;
      for (MenuItem Item : MenuItemList) {
        Item = null;
      }
    }

    public void AddMenuItem ( String ItemName, double ItemPrice, double ItemCalories){
          MenuItem order = new MenuItem(ItemName, ItemPrice, ItemCalories);
          this.MenuItemList.add(order);
    }

    public void setFullPrice() {
      for (MenuItem Item : MenuItemList) {
        this.fullPrice = this.fullPrice + Item.getPrice();
      }
    }

    public double getFullPrice() {
      return fullPrice;
    }

    public double gettotalCalories(){
      for (MenuItem Item : MenuItemList) {
        this.totalCalories += Item.getCalories();
      }
      return totalCalories;
    }

    public double getDiscount(){
    	return Discount;
    }

    public void setDiscount(double Discount){
      this.Discount = Discount;
      System.out.println(this.Discount);
    }

    public double getFinalPrice(){
      return FinalPrice;
    }

    public double setFinalPrice(){
      setFullPrice();
      this.fullPrice = getFullPrice();
      System.out.println(this.fullPrice + "\n");
      this.FinalPrice = this.fullPrice - this.Discount;
      System.out.println(this.FinalPrice);
      return FinalPrice;
    }

    public String getOrder(){

      for (int counter = 0; counter < this.MenuItemList.size(); counter++) {
      MenuItem x = this.MenuItemList.get(counter);
        this.out += x.itemToString();
      }
      return out;
    }
}
