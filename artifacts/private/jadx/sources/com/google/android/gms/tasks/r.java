package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class r<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f111017a = new CountDownLatch(1);

    private r() {
    }

    @Override // com.google.android.gms.tasks.e
    public final void a() {
        this.f111017a.countDown();
    }

    @Override // com.google.android.gms.tasks.g
    public final void b(T t10) {
        this.f111017a.countDown();
    }

    public final void c() throws InterruptedException {
        this.f111017a.await();
    }

    @Override // com.google.android.gms.tasks.f
    public final void d(@NonNull Exception exc) {
        this.f111017a.countDown();
    }

    public final boolean e(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f111017a.await(j10, timeUnit);
    }

    /* synthetic */ r(u uVar) {
    }
}
