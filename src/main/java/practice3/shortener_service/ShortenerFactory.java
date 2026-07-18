package practice3.shortener_service;

import practice3.shortener_service.strategy.ShorteningStrategy;

public class ShortenerFactory {

    private final ShorteningStrategy strategy;

    public ShortenerFactory(ShorteningStrategy strategy) {
        this.strategy = strategy;
    }

    public ShorteningStrategy createStrategy() {
        return strategy;
    }
}
