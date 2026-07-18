package practice3.shortener_service;

import practice3.shortener_service.storage.InMemoryUrlStorage;
import practice3.shortener_service.storage.UrlStorage;
import practice3.shortener_service.strategy.ShorteningStrategy;

// Класс, отвечающий за логику сокращения и восстановления URL
public class UrlShortenerService {

    // ссылка на объект хранилища
    private final UrlStorage storage;
    // стратегия сокращения
    private final ShorteningStrategy strategy;

    public UrlShortenerService(ShortenerFactory factory) {
        this.strategy = factory.createStrategy();
        this.storage = InMemoryUrlStorage.getInstance();
    }

    // сокращение урл
    public String shortenUrl(String longUrl) {
        String shortUrl = strategy.shorten(longUrl);
        storage.save(shortUrl, longUrl);
        return shortUrl;
    }

    // возвращаем исходный урл из хранилища
    public String expandUrl(String shortUrl) {
        return  storage.getLongUrl(shortUrl);
    }
}
