package Lab.Lab_4;

class PriceException extends Exception {
    @Override
    public String getMessage() {
        return "Cenata trqbva da e po-golqma ot 0!";
    }
}

class PowerException extends Exception {
    @Override
    public String getMessage() {
        return "Moshtnostta trqbva da e po-golqma ot 0!";
    }
}

abstract class Stoki {
    private double price;
    private int articleNumber;

    public Stoki(double price, int articleNumber) throws PriceException {
        setPrice(price);
        this.articleNumber = articleNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws PriceException {
        if (price <= 0) {
            throw new PriceException();
        }
        this.price = price;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public abstract double checkPromo();
}

class Knigi extends Stoki {
    private String author;
    private String title;

    public Knigi(double price, int articleNumber, String author, String title) throws PriceException {
        super(price, articleNumber);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.85;
    }
}

interface ElectricalAppliance {
    double calculateEnergy(double hours);
}

class Televizori extends Stoki implements ElectricalAppliance {
    private String manufacturer;
    private String model;
    private int power;

    public Televizori(double price, int articleNumber, String manufacturer, String model, int power)
            throws PriceException, PowerException {
        super(price, articleNumber);
        this.manufacturer = manufacturer;
        this.model = model;
        setPower(power);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) throws PowerException {
        if (power <= 0) {
            throw new PowerException();
        }
        this.power = power;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.91;
    }

    @Override
    public double calculateEnergy(double hours) {
        return power * hours / 1000.0;
    }
}

public class Zadacha2 {
    public static void main(String[] args) {
        try {
            Knigi book = new Knigi(20, 101, "J. K. Rowling", "Harry Potter");
            Televizori tv = new Televizori(1000, 202, "Samsung", "S95H OLED", 150);

            System.out.println("Kniga: " + book.getTitle() + ", avtor: " + book.getAuthor());
            System.out.println("Artikul: " + book.getArticleNumber());
            System.out.println("Cena: " + book.getPrice());
            System.out.println("Promo cena: " + book.checkPromo());

            System.out.println("");

            System.out.println("Televizor: " + tv.getManufacturer() + " " + tv.getModel());
            System.out.println("Artikul: " + tv.getArticleNumber());
            System.out.println("Cena: " + tv.getPrice());
            System.out.println("Promo cena: " + tv.checkPromo());
            System.out.println("Razhod za 5 chasa: " + tv.calculateEnergy(5) + " kWh");
        } catch (PriceException err) {
            System.out.println(err.getMessage());
        } catch (PowerException err) {
            System.out.println(err.getMessage());
        }
    }
}
