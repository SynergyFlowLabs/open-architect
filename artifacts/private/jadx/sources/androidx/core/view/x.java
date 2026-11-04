package androidx.core.view;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f49021a = 3840;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f49022b = 2160;

    @androidx.annotation.w0(23)
    static class a {
        private a() {
        }

        @NonNull
        static b a(@NonNull Context context, @NonNull Display display) {
            Display.Mode mode = display.getMode();
            Point pointA = x.a(context, display);
            if (pointA != null && !d(mode, pointA)) {
                return new b(mode, pointA);
            }
            return new b(mode, true);
        }

        @NonNull
        @e.a({"ArrayReturn"})
        public static b[] b(@NonNull Context context, @NonNull Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            b[] bVarArr = new b[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point pointA = x.a(context, display);
            if (pointA == null || d(mode, pointA)) {
                for (int i10 = 0; i10 < supportedModes.length; i10++) {
                    bVarArr[i10] = new b(supportedModes[i10], e(supportedModes[i10], mode));
                }
            } else {
                for (int i11 = 0; i11 < supportedModes.length; i11++) {
                    bVarArr[i11] = e(supportedModes[i11], mode) ? new b(supportedModes[i11], pointA) : new b(supportedModes[i11], false);
                }
            }
            return bVarArr;
        }

        static boolean c(@NonNull Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        static boolean d(Display.Mode mode, Point point) {
            if (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) {
                return true;
            }
            return mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x;
        }

        static boolean e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    private x() {
    }

    static Point a(@NonNull Context context, @NonNull Display display) {
        Point pointJ = j("vendor.display-size", display);
        if (pointJ != null) {
            return pointJ;
        }
        if (g(context) && f(display)) {
            return new Point(f49021a, f49022b);
        }
        return null;
    }

    @NonNull
    private static Point b(@NonNull Context context, @NonNull Display display) {
        Point pointA = a(context, display);
        if (pointA != null) {
            return pointA;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @NonNull
    public static b c(@NonNull Context context, @NonNull Display display) {
        return a.a(context, display);
    }

    @NonNull
    @e.a({"ArrayReturn"})
    public static b[] d(@NonNull Context context, @NonNull Display display) {
        return a.b(context, display);
    }

    @androidx.annotation.p0
    private static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean f(@NonNull Display display) {
        return a.c(display);
    }

    private static boolean g(@NonNull Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    private static boolean h(@NonNull Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static Point i(@NonNull String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split("x", -1);
        if (strArrSplit.length == 2) {
            int i10 = 6 ^ 0;
            int i11 = Integer.parseInt(strArrSplit[0]);
            int i12 = Integer.parseInt(strArrSplit[1]);
            if (i11 > 0 && i12 > 0) {
                return new Point(i11, i12);
            }
        }
        throw new NumberFormatException();
    }

    @androidx.annotation.p0
    private static Point j(@NonNull String str, @NonNull Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String strE = e(str);
        if (!TextUtils.isEmpty(strE) && strE != null) {
            try {
                return i(strE);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Display.Mode f49023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Point f49024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f49025c;

        @androidx.annotation.w0(23)
        static class a {
            private a() {
            }

            static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        b(@NonNull Point point) {
            androidx.core.util.t.m(point, "physicalSize == null");
            this.f49024b = point;
            this.f49023a = null;
            int i10 = 5 ^ 1;
            this.f49025c = true;
        }

        public int a() {
            return this.f49024b.y;
        }

        public int b() {
            return this.f49024b.x;
        }

        @Deprecated
        public boolean c() {
            return this.f49025c;
        }

        @androidx.annotation.w0(23)
        @androidx.annotation.p0
        public Display.Mode d() {
            return this.f49023a;
        }

        @androidx.annotation.w0(23)
        b(@NonNull Display.Mode mode, boolean z10) {
            androidx.core.util.t.m(mode, "mode == null, can't wrap a null reference");
            this.f49024b = new Point(a.b(mode), a.a(mode));
            this.f49023a = mode;
            this.f49025c = z10;
        }

        @androidx.annotation.w0(23)
        b(@NonNull Display.Mode mode, @NonNull Point point) {
            androidx.core.util.t.m(mode, "mode == null, can't wrap a null reference");
            androidx.core.util.t.m(point, "physicalSize == null");
            this.f49024b = point;
            this.f49023a = mode;
            this.f49025c = true;
        }
    }
}
