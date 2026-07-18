package practice3.video_service;

import java.util.List;

public class VideoService {

    private List<VideoAdapter> adapters;

    public VideoService(VideoAdapter... adapters) {
        this.adapters = List.of(adapters);
    }

    public Video uploadVideo(String path) {

        String extension = path.substring(path.lastIndexOf('.') + 1).toUpperCase();

        Video video = new Video(path, extension);

        for (VideoAdapter adapter : adapters) {
            if (adapter.supports(extension)) {
                return adapter.convertToMp4(video);
            }
        }
        throw new IllegalArgumentException("Unsupported format: " + extension);
    }

    public Stream streamVideo(String id) {
        System.out.println("Streaming video: " + id);
        return new Stream(new Video("path", "MP4"));
    }
}
