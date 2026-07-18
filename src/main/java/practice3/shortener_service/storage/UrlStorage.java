package practice3.shortener_service.storage;

// Интерфейс для хранения пар "длинный URL - короткий URL"
public interface UrlStorage {
    // сохраняем пару url
    void save(String shortUrl, String longUrl);
    // возвращаем длинный урл по короткому
    String getLongUrl(String shortUrl);
}
