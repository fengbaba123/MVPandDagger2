package hard.mvpanddagger2.presenter;

import dagger.Component;
import hard.mvpanddagger2.view.MainActivity;

/**
 * Created by 替换model 起连接作用 不用new对象 on 2017/10/18.
 */
@Component(modules = MvpPresenterModule.class)
public interface MvpPresenterComponent {

    void inject(MainActivity activity);

}
