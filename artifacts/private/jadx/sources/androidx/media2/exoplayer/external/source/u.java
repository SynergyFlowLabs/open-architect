package androidx.media2.exoplayer.external.source;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class u implements x, x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f56444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z.a f56445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.b f56446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private x f56447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private x.a f56448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f56449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private a f56450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f56451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f56452i = -9223372036854775807L;

    public interface a {
        void a(z.a mediaPeriodId, IOException exception);
    }

    public u(z mediaSource, z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long preparePositionUs) {
        this.f56445b = id2;
        this.f56446c = allocator;
        this.f56444a = mediaSource;
        this.f56449f = preparePositionUs;
    }

    private long t(long preparePositionUs) {
        long j10 = this.f56452i;
        return j10 != -9223372036854775807L ? j10 : preparePositionUs;
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long b() {
        return ((x) androidx.media2.exoplayer.external.util.q0.i(this.f56447d)).b();
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public void c(long positionUs) {
        ((x) androidx.media2.exoplayer.external.util.q0.i(this.f56447d)).c(positionUs);
    }

    public void d(z.a id2) {
        long jT = t(this.f56449f);
        x xVarE = this.f56444a.e(id2, this.f56446c, jT);
        this.f56447d = xVarE;
        if (this.f56448e != null) {
            xVarE.r(this, jT);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long e() {
        return ((x) androidx.media2.exoplayer.external.util.q0.i(this.f56447d)).e();
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public List f(List list) {
        return w.a(this, list);
    }

    @Override // androidx.media2.exoplayer.external.source.x.a
    public void g(x mediaPeriod) {
        ((x.a) androidx.media2.exoplayer.external.util.q0.i(this.f56448e)).g(this);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long h(long positionUs) {
        return ((x) androidx.media2.exoplayer.external.util.q0.i(this.f56447d)).h(positionUs);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long i() {
        return ((x) androidx.media2.exoplayer.external.util.q0.i(this.f56447d)).i();
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public boolean k(long positionUs) {
        x xVar = this.f56447d;
        if (xVar == null || !xVar.k(positionUs)) {
            return false;
        }
        boolean z10 = false & true;
        return true;
    }

    public long l() {
        return this.f56449f;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public TrackGroupArray m() {
        return ((x) androidx.media2.exoplayer.external.util.q0.i(this.f56447d)).m();
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long n(long positionUs, androidx.media2.exoplayer.external.x0 seekParameters) {
        return ((x) androidx.media2.exoplayer.external.util.q0.i(this.f56447d)).n(positionUs, seekParameters);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void o() throws IOException {
        try {
            x xVar = this.f56447d;
            if (xVar != null) {
                xVar.o();
            } else {
                this.f56444a.a();
            }
        } catch (IOException e10) {
            a aVar = this.f56450g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f56451h) {
                return;
            }
            this.f56451h = true;
            aVar.a(this.f56445b, e10);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void p(long positionUs, boolean toKeyframe) {
        ((x) androidx.media2.exoplayer.external.util.q0.i(this.f56447d)).p(positionUs, toKeyframe);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void r(x.a callback, long preparePositionUs) {
        this.f56448e = callback;
        x xVar = this.f56447d;
        if (xVar != null) {
            xVar.r(this, t(this.f56449f));
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long s(androidx.media2.exoplayer.external.trackselection.m[] selections, boolean[] mayRetainStreamFlags, v0[] streams, boolean[] streamResetFlags, long positionUs) {
        long j10 = this.f56452i;
        if (j10 != -9223372036854775807L && positionUs == this.f56449f) {
            this.f56452i = -9223372036854775807L;
            positionUs = j10;
        }
        return ((x) androidx.media2.exoplayer.external.util.q0.i(this.f56447d)).s(selections, mayRetainStreamFlags, streams, streamResetFlags, positionUs);
    }

    @Override // androidx.media2.exoplayer.external.source.w0.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void j(x source) {
        ((x.a) androidx.media2.exoplayer.external.util.q0.i(this.f56448e)).j(this);
    }

    public void v(long preparePositionUs) {
        this.f56452i = preparePositionUs;
    }

    public void w() {
        x xVar = this.f56447d;
        if (xVar != null) {
            this.f56444a.c(xVar);
        }
    }

    public void x(a listener) {
        this.f56450g = listener;
    }
}
