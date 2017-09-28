package cn.jzvd;

/**
 * Created by Nathen
 * On 2016/04/04 22:13
 */
public interface JZUserAction {

    int ON_CLICK_START_ICON = 0;
    int ON_CLICK_START_ERROR = 1;
    int ON_CLICK_START_AUTO_COMPLETE = 2;

    int ON_CLICK_PAUSE = 3;
    int ON_CLICK_RESUME = 4;
    int ON_SEEK_POSITION = 5;
    int ON_AUTO_COMPLETE = 6;

    int ON_ENTER_FULLSCREEN = 7;
    int ON_QUIT_FULLSCREEN = 8;
    int ON_ENTER_TINYSCREEN = 9;
    int ON_QUIT_TINYSCREEN = 10;


    int ON_TOUCH_SCREEN_SEEK_VOLUME = 11;
    int ON_TOUCH_SCREEN_SEEK_POSITION = 12;

    int ON_TOUCH_BACK_BEFOR = 13;
    int ON_TOUCH_BACK_LAST = 14;

    int ON_TOUCH_FULLSCREEN_BEFOR = 15;
    int ON_TOUCH_FULLSCREEN_LAST = 16;


    int ON_STATE_NORMAL = 40;
    int ON_STATE_PREPARING = 41;
    int ON_STATE_PREPARING_CHANGING_URL = 42;
    int ON_STATE_PLAYING = 43;
    int ON_STATE_PAUSE = 44;
    int ON_STATE_PLAYING_BUFFER_START = 45;
    int ON_STATE_ERROR = 46;
    int ON_STATE_COMPLETE = 47;

    void onEvent(int type, String url, int screen, Object... objects);

}
