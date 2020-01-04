package banking;

public class Hamburger {
    private String breadRollType;
    private String meatType;
    private int price;
    private Additionals a1 = null;
    private Additionals a2 = null;
    private Additionals a3 = null;
    private Additionals a4 = null;

    public Hamburger(String breadRollType, String meatType, int price) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int setPrice(int price) {
        this.price += price;
        return price;
    }

    public int getPrice() {
        return this.price;
    }

    public void addAdditionals(Additionals a) {
        if (this.a1 == null) {
            this.a1 = a;
            this.setPrice(a.getPrice());
        } else if (this.a2 == null) {
            this.a2 = a;
            this.setPrice(a.getPrice());
        } else if (this.a3 == null) {
            this.a3 = a;
            this.setPrice(a.getPrice());
        } else if (this.a4 == null) {
            this.a4 = a;
            this.setPrice(a.getPrice());
        } else {
            System.out.println("no more additionals can be added");
        }
    }
}

class Additionals {
    private String name;
    private int price;

    public Additionals(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Lettuce extends Additionals {
    public Lettuce() {
        super("lettuce", 10);
    }
}

class Carrot extends Additionals {
    public Carrot() {
        super("Carrot", 20);
    }
}

class Tomato extends Additionals {
    public Tomato() {
        super("Tomato", 15);
    }
}

class Potato extends Additionals {
    public Potato() {
        super("Potato", 30);
    }
}

class Leaves extends Additionals {
    public Leaves() {
        super("Leaves", 35);
    }
}

class Onions extends Additionals {
    public Onions() {
        super("Onions", 25);
    }
}

class Drinks extends Additionals {
    public Drinks() {
        super("Coke", 15);
    }
}

class Chips extends Additionals {
    public Chips() {
        super("Chips", 20);
    }
}

class HealthyBurger extends Hamburger {
    private Additionals a5;
    private Additionals a6;
    public HealthyBurger() {
        this("Brown Rye", "Meat", 30,
                new Carrot(), new Potato(), new Tomato(), new Lettuce());
    }
    public HealthyBurger(String breadRollType, String meatType, int price,
                         Additionals a1, Additionals a2, Additionals a3, Additionals a4) {
        super("Brown Rye", meatType, price);
        super.addAdditionals(a1);
        super.addAdditionals(a2);
        super.addAdditionals(a3);
        super.addAdditionals(a4);
    }
}

class DeluxeBurger extends Hamburger {
    private Additionals a5;
    private Additionals a6;

    public DeluxeBurger(String breadRollType, String meatType, int price,
                        Additionals a1, Additionals a2, Additionals a3,
                        Additionals a4) {
        super(breadRollType, meatType, price);
        super.addAdditionals(a1);
        super.addAdditionals(a2);
        super.addAdditionals(a3);
        super.addAdditionals(a4);
        this.addAdditionals(new Chips());
        this.addAdditionals(new Drinks());
    }
}