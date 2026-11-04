package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.n8;
import io.sentry.x9;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Window.Callback f304236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f304237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final GestureDetectorCompat f304238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final n8 f304239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final b f304240f;

    class a implements b {
        a() {
        }
    }

    interface b {
        @NotNull
        default MotionEvent a(@NotNull MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public h(@NotNull Window.Callback callback, @NotNull Context context, @NotNull g gVar, @Nullable n8 n8Var) {
        this(callback, new GestureDetectorCompat(context, gVar, new Handler(Looper.getMainLooper())), gVar, n8Var, new a());
    }

    private void b(@NotNull MotionEvent motionEvent) {
        this.f304238d.b(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f304237c.k(motionEvent);
        }
    }

    @NotNull
    public Window.Callback a() {
        return this.f304236b;
    }

    public void c() {
        this.f304237c.m(x9.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent motionEventA = this.f304240f.a(motionEvent);
            try {
                b(motionEventA);
            } catch (Throwable th2) {
                try {
                    if (this.f304239e != null) {
                        this.f304239e.getLogger().a(y7.ERROR, "Error dispatching touch event", th2);
                    }
                } catch (Throwable th3) {
                    motionEventA.recycle();
                    throw th3;
                }
            }
            motionEventA.recycle();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    h(@NotNull Window.Callback callback, @NotNull GestureDetectorCompat gestureDetectorCompat, @NotNull g gVar, @Nullable n8 n8Var, @NotNull b bVar) {
        super(callback);
        this.f304236b = callback;
        this.f304237c = gVar;
        this.f304239e = n8Var;
        this.f304238d = gestureDetectorCompat;
        this.f304240f = bVar;
    }
}
