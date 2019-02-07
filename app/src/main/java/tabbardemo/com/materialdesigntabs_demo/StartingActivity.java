package tabbardemo.com.materialdesigntabs_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by sonu on 12/06/17.
 */

public class StartingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_activity);
    }


    public void showDefaultTab(View view) {
        startTabActivity(TabType.DEFAULT);
    }

    public void showTabWithIconAndText(View view) {
        startTabActivity(TabType.ICON_TEXT);
    }

    public void showTabWithIconsOnly(View view) {
        startTabActivity(TabType.ICONS_ONLY);
    }

    public void showCustomTab(View view) {
        startTabActivity(TabType.CUSTOM);
    }

    /**
     * method to start MainActivity with passing TabType
     *
     * @param tabType type of tab to show
     **/
    private void startTabActivity(TabType tabType) {
        Intent intent = new Intent(StartingActivity.this, MainActivity.class);
        intent.putExtra(MainActivity.TAB_TYPE, tabType);
        startActivity(intent);

    }

}
