package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f303263d = -7789753024099756196L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f303264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f303265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f303266c;

    static final class a extends Thread implements j {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public k(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f303264a + org.apache.commons.codec.language.l.f335457d + incrementAndGet();
        Thread aVar = this.f303266c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f303265b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f303264a + "]";
    }

    public k(String str, int i10) {
        this(str, i10, false);
    }

    public k(String str, int i10, boolean z10) {
        this.f303264a = str;
        this.f303265b = i10;
        this.f303266c = z10;
    }
}
