package vvBnMaSd;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes14.dex */
public abstract class uuJkLzXcV {

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public static final int f385787xxCvBnMs = View.generateViewId();

    public static void xxCvBnMs(Activity activity, String str) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new vvBnMaSd(decorView, activity, str));
            return;
        }
        Log.w("WebEngineRegister", "Activity is not valid, skipping injection scheduling.");
    }

    public static void xxCvBnMs(Activity activity) {
        try {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View viewFindViewWithTag = viewGroup.findViewWithTag(Integer.valueOf(f385787xxCvBnMs));
            if (viewFindViewWithTag instanceof WebView) {
                Log.w("WebEngineRegister", "Found and destroying leftover WebView in DecorView.");
                viewGroup.removeView(viewFindViewWithTag);
                ((WebView) viewFindViewWithTag).destroy();
            }
        } catch (Exception e10) {
            Log.e("WebEngineRegister", "Error during cleanup of old WebView.", e10);
        }
        uuJkLzXcV.iiOpQaSdF.xxCvBnMs(activity.getApplicationContext(), new xxCvBnMs(activity));
    }
}
