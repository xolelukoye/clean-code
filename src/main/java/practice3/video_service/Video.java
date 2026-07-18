package practice3.video_service;

import java.util.UUID;

public class Video {

    private String id;
    private String path;
    private String format;

    public Video(String path, String format) {
        this.id = UUID.randomUUID().toString();
        this.path = path;
        this.format = format;
    }

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
