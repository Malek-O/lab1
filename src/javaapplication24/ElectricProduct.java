

package javaapplication24;



public class ElectricProduct extends Product{

  private String voltage;

  public ElectricProduct(int id, double price, float weight, String name, String voltage){
    super(id, price, name,weight );
    this.voltage = voltage;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Voltage: " + this.voltage;
  }

}
