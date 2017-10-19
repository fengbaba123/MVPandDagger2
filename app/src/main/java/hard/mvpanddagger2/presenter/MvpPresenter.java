package hard.mvpanddagger2.presenter;

import hard.mvpanddagger2.model.MvpEntity;
import hard.mvpanddagger2.model.MvpModelImpl;
import hard.mvpanddagger2.view.MupUitldemo;

/**
 * Created by 苗 on 2017/10/18.
 */
public class MvpPresenter {
    MupUitldemo ui;
    MvpModelImpl model;

    public MvpPresenter(MupUitldemo ui, MvpModelImpl model) {
        this.ui = ui;
        this.model = model;
    }

    public void testDoS() {
        MvpEntity entity = model.test();
        ui.huozhi(entity.getName());
    }
}
