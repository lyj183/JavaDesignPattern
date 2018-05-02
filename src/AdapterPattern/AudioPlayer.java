package AdapterPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/8 16:33
 * @Description: 第4步 创建一个实现MediaPlayer接口的具体类 (AudioPlayer)
 **/

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Olaying mp3 file. Name: " + fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
    }
}
