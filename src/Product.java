
import java.math.RoundingMode;
import java.text.NumberFormat;

public abstract class Product {

    private String code;
    private String description;
    private double price;
    //protected static int count =0;

    public Product() {
        code = "";
        description = "";
        price = 0.0;
    }


    @Override
    public String toString() {
        return "Code:\t" + code + "\n" +
                "Description:\t" + description + "\n" +
                "Price:\t" + this.getFormatedPrice() + "\n";
    }

    //@Override
//    public boolean equals(Product obj){
//        if(obj == null){ return false; }
//        if(this.getClass() != obj.getClass()){ return false;}
//        if(code != (obj).code){return false;}
//        if(description != (obj).description){return false;}
//        if(price != (obj).price){return false;}
//        else{return true;}
//    }

    private String getFormatedPrice() {
        //use Number format to change to 2 decimals
        NumberFormat change = NumberFormat.getInstance();
        change.setMaximumFractionDigits(2);
        change.setMinimumFractionDigits(2);
        change.setRoundingMode(RoundingMode.HALF_UP);
        return change.format(price);

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String returnFormatedPrice() {
        return getFormatedPrice();
    }

//    public static int getCount() {
//        return count;
//
//    }


}


