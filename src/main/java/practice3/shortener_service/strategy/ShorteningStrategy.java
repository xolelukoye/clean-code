package practice3.shortener_service.strategy;

// интерфейс, определяющий метод для сокращения урл
public interface ShorteningStrategy {
    String shorten(String longUrl);
}
