package io.reactivex.internal.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends CountDownLatch implements dj.g<Throwable>, dj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f303478a;

    public f() {
        super(1);
    }

    @Override // dj.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        this.f303478a = th2;
        countDown();
    }

    @Override // dj.a
    public void run() {
        countDown();
    }
}
