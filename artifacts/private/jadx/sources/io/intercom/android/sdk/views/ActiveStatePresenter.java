package io.intercom.android.sdk.views;

import android.view.View;
import androidx.core.content.d;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;

/* JADX INFO: loaded from: classes13.dex */
public class ActiveStatePresenter {
    private static final String ENGLISH_LOCALE = "en";

    public void presentStateDot(boolean z10, View view, AppConfig appConfig) {
        if (ENGLISH_LOCALE.equals(appConfig.getLocale())) {
            BackgroundUtils.setBackground(view, new ActiveStateDrawable(d.g(view.getContext(), z10 ? R.color.intercom_active_state : R.color.intercom_away_state), d.g(view.getContext(), R.color.intercom_white), view.getResources().getDisplayMetrics().density * 1.0f));
        } else {
            view.setBackgroundResource(0);
        }
    }
}
