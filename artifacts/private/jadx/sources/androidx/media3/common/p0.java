package androidx.media3.common;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61019a = "AndroidXMedia3";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f61020b = "1.6.0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f61021c = "AndroidXMedia3/1.6.0";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f61022d = 1006000300;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f61023e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f61024f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashSet<String> f61025g = new HashSet<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f61026h = "media3.common";

    private p0() {
    }

    public static synchronized void a(String str) {
        try {
            if (f61025g.add(str)) {
                f61026h += ", " + str;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized String b() {
        return f61026h;
    }
}
