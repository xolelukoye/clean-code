package practice3.shortener_service.strategy;

import java.util.concurrent.atomic.AtomicLong;

public class Base62Strategy implements ShorteningStrategy {

    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static final AtomicLong COUNTER = new AtomicLong(100000);

    @Override
    public String shorten(String longUrl) {

        long value  = COUNTER.incrementAndGet();

        StringBuilder sb = new StringBuilder();

        while (value > 0) {
            sb.append(ALPHABET.charAt((int)(value % 62)));
            value /= 62;
        }
        return sb.reverse().toString();
    }
}
