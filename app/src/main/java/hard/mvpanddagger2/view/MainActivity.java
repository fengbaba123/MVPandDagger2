package hard.mvpanddagger2.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import hard.mvpanddagger2.R;
import hard.mvpanddagger2.presenter.DaggerMvpPresenterComponent;
import hard.mvpanddagger2.presenter.MvpPresenter;
import hard.mvpanddagger2.presenter.MvpPresenterModule;

public class MainActivity extends AppCompatActivity implements MupUitldemo, View.OnClickListener {


    private TextView name;
    private Button bt;
    @Inject
    MvpPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMvpPresenterComponent.builder().mvpPresenterModule(new MvpPresenterModule(this)).build().inject(this);
        initView();


    }


    private void initView() {

        bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(this);

    }

    @Override
    public void huozhi(String msg) {
        name = (TextView) findViewById(R.id.name);
        name.setText(msg);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt:
            presenter.testDoS();
                break;
        }
    }
}
