package AdapterPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/8 16:40
 * @Description: 第5步 使用AudioPlayer播放不同类型的音频格式。
 **/

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
