package androidx.media3.exoplayer;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class l implements r3 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f63958t = 0.97f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f63959u = 1.03f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f63960v = 1000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f63961w = 0.1f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f63962x = 500;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final float f63963y = 0.999f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f63964z = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f63965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f63966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f63967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f63968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f63969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f63970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f63971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f63972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f63973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f63974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f63975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f63976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f63977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f63978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f63979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f63980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f63981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f63982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f63983s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f63984a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f63985b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f63986c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f63987d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f63988e = androidx.media3.common.util.k1.D1(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f63989f = androidx.media3.common.util.k1.D1(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f63990g = 0.999f;

        public l a() {
            int i10 = 5 | 0;
            return new l(this.f63984a, this.f63985b, this.f63986c, this.f63987d, this.f63988e, this.f63989f, this.f63990g);
        }

        @z7.a
        public b b(float f10) {
            androidx.media3.common.util.a.a(f10 >= 1.0f);
            this.f63985b = f10;
            return this;
        }

        @z7.a
        public b c(float f10) {
            androidx.media3.common.util.a.a(0.0f < f10 && f10 <= 1.0f);
            this.f63984a = f10;
            return this;
        }

        @z7.a
        public b d(long j10) {
            androidx.media3.common.util.a.a(j10 > 0);
            this.f63988e = androidx.media3.common.util.k1.D1(j10);
            return this;
        }

        @z7.a
        public b e(float f10) {
            androidx.media3.common.util.a.a(f10 >= 0.0f && f10 < 1.0f);
            this.f63990g = f10;
            return this;
        }

        @z7.a
        public b f(long j10) {
            androidx.media3.common.util.a.a(j10 > 0);
            this.f63986c = j10;
            return this;
        }

        @z7.a
        public b g(float f10) {
            androidx.media3.common.util.a.a(f10 > 0.0f);
            this.f63987d = f10 / 1000000.0f;
            return this;
        }

        @z7.a
        public b h(long j10) {
            androidx.media3.common.util.a.a(j10 >= 0);
            this.f63989f = androidx.media3.common.util.k1.D1(j10);
            return this;
        }
    }

    private void f(long j10) {
        long j11 = this.f63982r + (this.f63983s * 3);
        if (this.f63977m > j11) {
            float fD1 = androidx.media3.common.util.k1.D1(this.f63967c);
            this.f63977m = com.google.common.primitives.n.t(j11, this.f63974j, this.f63977m - (((long) ((this.f63980p - 1.0f) * fD1)) + ((long) ((this.f63978n - 1.0f) * fD1))));
            return;
        }
        long jX = androidx.media3.common.util.k1.x(j10 - ((long) (Math.max(0.0f, this.f63980p - 1.0f) / this.f63968d)), this.f63977m, j11);
        this.f63977m = jX;
        long j12 = this.f63976l;
        if (j12 == -9223372036854775807L || jX <= j12) {
            return;
        }
        this.f63977m = j12;
    }

    private void g() {
        long j10;
        long j11 = this.f63972h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f63973i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f63975k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f63976l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f63974j == j10) {
            return;
        }
        this.f63974j = j10;
        this.f63977m = j10;
        this.f63982r = -9223372036854775807L;
        this.f63983s = -9223372036854775807L;
        this.f63981q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f63982r;
        if (j13 == -9223372036854775807L) {
            this.f63982r = j12;
            this.f63983s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f63971g));
            this.f63982r = jMax;
            this.f63983s = h(this.f63983s, Math.abs(j12 - jMax), this.f63971g);
        }
    }

    @Override // androidx.media3.exoplayer.r3
    public void a(androidx.media3.common.k0.g gVar) {
        this.f63972h = androidx.media3.common.util.k1.D1(gVar.f60902a);
        this.f63975k = androidx.media3.common.util.k1.D1(gVar.f60903b);
        this.f63976l = androidx.media3.common.util.k1.D1(gVar.f60904c);
        float f10 = gVar.f60905d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f63965a;
        }
        this.f63979o = f10;
        float f11 = gVar.f60906e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f63966b;
        }
        this.f63978n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f63972h = -9223372036854775807L;
        }
        g();
    }

    @Override // androidx.media3.exoplayer.r3
    public float b(long j10, long j11) {
        if (this.f63972h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f63981q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f63981q < this.f63967c) {
            return this.f63980p;
        }
        this.f63981q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f63977m;
        if (Math.abs(j12) < this.f63969e) {
            this.f63980p = 1.0f;
        } else {
            this.f63980p = androidx.media3.common.util.k1.v((this.f63968d * j12) + 1.0f, this.f63979o, this.f63978n);
        }
        return this.f63980p;
    }

    @Override // androidx.media3.exoplayer.r3
    public long c() {
        return this.f63977m;
    }

    @Override // androidx.media3.exoplayer.r3
    public void d() {
        long j10 = this.f63977m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f63970f;
        this.f63977m = j11;
        long j12 = this.f63976l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f63977m = j12;
        }
        this.f63981q = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.r3
    public void e(long j10) {
        this.f63973i = j10;
        g();
    }

    private l(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f63965a = f10;
        this.f63966b = f11;
        this.f63967c = j10;
        this.f63968d = f12;
        this.f63969e = j11;
        this.f63970f = j12;
        this.f63971g = f13;
        this.f63972h = -9223372036854775807L;
        this.f63973i = -9223372036854775807L;
        this.f63975k = -9223372036854775807L;
        this.f63976l = -9223372036854775807L;
        this.f63979o = f10;
        this.f63978n = f11;
        this.f63980p = 1.0f;
        this.f63981q = -9223372036854775807L;
        this.f63974j = -9223372036854775807L;
        this.f63977m = -9223372036854775807L;
        this.f63982r = -9223372036854775807L;
        this.f63983s = -9223372036854775807L;
    }
}
