package practice3.video_service;

public class AviVideoAdapter implements VideoAdapter {

    @Override
    public boolean supports(String format) {
        return format.equalsIgnoreCase("AVI");
    }

    @Override
    public Video convertToMp4(Video video) {
        System.out.println("Converting AVI to MP4...");
        video.setFormat("MP4");
        return video;
    }
}
