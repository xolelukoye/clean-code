package practice3.video_service;

public interface VideoAdapter {
    boolean supports(String format);
    Video convertToMp4(Video video);
}
