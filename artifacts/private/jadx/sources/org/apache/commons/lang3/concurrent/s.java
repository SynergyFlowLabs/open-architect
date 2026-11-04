package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public class s extends a<Long> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f337126f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f337127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f337128e = new AtomicLong(0);

    public s(long j10) {
        this.f337127d = j10;
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public boolean a() throws h {
        return isOpen();
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public void close() {
        super.close();
        this.f337128e.set(0L);
    }

    public long g() {
        return this.f337127d;
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(Long l10) throws h {
        if (this.f337127d == 0) {
            open();
        }
        if (this.f337128e.addAndGet(l10.longValue()) > this.f337127d) {
            open();
        }
        return a();
    }
}
