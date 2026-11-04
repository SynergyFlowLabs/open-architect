package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
final class i implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f289248a = new AtomicLong();

    i() {
    }

    @Override // io.grpc.internal.l1
    public void add(long j10) {
        this.f289248a.getAndAdd(j10);
    }

    @Override // io.grpc.internal.l1
    public long value() {
        return this.f289248a.get();
    }
}
