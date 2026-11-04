package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 {
    private g1() {
    }

    @androidx.annotation.v0(expression = "scaleGestureDetector.isQuickScaleEnabled()")
    @Deprecated
    public static boolean a(@NonNull ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    @androidx.annotation.v0(expression = "scaleGestureDetector.setQuickScaleEnabled(enabled)")
    @Deprecated
    public static void c(@NonNull ScaleGestureDetector scaleGestureDetector, boolean z10) {
        scaleGestureDetector.setQuickScaleEnabled(z10);
    }

    @Deprecated
    public static void d(Object obj, boolean z10) {
        c((ScaleGestureDetector) obj, z10);
    }
}
