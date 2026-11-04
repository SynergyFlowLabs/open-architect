package androidx.media3.extractor.text;

import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.u0;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class v implements u0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f68819n = "SubtitleTranscodingTO";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u0 f68820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r.a f68821e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private r f68827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.common.w f68828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f68829m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f68822f = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68824h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68825i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f68826j = k1.f61545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o0 f68823g = new o0();

    public v(u0 u0Var, r.a aVar) {
        this.f68820d = u0Var;
        this.f68821e = aVar;
    }

    private void i(int i10) {
        int length = this.f68826j.length;
        int i11 = this.f68825i;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f68824h;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f68826j;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f68824h, bArr2, 0, i12);
        this.f68824h = 0;
        this.f68825i = i12;
        this.f68826j = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(d dVar, long j10, int i10) {
        androidx.media3.common.util.a.k(this.f68828l);
        byte[] bArrA = this.f68822f.a(dVar.f68444a, dVar.f68446c);
        this.f68823g.X(bArrA);
        this.f68820d.b(this.f68823g, bArrA.length);
        long j11 = dVar.f68445b;
        if (j11 == -9223372036854775807L) {
            androidx.media3.common.util.a.i(this.f68828l.f61766t == Long.MAX_VALUE);
        } else {
            long j12 = this.f68828l.f61766t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f68820d.g(j10, i10 | 1, bArrA.length, 0, null);
    }

    @Override // androidx.media3.extractor.u0
    public void a(o0 o0Var, int i10, int i11) {
        if (this.f68827k == null) {
            this.f68820d.a(o0Var, i10, i11);
            return;
        }
        i(i10);
        o0Var.n(this.f68826j, this.f68825i, i10);
        this.f68825i += i10;
    }

    @Override // androidx.media3.extractor.u0
    public int d(androidx.media3.common.l lVar, int i10, boolean z10, int i11) throws IOException {
        if (this.f68827k == null) {
            return this.f68820d.d(lVar, i10, z10, i11);
        }
        i(i10);
        int i12 = lVar.read(this.f68826j, this.f68825i, i10);
        if (i12 != -1) {
            this.f68825i += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.u0
    public void e(androidx.media3.common.w wVar) {
        androidx.media3.common.util.a.g(wVar.f61761o);
        androidx.media3.common.util.a.a(s0.m(wVar.f61761o) == 3);
        if (!wVar.equals(this.f68828l)) {
            this.f68828l = wVar;
            this.f68827k = this.f68821e.b(wVar) ? this.f68821e.c(wVar) : null;
        }
        if (this.f68827k == null) {
            this.f68820d.e(wVar);
        } else {
            this.f68820d.e(wVar.b().u0(s0.T0).S(wVar.f61761o).y0(Long.MAX_VALUE).W(this.f68821e.a(wVar)).N());
        }
    }

    @Override // androidx.media3.extractor.u0
    public void g(final long j10, final int i10, int i11, int i12, @p0 u0.a aVar) {
        int i13;
        if (this.f68827k == null) {
            this.f68820d.g(j10, i10, i11, i12, aVar);
            return;
        }
        androidx.media3.common.util.a.b(aVar == null, "DRM on subtitles is not supported");
        int i14 = (this.f68825i - i12) - i11;
        try {
            i13 = i14;
            try {
                this.f68827k.a(this.f68826j, i13, i11, r.b.b(), new androidx.media3.common.util.o() { // from class: androidx.media3.extractor.text.u
                    @Override // androidx.media3.common.util.o
                    public final void accept(Object obj) {
                        this.f68816a.j((d) obj, j10, i10);
                    }
                });
            } catch (RuntimeException e10) {
                e = e10;
                RuntimeException runtimeException = e;
                if (!this.f68829m) {
                    throw runtimeException;
                }
                z.o(f68819n, "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e11) {
            e = e11;
            i13 = i14;
        }
        int i15 = i13 + i11;
        this.f68824h = i15;
        if (i15 == this.f68825i) {
            this.f68824h = 0;
            this.f68825i = 0;
        }
    }

    public void k() {
        r rVar = this.f68827k;
        if (rVar != null) {
            rVar.reset();
        }
    }

    public void l(boolean z10) {
        this.f68829m = z10;
    }
}
