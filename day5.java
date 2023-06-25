import java.util.ArrayList;
import java.util.List;

interface MusicPlayer {
    void play();
    void pause();
    void stop();
    void addSong(String song);
    void removeSong(String song);
}

class MyMusicPlayer implements MusicPlayer {
    private List playlist;
    private boolean isPlaying;

    public MyMusicPlayer() {
        this.playlist = new ArrayList<>();
        this.isPlaying = false;
    }

    @Override
    public void play() {
        if (!playlist.isEmpty()) {
            System.out.println("Playing: " + playlist.get(0));
            isPlaying = true;
        } else {
            System.out.println("No songs in the playlist.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("Paused: " + playlist.get(0));
            isPlaying = false;
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("Stopped: " + playlist.get(0));
            isPlaying = false;
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    @Override
    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Added song: " + song);
    }

    @Override
    public void removeSong(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println("Removed song: " + song);
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }
}

public class day5 {
    public static void main(String[] args) {
        MusicPlayer player = new MyMusicPlayer();

        player.addSong("Song 1");
        player.addSong("Song 2");
        player.addSong("Song 3");
        player.addSong("Song 4");
        player.addSong("Song 5");

        player.play();
        player.pause();

        player.removeSong("Song 3");

        player.stop();
    }
}