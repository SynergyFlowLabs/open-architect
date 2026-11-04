package androidx.media3.exoplayer.source.chunk;

import android.util.SparseArray;
import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.w;
import androidx.media3.exoplayer.analytics.j4;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d implements t, f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final b f64859j = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final n0 f64860k = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.extractor.r f64861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f64862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f64863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f64864d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f64865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private f.b f64866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f64867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.media3.extractor.p0 f64868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private w[] f64869i;

    private static final class a implements u0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f64870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f64871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private final w f64872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final androidx.media3.extractor.m f64873g = new androidx.media3.extractor.m();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public w f64874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private u0 f64875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f64876j;

        public a(int i10, int i11, @p0 w wVar) {
            this.f64870d = i10;
            this.f64871e = i11;
            this.f64872f = wVar;
        }

        @Override // androidx.media3.extractor.u0
        public void a(o0 o0Var, int i10, int i11) {
            ((u0) k1.o(this.f64875i)).b(o0Var, i10);
        }

        @Override // androidx.media3.extractor.u0
        public int d(androidx.media3.common.l lVar, int i10, boolean z10, int i11) throws IOException {
            return ((u0) k1.o(this.f64875i)).f(lVar, i10, z10);
        }

        @Override // androidx.media3.extractor.u0
        public void e(w wVar) {
            w wVar2 = this.f64872f;
            if (wVar2 != null) {
                wVar = wVar.m(wVar2);
            }
            this.f64874h = wVar;
            ((u0) k1.o(this.f64875i)).e(this.f64874h);
        }

        @Override // androidx.media3.extractor.u0
        public void g(long j10, int i10, int i11, int i12, @p0 u0.a aVar) {
            long j11 = this.f64876j;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f64875i = this.f64873g;
            }
            ((u0) k1.o(this.f64875i)).g(j10, i10, i11, i12, aVar);
        }

        public void h(@p0 f.b bVar, long j10) {
            if (bVar == null) {
                this.f64875i = this.f64873g;
                return;
            }
            this.f64876j = j10;
            u0 u0VarA = bVar.a(this.f64870d, this.f64871e);
            this.f64875i = u0VarA;
            w wVar = this.f64874h;
            if (wVar != null) {
                u0VarA.e(wVar);
            }
        }
    }

    public static final class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.extractor.text.r.a f64877a = new androidx.media3.extractor.text.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f64878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f64879c;

        @Override // androidx.media3.exoplayer.source.chunk.f.a
        @p0
        public f c(int i10, w wVar, boolean z10, List<w> list, @p0 u0 u0Var, j4 j4Var) {
            androidx.media3.extractor.r iVar;
            String str = wVar.f61760n;
            if (!s0.u(str)) {
                if (s0.t(str)) {
                    iVar = new androidx.media3.extractor.mkv.f(this.f64877a, this.f64878b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    iVar = new androidx.media3.extractor.jpeg.a(1);
                } else if (Objects.equals(str, s0.X0)) {
                    iVar = new androidx.media3.extractor.png.a();
                } else {
                    int i11 = z10 ? 4 : 0;
                    if (!this.f64878b) {
                        i11 |= 32;
                    }
                    iVar = new androidx.media3.extractor.mp4.i(this.f64877a, i11 | androidx.media3.extractor.mp4.i.l(this.f64879c), null, null, list, u0Var);
                }
            } else {
                if (!this.f64878b) {
                    return null;
                }
                iVar = new androidx.media3.extractor.text.n(this.f64877a.c(wVar), wVar);
            }
            return new d(iVar, i10, wVar);
        }

        @Override // androidx.media3.exoplayer.source.chunk.f.a
        public w e(w wVar) {
            String str;
            if (!this.f64878b || !this.f64877a.b(wVar)) {
                return wVar;
            }
            w.b bVarW = wVar.b().u0(s0.T0).W(this.f64877a.a(wVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wVar.f61761o);
            if (wVar.f61757k != null) {
                str = " " + wVar.f61757k;
            } else {
                str = "";
            }
            sb2.append(str);
            return bVarW.S(sb2.toString()).y0(Long.MAX_VALUE).N();
        }

        @Override // androidx.media3.exoplayer.source.chunk.f.a
        @z7.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b d(boolean z10) {
            this.f64878b = z10;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.f.a
        @z7.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b b(int i10) {
            this.f64879c = i10;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.f.a
        @z7.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a(androidx.media3.extractor.text.r.a aVar) {
            this.f64877a = (androidx.media3.extractor.text.r.a) androidx.media3.common.util.a.g(aVar);
            return this;
        }
    }

    public d(androidx.media3.extractor.r rVar, int i10, w wVar) {
        this.f64861a = rVar;
        this.f64862b = i10;
        this.f64863c = wVar;
    }

    @Override // androidx.media3.extractor.t
    public u0 a(int i10, int i11) {
        a aVar = this.f64864d.get(i10);
        if (aVar == null) {
            androidx.media3.common.util.a.i(this.f64869i == null);
            aVar = new a(i10, i11, i11 == this.f64862b ? this.f64863c : null);
            aVar.h(this.f64866f, this.f64867g);
            this.f64864d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    public boolean b(androidx.media3.extractor.s sVar) throws IOException {
        int iF = this.f64861a.f(sVar, f64860k);
        androidx.media3.common.util.a.i(iF != 1);
        return iF == 0;
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    public void c(@p0 f.b bVar, long j10, long j11) {
        this.f64866f = bVar;
        this.f64867g = j11;
        if (!this.f64865e) {
            this.f64861a.h(this);
            if (j10 != -9223372036854775807L) {
                this.f64861a.a(0L, j10);
            }
            this.f64865e = true;
            return;
        }
        androidx.media3.extractor.r rVar = this.f64861a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        rVar.a(0L, j10);
        for (int i10 = 0; i10 < this.f64864d.size(); i10++) {
            this.f64864d.valueAt(i10).h(bVar, j11);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    @p0
    public androidx.media3.extractor.g d() {
        androidx.media3.extractor.p0 p0Var = this.f64868h;
        if (p0Var instanceof androidx.media3.extractor.g) {
            return (androidx.media3.extractor.g) p0Var;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    @p0
    public w[] e() {
        return this.f64869i;
    }

    @Override // androidx.media3.extractor.t
    public void l() {
        w[] wVarArr = new w[this.f64864d.size()];
        for (int i10 = 0; i10 < this.f64864d.size(); i10++) {
            wVarArr[i10] = (w) androidx.media3.common.util.a.k(this.f64864d.valueAt(i10).f64874h);
        }
        this.f64869i = wVarArr;
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    public void release() {
        this.f64861a.release();
    }

    @Override // androidx.media3.extractor.t
    public void u(androidx.media3.extractor.p0 p0Var) {
        this.f64868h = p0Var;
    }
}
