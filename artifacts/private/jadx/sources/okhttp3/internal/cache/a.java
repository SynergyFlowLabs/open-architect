package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jk.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.internal.http.h;
import okhttp3.r;
import okhttp3.u;
import okhttp3.w;
import okio.b1;
import okio.e1;
import okio.l;
import okio.l0;
import okio.m;
import okio.n;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C2355a f333941c = new C2355a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final okhttp3.c f333942b;

    /* JADX INFO: renamed from: okhttp3.internal.cache.a$a, reason: collision with other inner class name */
    public static final class C2355a {
        public /* synthetic */ C2355a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u c(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strN = uVar.n(i10);
                String strW = uVar.w(i10);
                if ((!StringsKt.N1(com.google.common.net.d.f119495g, strN, true) || !StringsKt.u2(strW, "1", false, 2, null)) && (d(strN) || !e(strN) || uVar2.k(strN) == null)) {
                    aVar.g(strN, strW);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strN2 = uVar2.n(i11);
                if (!d(strN2) && e(strN2)) {
                    aVar.g(strN2, uVar2.w(i11));
                }
            }
            return aVar.i();
        }

        private final boolean d(String str) {
            return StringsKt.N1("Content-Length", str, true) || StringsKt.N1(com.google.common.net.d.f119476b0, str, true) || StringsKt.N1("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (StringsKt.N1(com.google.common.net.d.f119523o, str, true) || StringsKt.N1(com.google.common.net.d.f119542u0, str, true) || StringsKt.N1("Proxy-Authenticate", str, true) || StringsKt.N1("Proxy-Authorization", str, true) || StringsKt.N1(com.google.common.net.d.M, str, true) || StringsKt.N1("Trailers", str, true) || StringsKt.N1(com.google.common.net.d.M0, str, true) || StringsKt.N1(com.google.common.net.d.N, str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f0 f(f0 f0Var) {
            return (f0Var != null ? f0Var.r() : null) != null ? f0Var.j0().b(null).c() : f0Var;
        }

        private C2355a() {
        }
    }

    public static final class b implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f333943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f333944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.cache.b f333945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f333946d;

        b(n nVar, okhttp3.internal.cache.b bVar, m mVar) {
            this.f333944b = nVar;
            this.f333945c = bVar;
            this.f333946d = mVar;
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f333943a && !f.w(this, 100, TimeUnit.MILLISECONDS)) {
                this.f333943a = true;
                this.f333945c.abort();
            }
            this.f333944b.close();
        }

        @Override // okio.b1
        public long read(@NotNull l sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                long j11 = this.f333944b.read(sink, j10);
                if (j11 != -1) {
                    sink.o(this.f333946d.n(), sink.size() - j11, j11);
                    this.f333946d.L9();
                    return j11;
                }
                if (!this.f333943a) {
                    this.f333943a = true;
                    this.f333946d.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (this.f333943a) {
                    throw e10;
                }
                this.f333943a = true;
                this.f333945c.abort();
                throw e10;
            }
        }

        @Override // okio.b1
        @NotNull
        public e1 timeout() {
            return this.f333944b.timeout();
        }
    }

    public a(@Nullable okhttp3.c cVar) {
        this.f333942b = cVar;
    }

    private final f0 a(okhttp3.internal.cache.b bVar, f0 f0Var) throws IOException {
        if (bVar == null) {
            return f0Var;
        }
        z0 z0VarA = bVar.a();
        g0 g0VarR = f0Var.r();
        Intrinsics.checkNotNull(g0VarR);
        b bVar2 = new b(g0VarR.source(), bVar, l0.d(z0VarA));
        return f0Var.j0().b(new h(f0.T(f0Var, "Content-Type", null, 2, null), f0Var.r().contentLength(), l0.e(bVar2))).c();
    }

    @Nullable
    public final okhttp3.c b() {
        return this.f333942b;
    }

    @Override // okhttp3.w
    @NotNull
    public f0 intercept(@NotNull w.a chain) throws IOException {
        r rVarN;
        g0 g0VarR;
        g0 g0VarR2;
        g0 g0VarR3;
        Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.e eVarCall = chain.call();
        okhttp3.c cVar = this.f333942b;
        f0 f0VarF = cVar != null ? cVar.f(chain.request()) : null;
        c cVarB = new c.b(System.currentTimeMillis(), chain.request(), f0VarF).b();
        d0 d0VarB = cVarB.b();
        f0 f0VarA = cVarB.a();
        okhttp3.c cVar2 = this.f333942b;
        if (cVar2 != null) {
            cVar2.N(cVarB);
        }
        okhttp3.internal.connection.e eVar = eVarCall instanceof okhttp3.internal.connection.e ? (okhttp3.internal.connection.e) eVarCall : null;
        if (eVar == null || (rVarN = eVar.n()) == null) {
            rVarN = r.f334753b;
        }
        if (f0VarF != null && f0VarA == null && (g0VarR3 = f0VarF.r()) != null) {
            f.o(g0VarR3);
        }
        if (d0VarB == null && f0VarA == null) {
            f0 f0VarC = new f0.a().E(chain.request()).B(c0.HTTP_1_1).g(504).y("Unsatisfiable Request (only-if-cached)").b(f.f307485c).F(-1L).C(System.currentTimeMillis()).c();
            rVarN.A(eVarCall, f0VarC);
            return f0VarC;
        }
        if (d0VarB == null) {
            Intrinsics.checkNotNull(f0VarA);
            f0 f0VarC2 = f0VarA.j0().d(f333941c.f(f0VarA)).c();
            rVarN.b(eVarCall, f0VarC2);
            return f0VarC2;
        }
        if (f0VarA != null) {
            rVarN.a(eVarCall, f0VarA);
        } else if (this.f333942b != null) {
            rVarN.c(eVarCall);
        }
        try {
            f0 f0VarC3 = chain.c(d0VarB);
            if (f0VarC3 == null && f0VarF != null && (g0VarR2 = f0VarF.r()) != null) {
                f.o(g0VarR2);
            }
            if (f0VarA != null) {
                if (f0VarC3 != null && f0VarC3.E() == 304) {
                    f0.a aVarJ0 = f0VarA.j0();
                    C2355a c2355a = f333941c;
                    f0 f0VarC4 = aVarJ0.w(c2355a.c(f0VarA.Y(), f0VarC3.Y())).F(f0VarC3.y0()).C(f0VarC3.w0()).d(c2355a.f(f0VarA)).z(c2355a.f(f0VarC3)).c();
                    g0 g0VarR4 = f0VarC3.r();
                    Intrinsics.checkNotNull(g0VarR4);
                    g0VarR4.close();
                    okhttp3.c cVar3 = this.f333942b;
                    Intrinsics.checkNotNull(cVar3);
                    cVar3.I();
                    this.f333942b.R(f0VarA, f0VarC4);
                    rVarN.b(eVarCall, f0VarC4);
                    return f0VarC4;
                }
                g0 g0VarR5 = f0VarA.r();
                if (g0VarR5 != null) {
                    f.o(g0VarR5);
                }
            }
            Intrinsics.checkNotNull(f0VarC3);
            f0.a aVarJ1 = f0VarC3.j0();
            C2355a c2355a2 = f333941c;
            f0 f0VarC5 = aVarJ1.d(c2355a2.f(f0VarA)).z(c2355a2.f(f0VarC3)).c();
            if (this.f333942b != null) {
                if (okhttp3.internal.http.e.c(f0VarC5) && c.f333947c.a(f0VarC5, d0VarB)) {
                    f0 f0VarA2 = a(this.f333942b.t(f0VarC5), f0VarC5);
                    if (f0VarA != null) {
                        rVarN.c(eVarCall);
                    }
                    return f0VarA2;
                }
                if (okhttp3.internal.http.f.f334185a.a(d0VarB.m())) {
                    try {
                        this.f333942b.x(d0VarB);
                    } catch (IOException unused) {
                    }
                }
            }
            return f0VarC5;
        } catch (Throwable th2) {
            if (f0VarF != null && (g0VarR = f0VarF.r()) != null) {
                f.o(g0VarR);
            }
            throw th2;
        }
    }
}
