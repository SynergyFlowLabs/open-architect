package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f48693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f48694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f48695c;

    private e1(View view, Runnable runnable) {
        this.f48693a = view;
        this.f48694b = view.getViewTreeObserver();
        this.f48695c = runnable;
    }

    @NonNull
    public static e1 a(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        e1 e1Var = new e1(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(e1Var);
        view.addOnAttachStateChangeListener(e1Var);
        return e1Var;
    }

    public void b() {
        if (this.f48694b.isAlive()) {
            this.f48694b.removeOnPreDrawListener(this);
        } else {
            this.f48693a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f48693a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f48695c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view) {
        this.f48694b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view) {
        b();
    }
}
