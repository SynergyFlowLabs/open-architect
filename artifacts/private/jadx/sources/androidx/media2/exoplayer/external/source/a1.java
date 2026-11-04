package androidx.media2.exoplayer.external.source;

import androidx.media2.exoplayer.external.Format;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
final class a1 implements x, androidx.media2.exoplayer.external.upstream.g0.b<c> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f55663s = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.o f55664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l.a f55665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media2.exoplayer.external.upstream.q0 f55666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.f0 f55667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0.a f55668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TrackGroupArray f55669f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f55671h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Format f55673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f55674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f55675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f55676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    byte[] f55677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f55678o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f55670g = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final androidx.media2.exoplayer.external.upstream.g0 f55672i = new androidx.media2.exoplayer.external.upstream.g0("Loader:SingleSampleMediaPeriod");

    private final class b implements v0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f55679d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f55680e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f55681f = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f55682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f55683b;

        private b() {
        }

        private void b() {
            if (this.f55683b) {
                return;
            }
            a1.this.f55668e.c(androidx.media2.exoplayer.external.util.s.g(a1.this.f55673j.f53103i), a1.this.f55673j, 0, null, 0L);
            this.f55683b = true;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public void a() throws IOException {
            a1 a1Var = a1.this;
            if (a1Var.f55674k) {
                return;
            }
            a1Var.f55672i.a();
        }

        public void c() {
            if (this.f55682a == 2) {
                this.f55682a = 1;
            }
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public boolean isReady() {
            return a1.this.f55676m;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int l(long positionUs) {
            b();
            if (positionUs <= 0 || this.f55682a == 2) {
                return 0;
            }
            this.f55682a = 2;
            int i10 = 5 << 1;
            return 1;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int q(androidx.media2.exoplayer.external.d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean requireFormat) {
            b();
            int i10 = this.f55682a;
            if (i10 == 2) {
                buffer.c(4);
                return -4;
            }
            if (requireFormat || i10 == 0) {
                formatHolder.f53762c = a1.this.f55673j;
                this.f55682a = 1;
                return -5;
            }
            a1 a1Var = a1.this;
            if (!a1Var.f55676m) {
                return -3;
            }
            if (a1Var.f55677n != null) {
                buffer.c(1);
                buffer.f53790d = 0L;
                if (buffer.H()) {
                    return -4;
                }
                buffer.z(a1.this.f55678o);
                ByteBuffer byteBuffer = buffer.f53789c;
                a1 a1Var2 = a1.this;
                byteBuffer.put(a1Var2.f55677n, 0, a1Var2.f55678o);
            } else {
                buffer.c(4);
            }
            this.f55682a = 2;
            return -4;
        }
    }

    static final class c implements androidx.media2.exoplayer.external.upstream.g0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media2.exoplayer.external.upstream.o f55685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.upstream.o0 f55686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private byte[] f55687c;

        public c(androidx.media2.exoplayer.external.upstream.o dataSpec, androidx.media2.exoplayer.external.upstream.l dataSource) {
            this.f55685a = dataSpec;
            this.f55686b = new androidx.media2.exoplayer.external.upstream.o0(dataSource);
        }

        @Override // androidx.media2.exoplayer.external.upstream.g0.e
        public void a() throws InterruptedException, IOException {
            this.f55686b.i();
            try {
                this.f55686b.b(this.f55685a);
                int i10 = 0;
                while (i10 != -1) {
                    int iD = (int) this.f55686b.d();
                    byte[] bArr = this.f55687c;
                    if (bArr == null) {
                        this.f55687c = new byte[1024];
                    } else if (iD == bArr.length) {
                        this.f55687c = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    androidx.media2.exoplayer.external.upstream.o0 o0Var = this.f55686b;
                    byte[] bArr2 = this.f55687c;
                    i10 = o0Var.read(bArr2, iD, bArr2.length - iD);
                }
                androidx.media2.exoplayer.external.util.q0.n(this.f55686b);
            } catch (Throwable th2) {
                androidx.media2.exoplayer.external.util.q0.n(this.f55686b);
                throw th2;
            }
        }

        @Override // androidx.media2.exoplayer.external.upstream.g0.e
        public void b() {
        }
    }

    public a1(androidx.media2.exoplayer.external.upstream.o dataSpec, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, @androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 transferListener, Format format, long durationUs, androidx.media2.exoplayer.external.upstream.f0 loadErrorHandlingPolicy, k0.a eventDispatcher, boolean treatLoadErrorsAsEndOfStream) {
        this.f55664a = dataSpec;
        this.f55665b = dataSourceFactory;
        this.f55666c = transferListener;
        this.f55673j = format;
        this.f55671h = durationUs;
        this.f55667d = loadErrorHandlingPolicy;
        this.f55668e = eventDispatcher;
        this.f55674k = treatLoadErrorsAsEndOfStream;
        this.f55669f = new TrackGroupArray(new TrackGroup(format));
        eventDispatcher.z();
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long b() {
        return this.f55676m ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public void c(long positionUs) {
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long e() {
        if (!this.f55676m && !this.f55672i.i()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public List f(List list) {
        return w.a(this, list);
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void u(c loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        this.f55668e.o(loadable.f55685a, loadable.f55686b.e(), loadable.f55686b.g(), 1, -1, null, 0, null, 0L, this.f55671h, elapsedRealtimeMs, loadDurationMs, loadable.f55686b.d());
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long h(long positionUs) {
        for (int i10 = 0; i10 < this.f55670g.size(); i10++) {
            this.f55670g.get(i10).c();
        }
        return positionUs;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long i() {
        if (this.f55675l) {
            return -9223372036854775807L;
        }
        this.f55668e.C();
        this.f55675l = true;
        return -9223372036854775807L;
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void t(c loadable, long elapsedRealtimeMs, long loadDurationMs) {
        this.f55678o = (int) loadable.f55686b.d();
        this.f55677n = (byte[]) androidx.media2.exoplayer.external.util.a.g(loadable.f55687c);
        this.f55676m = true;
        this.f55668e.r(loadable.f55685a, loadable.f55686b.e(), loadable.f55686b.g(), 1, -1, this.f55673j, 0, null, 0L, this.f55671h, elapsedRealtimeMs, loadDurationMs, this.f55678o);
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public boolean k(long positionUs) {
        if (this.f55676m || this.f55672i.i()) {
            return false;
        }
        androidx.media2.exoplayer.external.upstream.l lVarA = this.f55665b.a();
        androidx.media2.exoplayer.external.upstream.q0 q0Var = this.f55666c;
        if (q0Var != null) {
            lVarA.c(q0Var);
        }
        this.f55668e.x(this.f55664a, 1, -1, this.f55673j, 0, null, 0L, this.f55671h, this.f55672i.l(new c(this.f55664a, lVarA), this, this.f55667d.a(1)));
        return true;
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.media2.exoplayer.external.upstream.g0.c d(c loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        androidx.media2.exoplayer.external.upstream.g0.c cVarH;
        long jC = this.f55667d.c(1, loadDurationMs, error, errorCount);
        boolean z10 = jC == -9223372036854775807L || errorCount >= this.f55667d.a(1);
        if (this.f55674k && z10) {
            this.f55676m = true;
            cVarH = androidx.media2.exoplayer.external.upstream.g0.f57297j;
        } else {
            cVarH = jC != -9223372036854775807L ? androidx.media2.exoplayer.external.upstream.g0.h(false, jC) : androidx.media2.exoplayer.external.upstream.g0.f57298k;
        }
        this.f55668e.u(loadable.f55685a, loadable.f55686b.e(), loadable.f55686b.g(), 1, -1, this.f55673j, 0, null, 0L, this.f55671h, elapsedRealtimeMs, loadDurationMs, loadable.f55686b.d(), error, !cVarH.c());
        return cVarH;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public TrackGroupArray m() {
        return this.f55669f;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long n(long positionUs, androidx.media2.exoplayer.external.x0 seekParameters) {
        return positionUs;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void o() throws IOException {
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void p(long positionUs, boolean toKeyframe) {
    }

    public void q() {
        this.f55672i.j();
        this.f55668e.A();
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void r(x.a callback, long positionUs) {
        callback.g(this);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long s(androidx.media2.exoplayer.external.trackselection.m[] selections, boolean[] mayRetainStreamFlags, v0[] streams, boolean[] streamResetFlags, long positionUs) {
        for (int i10 = 0; i10 < selections.length; i10++) {
            v0 v0Var = streams[i10];
            if (v0Var != null && (selections[i10] == null || !mayRetainStreamFlags[i10])) {
                this.f55670g.remove(v0Var);
                streams[i10] = null;
            }
            if (streams[i10] == null && selections[i10] != null) {
                b bVar = new b();
                this.f55670g.add(bVar);
                streams[i10] = bVar;
                streamResetFlags[i10] = true;
            }
        }
        return positionUs;
    }
}
