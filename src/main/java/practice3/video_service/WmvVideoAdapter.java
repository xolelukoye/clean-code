package practice3.video_service;

public class WmvVideoAdapter implements VideoAdapter {

    @Override
    public boolean supports(String format) {
        return format.equalsIgnoreCase("WMV");
    }

    @Override
    public Video convertToMp4(Video video) {
        System.out.println("Converting WMV to MP4...");
        video.setFormat("MP4");
        return video;
    }
}
