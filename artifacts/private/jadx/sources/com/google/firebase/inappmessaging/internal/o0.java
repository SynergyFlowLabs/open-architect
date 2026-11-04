package com.google.firebase.inappmessaging.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes5.dex */
public class o0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f122892f = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f122896d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f122893a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f122894b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f122895c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.reactivex.subjects.b<String> f122897e = io.reactivex.subjects.b.n8();

    public static /* synthetic */ void a(o0 o0Var) {
        boolean z10 = o0Var.f122894b;
        o0Var.f122894b = !(z10 && o0Var.f122895c) && z10;
    }

    public io.reactivex.flowables.a<String> b() {
        return this.f122897e.V6(io.reactivex.b.BUFFER).L4();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f122895c = true;
        Runnable runnable = this.f122896d;
        if (runnable != null) {
            this.f122893a.removeCallbacks(runnable);
        }
        Handler handler = this.f122893a;
        Runnable runnable2 = new Runnable() { // from class: com.google.firebase.inappmessaging.internal.n0
            @Override // java.lang.Runnable
            public final void run() {
                o0.a(this.f122871a);
            }
        };
        this.f122896d = runnable2;
        handler.postDelayed(runnable2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f122895c = false;
        boolean z10 = this.f122894b;
        this.f122894b = true;
        Runnable runnable = this.f122896d;
        if (runnable != null) {
            this.f122893a.removeCallbacks(runnable);
        }
        if (z10) {
            return;
        }
        p2.c("went foreground");
        this.f122897e.onNext(m2.f122848p);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
