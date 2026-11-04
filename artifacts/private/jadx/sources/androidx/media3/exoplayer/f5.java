package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class f5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f5 f63787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f5 f63788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f5 f63789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f5 f63790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f5 f63791g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63793b;

    static {
        f5 f5Var = new f5(0L, 0L);
        f63787c = f5Var;
        f63788d = new f5(Long.MAX_VALUE, Long.MAX_VALUE);
        f63789e = new f5(Long.MAX_VALUE, 0L);
        f63790f = new f5(0L, Long.MAX_VALUE);
        f63791g = f5Var;
    }

    public f5(long j10, long j11) {
        androidx.media3.common.util.a.a(j10 >= 0);
        androidx.media3.common.util.a.a(j11 >= 0);
        this.f63792a = j10;
        this.f63793b = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (java.lang.Math.abs(r11 - r9) <= java.lang.Math.abs(r13 - r9)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(long r9, long r11, long r13) {
        /*
            r8 = this;
            java.lang.String r7 = "Androeed.ru"
            long r2 = r8.f63792a
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L14
            r7 = 4
            long r4 = r8.f63793b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r7 = 5
            if (r0 != 0) goto L14
            r7 = 2
            return r9
        L14:
            r7 = 1
            r4 = -9223372036854775808
            r0 = r9
            r7 = 7
            long r9 = androidx.media3.common.util.k1.p2(r0, r2, r4)
            long r2 = r8.f63793b
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = androidx.media3.common.util.k1.f(r0, r2, r4)
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r7 = 4
            r4 = 0
            r5 = 1
            if (r8 > 0) goto L3d
            r7 = 3
            int r8 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            r7 = 3
            if (r8 > 0) goto L3d
            r8 = r5
            r7 = 1
            goto L3e
        L3d:
            r8 = r4
        L3e:
            int r6 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r7 = 2
            if (r6 > 0) goto L4a
            r7 = 7
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            r7 = 2
            if (r2 > 0) goto L4a
            r4 = r5
        L4a:
            r7 = 0
            if (r8 == 0) goto L62
            r7 = 3
            if (r4 == 0) goto L62
            long r8 = r11 - r0
            long r8 = java.lang.Math.abs(r8)
            long r0 = r13 - r0
            long r0 = java.lang.Math.abs(r0)
            r7 = 2
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 > 0) goto L68
            goto L64
        L62:
            if (r8 == 0) goto L66
        L64:
            r7 = 6
            return r11
        L66:
            if (r4 == 0) goto L6a
        L68:
            r7 = 5
            return r13
        L6a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.f5.a(long, long, long):long");
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f5.class == obj.getClass()) {
            f5 f5Var = (f5) obj;
            if (this.f63792a == f5Var.f63792a && this.f63793b == f5Var.f63793b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f63792a) * 31) + ((int) this.f63793b);
    }
}
