package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17336g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f17337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f17338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17342f = -1;

    private final int a(int i10, int i11) {
        return i11 == -1 ? i10 : ((i11 * 3) + i10) / 4;
    }

    private final long b(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        long j12 = 4;
        return ((j11 / j12) * ((long) 3)) + (j10 / j12);
    }

    public final void c() {
        this.f17341e = 0L;
    }

    public final long d() {
        return this.f17340d;
    }

    public final long e() {
        return this.f17337a;
    }

    public final long f() {
        return this.f17341e;
    }

    public final int g() {
        return this.f17342f;
    }

    public final long h() {
        return this.f17339c;
    }

    public final long i() {
        return this.f17338b;
    }

    public final void j(long j10) {
        this.f17340d = b(j10, this.f17340d);
    }

    public final void k(long j10) {
        this.f17337a = b(j10, this.f17337a);
    }

    public final void l(long j10) {
        this.f17341e = b(j10, this.f17341e);
    }

    public final void m(int i10) {
        this.f17342f = a(i10, this.f17342f);
    }

    public final void n(long j10) {
        this.f17339c = b(j10, this.f17339c);
    }

    public final void o(long j10) {
        this.f17338b = b(j10, this.f17338b);
    }

    public final void p(long j10) {
        this.f17340d = j10;
    }

    public final void q(long j10) {
        this.f17337a = j10;
    }

    public final void r(long j10) {
        this.f17341e = j10;
    }

    public final void s(int i10) {
        this.f17342f = i10;
    }

    public final void t(long j10) {
        this.f17339c = j10;
    }

    public final void u(long j10) {
        this.f17338b = j10;
    }
}
