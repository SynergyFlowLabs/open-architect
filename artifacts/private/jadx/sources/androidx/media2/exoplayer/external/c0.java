package androidx.media2.exoplayer.external;

import androidx.annotation.b1;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f53751a = "ExoPlayer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f53752b = "2.10.4";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53753c = "ExoPlayerLib/2.10.4";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53754d = 2010004;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f53755e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f53756f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f53757g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashSet<String> f53758h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f53759i = "goog.exo.core";

    private c0() {
    }

    public static synchronized void a(String name) {
        try {
            if (f53758h.add(name)) {
                String str = f53759i;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(name).length());
                sb2.append(str);
                sb2.append(", ");
                sb2.append(name);
                f53759i = sb2.toString();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized String b() {
        return f53759i;
    }
}
