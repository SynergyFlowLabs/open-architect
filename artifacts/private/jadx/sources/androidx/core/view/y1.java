package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f49028a = "ViewConfigCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f49029b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f49030c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f49031d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f49032e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f49033f;

    @androidx.annotation.w0(26)
    static class a {
        private a() {
        }

        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    @androidx.annotation.w0(28)
    static class b {
        private b() {
        }

        static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    @androidx.annotation.w0(34)
    static class c {
        private c() {
        }

        static int a(@NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
        }

        static int b(@NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
        }
    }

    private y1() {
    }

    private static int a(Resources resources, int i10, androidx.core.util.i0<Integer> i0Var, int i11) {
        int dimensionPixelSize;
        if (i10 == -1) {
            return i0Var.get().intValue();
        }
        if (i10 != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(i10)) >= 0) {
            return dimensionPixelSize;
        }
        return i11;
    }

    private static float b(ViewConfiguration viewConfiguration, Context context) {
        Method method = f49033f;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int d(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int e(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float f(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return a.a(viewConfiguration);
    }

    public static int g(@NonNull ViewConfiguration viewConfiguration) {
        return b.a(viewConfiguration);
    }

    public static int h(@NonNull Context context, @NonNull final ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i10, i11, i12);
        }
        if (!m(i10, i11, i12)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iD = d(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iD, new androidx.core.util.i0() { // from class: androidx.core.view.w1
            @Override // androidx.core.util.i0
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int i(@NonNull Context context, @NonNull final ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i10, i11, i12);
        }
        if (!m(i10, i11, i12)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iE = e(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iE, new androidx.core.util.i0() { // from class: androidx.core.view.x1
            @Override // androidx.core.util.i0
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    @androidx.annotation.v0(expression = "config.getScaledPagingTouchSlop()")
    @Deprecated
    public static int j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float k(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return a.b(viewConfiguration);
    }

    @androidx.annotation.v0(expression = "config.hasPermanentMenuKey()")
    @Deprecated
    public static boolean l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    private static boolean m(int i10, int i11, int i12) {
        InputDevice device = InputDevice.getDevice(i10);
        return (device == null || device.getMotionRange(i11, i12) == null) ? false : true;
    }

    public static boolean n(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return b.b(viewConfiguration);
    }
}
