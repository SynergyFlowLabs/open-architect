package androidx.media3.exoplayer.source.chunk;

import android.media.MediaParser;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.w;
import androidx.media3.exoplayer.analytics.j4;
import androidx.media3.exoplayer.source.k0;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
@w0(30)
public final class q implements f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f64934i = "MediaPrsrChunkExtractor";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final f.a f64935j = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.mediaparser.l f64936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.mediaparser.a f64937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaParser f64938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f64939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.extractor.m f64940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f64941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private f.b f64942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private w[] f64943h;

    public static class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.extractor.text.r.a f64944a = new androidx.media3.extractor.text.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f64945b;

        @Override // androidx.media3.exoplayer.source.chunk.f.a
        @p0
        public f c(int i10, w wVar, boolean z10, List<w> list, @p0 u0 u0Var, j4 j4Var) {
            if (!s0.u(wVar.f61760n)) {
                return new q(i10, wVar, list, j4Var);
            }
            if (this.f64945b) {
                return new d(new androidx.media3.extractor.text.n(this.f64944a.c(wVar), wVar), i10, wVar);
            }
            return null;
        }

        @Override // androidx.media3.exoplayer.source.chunk.f.a
        public w e(w wVar) {
            String str;
            if (!this.f64945b || !this.f64944a.b(wVar)) {
                return wVar;
            }
            w.b bVarW = wVar.b().u0(s0.T0).W(this.f64944a.a(wVar));
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
            this.f64945b = z10;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.f.a
        @z7.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b a(androidx.media3.extractor.text.r.a aVar) {
            this.f64944a = (androidx.media3.extractor.text.r.a) androidx.media3.common.util.a.g(aVar);
            return this;
        }
    }

    private class c implements t {
        private c() {
        }

        @Override // androidx.media3.extractor.t
        public u0 a(int i10, int i11) {
            return q.this.f64942g != null ? q.this.f64942g.a(i10, i11) : q.this.f64940e;
        }

        @Override // androidx.media3.extractor.t
        public void l() {
            q qVar = q.this;
            qVar.f64943h = qVar.f64936a.h();
        }

        @Override // androidx.media3.extractor.t
        public void u(androidx.media3.extractor.p0 p0Var) {
        }
    }

    @e.a({"WrongConstant"})
    public q(int i10, w wVar, List<w> list, j4 j4Var) {
        androidx.media3.exoplayer.source.mediaparser.l lVar = new androidx.media3.exoplayer.source.mediaparser.l(wVar, i10, true);
        this.f64936a = lVar;
        this.f64937b = new androidx.media3.exoplayer.source.mediaparser.a();
        String str = s0.t((String) androidx.media3.common.util.a.g(wVar.f61760n)) ? "android.media.mediaparser.MatroskaParser" : "android.media.mediaparser.FragmentedMp4Parser";
        lVar.p(str);
        MediaParser mediaParserCreateByName = MediaParser.createByName(str, lVar);
        this.f64938c = mediaParserCreateByName;
        Boolean bool = Boolean.TRUE;
        mediaParserCreateByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", bool);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65217a, bool);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65218b, bool);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65219c, bool);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65220d, bool);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65221e, bool);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65222f, bool);
        ArrayList arrayList = new ArrayList();
        int i11 = 3 ^ 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayList.add(androidx.media3.exoplayer.source.mediaparser.c.b(list.get(i12)));
        }
        this.f64938c.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65223g, arrayList);
        if (k1.f61540a >= 31) {
            androidx.media3.exoplayer.source.mediaparser.c.a(this.f64938c, j4Var);
        }
        this.f64936a.n(list);
        this.f64939d = new c();
        this.f64940e = new androidx.media3.extractor.m();
        this.f64941f = -9223372036854775807L;
    }

    private void i() {
        MediaParser.SeekMap seekMapD = this.f64936a.d();
        long j10 = this.f64941f;
        if (j10 == -9223372036854775807L || seekMapD == null) {
            return;
        }
        this.f64938c.seek(k0.a(seekMapD.getSeekPoints(j10).first));
        this.f64941f = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    public boolean b(androidx.media3.extractor.s sVar) throws IOException {
        i();
        this.f64937b.c(sVar, sVar.getLength());
        return this.f64938c.advance(this.f64937b);
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    public void c(@p0 f.b bVar, long j10, long j11) {
        this.f64942g = bVar;
        this.f64936a.o(j11);
        this.f64936a.m(this.f64939d);
        this.f64941f = j10;
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    @p0
    public androidx.media3.extractor.g d() {
        return this.f64936a.c();
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    @p0
    public w[] e() {
        return this.f64943h;
    }

    @Override // androidx.media3.exoplayer.source.chunk.f
    public void release() {
        this.f64938c.release();
    }
}
