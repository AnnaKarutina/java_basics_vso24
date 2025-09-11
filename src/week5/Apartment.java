package week5;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    // Exercise 87.1: Larger
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }

    // Exercise 87.2: Price difference
    public int apartmentPrice() {
        return this.squareMeters * this.pricePerSquareMeter;
    }

    public int priceDifference(Apartment otherApartment){
        return Math.abs(this.apartmentPrice() - otherApartment.apartmentPrice());
    }

    // Exercise 87.3: more expensive than
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.apartmentPrice() >= otherApartment.apartmentPrice();
    }
}
