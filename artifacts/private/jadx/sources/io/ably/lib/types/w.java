package io.ably.lib.types;

/* JADX INFO: loaded from: classes13.dex */
public class w extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f288196c = 1;

    private w(Throwable th2, r rVar) {
        super(th2, rVar);
    }

    public static w d(String str) {
        return new w(new Exception(str), new r(str, 40013));
    }

    public static w e(Throwable th2, r rVar) {
        return new w(th2, rVar);
    }
}
