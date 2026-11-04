package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.v0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final int A = 64;
    public static final int B = 128;
    public static final int C = 256;
    public static final int D = 512;
    public static final int E = 1024;
    public static final int F = 2048;
    public static final int G = 4096;
    public static final int H = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f48462a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f48463b = 256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f48464c = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f48465d = 1024;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f48466e = 2048;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f48467f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f48468g = 8192;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48469h = 16384;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f48470i = 32768;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f48471j = 65536;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f48472k = 131072;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f48473l = 262144;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f48474m = 524288;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f48475n = 1048576;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f48476o = 2097152;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f48477p = 4194304;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f48478q = 8388608;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f48479r = 16777216;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f48480s = 67108864;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f48481t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f48482u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f48483v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f48484w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f48485x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f48486y = 16;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f48487z = 32;

    @w0(34)
    static class a {
        private a() {
        }

        static boolean a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        static void b(AccessibilityEvent accessibilityEvent, boolean z10) {
            accessibilityEvent.setAccessibilityDataSensitive(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.b$b, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0410b {
    }

    private b() {
    }

    @v0(expression = "event.appendRecord(record)")
    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, l lVar) {
        accessibilityEvent.appendRecord((AccessibilityRecord) lVar.g());
    }

    @Deprecated
    public static l b(AccessibilityEvent accessibilityEvent) {
        return new l(accessibilityEvent);
    }

    @v0(expression = "event.getAction()")
    @Deprecated
    public static int c(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    @v0(expression = "event.getContentChangeTypes()")
    @e.a({"WrongConstant"})
    @Deprecated
    public static int d(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @v0(expression = "event.getMovementGranularity()")
    @Deprecated
    public static int e(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static l f(AccessibilityEvent accessibilityEvent, int i10) {
        return new l(accessibilityEvent.getRecord(i10));
    }

    @v0(expression = "event.getRecordCount()")
    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static boolean h(@NonNull AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(accessibilityEvent);
        }
        return false;
    }

    public static void i(@NonNull AccessibilityEvent accessibilityEvent, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.b(accessibilityEvent, z10);
        }
    }

    @v0(expression = "event.setAction(action)")
    @Deprecated
    public static void j(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setAction(i10);
    }

    @v0(expression = "event.setContentChangeTypes(changeTypes)")
    @Deprecated
    public static void k(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }

    @v0(expression = "event.setMovementGranularity(granularity)")
    @Deprecated
    public static void l(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setMovementGranularity(i10);
    }
}
