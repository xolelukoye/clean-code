package practice3.shortener_service.storage;
import java.util.HashMap;
import java.util.Map;

// единственное хранилище всех урл
public class InMemoryUrlStorage implements UrlStorage {

    private static final InMemoryUrlStorage INSTANCE = new InMemoryUrlStorage();

    // храним пары урл
    private final Map<String, String> storage = new HashMap<>();

    // приватный(закрытый) конструктор
    private InMemoryUrlStorage() {
    }

    // единственный экземпляр хранилища
    public static InMemoryUrlStorage getInstance() {
        return INSTANCE;
    }

    @Override
    public void save(String shortUrl, String longUrl) {
        storage.put(shortUrl, longUrl);
    }

    @Override
    public String getLongUrl(String shortUrl) {
        return storage.get(shortUrl);
    }
}
