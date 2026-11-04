package io.ably.lib.util;

/* JADX INFO: loaded from: classes13.dex */
public class f implements io.ably.lib.http.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f288227a = new f();

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
