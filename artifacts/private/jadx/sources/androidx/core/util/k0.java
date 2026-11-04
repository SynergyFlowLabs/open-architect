package androidx.core.util;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f48397a = 0.013888889f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f48398b = 0.03937008f;

    @w0(34)
    private static class a {
        private a() {
        }

        public static float a(int i10, float f10, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i10, f10, displayMetrics);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    private k0() {
    }

    public static float a(int i10, float f10, @NonNull DisplayMetrics displayMetrics) {
        float f11;
        float f12;
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(i10, f10, displayMetrics);
        }
        if (i10 == 0) {
            return f10;
        }
        if (i10 == 1) {
            float f13 = displayMetrics.density;
            if (f13 == 0.0f) {
                return 0.0f;
            }
            return f10 / f13;
        }
        if (i10 == 2) {
            float f14 = displayMetrics.scaledDensity;
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return f10 / f14;
        }
        if (i10 == 3) {
            float f15 = displayMetrics.xdpi;
            if (f15 == 0.0f) {
                return 0.0f;
            }
            f11 = f10 / f15;
            f12 = f48397a;
        } else {
            if (i10 == 4) {
                float f16 = displayMetrics.xdpi;
                if (f16 == 0.0f) {
                    return 0.0f;
                }
                return f10 / f16;
            }
            if (i10 != 5) {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + i10);
            }
            float f17 = displayMetrics.xdpi;
            if (f17 == 0.0f) {
                return 0.0f;
            }
            f11 = f10 / f17;
            f12 = f48398b;
        }
        return f11 / f12;
    }

    public static float b(float f10, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f10, displayMetrics);
    }

    @e.a({"WrongConstant"})
    public static int c(int i10) {
        return i10 & 15;
    }

    public static float d(float f10, @NonNull DisplayMetrics displayMetrics) {
        return a(1, f10, displayMetrics);
    }

    public static float e(float f10, @NonNull DisplayMetrics displayMetrics) {
        return a(2, f10, displayMetrics);
    }

    public static float f(float f10, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f10, displayMetrics);
    }
}
