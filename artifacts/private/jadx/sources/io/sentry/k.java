package io.sentry;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends io.sentry.protocol.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f305683i = 3585992094653318439L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.c f305684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.c f305685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.c f305686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final x4 f305687h;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f305688a;

        static {
            int[] iArr = new int[x4.values().length];
            f305688a = iArr;
            try {
                iArr[x4.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f305688a[x4.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f305688a[x4.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(@NotNull io.sentry.protocol.c cVar, @NotNull io.sentry.protocol.c cVar2, @NotNull io.sentry.protocol.c cVar3, @NotNull x4 x4Var) {
        this.f305684e = cVar;
        this.f305685f = cVar2;
        this.f305686g = cVar3;
        this.f305687h = x4Var;
    }

    @NotNull
    private io.sentry.protocol.c K() {
        int i10 = a.f305688a[this.f305687h.ordinal()];
        if (i10 == 1) {
            return this.f305686g;
        }
        if (i10 == 2) {
            return this.f305685f;
        }
        int i11 = 2 | 3;
        return i10 != 3 ? this.f305686g : this.f305684e;
    }

    @NotNull
    private io.sentry.protocol.c L() {
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        cVar.s(this.f305684e);
        cVar.s(this.f305685f);
        cVar.s(this.f305686g);
        return cVar;
    }

    @Override // io.sentry.protocol.c
    public void A(@NotNull io.sentry.protocol.h hVar) {
        K().A(hVar);
    }

    @Override // io.sentry.protocol.c
    public void B(@NotNull io.sentry.protocol.l lVar) {
        K().B(lVar);
    }

    @Override // io.sentry.protocol.c
    public void D(@NotNull io.sentry.protocol.n nVar) {
        K().D(nVar);
    }

    @Override // io.sentry.protocol.c
    public void E(@NotNull io.sentry.protocol.x xVar) {
        K().E(xVar);
    }

    @Override // io.sentry.protocol.c
    public void F(@NotNull io.sentry.protocol.d0 d0Var) {
        K().F(d0Var);
    }

    @Override // io.sentry.protocol.c
    public void G(@NotNull p9 p9Var) {
        K().G(p9Var);
    }

    @Override // io.sentry.protocol.c
    public int H() {
        return L().H();
    }

    @Override // io.sentry.protocol.c
    public void J(io.sentry.util.n.a<io.sentry.protocol.n> aVar) {
        if (this.f305686g.k() != null) {
            this.f305686g.J(aVar);
            return;
        }
        if (this.f305685f.k() != null) {
            this.f305685f.J(aVar);
        } else if (this.f305684e.k() != null) {
            this.f305684e.J(aVar);
        } else {
            K().J(aVar);
        }
    }

    @Override // io.sentry.protocol.c
    public boolean a(@Nullable Object obj) {
        return this.f305684e.a(obj) || this.f305685f.a(obj) || this.f305686g.a(obj);
    }

    @Override // io.sentry.protocol.c
    @NotNull
    public Set<Map.Entry<String, Object>> b() {
        return L().b();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public Object c(@Nullable Object obj) {
        Object objC = this.f305686g.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.f305685f.c(obj);
        return objC2 != null ? objC2 : this.f305684e.c(obj);
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public io.sentry.protocol.a d() {
        io.sentry.protocol.a aVarD = this.f305686g.d();
        if (aVarD != null) {
            return aVarD;
        }
        io.sentry.protocol.a aVarD2 = this.f305685f.d();
        return aVarD2 != null ? aVarD2 : this.f305684e.d();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public io.sentry.protocol.b e() {
        io.sentry.protocol.b bVarE = this.f305686g.e();
        if (bVarE != null) {
            return bVarE;
        }
        io.sentry.protocol.b bVarE2 = this.f305685f.e();
        return bVarE2 != null ? bVarE2 : this.f305684e.e();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public io.sentry.protocol.e f() {
        io.sentry.protocol.e eVarF = this.f305686g.f();
        if (eVarF != null) {
            return eVarF;
        }
        io.sentry.protocol.e eVarF2 = this.f305685f.f();
        return eVarF2 != null ? eVarF2 : this.f305684e.f();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public io.sentry.protocol.h h() {
        io.sentry.protocol.h hVarH = this.f305686g.h();
        if (hVarH != null) {
            return hVarH;
        }
        io.sentry.protocol.h hVarH2 = this.f305685f.h();
        return hVarH2 != null ? hVarH2 : this.f305684e.h();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public io.sentry.protocol.l i() {
        io.sentry.protocol.l lVarI = this.f305686g.i();
        if (lVarI != null) {
            return lVarI;
        }
        io.sentry.protocol.l lVarI2 = this.f305685f.i();
        return lVarI2 != null ? lVarI2 : this.f305684e.i();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public io.sentry.protocol.n k() {
        io.sentry.protocol.n nVarK = this.f305686g.k();
        if (nVarK != null) {
            return nVarK;
        }
        io.sentry.protocol.n nVarK2 = this.f305685f.k();
        return nVarK2 != null ? nVarK2 : this.f305684e.k();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public io.sentry.protocol.x l() {
        io.sentry.protocol.x xVarL = this.f305686g.l();
        if (xVarL != null) {
            return xVarL;
        }
        io.sentry.protocol.x xVarL2 = this.f305685f.l();
        return xVarL2 != null ? xVarL2 : this.f305684e.l();
    }

    @Override // io.sentry.protocol.c
    public int m() {
        return H();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public io.sentry.protocol.d0 n() {
        io.sentry.protocol.d0 d0VarN = this.f305686g.n();
        if (d0VarN != null) {
            return d0VarN;
        }
        io.sentry.protocol.d0 d0VarN2 = this.f305685f.n();
        return d0VarN2 != null ? d0VarN2 : this.f305684e.n();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public p9 o() {
        p9 p9VarO = this.f305686g.o();
        if (p9VarO != null) {
            return p9VarO;
        }
        p9 p9VarO2 = this.f305685f.o();
        return p9VarO2 != null ? p9VarO2 : this.f305684e.o();
    }

    @Override // io.sentry.protocol.c
    public boolean p() {
        return this.f305684e.p() && this.f305685f.p() && this.f305686g.p();
    }

    @Override // io.sentry.protocol.c
    @NotNull
    public Enumeration<String> q() {
        return L().q();
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public Object r(@Nullable String str, @Nullable Object obj) {
        return K().r(str, obj);
    }

    @Override // io.sentry.protocol.c
    public void s(@Nullable io.sentry.protocol.c cVar) {
        K().s(cVar);
    }

    @Override // io.sentry.protocol.c, io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        L().serialize(z3Var, iLogger);
    }

    @Override // io.sentry.protocol.c
    public void t(@Nullable Map<? extends String, ?> map) {
        K().t(map);
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public Object u(@Nullable Object obj) {
        return K().u(obj);
    }

    @Override // io.sentry.protocol.c
    @Nullable
    public Object v(@Nullable String str, @Nullable Object obj) {
        return r(str, obj);
    }

    @Override // io.sentry.protocol.c
    public void w(@NotNull io.sentry.protocol.a aVar) {
        K().w(aVar);
    }

    @Override // io.sentry.protocol.c
    public void x(@NotNull io.sentry.protocol.b bVar) {
        K().x(bVar);
    }

    @Override // io.sentry.protocol.c
    public void y(@NotNull io.sentry.protocol.e eVar) {
        K().y(eVar);
    }
}
