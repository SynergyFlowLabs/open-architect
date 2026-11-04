package xxCvBnMs;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes14.dex */
public final class iiOpQaSdF implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: iiOpQaSdF, reason: collision with root package name */
    public final /* synthetic */ qWeRtYuIo f390644iiOpQaSdF;

    /* JADX INFO: renamed from: uuJkLzXcV, reason: collision with root package name */
    public final /* synthetic */ Activity f390645uuJkLzXcV;

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final /* synthetic */ View f390646vvBnMaSd;

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public boolean f390647xxCvBnMs = false;

    public iiOpQaSdF(qWeRtYuIo qwertyuio, View view, Activity activity) {
        this.f390644iiOpQaSdF = qwertyuio;
        this.f390646vvBnMaSd = view;
        this.f390645uuJkLzXcV = activity;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f390647xxCvBnMs) {
            return;
        }
        this.f390647xxCvBnMs = true;
        final View view = this.f390646vvBnMaSd;
        view.post(new Runnable() { // from class: xxCvBnMs.iiOpQaSdF$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.xxCvBnMs(view);
            }
        });
        if (this.f390645uuJkLzXcV.isFinishing() || this.f390645uuJkLzXcV.isDestroyed()) {
            Log.w(qWeRtYuIo.xxCvBnMs(this.f390644iiOpQaSdF.zXcAqWGh), "Activity was destroyed while waiting for onDraw event.");
            return;
        }
        Log.i(qWeRtYuIo.xxCvBnMs(this.f390644iiOpQaSdF.zXcAqWGh), "UI is stable (onDraw event). Scheduling banner display with delay.");
        qWeRtYuIo qwertyuio = this.f390644iiOpQaSdF;
        Activity activity = this.f390645uuJkLzXcV;
        qwertyuio.getClass();
        new Handler(Looper.getMainLooper()).postDelayed(new ppLkMjNhB(qwertyuio, activity), 600L);
    }

    public final /* synthetic */ void xxCvBnMs(View view) {
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(this);
        }
    }
}
