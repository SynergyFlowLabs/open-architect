package androidx.media3.common.util;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private static Executor f61475a;

    private c() {
    }

    public static synchronized Executor a() {
        try {
            if (f61475a == null) {
                f61475a = k1.E1("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f61475a;
    }

    public static synchronized void b(Executor executor) {
        try {
            f61475a = executor;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
