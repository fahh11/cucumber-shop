package ku.shop;

public class NotEnoughStock extends RuntimeException {
    public NotEnoughStock(String message) {
        super(message);
    }
}