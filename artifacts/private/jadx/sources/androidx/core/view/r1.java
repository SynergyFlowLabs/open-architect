package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<VelocityTracker, s1> f48911a = Collections.synchronizedMap(new WeakHashMap());

    @androidx.annotation.w0(34)
    private static class a {
        private a() {
        }

        static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }

        static float b(VelocityTracker velocityTracker, int i10, int i11) {
            return velocityTracker.getAxisVelocity(i10, i11);
        }

        static boolean c(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.isAxisSupported(i10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    private r1() {
    }

    public static void a(@NonNull VelocityTracker velocityTracker, @NonNull MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f48911a.containsKey(velocityTracker)) {
                f48911a.put(velocityTracker, new s1());
            }
            f48911a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.clear();
        l(velocityTracker);
    }

    public static void c(@NonNull VelocityTracker velocityTracker, int i10) {
        d(velocityTracker, i10, Float.MAX_VALUE);
    }

    public static void d(@NonNull VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        s1 s1VarG = g(velocityTracker);
        if (s1VarG != null) {
            s1VarG.d(i10, f10);
        }
    }

    public static float e(@NonNull VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        s1 s1VarG = g(velocityTracker);
        if (s1VarG != null) {
            return s1VarG.e(i10);
        }
        return 0.0f;
    }

    public static float f(@NonNull VelocityTracker velocityTracker, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.b(velocityTracker, i10, i11);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity(i11);
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity(i11);
        }
        return 0.0f;
    }

    @androidx.annotation.p0
    private static s1 g(VelocityTracker velocityTracker) {
        return f48911a.get(velocityTracker);
    }

    @androidx.annotation.v0(expression = "tracker.getXVelocity(pointerId)")
    @Deprecated
    public static float h(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getXVelocity(i10);
    }

    @androidx.annotation.v0(expression = "tracker.getYVelocity(pointerId)")
    @Deprecated
    public static float i(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getYVelocity(i10);
    }

    public static boolean j(@NonNull VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.c(velocityTracker, i10);
        }
        return i10 == 26 || i10 == 0 || i10 == 1;
    }

    public static void k(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        l(velocityTracker);
    }

    private static void l(VelocityTracker velocityTracker) {
        f48911a.remove(velocityTracker);
    }
}
