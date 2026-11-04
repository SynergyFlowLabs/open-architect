package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f130373c;

    static {
        d dVar = new d();
        f130373c = dVar;
        dVar.setStackTrace(q.f130874b);
    }

    private d() {
    }

    public static d a() {
        return q.f130873a ? new d() : f130373c;
    }

    public static d b(Throwable th2) {
        return q.f130873a ? new d(th2) : f130373c;
    }

    private d(Throwable th2) {
        super(th2);
    }
}
