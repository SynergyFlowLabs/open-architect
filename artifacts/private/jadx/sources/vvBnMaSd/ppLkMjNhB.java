package vvBnMaSd;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class ppLkMjNhB implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: uuJkLzXcV, reason: collision with root package name */
    public static volatile ppLkMjNhB f385784uuJkLzXcV;

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final ConcurrentHashMap f385786xxCvBnMs = new ConcurrentHashMap();

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final Handler f385785vvBnMaSd = new Handler(Looper.getMainLooper());

    public ppLkMjNhB(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        vvBnMaSd(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void vvBnMaSd(Activity activity) {
        iiOpQaSdF iiopqasdf = (iiOpQaSdF) this.f385786xxCvBnMs.remove(activity);
        if (iiopqasdf != null) {
            Runnable runnable = iiopqasdf.f385782vvBnMaSd;
            if (runnable != null) {
                this.f385785vvBnMaSd.removeCallbacks(runnable);
            }
            try {
                WebView webView = iiopqasdf.f385783xxCvBnMs;
                if (webView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) webView.getParent()).removeView(webView);
                }
                webView.destroy();
                Log.i("LifecycleManager", "Managed WebView removed and destroyed for ".concat(activity.getClass().getSimpleName()));
            } catch (Exception e10) {
                Log.e("LifecycleManager", "Error destroying managed WebView.", e10);
            }
        }
    }

    public final void xxCvBnMs(final Activity activity, WebView webView) {
        vvBnMaSd(activity);
        iiOpQaSdF iiopqasdf = new iiOpQaSdF(webView);
        this.f385786xxCvBnMs.put(activity, iiopqasdf);
        Runnable runnable = new Runnable() { // from class: vvBnMaSd.ppLkMjNhB$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.xxCvBnMs(activity);
            }
        };
        iiopqasdf.f385782vvBnMaSd = runnable;
        this.f385785vvBnMaSd.postDelayed(runnable, 60000L);
    }

    public final /* synthetic */ void xxCvBnMs(Activity activity) {
        Log.i("LifecycleManager", "WebView lifetime timeout reached. Destroying for ".concat(activity.getClass().getSimpleName()));
        vvBnMaSd(activity);
    }
}
