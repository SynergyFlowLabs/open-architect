package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f103807a;

    public c(long j10) {
        this.f103807a = new AtomicLong(j10);
    }

    @Override // com.google.android.datatransport.runtime.time.a
    public long V() {
        return this.f103807a.get();
    }

    public void a(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("cannot advance time backwards.");
        }
        this.f103807a.addAndGet(j10);
    }

    public void b() {
        a(1L);
    }
}
