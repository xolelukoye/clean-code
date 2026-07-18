package practice3.video_service;

public class MovVideoAdapter implements VideoAdapter {

    @Override
    public boolean supports(String format) {
        return format.equalsIgnoreCase("MOV");
    }

    @Override
    public Video convertToMp4(Video video) {
        System.out.println("Converting MOV to MP4...");
        video.setFormat("MP4");
        return video;
    }
}
