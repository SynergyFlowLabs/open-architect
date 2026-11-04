package androidx.core.view;

import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48669a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48670b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48671c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48672d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48673e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48674f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f48675g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48676h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f48677i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f48678j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f48679k = 12;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f48680l = 13;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f48681m = 16;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f48682n = 17;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f48683o = 21;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f48684p = 22;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f48685q = 23;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f48686r = 24;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f48687s = 25;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f48688t = 26;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f48689u = 27;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.l1
    static final int f48690v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.l1
    static final int f48691w = 27;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f48692x = 1;

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public @interface b {
    }

    private e0() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0039  */
    /* JADX WARN: Code duplicated, block: B:27:0x003c  */
    static int a(int i10) {
        if (i10 == -1) {
            return -1;
        }
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 6;
        if (i11 < 34) {
            switch (i10) {
                case 21:
                case 23:
                case 26:
                    i10 = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i10 = 4;
                    break;
                case 25:
                    i10 = 0;
                    break;
            }
        }
        if (i11 >= 30) {
            i12 = i10;
        } else if (i10 == 12) {
            i12 = 1;
        } else if (i10 != 13) {
            if (i10 == 16) {
                i12 = 1;
            } else if (i10 != 17) {
                i12 = i10;
            } else {
                i12 = 0;
            }
        }
        return i12;
    }
}
