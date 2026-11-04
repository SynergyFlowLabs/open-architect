package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.datasource.d0;
import androidx.media3.datasource.j1;
import androidx.media3.datasource.q1;
import androidx.media3.datasource.r1;
import androidx.media3.datasource.x;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c implements androidx.media3.datasource.p {
    public static final int A = 0;
    public static final int B = 1;
    private static final long C = 102400;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f62319w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f62320x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f62321y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f62322z = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.cache.a f62323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.datasource.p f62324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final androidx.media3.datasource.p f62325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.datasource.p f62326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f62327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final InterfaceC0576c f62328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f62329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f62330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f62331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private Uri f62332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private x f62333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private x f62334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private androidx.media3.datasource.p f62335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f62336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f62337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f62338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private i f62339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f62340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f62341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f62342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f62343v;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: renamed from: androidx.media3.datasource.cache.c$c, reason: collision with other inner class name */
    public interface InterfaceC0576c {
        void a(int i10);

        void b(long j10, long j11);
    }

    public static final class d implements androidx.media3.datasource.p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.datasource.cache.a f62344a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private androidx.media3.datasource.o.a f62346c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f62348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private androidx.media3.datasource.p.a f62349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private androidx.media3.common.b1 f62350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f62351h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f62352i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private InterfaceC0576c f62353j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.datasource.p.a f62345b = new d0.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h f62347d = h.f62369a;

        private c f(@p0 androidx.media3.datasource.p pVar, int i10, int i11) {
            androidx.media3.datasource.o oVarA;
            androidx.media3.datasource.cache.a aVar = (androidx.media3.datasource.cache.a) androidx.media3.common.util.a.g(this.f62344a);
            if (this.f62348e || pVar == null) {
                oVarA = null;
            } else {
                androidx.media3.datasource.o.a aVar2 = this.f62346c;
                oVarA = aVar2 != null ? aVar2.a() : new androidx.media3.datasource.cache.b.C0575b().c(aVar).a();
            }
            return new c(aVar, pVar, this.f62345b.a(), oVarA, this.f62347d, i10, this.f62350g, i11, this.f62353j);
        }

        @Override // androidx.media3.datasource.p.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a() {
            androidx.media3.datasource.p.a aVar = this.f62349f;
            return f(aVar != null ? aVar.a() : null, this.f62352i, this.f62351h);
        }

        public c d() {
            androidx.media3.datasource.p.a aVar = this.f62349f;
            return f(aVar != null ? aVar.a() : null, this.f62352i | 1, -4000);
        }

        public c e() {
            return f(null, this.f62352i | 1, -4000);
        }

        @p0
        public androidx.media3.datasource.cache.a g() {
            return this.f62344a;
        }

        public h h() {
            return this.f62347d;
        }

        @p0
        public androidx.media3.common.b1 i() {
            return this.f62350g;
        }

        @z7.a
        public d j(androidx.media3.datasource.cache.a aVar) {
            this.f62344a = aVar;
            return this;
        }

        @z7.a
        public d k(h hVar) {
            this.f62347d = hVar;
            return this;
        }

        @z7.a
        public d l(androidx.media3.datasource.p.a aVar) {
            this.f62345b = aVar;
            return this;
        }

        @z7.a
        public d m(@p0 androidx.media3.datasource.o.a aVar) {
            this.f62346c = aVar;
            this.f62348e = aVar == null;
            return this;
        }

        @z7.a
        public d n(@p0 InterfaceC0576c interfaceC0576c) {
            this.f62353j = interfaceC0576c;
            return this;
        }

        @z7.a
        public d o(int i10) {
            this.f62352i = i10;
            return this;
        }

        @z7.a
        public d p(@p0 androidx.media3.datasource.p.a aVar) {
            this.f62349f = aVar;
            return this;
        }

        @z7.a
        public d q(int i10) {
            this.f62351h = i10;
            return this;
        }

        @z7.a
        public d r(@p0 androidx.media3.common.b1 b1Var) {
            this.f62350g = b1Var;
            return this;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    private boolean A() {
        return this.f62335n == this.f62324c;
    }

    private boolean B() {
        return !A();
    }

    private boolean C() {
        return this.f62335n == this.f62325d;
    }

    private void D() {
        InterfaceC0576c interfaceC0576c = this.f62328g;
        if (interfaceC0576c == null || this.f62342u <= 0) {
            return;
        }
        interfaceC0576c.b(this.f62323b.m(), this.f62342u);
        this.f62342u = 0L;
    }

    private void E(int i10) {
        InterfaceC0576c interfaceC0576c = this.f62328g;
        if (interfaceC0576c != null) {
            interfaceC0576c.a(i10);
        }
    }

    private void F(x xVar, boolean z10) throws IOException {
        i iVarE;
        long jMin;
        x xVarA;
        androidx.media3.datasource.p pVar;
        String str = (String) k1.o(xVar.f62602i);
        if (this.f62341t) {
            iVarE = null;
        } else if (this.f62329h) {
            try {
                iVarE = this.f62323b.e(str, this.f62337p, this.f62338q);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            iVarE = this.f62323b.k(str, this.f62337p, this.f62338q);
        }
        if (iVarE == null) {
            pVar = this.f62326e;
            xVarA = xVar.a().i(this.f62337p).h(this.f62338q).a();
        } else if (iVarE.f62373d) {
            Uri uriFromFile = Uri.fromFile((File) k1.o(iVarE.f62374e));
            long j10 = iVarE.f62371b;
            long j11 = this.f62337p - j10;
            long jMin2 = iVarE.f62372c - j11;
            long j12 = this.f62338q;
            if (j12 != -1) {
                jMin2 = Math.min(jMin2, j12);
            }
            xVarA = xVar.a().j(uriFromFile).l(j10).i(j11).h(jMin2).a();
            pVar = this.f62324c;
        } else {
            if (iVarE.l()) {
                jMin = this.f62338q;
            } else {
                jMin = iVarE.f62372c;
                long j13 = this.f62338q;
                if (j13 != -1) {
                    jMin = Math.min(jMin, j13);
                }
            }
            xVarA = xVar.a().i(this.f62337p).h(jMin).a();
            pVar = this.f62325d;
            if (pVar == null) {
                pVar = this.f62326e;
                this.f62323b.n(iVarE);
                iVarE = null;
            }
        }
        this.f62343v = (this.f62341t || pVar != this.f62326e) ? Long.MAX_VALUE : this.f62337p + C;
        if (z10) {
            androidx.media3.common.util.a.i(z());
            if (pVar == this.f62326e) {
                return;
            }
            try {
                u();
            } catch (Throwable th2) {
                if (((i) k1.o(iVarE)).k()) {
                    this.f62323b.n(iVarE);
                }
                throw th2;
            }
        }
        if (iVarE != null && iVarE.k()) {
            this.f62339r = iVarE;
        }
        this.f62335n = pVar;
        this.f62334m = xVarA;
        this.f62336o = 0L;
        long jC = pVar.c(xVarA);
        n nVar = new n();
        if (xVarA.f62601h == -1 && jC != -1) {
            this.f62338q = jC;
            n.h(nVar, this.f62337p + jC);
        }
        if (B()) {
            Uri uri = pVar.getUri();
            this.f62332k = uri;
            n.i(nVar, xVar.f62594a.equals(uri) ? null : this.f62332k);
        }
        if (C()) {
            this.f62323b.p(str, nVar);
        }
    }

    private void G(String str) throws IOException {
        this.f62338q = 0L;
        if (C()) {
            n nVar = new n();
            n.h(nVar, this.f62337p);
            this.f62323b.p(str, nVar);
        }
    }

    private int H(x xVar) {
        if (this.f62330i && this.f62340s) {
            return 0;
        }
        return (this.f62331j && xVar.f62601h == -1) ? 1 : -1;
    }

    private void u() throws IOException {
        androidx.media3.datasource.p pVar = this.f62335n;
        if (pVar == null) {
            return;
        }
        try {
            pVar.close();
            this.f62334m = null;
            this.f62335n = null;
            i iVar = this.f62339r;
            if (iVar != null) {
                this.f62323b.n(iVar);
            }
        } finally {
            this.f62334m = null;
            this.f62335n = null;
            i iVar2 = this.f62339r;
            if (iVar2 != null) {
                this.f62323b.n(iVar2);
                this.f62339r = null;
            }
        }
    }

    private static Uri x(androidx.media3.datasource.cache.a aVar, String str, Uri uri) {
        Uri uriD = m.d(aVar.b(str));
        return uriD != null ? uriD : uri;
    }

    private void y(Throwable th2) {
        if (!A() && !(th2 instanceof androidx.media3.datasource.cache.a.C0574a)) {
            return;
        }
        this.f62340s = true;
    }

    private boolean z() {
        return this.f62335n == this.f62326e;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public Map<String, List<String>> a() {
        return B() ? this.f62326e.a() : Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        try {
            String strB = this.f62327f.b(xVar);
            x xVarA = xVar.a().g(strB).a();
            this.f62333l = xVarA;
            this.f62332k = x(this.f62323b, strB, xVarA.f62594a);
            this.f62337p = xVar.f62600g;
            int iH = H(xVar);
            boolean z10 = iH != -1;
            this.f62341t = z10;
            if (z10) {
                E(iH);
            }
            if (this.f62341t) {
                this.f62338q = -1L;
            } else {
                long jF = m.f(this.f62323b.b(strB));
                this.f62338q = jF;
                if (jF != -1) {
                    long j10 = jF - xVar.f62600g;
                    this.f62338q = j10;
                    if (j10 < 0) {
                        throw new androidx.media3.datasource.u(2008);
                    }
                }
            }
            long jMin = xVar.f62601h;
            if (jMin != -1) {
                long j11 = this.f62338q;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f62338q = jMin;
            }
            long j12 = this.f62338q;
            if (j12 > 0 || j12 == -1) {
                F(xVarA, false);
            }
            long j13 = xVar.f62601h;
            return j13 != -1 ? j13 : this.f62338q;
        } catch (Throwable th2) {
            y(th2);
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() throws IOException {
        this.f62333l = null;
        this.f62332k = null;
        this.f62337p = 0L;
        D();
        try {
            u();
        } catch (Throwable th2) {
            y(th2);
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.p
    @p0
    public Uri getUri() {
        return this.f62332k;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f62338q == 0) {
            return -1;
        }
        x xVar = (x) androidx.media3.common.util.a.g(this.f62333l);
        x xVar2 = (x) androidx.media3.common.util.a.g(this.f62334m);
        try {
            if (this.f62337p >= this.f62343v) {
                F(xVar, true);
            }
            int i12 = ((androidx.media3.datasource.p) androidx.media3.common.util.a.g(this.f62335n)).read(bArr, i10, i11);
            if (i12 == -1) {
                if (B()) {
                    long j10 = xVar2.f62601h;
                    if (j10 == -1 || this.f62336o < j10) {
                        G((String) k1.o(xVar.f62602i));
                        return i12;
                    }
                }
                long j11 = this.f62338q;
                if (j11 <= 0) {
                    if (j11 == -1) {
                    }
                }
                u();
                F(xVar, false);
                return read(bArr, i10, i11);
            }
            if (A()) {
                this.f62342u += (long) i12;
            }
            long j12 = i12;
            this.f62337p += j12;
            this.f62336o += j12;
            long j13 = this.f62338q;
            if (j13 != -1) {
                this.f62338q = j13 - j12;
                return i12;
            }
            return i12;
        } catch (Throwable th2) {
            y(th2);
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.p
    public void s(r1 r1Var) {
        androidx.media3.common.util.a.g(r1Var);
        this.f62324c.s(r1Var);
        this.f62326e.s(r1Var);
    }

    public androidx.media3.datasource.cache.a v() {
        return this.f62323b;
    }

    public h w() {
        return this.f62327f;
    }

    public c(androidx.media3.datasource.cache.a aVar, @p0 androidx.media3.datasource.p pVar) {
        this(aVar, pVar, 0);
    }

    public c(androidx.media3.datasource.cache.a aVar, @p0 androidx.media3.datasource.p pVar, int i10) {
        this(aVar, pVar, new d0(), new androidx.media3.datasource.cache.b(aVar, androidx.media3.datasource.cache.b.f62302k), i10, null);
    }

    public c(androidx.media3.datasource.cache.a aVar, @p0 androidx.media3.datasource.p pVar, androidx.media3.datasource.p pVar2, @p0 androidx.media3.datasource.o oVar, int i10, @p0 InterfaceC0576c interfaceC0576c) {
        this(aVar, pVar, pVar2, oVar, i10, interfaceC0576c, null);
    }

    public c(androidx.media3.datasource.cache.a aVar, @p0 androidx.media3.datasource.p pVar, androidx.media3.datasource.p pVar2, @p0 androidx.media3.datasource.o oVar, int i10, @p0 InterfaceC0576c interfaceC0576c, @p0 h hVar) {
        this(aVar, pVar, pVar2, oVar, hVar, i10, null, -1000, interfaceC0576c);
    }

    private c(androidx.media3.datasource.cache.a aVar, @p0 androidx.media3.datasource.p pVar, androidx.media3.datasource.p pVar2, @p0 androidx.media3.datasource.o oVar, @p0 h hVar, int i10, @p0 androidx.media3.common.b1 b1Var, int i11, @p0 InterfaceC0576c interfaceC0576c) {
        this.f62323b = aVar;
        this.f62324c = pVar2;
        this.f62327f = hVar == null ? h.f62369a : hVar;
        this.f62329h = (i10 & 1) != 0;
        this.f62330i = (i10 & 2) != 0;
        this.f62331j = (i10 & 4) != 0;
        if (pVar != null) {
            pVar = b1Var != null ? new androidx.media3.datasource.k1(pVar, b1Var, i11) : pVar;
            this.f62326e = pVar;
            this.f62325d = oVar != null ? new q1(pVar, oVar) : null;
        } else {
            this.f62326e = j1.f62514b;
            this.f62325d = null;
        }
        this.f62328g = interfaceC0576c;
    }
}
