package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class i1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.common.annotations.e
    public static final int f289253h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.google.common.annotations.e
    public static final long f289254i = TimeUnit.HOURS.toNanos(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f289255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f289256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f289257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f289258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f289259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f289260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f289261g;

    @com.google.common.annotations.e
    static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f289262a = new a();

        a() {
        }

        @Override // io.grpc.internal.i1.b
        public long a() {
            return System.nanoTime();
        }
    }

    @com.google.common.annotations.e
    interface b {
        long a();
    }

    public i1(boolean z10, long j10, TimeUnit timeUnit) {
        this(z10, j10, timeUnit, a.f289262a);
    }

    private static long a(long j10, long j11) {
        return j10 - j11;
    }

    public void b() {
        this.f289260f = true;
    }

    public void c() {
        this.f289260f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (a(r11.f289259e + r11.f289256b, r0) <= 0) goto L11;
     */
    @fj.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            r11 = this;
            r10 = 6
            io.grpc.internal.i1$b r0 = r11.f289257c
            long r0 = r0.a()
            boolean r2 = r11.f289260f
            r3 = 0
            r5 = 0
            r5 = 1
            if (r2 != 0) goto L26
            r10 = 1
            boolean r2 = r11.f289255a
            if (r2 != 0) goto L26
            r10 = 0
            long r6 = r11.f289259e
            r10 = 7
            long r8 = io.grpc.internal.i1.f289254i
            long r6 = r6 + r8
            long r6 = a(r6, r0)
            r10 = 5
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 > 0) goto L38
            r10 = 2
            goto L35
        L26:
            long r6 = r11.f289259e
            r10 = 5
            long r8 = r11.f289256b
            r10 = 2
            long r6 = r6 + r8
            long r6 = a(r6, r0)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 > 0) goto L38
        L35:
            r11.f289259e = r0
            return r5
        L38:
            r10 = 4
            int r0 = r11.f289261g
            int r0 = r0 + r5
            r11.f289261g = r0
            r11 = 2
            if (r0 > r11) goto L42
            return r5
        L42:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.i1.d():boolean");
    }

    public void e() {
        this.f289259e = this.f289258d;
        this.f289261g = 0;
    }

    @com.google.common.annotations.e
    i1(boolean z10, long j10, TimeUnit timeUnit, b bVar) {
        com.google.common.base.j0.p(j10 >= 0, "minTime must be non-negative: %s", j10);
        this.f289255a = z10;
        this.f289256b = Math.min(timeUnit.toNanos(j10), f289254i);
        this.f289257c = bVar;
        long jA = bVar.a();
        this.f289258d = jA;
        this.f289259e = jA;
    }
}
