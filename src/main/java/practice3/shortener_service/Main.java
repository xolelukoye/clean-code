package practice3.shortener_service;

import practice3.shortener_service.strategy.Base62Strategy;

public class Main {

    public static void main(String[] args) {
        UrlShortenerService shortenerService = new UrlShortenerService(new ShortenerFactory(new Base62Strategy()));

        String shortUrl = shortenerService.shortenUrl("https://example.com/very/long/url");
        System.out.println("Short URL: " + shortUrl);

        String longUrl = shortenerService.expandUrl(shortUrl);
        System.out.println("Original URL: " + longUrl);
    }
}
