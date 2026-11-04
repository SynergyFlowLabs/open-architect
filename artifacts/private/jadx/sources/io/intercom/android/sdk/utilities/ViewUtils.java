package io.intercom.android.sdk.utilities;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes13.dex */
public class ViewUtils {
    public static void removeGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void waitForViewAttachment(final View view, final Runnable runnable) {
        if (view.getHeight() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.utilities.ViewUtils.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ViewUtils.removeGlobalLayoutListener(view, this);
                    runnable.run();
                }
            });
        } else {
            runnable.run();
        }
    }
}
