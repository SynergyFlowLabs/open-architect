package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.d0;
import androidx.media2.exoplayer.external.drm.r;
import androidx.media2.exoplayer.external.source.chunk.h;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.source.u0;
import androidx.media2.exoplayer.external.source.v0;
import androidx.media2.exoplayer.external.source.w0;
import androidx.media2.exoplayer.external.upstream.f0;
import androidx.media2.exoplayer.external.upstream.g0;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class g<T extends h> implements v0, w0, g0.b<d>, g0.f {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f55800p1 = "ChunkSampleStream";
    private long X;
    private int Y;
    long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final int[] f55802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final Format[] f55803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f55804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f55805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w0.a<g<T>> f55806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k0.a f55807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0 f55808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g0 f55809i = new g0("Loader:ChunkSampleStream");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f55810j = new f();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<androidx.media2.exoplayer.external.source.chunk.a> f55811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<androidx.media2.exoplayer.external.source.chunk.a> f55812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u0 f55813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.m f55814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final u0[] f55815o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f55816p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f55817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Format f55818t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private b<T> f55819v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f55820w;

    public final class a implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g<T> f55821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u0 f55822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f55823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f55824d;

        public a(g<T> parent, u0 sampleQueue, int index) {
            this.f55821a = parent;
            this.f55822b = sampleQueue;
            this.f55823c = index;
        }

        private void b() {
            if (this.f55824d) {
                return;
            }
            g.this.f55807g.c(g.this.f55802b[this.f55823c], g.this.f55803c[this.f55823c], 0, null, g.this.X);
            this.f55824d = true;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public void a() throws IOException {
        }

        public void c() {
            androidx.media2.exoplayer.external.util.a.i(g.this.f55804d[this.f55823c]);
            g.this.f55804d[this.f55823c] = false;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public boolean isReady() {
            g gVar = g.this;
            if (gVar.f55816p0) {
                return true;
            }
            return !gVar.F() && this.f55822b.u();
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int l(long positionUs) {
            if (g.this.F()) {
                return 0;
            }
            b();
            if (g.this.f55816p0 && positionUs > this.f55822b.q()) {
                return this.f55822b.g();
            }
            int iF = this.f55822b.f(positionUs, true, true);
            if (iF == -1) {
                return 0;
            }
            return iF;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int q(d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired) {
            if (g.this.F()) {
                return -3;
            }
            b();
            u0 u0Var = this.f55822b;
            g gVar = g.this;
            return u0Var.A(formatHolder, buffer, formatRequired, false, gVar.f55816p0, gVar.Z);
        }
    }

    public interface b<T extends h> {
        void a(g<T> chunkSampleStream);
    }

    public g(int primaryTrackType, @p0 int[] embeddedTrackTypes, @p0 Format[] embeddedTrackFormats, T chunkSource, w0.a<g<T>> callback, androidx.media2.exoplayer.external.upstream.b allocator, long positionUs, r<?> drmSessionManager, f0 loadErrorHandlingPolicy, k0.a eventDispatcher) {
        this.f55801a = primaryTrackType;
        this.f55802b = embeddedTrackTypes;
        this.f55803c = embeddedTrackFormats;
        this.f55805e = chunkSource;
        this.f55806f = callback;
        this.f55807g = eventDispatcher;
        this.f55808h = loadErrorHandlingPolicy;
        ArrayList<androidx.media2.exoplayer.external.source.chunk.a> arrayList = new ArrayList<>();
        this.f55811k = arrayList;
        this.f55812l = Collections.unmodifiableList(arrayList);
        int i10 = 0;
        int length = embeddedTrackTypes == null ? 0 : embeddedTrackTypes.length;
        this.f55815o = new u0[length];
        this.f55804d = new boolean[length];
        int i11 = length + 1;
        int[] iArr = new int[i11];
        u0[] u0VarArr = new u0[i11];
        u0 u0Var = new u0(allocator);
        this.f55813m = u0Var;
        this.f55814n = new androidx.media2.exoplayer.external.source.m(u0Var, drmSessionManager);
        iArr[0] = primaryTrackType;
        u0VarArr[0] = u0Var;
        while (i10 < length) {
            u0 u0Var2 = new u0(allocator);
            this.f55815o[i10] = u0Var2;
            int i12 = i10 + 1;
            u0VarArr[i12] = u0Var2;
            iArr[i12] = embeddedTrackTypes[i10];
            i10 = i12;
        }
        this.f55817s = new c(iArr, u0VarArr);
        this.f55820w = positionUs;
        this.X = positionUs;
    }

    private androidx.media2.exoplayer.external.source.chunk.a A(int chunkIndex) {
        androidx.media2.exoplayer.external.source.chunk.a aVar = this.f55811k.get(chunkIndex);
        ArrayList<androidx.media2.exoplayer.external.source.chunk.a> arrayList = this.f55811k;
        q0.G0(arrayList, chunkIndex, arrayList.size());
        this.Y = Math.max(this.Y, this.f55811k.size());
        int i10 = 0;
        this.f55813m.m(aVar.i(0));
        while (true) {
            u0[] u0VarArr = this.f55815o;
            if (i10 >= u0VarArr.length) {
                return aVar;
            }
            u0 u0Var = u0VarArr[i10];
            i10++;
            u0Var.m(aVar.i(i10));
        }
    }

    private androidx.media2.exoplayer.external.source.chunk.a C() {
        ArrayList<androidx.media2.exoplayer.external.source.chunk.a> arrayList = this.f55811k;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean D(int mediaChunkIndex) {
        int iR;
        androidx.media2.exoplayer.external.source.chunk.a aVar = this.f55811k.get(mediaChunkIndex);
        if (this.f55813m.r() > aVar.i(0)) {
            return true;
        }
        int i10 = 0;
        do {
            u0[] u0VarArr = this.f55815o;
            if (i10 >= u0VarArr.length) {
                return false;
            }
            iR = u0VarArr[i10].r();
            i10++;
        } while (iR <= aVar.i(i10));
        return true;
    }

    private boolean E(d chunk) {
        return chunk instanceof androidx.media2.exoplayer.external.source.chunk.a;
    }

    private void G() {
        int iL = L(this.f55813m.r(), this.Y - 1);
        while (true) {
            int i10 = this.Y;
            if (i10 > iL) {
                return;
            }
            this.Y = i10 + 1;
            H(i10);
        }
    }

    private void H(int mediaChunkReadIndex) {
        androidx.media2.exoplayer.external.source.chunk.a aVar = this.f55811k.get(mediaChunkReadIndex);
        Format format = aVar.f55776c;
        if (!format.equals(this.f55818t)) {
            this.f55807g.c(this.f55801a, format, aVar.f55777d, aVar.f55778e, aVar.f55779f);
        }
        this.f55818t = format;
    }

    private int L(int primarySampleIndex, int minChunkIndex) {
        do {
            minChunkIndex++;
            if (minChunkIndex >= this.f55811k.size()) {
                return this.f55811k.size() - 1;
            }
        } while (this.f55811k.get(minChunkIndex).i(0) <= primarySampleIndex);
        return minChunkIndex - 1;
    }

    private void z(int discardToSampleIndex) {
        int iMin = Math.min(L(discardToSampleIndex, 0), this.Y);
        if (iMin > 0) {
            q0.G0(this.f55811k, 0, iMin);
            this.Y -= iMin;
        }
    }

    public T B() {
        return this.f55805e;
    }

    boolean F() {
        return this.f55820w != -9223372036854775807L;
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void u(d loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        this.f55807g.o(loadable.f55774a, loadable.f(), loadable.e(), loadable.f55775b, this.f55801a, loadable.f55776c, loadable.f55777d, loadable.f55778e, loadable.f55779f, loadable.f55780g, elapsedRealtimeMs, loadDurationMs, loadable.c());
        if (released) {
            return;
        }
        this.f55813m.F();
        for (u0 u0Var : this.f55815o) {
            u0Var.F();
        }
        this.f55806f.j(this);
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(d loadable, long elapsedRealtimeMs, long loadDurationMs) {
        this.f55805e.e(loadable);
        this.f55807g.r(loadable.f55774a, loadable.f(), loadable.e(), loadable.f55775b, this.f55801a, loadable.f55776c, loadable.f55777d, loadable.f55778e, loadable.f55779f, loadable.f55780g, elapsedRealtimeMs, loadDurationMs, loadable.c());
        this.f55806f.j(this);
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public g0.c d(d loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        g0.c cVarH;
        long jC = loadable.c();
        boolean zE = E(loadable);
        int size = this.f55811k.size() - 1;
        boolean z10 = (jC != 0 && zE && D(size)) ? false : true;
        if (!this.f55805e.d(loadable, z10, error, z10 ? this.f55808h.b(loadable.f55775b, loadDurationMs, error, errorCount) : -9223372036854775807L)) {
            cVarH = null;
        } else if (z10) {
            cVarH = g0.f57297j;
            if (zE) {
                androidx.media2.exoplayer.external.util.a.i(A(size) == loadable);
                if (this.f55811k.isEmpty()) {
                    this.f55820w = this.X;
                }
            }
        } else {
            p.l(f55800p1, "Ignoring attempt to cancel non-cancelable load.");
            cVarH = null;
        }
        if (cVarH == null) {
            long jC2 = this.f55808h.c(loadable.f55775b, loadDurationMs, error, errorCount);
            cVarH = jC2 != -9223372036854775807L ? g0.h(false, jC2) : g0.f57298k;
        }
        g0.c cVar = cVarH;
        boolean zC = cVar.c();
        this.f55807g.u(loadable.f55774a, loadable.f(), loadable.e(), loadable.f55775b, this.f55801a, loadable.f55776c, loadable.f55777d, loadable.f55778e, loadable.f55779f, loadable.f55780g, elapsedRealtimeMs, loadDurationMs, jC, error, !zC);
        if (!zC) {
            this.f55806f.j(this);
        }
        return cVar;
    }

    public void M() {
        N(null);
    }

    public void N(@p0 b<T> callback) {
        this.f55819v = callback;
        this.f55813m.k();
        this.f55814n.e();
        for (u0 u0Var : this.f55815o) {
            u0Var.k();
        }
        this.f55809i.k(this);
    }

    public void O(long positionUs) {
        androidx.media2.exoplayer.external.source.chunk.a aVar;
        boolean zI;
        this.X = positionUs;
        if (F()) {
            this.f55820w = positionUs;
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < this.f55811k.size()) {
                aVar = this.f55811k.get(i10);
                long j10 = aVar.f55779f;
                if (j10 == positionUs && aVar.f55764j == -9223372036854775807L) {
                    break;
                } else if (j10 <= positionUs) {
                    i10++;
                }
            }
            aVar = null;
            break;
        }
        this.f55813m.H();
        if (aVar != null) {
            zI = this.f55813m.I(aVar.i(0));
            this.Z = 0L;
        } else {
            zI = this.f55813m.f(positionUs, true, (positionUs > e() ? 1 : (positionUs == e() ? 0 : -1)) < 0) != -1;
            this.Z = this.X;
        }
        if (zI) {
            this.Y = L(this.f55813m.r(), 0);
            for (u0 u0Var : this.f55815o) {
                u0Var.H();
                u0Var.f(positionUs, true, false);
            }
        } else {
            this.f55820w = positionUs;
            this.f55816p0 = false;
            this.f55811k.clear();
            this.Y = 0;
            if (this.f55809i.i()) {
                this.f55809i.g();
                return;
            }
            this.f55813m.F();
            for (u0 u0Var2 : this.f55815o) {
                u0Var2.F();
            }
        }
    }

    public g<T>.a P(long positionUs, int trackType) {
        for (int i10 = 0; i10 < this.f55815o.length; i10++) {
            if (this.f55802b[i10] == trackType) {
                androidx.media2.exoplayer.external.util.a.i(!this.f55804d[i10]);
                this.f55804d[i10] = true;
                this.f55815o[i10].H();
                this.f55815o[i10].f(positionUs, true, true);
                return new a(this, this.f55815o[i10], i10);
            }
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public void a() throws IOException {
        this.f55809i.a();
        this.f55814n.b();
        if (this.f55809i.i()) {
            return;
        }
        this.f55805e.a();
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public long b() {
        if (this.f55816p0) {
            return Long.MIN_VALUE;
        }
        if (F()) {
            return this.f55820w;
        }
        long jMax = this.X;
        androidx.media2.exoplayer.external.source.chunk.a aVarC = C();
        if (!aVarC.h()) {
            if (this.f55811k.size() > 1) {
                ArrayList<androidx.media2.exoplayer.external.source.chunk.a> arrayList = this.f55811k;
                aVarC = arrayList.get(arrayList.size() - 2);
            } else {
                aVarC = null;
            }
        }
        if (aVarC != null) {
            jMax = Math.max(jMax, aVarC.f55780g);
        }
        return Math.max(jMax, this.f55813m.q());
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public void c(long positionUs) {
        int size;
        int iB;
        if (!this.f55809i.i() && !F() && (size = this.f55811k.size()) > (iB = this.f55805e.b(positionUs, this.f55812l))) {
            while (true) {
                if (iB >= size) {
                    iB = size;
                    break;
                } else if (!D(iB)) {
                    break;
                } else {
                    iB++;
                }
            }
            if (iB == size) {
                return;
            }
            long j10 = C().f55780g;
            androidx.media2.exoplayer.external.source.chunk.a aVarA = A(iB);
            if (this.f55811k.isEmpty()) {
                this.f55820w = this.X;
            }
            this.f55816p0 = false;
            this.f55807g.E(this.f55801a, aVarA.f55779f, j10);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public long e() {
        if (F()) {
            return this.f55820w;
        }
        if (this.f55816p0) {
            return Long.MIN_VALUE;
        }
        return C().f55780g;
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public boolean isReady() {
        return !F() && this.f55814n.a(this.f55816p0);
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.f
    public void j() {
        this.f55813m.F();
        for (u0 u0Var : this.f55815o) {
            u0Var.F();
        }
        b<T> bVar = this.f55819v;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public boolean k(long positionUs) {
        List<androidx.media2.exoplayer.external.source.chunk.a> list;
        long j10;
        if (this.f55816p0 || this.f55809i.i()) {
            return false;
        }
        boolean zF = F();
        if (zF) {
            list = Collections.EMPTY_LIST;
            j10 = this.f55820w;
        } else {
            list = this.f55812l;
            j10 = C().f55780g;
        }
        this.f55805e.c(positionUs, j10, list, this.f55810j);
        f fVar = this.f55810j;
        boolean z10 = fVar.f55799b;
        d dVar = fVar.f55798a;
        fVar.a();
        if (z10) {
            this.f55820w = -9223372036854775807L;
            this.f55816p0 = true;
            return true;
        }
        if (dVar == null) {
            return false;
        }
        if (E(dVar)) {
            androidx.media2.exoplayer.external.source.chunk.a aVar = (androidx.media2.exoplayer.external.source.chunk.a) dVar;
            if (zF) {
                long j11 = aVar.f55779f;
                long j12 = this.f55820w;
                if (j11 == j12) {
                    j12 = 0;
                }
                this.Z = j12;
                this.f55820w = -9223372036854775807L;
            }
            aVar.k(this.f55817s);
            this.f55811k.add(aVar);
        }
        this.f55807g.x(dVar.f55774a, dVar.f55775b, this.f55801a, dVar.f55776c, dVar.f55777d, dVar.f55778e, dVar.f55779f, dVar.f55780g, this.f55809i.l(dVar, this, this.f55808h.a(dVar.f55775b)));
        return true;
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public int l(long positionUs) {
        int iG = 0;
        if (F()) {
            return 0;
        }
        if (!this.f55816p0 || positionUs <= this.f55813m.q()) {
            int iF = this.f55813m.f(positionUs, true, true);
            if (iF != -1) {
                iG = iF;
            }
        } else {
            iG = this.f55813m.g();
        }
        G();
        return iG;
    }

    public long n(long positionUs, x0 seekParameters) {
        return this.f55805e.n(positionUs, seekParameters);
    }

    public void p(long positionUs, boolean toKeyframe) {
        if (F()) {
            return;
        }
        int iO = this.f55813m.o();
        this.f55813m.j(positionUs, toKeyframe, true);
        int iO2 = this.f55813m.o();
        if (iO2 > iO) {
            long jP = this.f55813m.p();
            int i10 = 0;
            while (true) {
                u0[] u0VarArr = this.f55815o;
                if (i10 >= u0VarArr.length) {
                    break;
                }
                u0VarArr[i10].j(jP, toKeyframe, this.f55804d[i10]);
                i10++;
            }
        }
        z(iO2);
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public int q(d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired) {
        if (F()) {
            return -3;
        }
        G();
        return this.f55814n.d(formatHolder, buffer, formatRequired, this.f55816p0, this.Z);
    }
}
