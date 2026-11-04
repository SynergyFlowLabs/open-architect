package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e.a({"ThreadPoolCreation"})
    private final Handler f124234a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<View> f124235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f124236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f124237d;

    private g(View view, Runnable runnable, Runnable runnable2) {
        this.f124235b = new AtomicReference<>(view);
        this.f124236c = runnable;
        this.f124237d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new g(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f124235b.getAndSet(null);
        int i10 = 3 | 1;
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f124234a.post(this.f124236c);
        this.f124234a.postAtFrontOfQueue(this.f124237d);
        return true;
    }
}
