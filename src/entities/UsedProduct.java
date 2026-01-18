package entities;


public class UsedProduct extends Product{
    private String manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + "(Manufacture Date: " + manufactureDate + ")";
    }

}
