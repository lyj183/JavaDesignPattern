package AdapterPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/8 16:20
 * @Description: 第2步 分别创建实现 AdvancedMediaPlayer 接口的具体类（VlcPlayer 和 Mp4Player）
 **/

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
