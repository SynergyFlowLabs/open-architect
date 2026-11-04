package androidx.media3.extractor.text;

import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.extractor.j0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class n implements androidx.media3.extractor.r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f68527o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68528p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68529q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f68530r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f68531s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f68532t = 4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f68533u = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f68534v = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f68535d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final androidx.media3.common.w f68537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<b> f68538g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u0 f68541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f68542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f68543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f68544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f68545n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f68536e = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f68540i = k1.f61545f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o0 f68539h = new o0();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f68546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f68547b;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f68546a, bVar.f68546a);
        }

        private b(long j10, byte[] bArr) {
            this.f68546a = j10;
            this.f68547b = bArr;
        }
    }

    public n(r rVar, @p0 androidx.media3.common.w wVar) {
        this.f68535d = rVar;
        this.f68537f = wVar != null ? wVar.b().u0(s0.T0).S(wVar.f61761o).W(rVar.b()).N() : null;
        this.f68538g = new ArrayList();
        this.f68543l = 0;
        this.f68544m = k1.f61546g;
        this.f68545n = -9223372036854775807L;
    }

    public static /* synthetic */ void d(n nVar, d dVar) {
        nVar.getClass();
        int i10 = 4 & 0;
        b bVar = new b(dVar.f68445b, nVar.f68536e.a(dVar.f68444a, dVar.f68446c));
        nVar.f68538g.add(bVar);
        long j10 = nVar.f68545n;
        if (j10 != -9223372036854775807L && dVar.f68445b < j10) {
            return;
        }
        nVar.l(bVar);
    }

    private void e() throws IOException {
        try {
            long j10 = this.f68545n;
            this.f68535d.a(this.f68540i, 0, this.f68542k, j10 != -9223372036854775807L ? r.b.c(j10) : r.b.b(), new androidx.media3.common.util.o() { // from class: androidx.media3.extractor.text.m
                @Override // androidx.media3.common.util.o
                public final void accept(Object obj) {
                    n.d(this.f68526a, (d) obj);
                }
            });
            Collections.sort(this.f68538g);
            this.f68544m = new long[this.f68538g.size()];
            for (int i10 = 0; i10 < this.f68538g.size(); i10++) {
                this.f68544m[i10] = this.f68538g.get(i10).f68546a;
            }
            this.f68540i = k1.f61545f;
        } catch (RuntimeException e10) {
            throw v0.a("SubtitleParser failed.", e10);
        }
    }

    private boolean i(androidx.media3.extractor.s sVar) throws IOException {
        byte[] bArr = this.f68540i;
        if (bArr.length == this.f68542k) {
            this.f68540i = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f68540i;
        int i10 = this.f68542k;
        int i11 = sVar.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.f68542k += i11;
        }
        long length = sVar.getLength();
        return (length != -1 && ((long) this.f68542k) == length) || i11 == -1;
    }

    private boolean j(androidx.media3.extractor.s sVar) throws IOException {
        return sVar.b((sVar.getLength() > (-1L) ? 1 : (sVar.getLength() == (-1L) ? 0 : -1)) != 0 ? com.google.common.primitives.l.e(sVar.getLength()) : 1024) == -1;
    }

    private void k() {
        long j10 = this.f68545n;
        for (int iN = j10 == -9223372036854775807L ? 0 : k1.n(this.f68544m, j10, true, true); iN < this.f68538g.size(); iN++) {
            l(this.f68538g.get(iN));
        }
    }

    private void l(b bVar) {
        androidx.media3.common.util.a.k(this.f68541j);
        int length = bVar.f68547b.length;
        this.f68539h.X(bVar.f68547b);
        this.f68541j.b(this.f68539h, length);
        this.f68541j.g(bVar.f68546a, 1, length, 0, null);
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        int i10 = this.f68543l;
        androidx.media3.common.util.a.i((i10 == 0 || i10 == 5) ? false : true);
        this.f68545n = j11;
        if (this.f68543l == 2) {
            this.f68543l = 1;
        }
        if (this.f68543l == 4) {
            this.f68543l = 3;
        }
    }

    @Override // androidx.media3.extractor.r
    public int f(androidx.media3.extractor.s sVar, n0 n0Var) throws IOException {
        int i10 = this.f68543l;
        androidx.media3.common.util.a.i((i10 == 0 || i10 == 5) ? false : true);
        if (this.f68543l == 1) {
            int iE = sVar.getLength() != -1 ? com.google.common.primitives.l.e(sVar.getLength()) : 1024;
            if (iE > this.f68540i.length) {
                this.f68540i = new byte[iE];
            }
            this.f68542k = 0;
            this.f68543l = 2;
        }
        if (this.f68543l == 2 && i(sVar)) {
            e();
            this.f68543l = 4;
        }
        if (this.f68543l == 3 && j(sVar)) {
            k();
            this.f68543l = 4;
        }
        return this.f68543l == 4 ? -1 : 0;
    }

    @Override // androidx.media3.extractor.r
    public boolean g(androidx.media3.extractor.s sVar) throws IOException {
        return true;
    }

    @Override // androidx.media3.extractor.r
    public void h(androidx.media3.extractor.t tVar) {
        androidx.media3.common.util.a.i(this.f68543l == 0);
        u0 u0VarA = tVar.a(0, 3);
        this.f68541j = u0VarA;
        androidx.media3.common.w wVar = this.f68537f;
        if (wVar != null) {
            u0VarA.e(wVar);
            tVar.l();
            tVar.u(new j0(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f68543l = 1;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
        if (this.f68543l == 5) {
            return;
        }
        this.f68535d.reset();
        this.f68543l = 5;
    }
}
