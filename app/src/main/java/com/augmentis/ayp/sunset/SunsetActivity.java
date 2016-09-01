package com.augmentis.ayp.sunset;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SunsetActivity extends SingleFragmentActivity {

    @Override
    protected Fragment onCreateFragment() {
        return SunsetFragment.newInstance();
    }
}
