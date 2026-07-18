package practice3.video_service;

public class Main {

    public static void main(String[] args) {

        VideoService videoService = new VideoService(new AviVideoAdapter(), new MovVideoAdapter(), new WmvVideoAdapter());

        String videoPath = "path/to/example.avi";
        Video video = videoService.uploadVideo(videoPath);

        Stream stream = videoService.streamVideo(video.getId());

        System.out.println("Streaming video in MP4 format, Video ID: " + video.getId());
    }
}
