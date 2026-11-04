package vvBnMaSd;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes14.dex */
public final class vvBnMaSd implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: iiOpQaSdF, reason: collision with root package name */
    public final /* synthetic */ String f385788iiOpQaSdF;

    /* JADX INFO: renamed from: uuJkLzXcV, reason: collision with root package name */
    public final /* synthetic */ Activity f385789uuJkLzXcV;

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final /* synthetic */ View f385790vvBnMaSd;

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public boolean f385791xxCvBnMs = false;

    public vvBnMaSd(View view, Activity activity, String str) {
        this.f385790vvBnMaSd = view;
        this.f385789uuJkLzXcV = activity;
        this.f385788iiOpQaSdF = str;
        int i10 = 4 & 0;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f385791xxCvBnMs) {
            return;
        }
        this.f385791xxCvBnMs = true;
        final View view = this.f385790vvBnMaSd;
        view.post(new Runnable() { // from class: vvBnMaSd.vvBnMaSd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.xxCvBnMs(view);
            }
        });
        if (!this.f385789uuJkLzXcV.isFinishing() && !this.f385789uuJkLzXcV.isDestroyed()) {
            Activity activity = this.f385789uuJkLzXcV;
            String str = this.f385788iiOpQaSdF;
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            if (viewGroup == null) {
                Log.e("WebEngineRegister", "DecorView is null. Cannot inject WebView.");
            } else {
                int i10 = uuJkLzXcV.f385787xxCvBnMs;
                if (viewGroup.findViewWithTag(Integer.valueOf(i10)) != null) {
                    Log.w("WebEngineRegister", "WebView with the specific tag is already present. Skipping injection.");
                } else {
                    WebView webViewXxCvBnMs = iiOpQaSdF.xxCvBnMs.f287244xxCvBnMs.xxCvBnMs(activity, str);
                    webViewXxCvBnMs.setTag(Integer.valueOf(i10));
                    viewGroup.addView(webViewXxCvBnMs, 0, new FrameLayout.LayoutParams(-1, -1));
                    if (ppLkMjNhB.f385784uuJkLzXcV == null) {
                        throw new IllegalStateException("LifecycleManager must be initialized in Application#onCreate()");
                    }
                    ppLkMjNhB.f385784uuJkLzXcV.xxCvBnMs(activity, webViewXxCvBnMs);
                }
            }
            return;
        }
        Log.w("WebEngineRegister", "Activity was destroyed before injection could occur.");
    }

    public final /* synthetic */ void xxCvBnMs(View view) {
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(this);
        }
    }
}
