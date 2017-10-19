package hard.mvpanddagger2.model;

/**
 * Created by 苗 on 2017/10/18.
 */

public class Modeldemo implements MvpModelImpl{
    @Override
    public MvpEntity test() {
        return new MvpEntity("你点击了MVP触发按钮哦！我现在正在和dragger2使用");
    }
}
