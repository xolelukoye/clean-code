package practice3.shortener_service.strategy;
import java.util.UUID;

public class UUIDStrategy implements ShorteningStrategy {

    @Override
    public String shorten(String longUrl) {
        return UUID.randomUUID().toString().substring(0,8);
    }
}
