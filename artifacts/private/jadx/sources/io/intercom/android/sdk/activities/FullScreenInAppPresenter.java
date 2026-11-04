package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
class FullScreenInAppPresenter {
    FullScreenInAppPresenter() {
    }

    void closeWindow(final Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        decorView.setAlpha(1.0f);
        decorView.animate().alpha(0.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.FullScreenInAppPresenter.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
        }).start();
    }
}
