package androidx.compose.runtime.internal;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f36161a;

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f36161a = id2;
    }

    public static final long a() {
        return f36161a;
    }
}
