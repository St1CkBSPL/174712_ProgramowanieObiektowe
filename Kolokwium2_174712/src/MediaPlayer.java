public interface MediaPlayer {
    public abstract void play();
    public abstract void pause();
    public abstract String getCurrentTrack();
}

class AudioPlayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Playing audio track");
    }
    @Override
    public void pause() {
        System.out.println("Pausing audio track");
    }
    @Override
    public String getCurrentTrack() {
        return "Audio track";
    }
}

class VideoPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing video track");
    }
    @Override
    public void pause() {
        System.out.println("Pausing video track");
    }
    @Override
    public String getCurrentTrack() {
        return "Video track";
    }
}
