package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.z3;
import com.google.common.collect.l6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@Deprecated
public final class y1 extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.datasource.x f65568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.datasource.p.a f65569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.common.w f65570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f65571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.m f65572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f65573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z3 f65574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media3.common.k0 f65575o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.common.base.s0<androidx.media3.exoplayer.util.c> f65576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.datasource.r1 f65577t;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.datasource.p.a f65578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.m f65579b = new androidx.media3.exoplayer.upstream.l();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f65580c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f65581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private String f65582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.common.base.s0<androidx.media3.exoplayer.util.c> f65583f;

        public b(androidx.media3.datasource.p.a aVar) {
            this.f65578a = (androidx.media3.datasource.p.a) androidx.media3.common.util.a.g(aVar);
        }

        public y1 b(androidx.media3.common.k0.k kVar, long j10) {
            return new y1(this.f65582e, kVar, this.f65578a, j10, this.f65579b, this.f65580c, this.f65581d, this.f65583f);
        }

        @z7.a
        public <T extends Executor> b c(final com.google.common.base.s0<T> s0Var, final androidx.media3.common.util.o<T> oVar) {
            this.f65583f = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.source.z1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return androidx.media3.exoplayer.util.c.y3((Executor) s0Var.get(), oVar);
                }
            };
            return this;
        }

        @z7.a
        public b d(@androidx.annotation.p0 androidx.media3.exoplayer.upstream.m mVar) {
            if (mVar == null) {
                mVar = new androidx.media3.exoplayer.upstream.l();
            }
            this.f65579b = mVar;
            return this;
        }

        @z7.a
        public b e(@androidx.annotation.p0 Object obj) {
            this.f65581d = obj;
            return this;
        }

        @z7.a
        @Deprecated
        public b f(@androidx.annotation.p0 String str) {
            this.f65582e = str;
            return this;
        }

        @z7.a
        public b g(boolean z10) {
            this.f65580c = z10;
            return this;
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void a() {
    }

    @Override // androidx.media3.exoplayer.source.t0
    public androidx.media3.common.k0 g() {
        return this.f65575o;
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        this.f65577t = r1Var;
        k0(this.f65574n);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        ((x1) s0Var).x();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void l0() {
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        androidx.media3.datasource.x xVar = this.f65568h;
        androidx.media3.datasource.p.a aVar = this.f65569i;
        androidx.media3.datasource.r1 r1Var = this.f65577t;
        androidx.media3.common.w wVar = this.f65570j;
        long j11 = this.f65571k;
        androidx.media3.exoplayer.upstream.m mVar = this.f65572l;
        b1.a aVarX = X(bVar);
        boolean z10 = this.f65573m;
        com.google.common.base.s0<androidx.media3.exoplayer.util.c> s0Var = this.f65576s;
        return new x1(xVar, aVar, r1Var, wVar, j11, mVar, aVarX, z10, s0Var != null ? s0Var.get() : null);
    }

    private y1(@androidx.annotation.p0 String str, androidx.media3.common.k0.k kVar, androidx.media3.datasource.p.a aVar, long j10, androidx.media3.exoplayer.upstream.m mVar, boolean z10, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 com.google.common.base.s0<androidx.media3.exoplayer.util.c> s0Var) {
        this.f65569i = aVar;
        this.f65571k = j10;
        this.f65572l = mVar;
        this.f65573m = z10;
        androidx.media3.common.k0 k0VarA = new androidx.media3.common.k0.c().M(Uri.EMPTY).E(kVar.f60947a.toString()).J(l6.G(kVar)).L(obj).a();
        this.f65575o = k0VarA;
        androidx.media3.common.w.b bVarH0 = new androidx.media3.common.w.b().u0((String) com.google.common.base.b0.a(kVar.f60948b, androidx.media3.common.s0.f61334r0)).j0(kVar.f60949c).w0(kVar.f60950d).s0(kVar.f60951e).h0(kVar.f60952f);
        String str2 = kVar.f60953g;
        this.f65570j = bVarH0.f0(str2 != null ? str2 : str).N();
        this.f65568h = new androidx.media3.datasource.x.b().j(kVar.f60947a).c(1).a();
        this.f65574n = new w1(j10, true, false, false, (Object) null, k0VarA);
        this.f65576s = s0Var;
    }
}
