package io.sentry.transport;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f306888a = new n();

    private n() {
    }

    public static p b() {
        return f306888a;
    }

    @Override // io.sentry.transport.p
    public final long a() {
        return System.currentTimeMillis();
    }
}
