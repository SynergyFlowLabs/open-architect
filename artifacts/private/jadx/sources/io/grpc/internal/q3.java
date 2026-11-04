package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class q3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final b f289721m = new b(n3.f289633a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n3 f289722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f289723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f289724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f289725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f289726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f289727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f289728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f289729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f289730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f289731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l1 f289732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile long f289733l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n3 f289734a;

        @com.google.common.annotations.e
        public b(n3 n3Var) {
            this.f289734a = n3Var;
        }

        public q3 a() {
            return new q3(this.f289734a);
        }
    }

    public interface c {
        d read();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f289735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f289736b;

        public d(long j10, long j11) {
            this.f289736b = j10;
            this.f289735a = j11;
        }
    }

    public static b a() {
        return f289721m;
    }

    public io.grpc.v0.o b() {
        c cVar = this.f289729h;
        long j10 = cVar == null ? -1L : cVar.read().f289736b;
        c cVar2 = this.f289729h;
        return new io.grpc.v0.o(this.f289723b, this.f289724c, this.f289725d, this.f289726e, this.f289727f, this.f289730i, this.f289732k.value(), this.f289728g, this.f289731j, this.f289733l, j10, cVar2 != null ? cVar2.read().f289735a : -1L);
    }

    public void c() {
        this.f289728g++;
    }

    public void d() {
        this.f289723b++;
        this.f289724c = this.f289722a.a();
    }

    public void e() {
        this.f289732k.add(1L);
        this.f289733l = this.f289722a.a();
    }

    public void f(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f289730i += (long) i10;
        this.f289731j = this.f289722a.a();
    }

    public void g() {
        this.f289723b++;
        this.f289725d = this.f289722a.a();
    }

    public void h(boolean z10) {
        if (z10) {
            this.f289726e++;
        } else {
            this.f289727f++;
        }
    }

    public void i(c cVar) {
        this.f289729h = (c) com.google.common.base.j0.E(cVar);
    }

    public q3() {
        this.f289732k = m1.a();
        this.f289722a = n3.f289633a;
    }

    private q3(n3 n3Var) {
        this.f289732k = m1.a();
        this.f289722a = n3Var;
    }
}
