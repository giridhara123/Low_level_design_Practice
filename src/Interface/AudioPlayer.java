import Interface.MediaInfo;
import Interface.Playable;
import Interface.VolumeControl;

public class AudioPlayer implements Playable, VolumeControl, MediaInfo {

    private String title;
    private String artist;
    private int duration;
    private int volume;
    private boolean isPlaying;

    public AudioPlayer(String title, String artist, int duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.volume = 50;
    }

    public void play(){
        isPlaying = true;
        System.out.println("Playing " + title + " by " + artist);

    }
    public void pause(){
        isPlaying = false;
        System.out.println("Pausing " + title + " by " + artist);
    }
    public void end(){
        isPlaying = false;
        System.out.println("Stopping " + title + " by " + artist);
    }

    public void setVolume(int volume){
        if(volume < 0 || volume > 100){
            throw new IllegalArgumentException("Volume must be between 0 and 100");
        }
        else
        {
            this.volume = volume;
            System.out.println("Changed volume to " + volume);
        }
    }
    public int getVolume(){
        return volume;
    }

    public void getTitle(){
        System.out.println(title);
    }
    public void getArtist(){
        System.out.println(artist);
    }
    public int getDuration(){
        return duration;
    }
}
//AudioPlayer ap = new AudioPlayer("songa","Giri",100);

// ap.setVolume(70);
// ap.play();
// ap.pause();
// ap.setVolume(50);
// ap.end();
// ap.getArtist();
// ap.getTitle();
//System.out.println(ap.getDuration());

//MediaPlayer mp = new MediaPlayer();

// mp.addMedia("songb");
// mp.addMedia("songc");
// mp.playAll();
// mp.stopAll();