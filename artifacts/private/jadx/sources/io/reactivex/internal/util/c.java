package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends AtomicReference<Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f303477a = 3949248817947090603L;

    public boolean a(Throwable th2) {
        return k.a(this, th2);
    }

    public boolean b() {
        return get() == k.f303486a;
    }

    public Throwable c() {
        return k.c(this);
    }
}
