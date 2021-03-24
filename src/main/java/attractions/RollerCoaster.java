package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 12) && (visitor.getHeight() >= 145);
    }

//    public double priceFor(Visitor visitor){
//        return visitor.getMoney();
//    }

    public double defaultPrice(){
        return 8.40;

    }

    public double priceFor(Visitor visitor){
        if(visitor.getHeight() < 200){
            return defaultPrice();
        } else {
            return defaultPrice() * 2;
        }
    }


}


