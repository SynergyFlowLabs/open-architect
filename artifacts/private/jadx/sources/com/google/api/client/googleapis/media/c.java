package com.google.api.client.googleapis.media;

import com.google.api.client.http.b0;
import com.google.api.client.http.d0;
import com.google.api.client.http.f;
import com.google.api.client.http.g0;
import com.google.api.client.http.i;
import com.google.api.client.http.j;
import com.google.api.client.http.m;
import com.google.api.client.http.q;
import com.google.api.client.http.u;
import com.google.api.client.http.v;
import com.google.api.client.http.w;
import com.google.api.client.http.x;
import com.google.api.client.util.h0;
import com.google.api.client.util.k0;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final int A = 262144;
    public static final int B = 10485760;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f115424w = "X-Upload-Content-Length";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f115425x = "X-Upload-Content-Type";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f115426y = 1048576;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f115427z = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.api.client.http.b f115429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f115430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0 f115431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m f115432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f115433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f115434g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u f115437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InputStream f115438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f115439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f115440m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f115442o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Byte f115444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f115445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f115446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte[] f115447t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f115448u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f115428a = a.NOT_STARTED;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f115435h = "POST";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q f115436i = new q();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f115441n = "*";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f115443p = B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    k0 f115449v = k0.f116095a;

    public enum a {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public c(com.google.api.client.http.b bVar, b0 b0Var, w wVar) {
        this.f115429b = (com.google.api.client.http.b) h0.d(bVar);
        this.f115431d = (b0) h0.d(b0Var);
        this.f115430c = wVar == null ? b0Var.c() : b0Var.d(wVar);
    }

    private void F(a aVar) throws IOException {
        this.f115428a = aVar;
        d dVar = this.f115440m;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private x a(j jVar) throws IOException {
        F(a.MEDIA_IN_PROGRESS);
        m mVarL = this.f115429b;
        if (this.f115432e != null) {
            mVarL = new g0().l(Arrays.asList(this.f115432e, this.f115429b));
            jVar.put("uploadType", io.ktor.http.m.g.f296038b);
        } else {
            jVar.put("uploadType", "media");
        }
        u uVarG = this.f115430c.g(this.f115435h, jVar, mVarL);
        uVarG.j().putAll(this.f115436i);
        x xVarB = b(uVarG);
        try {
            if (t()) {
                this.f115442o = j();
            }
            F(a.MEDIA_COMPLETE);
            return xVarB;
        } catch (Throwable th2) {
            xVarB.a();
            throw th2;
        }
    }

    private x b(u uVar) throws IOException {
        if (!this.f115448u && !(uVar.f() instanceof f)) {
            uVar.H(new i());
        }
        return c(uVar);
    }

    private x c(u uVar) throws IOException {
        new com.google.api.client.googleapis.b().a(uVar);
        uVar.W(false);
        return uVar.a();
    }

    private x d(j jVar) throws IOException {
        F(a.INITIATION_STARTED);
        jVar.put("uploadType", "resumable");
        m fVar = this.f115432e;
        if (fVar == null) {
            fVar = new f();
        }
        u uVarG = this.f115430c.g(this.f115435h, jVar, fVar);
        this.f115436i.p(f115425x, this.f115429b.c());
        if (t()) {
            this.f115436i.p(f115424w, Long.valueOf(j()));
        }
        uVarG.j().putAll(this.f115436i);
        x xVarB = b(uVarG);
        try {
            F(a.INITIATION_COMPLETE);
            return xVarB;
        } catch (Throwable th2) {
            xVarB.a();
            throw th2;
        }
    }

    private long j() throws IOException {
        if (!this.f115434g) {
            this.f115433f = this.f115429b.getLength();
            this.f115434g = true;
        }
        return this.f115433f;
    }

    private long l(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    private boolean t() throws IOException {
        return j() >= 0;
    }

    private x u(j jVar) throws IOException {
        x xVarD = d(jVar);
        if (!xVarD.q()) {
            return xVarD;
        }
        try {
            j jVar2 = new j(xVarD.h().P());
            xVarD.a();
            InputStream inputStreamD = this.f115429b.d();
            this.f115438k = inputStreamD;
            if (!inputStreamD.markSupported() && t()) {
                this.f115438k = new BufferedInputStream(this.f115438k);
            }
            while (true) {
                this.f115437j = this.f115430c.f(jVar2, null);
                x();
                new e(this, this.f115437j);
                x xVarC = t() ? c(this.f115437j) : b(this.f115437j);
                try {
                    if (xVarC.q()) {
                        this.f115442o = j();
                        if (this.f115429b.b()) {
                            this.f115438k.close();
                        }
                        F(a.MEDIA_COMPLETE);
                        return xVarC;
                    }
                    if (xVarC.k() != 308) {
                        return xVarC;
                    }
                    String strP = xVarC.h().P();
                    if (strP != null) {
                        jVar2 = new j(strP);
                    }
                    long jL = l(xVarC.h().S());
                    long j10 = jL - this.f115442o;
                    h0.g(j10 >= 0 && j10 <= ((long) this.f115446s));
                    long j11 = ((long) this.f115446s) - j10;
                    if (t()) {
                        if (j11 > 0) {
                            this.f115438k.reset();
                            h0.g(j10 == this.f115438k.skip(j10));
                        }
                    } else if (j11 == 0) {
                        this.f115447t = null;
                    }
                    this.f115442o = jL;
                    F(a.MEDIA_IN_PROGRESS);
                    xVarC.a();
                } catch (Throwable th2) {
                    xVarC.a();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            xVarD.a();
            throw th3;
        }
    }

    private void x() throws IOException {
        int i10;
        int i11;
        m eVar;
        int iMin = t() ? (int) Math.min(this.f115443p, j() - this.f115442o) : this.f115443p;
        if (t()) {
            this.f115438k.mark(iMin);
            long j10 = iMin;
            eVar = new d0(this.f115429b.c(), com.google.api.client.util.i.b(this.f115438k, j10)).i(true).h(j10).e(false);
            this.f115441n = String.valueOf(j());
        } else {
            byte[] bArr = this.f115447t;
            if (bArr == null) {
                Byte b10 = this.f115444q;
                i10 = b10 == null ? iMin + 1 : iMin;
                byte[] bArr2 = new byte[iMin + 1];
                this.f115447t = bArr2;
                if (b10 != null) {
                    bArr2[0] = b10.byteValue();
                }
                i11 = 0;
            } else {
                int i12 = (int) (this.f115445r - this.f115442o);
                System.arraycopy(bArr, this.f115446s - i12, bArr, 0, i12);
                Byte b11 = this.f115444q;
                if (b11 != null) {
                    this.f115447t[i12] = b11.byteValue();
                }
                i10 = iMin - i12;
                i11 = i12;
            }
            int iC = com.google.api.client.util.i.c(this.f115438k, this.f115447t, (iMin + 1) - i10, i10);
            if (iC < i10) {
                int iMax = i11 + Math.max(0, iC);
                if (this.f115444q != null) {
                    iMax++;
                    this.f115444q = null;
                }
                iMin = iMax;
                if (this.f115441n.equals("*")) {
                    this.f115441n = String.valueOf(this.f115442o + ((long) iMin));
                }
            } else {
                this.f115444q = Byte.valueOf(this.f115447t[iMin]);
            }
            eVar = new com.google.api.client.http.e(this.f115429b.c(), this.f115447t, 0, iMin);
            this.f115445r = this.f115442o + ((long) iMin);
        }
        this.f115446s = iMin;
        this.f115437j.E(eVar);
        if (iMin == 0) {
            this.f115437j.j().p0("bytes */" + this.f115441n);
            return;
        }
        this.f115437j.j().p0("bytes " + this.f115442o + "-" + ((this.f115442o + ((long) iMin)) - 1) + "/" + this.f115441n);
    }

    public c A(q qVar) {
        this.f115436i = qVar;
        return this;
    }

    public c B(String str) {
        h0.a(str.equals("POST") || str.equals("PUT") || str.equals("PATCH"));
        this.f115435h = str;
        return this;
    }

    public c C(m mVar) {
        this.f115432e = mVar;
        return this;
    }

    public c D(d dVar) {
        this.f115440m = dVar;
        return this;
    }

    public c E(k0 k0Var) {
        this.f115449v = k0Var;
        return this;
    }

    public x G(j jVar) throws IOException {
        h0.a(this.f115428a == a.NOT_STARTED);
        return this.f115439l ? a(jVar) : u(jVar);
    }

    public int e() {
        return this.f115443p;
    }

    public boolean f() {
        return this.f115448u;
    }

    public q g() {
        return this.f115436i;
    }

    public String h() {
        return this.f115435h;
    }

    public m i() {
        return this.f115429b;
    }

    public m k() {
        return this.f115432e;
    }

    public long m() {
        return this.f115442o;
    }

    public double n() throws IOException {
        h0.b(t(), "Cannot call getProgress() if the specified AbstractInputStreamContent has no content length. Use  getNumBytesUploaded() to denote progress instead.");
        if (j() == 0) {
            return 0.0d;
        }
        return this.f115442o / j();
    }

    public d o() {
        return this.f115440m;
    }

    public k0 p() {
        return this.f115449v;
    }

    public b0 q() {
        return this.f115431d;
    }

    public a r() {
        return this.f115428a;
    }

    public boolean s() {
        return this.f115439l;
    }

    @com.google.api.client.util.f
    void v() throws IOException {
        h0.e(this.f115437j, "The current request should not be null");
        this.f115437j.E(new f());
        this.f115437j.j().p0("bytes */" + this.f115441n);
    }

    public c w(int i10) {
        h0.b(i10 > 0 && i10 % 262144 == 0, "chunkSize must be a positive multiple of 262144.");
        this.f115443p = i10;
        return this;
    }

    public c y(boolean z10) {
        this.f115439l = z10;
        return this;
    }

    public c z(boolean z10) {
        this.f115448u = z10;
        return this;
    }
}
