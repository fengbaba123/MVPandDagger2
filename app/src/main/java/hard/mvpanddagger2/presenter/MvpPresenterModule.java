package hard.mvpanddagger2.presenter;


import dagger.Module;
import dagger.Provides;
import hard.mvpanddagger2.model.Modeldemo;
import hard.mvpanddagger2.view.MainActivity;

/**
 * Created by 苗 on 2017/10/18.
 */
@Module
public class MvpPresenterModule {
    private MainActivity activity;
    public MvpPresenterModule(MainActivity activity) {
        this.activity = activity;
    }
    @Provides
    MainActivity provideActivity(){
        return  activity;
    }
    @Provides
    MvpPresenter providePresenter(MainActivity ui, Modeldemo mvpModel){
        return new MvpPresenter(ui,mvpModel);
    }
    @Provides
    Modeldemo provideMvpModel(){
        return new Modeldemo();
    }
}
