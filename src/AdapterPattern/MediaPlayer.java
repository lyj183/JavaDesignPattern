package AdapterPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/8 16:01
 * @Description: 第1步 分别创建媒体播放器和高级媒体播放器接口（MediaPlayer 和 AdvancedMediaPlayer）
 **/

public interface MediaPlayer {
    public void play(String audioType, String fileName);
}

