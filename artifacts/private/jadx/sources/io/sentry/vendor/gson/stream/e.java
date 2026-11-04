package io.sentry.vendor.gson.stream;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class e extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f307096a = 1;

    public e(String str) {
        super(str);
    }

    public e(String str, Throwable th2) {
        super(str);
        initCause(th2);
    }

    public e(Throwable th2) {
        initCause(th2);
    }
}
