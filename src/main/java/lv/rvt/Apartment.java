package lv.rvt;
public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if ((this.squares * this.rooms) > (compared.squares * compared.rooms)) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment compared) {
        int firstValue = this.pricePerSquare * this.squares;
        int secondValue = compared.pricePerSquare * compared.squares;
        return Math.abs(firstValue - secondValue);
    }
    public boolean moreExpensiveThan(Apartment compared){
        if ((this.squares * this.pricePerSquare) > (compared.squares * compared.pricePerSquare)) {
            return true;
        }

        return false;
    }

    }

    

