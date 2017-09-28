package cn.jzvd;

/**
 * Put JCVideoPlayer into layout
 * From a JCVideoPlayer to another JCVideoPlayer
 * Created by Nathen on 16/7/26.
 */
public class JZVideoPlayerManager {

    public static JZVideoPlayer FIRST_FLOOR_JCVD;
    public static JZVideoPlayer SECOND_FLOOR_JCVD;

    public static void setFirstFloor(JZVideoPlayer JZVideoPlayer) {
        FIRST_FLOOR_JCVD = JZVideoPlayer;
    }

    public static void setSecondFloor(JZVideoPlayer JZVideoPlayer) {
        SECOND_FLOOR_JCVD = JZVideoPlayer;
    }

    public static JZVideoPlayer getFirstFloor() {
        return FIRST_FLOOR_JCVD;
    }

    public static JZVideoPlayer getSecondFloor() {
        return SECOND_FLOOR_JCVD;
    }

    public static JZVideoPlayer getCurrentJcvd() {
        if (getSecondFloor() != null) {
            return getSecondFloor();
        }
        return getFirstFloor();
    }

    public static void completeAll() {
        if (SECOND_FLOOR_JCVD != null) {
            SECOND_FLOOR_JCVD.onCompletion();
            SECOND_FLOOR_JCVD = null;
        }
        if (FIRST_FLOOR_JCVD != null) {
            FIRST_FLOOR_JCVD.onCompletion();
            FIRST_FLOOR_JCVD = null;
        }
    }
}
