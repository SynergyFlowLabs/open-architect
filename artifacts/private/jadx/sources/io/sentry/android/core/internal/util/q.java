package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.u0;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class q implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f304328a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicReference<View> f304329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Runnable f304330c;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(q.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private q(@NotNull View view, @NotNull Runnable runnable) {
        this.f304329b = new AtomicReference<>(view);
        this.f304330c = runnable;
    }

    public static /* synthetic */ void a(q qVar, View view) {
        qVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(qVar);
    }

    public static /* synthetic */ void b(Window window, Window.Callback callback, Runnable runnable, u0 u0Var) {
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            e(viewPeekDecorView, runnable, u0Var);
        }
    }

    private static boolean c(@NotNull View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static void d(@NotNull Activity activity, @NotNull final Runnable runnable, @NotNull final u0 u0Var) {
        final Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                e(viewPeekDecorView, runnable, u0Var);
            } else {
                final Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.j(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new Runnable() { // from class: io.sentry.android.core.internal.util.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.b(window, callback, runnable, u0Var);
                    }
                }));
            }
        }
    }

    public static void e(@NotNull View view, @NotNull Runnable runnable, @NotNull u0 u0Var) {
        q qVar = new q(view, runnable);
        if (u0Var.d() >= 26 || c(view)) {
            view.getViewTreeObserver().addOnDrawListener(qVar);
        } else {
            view.addOnAttachStateChangeListener(qVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f304329b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.o
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                q.a(this.f304322a, andSet);
            }
        });
        this.f304328a.postAtFrontOfQueue(this.f304330c);
    }
}
