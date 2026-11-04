package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f62656m = "DefaultDataSource";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f62657n = "asset";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f62658o = "content";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f62659p = "rtmp";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f62660q = "udp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f62661r = "data";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f62662s = "rawresource";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f62663t = "android.resource";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f62664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<r1> f62665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f62666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private p f62667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private p f62668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private p f62669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private p f62670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private p f62671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private p f62672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private p f62673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private p f62674l;

    public static final class a implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f62675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p.a f62676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private r1 f62677c;

        public a(Context context) {
            this(context, new a0.b());
        }

        @Override // androidx.media3.datasource.p.a
        @androidx.media3.common.util.b1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public y a() {
            y yVar = new y(this.f62675a, this.f62676b.a());
            r1 r1Var = this.f62677c;
            if (r1Var != null) {
                yVar.s(r1Var);
            }
            return yVar;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public a d(@androidx.annotation.p0 r1 r1Var) {
            this.f62677c = r1Var;
            return this;
        }

        public a(Context context, p.a aVar) {
            this.f62675a = context.getApplicationContext();
            this.f62676b = (p.a) androidx.media3.common.util.a.g(aVar);
        }
    }

    @androidx.media3.common.util.b1
    public y(Context context, boolean z10) {
        this(context, null, 8000, 8000, z10);
    }

    private p A() {
        if (this.f62670h == null) {
            try {
                p pVar = (p) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f62670h = pVar;
                u(pVar);
            } catch (ClassNotFoundException unused) {
                androidx.media3.common.util.z.n(f62656m, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f62670h == null) {
                this.f62670h = this.f62666d;
            }
        }
        return this.f62670h;
    }

    private p B() {
        if (this.f62671i == null) {
            s1 s1Var = new s1();
            this.f62671i = s1Var;
            u(s1Var);
        }
        return this.f62671i;
    }

    private void C(@androidx.annotation.p0 p pVar, r1 r1Var) {
        if (pVar != null) {
            pVar.s(r1Var);
        }
    }

    private void u(p pVar) {
        for (int i10 = 0; i10 < this.f62665c.size(); i10++) {
            pVar.s(this.f62665c.get(i10));
        }
    }

    private p v() {
        if (this.f62668f == null) {
            d dVar = new d(this.f62664b);
            this.f62668f = dVar;
            u(dVar);
        }
        return this.f62668f;
    }

    private p w() {
        if (this.f62669g == null) {
            m mVar = new m(this.f62664b);
            this.f62669g = mVar;
            u(mVar);
        }
        return this.f62669g;
    }

    private p x() {
        if (this.f62672j == null) {
            n nVar = new n();
            this.f62672j = nVar;
            u(nVar);
        }
        return this.f62672j;
    }

    private p y() {
        if (this.f62667e == null) {
            d0 d0Var = new d0();
            this.f62667e = d0Var;
            u(d0Var);
        }
        return this.f62667e;
    }

    private p z() {
        if (this.f62673k == null) {
            n1 n1Var = new n1(this.f62664b);
            this.f62673k = n1Var;
            u(n1Var);
        }
        return this.f62673k;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public Map<String, List<String>> a() {
        p pVar = this.f62674l;
        return pVar == null ? Collections.EMPTY_MAP : pVar.a();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public long c(x xVar) throws IOException {
        androidx.media3.common.util.a.i(this.f62674l == null);
        String scheme = xVar.f62594a.getScheme();
        if (androidx.media3.common.util.k1.k1(xVar.f62594a)) {
            String path = xVar.f62594a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f62674l = y();
            } else {
                this.f62674l = v();
            }
        } else if (f62657n.equals(scheme)) {
            this.f62674l = v();
        } else if ("content".equals(scheme)) {
            this.f62674l = w();
        } else if (f62659p.equals(scheme)) {
            this.f62674l = A();
        } else if (f62660q.equals(scheme)) {
            this.f62674l = B();
        } else if ("data".equals(scheme)) {
            this.f62674l = x();
        } else if ("rawresource".equals(scheme) || f62663t.equals(scheme)) {
            this.f62674l = z();
        } else {
            this.f62674l = this.f62666d;
        }
        return this.f62674l.c(xVar);
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public void close() throws IOException {
        p pVar = this.f62674l;
        if (pVar != null) {
            try {
                pVar.close();
            } finally {
                this.f62674l = null;
            }
        }
    }

    @Override // androidx.media3.datasource.p
    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public Uri getUri() {
        p pVar = this.f62674l;
        if (pVar == null) {
            return null;
        }
        return pVar.getUri();
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((p) androidx.media3.common.util.a.g(this.f62674l)).read(bArr, i10, i11);
    }

    @Override // androidx.media3.datasource.p
    @androidx.media3.common.util.b1
    public void s(r1 r1Var) {
        androidx.media3.common.util.a.g(r1Var);
        this.f62666d.s(r1Var);
        this.f62665c.add(r1Var);
        C(this.f62667e, r1Var);
        C(this.f62668f, r1Var);
        C(this.f62669g, r1Var);
        C(this.f62670h, r1Var);
        C(this.f62671i, r1Var);
        C(this.f62672j, r1Var);
        C(this.f62673k, r1Var);
    }

    @androidx.media3.common.util.b1
    public y(Context context, @androidx.annotation.p0 String str, boolean z10) {
        this(context, str, 8000, 8000, z10);
    }

    @androidx.media3.common.util.b1
    public y(Context context, @androidx.annotation.p0 String str, int i10, int i11, boolean z10) {
        this(context, new a0.b().l(str).e(i10).j(i11).d(z10).a());
    }

    @androidx.media3.common.util.b1
    public y(Context context, p pVar) {
        this.f62664b = context.getApplicationContext();
        this.f62666d = (p) androidx.media3.common.util.a.g(pVar);
        this.f62665c = new ArrayList();
    }
}
