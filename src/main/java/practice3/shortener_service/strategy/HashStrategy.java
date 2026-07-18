package practice3.shortener_service.strategy;

public class HashStrategy implements ShorteningStrategy {

    @Override
    public String shorten(String longUrl) {
        return Integer.toHexString(longUrl.hashCode());
    }
}
