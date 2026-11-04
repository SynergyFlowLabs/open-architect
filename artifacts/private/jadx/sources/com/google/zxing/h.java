package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f130491c;

    static {
        h hVar = new h();
        f130491c = hVar;
        hVar.setStackTrace(q.f130874b);
    }

    private h() {
    }

    public static h a() {
        return q.f130873a ? new h() : f130491c;
    }

    public static h b(Throwable th2) {
        return q.f130873a ? new h(th2) : f130491c;
    }

    private h(Throwable th2) {
        super(th2);
    }
}
