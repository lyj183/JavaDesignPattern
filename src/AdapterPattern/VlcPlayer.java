package AdapterPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/8 16:17
 * @Description: 第2步 分别创建实现 AdvancedMediaPlayer 接口的具体类（VlcPlayer 和 Mp4Player）
 **/

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
