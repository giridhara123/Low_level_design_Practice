import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    private List<String> playlist;

    public MediaPlayer() {
        playlist = new ArrayList<String>();
    }

    public void addMedia(String media) {
        playlist.add(media);
    }
    public void playAll() {
        playlist.forEach(title -> System.out.println("Playing: " + title));
    }
    public void stopAll() {
        playlist.forEach(title -> System.out.println("Stopped: " + title));
    }
}
