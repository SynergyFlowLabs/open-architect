package androidx.media2.exoplayer.external.source;

import androidx.media2.exoplayer.external.Format;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class e implements x, x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f55852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private x.a f55853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a[] f55854c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f55855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f55856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f55857f;

    private final class a implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0 f55858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f55859b;

        public a(v0 childStream) {
            this.f55858a = childStream;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public void a() throws IOException {
            this.f55858a.a();
        }

        public void b() {
            this.f55859b = false;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public boolean isReady() {
            return !e.this.l() && this.f55858a.isReady();
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int l(long positionUs) {
            if (e.this.l()) {
                return -3;
            }
            return this.f55858a.l(positionUs);
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int q(androidx.media2.exoplayer.external.d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean requireFormat) {
            if (e.this.l()) {
                return -3;
            }
            if (this.f55859b) {
                buffer.w(4);
                return -4;
            }
            int iQ = this.f55858a.q(formatHolder, buffer, requireFormat);
            if (iQ == -5) {
                Format format = (Format) androidx.media2.exoplayer.external.util.a.g(formatHolder.f53762c);
                int i10 = format.H1;
                if (i10 != 0 || format.f53114p2 != 0) {
                    e eVar = e.this;
                    int i11 = 0;
                    if (eVar.f55856e != 0) {
                        i10 = 0;
                    }
                    if (eVar.f55857f == Long.MIN_VALUE) {
                        i11 = format.f53114p2;
                    }
                    formatHolder.f53762c = format.h(i10, i11);
                }
                return -5;
            }
            e eVar2 = e.this;
            long j10 = eVar2.f55857f;
            if (j10 == Long.MIN_VALUE || ((iQ != -4 || buffer.f53790d < j10) && !(iQ == -3 && eVar2.b() == Long.MIN_VALUE))) {
                return iQ;
            }
            buffer.o();
            buffer.w(4);
            int i12 = 3 | 1;
            this.f55859b = true;
            return -4;
        }
    }

    public e(x mediaPeriod, boolean enableInitialDiscontinuity, long startUs, long endUs) {
        this.f55852a = mediaPeriod;
        this.f55855d = enableInitialDiscontinuity ? startUs : -9223372036854775807L;
        this.f55856e = startUs;
        this.f55857f = endUs;
    }

    private androidx.media2.exoplayer.external.x0 d(long positionUs, androidx.media2.exoplayer.external.x0 seekParameters) {
        long jS = androidx.media2.exoplayer.external.util.q0.s(seekParameters.f57927a, 0L, positionUs - this.f55856e);
        long j10 = seekParameters.f57928b;
        long j11 = this.f55857f;
        long jS2 = androidx.media2.exoplayer.external.util.q0.s(j10, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - positionUs);
        return (jS == seekParameters.f57927a && jS2 == seekParameters.f57928b) ? seekParameters : new androidx.media2.exoplayer.external.x0(jS, jS2);
    }

    private static boolean u(long startUs, androidx.media2.exoplayer.external.trackselection.m[] selections) {
        if (startUs != 0) {
            for (androidx.media2.exoplayer.external.trackselection.m mVar : selections) {
                if (mVar != null && !androidx.media2.exoplayer.external.util.s.l(mVar.k().f53103i)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long b() {
        long jB = this.f55852a.b();
        if (jB != Long.MIN_VALUE) {
            long j10 = this.f55857f;
            if (j10 == Long.MIN_VALUE || jB < j10) {
                return jB;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public void c(long positionUs) {
        this.f55852a.c(positionUs);
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long e() {
        long jE = this.f55852a.e();
        if (jE != Long.MIN_VALUE) {
            long j10 = this.f55857f;
            if (j10 == Long.MIN_VALUE || jE < j10) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public List f(List list) {
        return w.a(this, list);
    }

    @Override // androidx.media2.exoplayer.external.source.x.a
    public void g(x mediaPeriod) {
        ((x.a) androidx.media2.exoplayer.external.util.a.g(this.f55853b)).g(this);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    @Override // androidx.media2.exoplayer.external.source.x
    public long h(long positionUs) {
        this.f55855d = -9223372036854775807L;
        boolean z10 = false;
        for (a aVar : this.f55854c) {
            if (aVar != null) {
                aVar.b();
            }
        }
        long jH = this.f55852a.h(positionUs);
        if (jH == positionUs) {
            z10 = true;
        } else if (jH >= this.f55856e) {
            long j10 = this.f55857f;
            if (j10 == Long.MIN_VALUE || jH <= j10) {
                z10 = true;
            }
        }
        androidx.media2.exoplayer.external.util.a.i(z10);
        return jH;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long i() {
        if (l()) {
            long j10 = this.f55855d;
            this.f55855d = -9223372036854775807L;
            long jI = i();
            return jI != -9223372036854775807L ? jI : j10;
        }
        long jI2 = this.f55852a.i();
        if (jI2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        androidx.media2.exoplayer.external.util.a.i(jI2 >= this.f55856e);
        long j11 = this.f55857f;
        androidx.media2.exoplayer.external.util.a.i(j11 == Long.MIN_VALUE || jI2 <= j11);
        return jI2;
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public boolean k(long positionUs) {
        return this.f55852a.k(positionUs);
    }

    boolean l() {
        return this.f55855d != -9223372036854775807L;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public TrackGroupArray m() {
        return this.f55852a.m();
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long n(long positionUs, androidx.media2.exoplayer.external.x0 seekParameters) {
        long j10 = this.f55856e;
        if (positionUs == j10) {
            return j10;
        }
        return this.f55852a.n(positionUs, d(positionUs, seekParameters));
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void o() throws IOException {
        this.f55852a.o();
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void p(long positionUs, boolean toKeyframe) {
        this.f55852a.p(positionUs, toKeyframe);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void r(x.a callback, long positionUs) {
        this.f55853b = callback;
        this.f55852a.r(this, positionUs);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    @Override // androidx.media2.exoplayer.external.source.x
    public long s(androidx.media2.exoplayer.external.trackselection.m[] selections, boolean[] mayRetainStreamFlags, v0[] streams, boolean[] streamResetFlags, long positionUs) {
        long j10;
        boolean z10;
        this.f55854c = new a[streams.length];
        v0[] v0VarArr = new v0[streams.length];
        int i10 = 0;
        while (true) {
            v0 v0Var = null;
            if (i10 >= streams.length) {
                break;
            }
            a[] aVarArr = this.f55854c;
            a aVar = (a) streams[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                v0Var = aVar.f55858a;
            }
            v0VarArr[i10] = v0Var;
            i10++;
        }
        long jS = this.f55852a.s(selections, mayRetainStreamFlags, v0VarArr, streamResetFlags, positionUs);
        if (l()) {
            long j11 = this.f55856e;
            if (positionUs == j11 && u(j11, selections)) {
                j10 = jS;
            } else {
                j10 = -9223372036854775807L;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        this.f55855d = j10;
        if (jS != positionUs) {
            if (jS >= this.f55856e) {
                long j12 = this.f55857f;
                z10 = j12 == Long.MIN_VALUE || jS <= j12;
            }
        }
        androidx.media2.exoplayer.external.util.a.i(z10);
        for (int i11 = 0; i11 < streams.length; i11++) {
            v0 v0Var2 = v0VarArr[i11];
            if (v0Var2 == null) {
                this.f55854c[i11] = null;
            } else {
                a[] aVarArr2 = this.f55854c;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f55858a != v0Var2) {
                    aVarArr2[i11] = new a(v0Var2);
                }
            }
            streams[i11] = this.f55854c[i11];
        }
        return jS;
    }

    @Override // androidx.media2.exoplayer.external.source.w0.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void j(x source) {
        ((x.a) androidx.media2.exoplayer.external.util.a.g(this.f55853b)).j(this);
    }

    public void v(long startUs, long endUs) {
        this.f55856e = startUs;
        this.f55857f = endUs;
    }
}
