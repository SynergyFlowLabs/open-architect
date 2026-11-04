package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class d implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e.a({"ThreadPoolCreation"})
    private final Handler f124227a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<View> f124228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f124229c;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(d.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private d(View view, Runnable runnable) {
        this.f124228b = new AtomicReference<>(view);
        this.f124229c = runnable;
    }

    public static /* synthetic */ void a(d dVar, View view) {
        dVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(dVar);
    }

    private static boolean b(View view) {
        if (!view.getViewTreeObserver().isAlive() || !c(view)) {
            return false;
        }
        int i10 = 4 | 1;
        return true;
    }

    private static boolean c(View view) {
        return view.isAttachedToWindow();
    }

    public static void d(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new d(view, runnable));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f124228b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.util.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d.a(this.f124225a, andSet);
            }
        });
        this.f124227a.postAtFrontOfQueue(this.f124229c);
    }
}
