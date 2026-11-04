package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class GestureDetectorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GestureDetector f48448a;

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.f48448a.isLongpressEnabled();
    }

    public boolean b(@NonNull MotionEvent motionEvent) {
        return this.f48448a.onTouchEvent(motionEvent);
    }

    @e.a({"KotlinPropertyAccess"})
    public void c(boolean z10) {
        this.f48448a.setIsLongpressEnabled(z10);
    }

    public void d(@androidx.annotation.p0 GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f48448a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @androidx.annotation.p0 Handler handler) {
        this.f48448a = new GestureDetector(context, onGestureListener, handler);
    }
}
