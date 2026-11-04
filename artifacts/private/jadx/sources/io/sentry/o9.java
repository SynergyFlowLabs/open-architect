package io.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class o9 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private e6 f305987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private e6 f305988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p9 f305989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final d9 f305990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Throwable f305991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final i1 f305992f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final w9 f305995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private s9 f305996j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f305993g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f305994h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f305997k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Map<String, io.sentry.protocol.i> f305998l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.c f305999m = new io.sentry.protocol.c();

    o9(@NotNull d9 d9Var, @NotNull i1 i1Var, @NotNull p9 p9Var, @NotNull w9 w9Var, @Nullable s9 s9Var) {
        this.f305989c = p9Var;
        p9Var.u(w9Var.a());
        this.f305990d = (d9) io.sentry.util.y.c(d9Var, "transaction is required");
        this.f305992f = (i1) io.sentry.util.y.c(i1Var, "Scopes are required");
        this.f305995i = w9Var;
        this.f305996j = s9Var;
        e6 e6VarC = w9Var.c();
        if (e6VarC != null) {
            this.f305987a = e6VarC;
        } else {
            this.f305987a = i1Var.b().getDateProvider().a();
        }
    }

    @NotNull
    private List<o9> S() {
        ArrayList arrayList = new ArrayList();
        for (o9 o9Var : this.f305990d.j()) {
            if (o9Var.V() != null && o9Var.V().equals(X())) {
                arrayList.add(o9Var);
            }
        }
        return arrayList;
    }

    private void b0(@NotNull e6 e6Var) {
        this.f305987a = e6Var;
    }

    @Override // io.sentry.p1
    @Nullable
    public da A() {
        return this.f305990d.A();
    }

    @Override // io.sentry.p1
    public void B(@Nullable String str, @Nullable Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f305997k.remove(str);
        } else {
            this.f305997k.put(str, obj);
        }
    }

    @Override // io.sentry.p1
    public boolean C(@NotNull e6 e6Var) {
        if (this.f305988b == null) {
            return false;
        }
        this.f305988b = e6Var;
        return true;
    }

    @Override // io.sentry.p1
    public void D(@Nullable Throwable th2) {
        this.f305991e = th2;
    }

    @Override // io.sentry.p1
    public void E(@Nullable x9 x9Var) {
        n(x9Var, this.f305992f.b().getDateProvider().a());
    }

    @Override // io.sentry.p1
    @NotNull
    public String E6() {
        return this.f305989c.f();
    }

    @Override // io.sentry.p1
    @Nullable
    public e F(@Nullable List<String> list) {
        return this.f305990d.F(list);
    }

    @Override // io.sentry.p1
    public void G(@NotNull String str, @NotNull Number number, @NotNull p2 p2Var) {
        if (isFinished()) {
            this.f305992f.b().getLogger().c(y7.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f305998l.put(str, new io.sentry.protocol.i(number, p2Var.apiName()));
        if (this.f305990d.j0() != this) {
            this.f305990d.v0(str, number, p2Var);
        }
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 I(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var, @NotNull w9 w9Var) {
        return this.f305993g ? s3.R() : this.f305990d.y0(this.f305989c.m(), str, str2, e6Var, w1Var, w9Var);
    }

    @Override // io.sentry.p1
    @Nullable
    public Object J(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f305997k.get(str);
    }

    @Override // io.sentry.p1
    public void K(@Nullable String str, @Nullable Object obj) {
        this.f305999m.r(str, obj);
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 M(@NotNull p9 p9Var, @NotNull w9 w9Var) {
        return this.f305990d.M(p9Var, w9Var);
    }

    @Override // io.sentry.p1
    @Nullable
    public e6 N() {
        return this.f305988b;
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 P(@NotNull String str, @Nullable String str2) {
        return this.f305993g ? s3.R() : this.f305990d.w0(this.f305989c.m(), str, str2);
    }

    @Override // io.sentry.p1
    @NotNull
    public e6 Q() {
        return this.f305987a;
    }

    @NotNull
    public Map<String, Object> R() {
        return this.f305997k;
    }

    @NotNull
    public Map<String, io.sentry.protocol.i> T() {
        return this.f305998l;
    }

    @NotNull
    w9 U() {
        return this.f305995i;
    }

    @Nullable
    public v9 V() {
        return this.f305989c.h();
    }

    @Nullable
    s9 W() {
        return this.f305996j;
    }

    @NotNull
    public v9 X() {
        return this.f305989c.m();
    }

    public Map<String, String> Y() {
        return this.f305989c.o();
    }

    @NotNull
    public io.sentry.protocol.v Z() {
        return this.f305989c.p();
    }

    @Override // io.sentry.p1
    public void a(@Nullable String str, @Nullable String str2) {
        this.f305989c.A(str, str2);
    }

    void a0(@Nullable s9 s9Var) {
        this.f305996j = s9Var;
    }

    @Override // io.sentry.p1
    @Nullable
    public Throwable b() {
        return this.f305991e;
    }

    @Override // io.sentry.p1
    public void c(@Nullable x9 x9Var) {
        this.f305989c.z(x9Var);
    }

    @Override // io.sentry.p1
    @NotNull
    public w8 d() {
        return new w8(this.f305989c.p(), this.f305989c.m(), this.f305989c.k());
    }

    @Override // io.sentry.p1
    @Nullable
    public Boolean f() {
        return this.f305989c.k();
    }

    @Nullable
    public Boolean g() {
        return this.f305989c.i();
    }

    @Override // io.sentry.p1
    @Nullable
    public String getDescription() {
        return this.f305989c.d();
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 h(@NotNull String str) {
        return P(str, null);
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 i(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var) {
        return I(str, str2, e6Var, w1Var, new w9());
    }

    @Override // io.sentry.p1
    public boolean isFinished() {
        return this.f305993g;
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 k(@NotNull String str, @Nullable String str2, @NotNull w9 w9Var) {
        return this.f305993g ? s3.R() : this.f305990d.z0(this.f305989c.m(), str, str2, w9Var);
    }

    @Override // io.sentry.p1
    @NotNull
    public p9 m() {
        return this.f305989c;
    }

    @Override // io.sentry.p1
    public void n(@Nullable x9 x9Var, @Nullable e6 e6Var) {
        e6 e6Var2;
        if (!this.f305993g && this.f305994h.compareAndSet(false, true)) {
            this.f305989c.z(x9Var);
            if (e6Var == null) {
                e6Var = this.f305992f.b().getDateProvider().a();
            }
            this.f305988b = e6Var;
            if (this.f305995i.f() || this.f305995i.e()) {
                e6 e6VarQ = null;
                e6 e6VarN = null;
                for (o9 o9Var : this.f305990d.j0().X().equals(X()) ? this.f305990d.e0() : S()) {
                    if (e6VarQ == null || o9Var.Q().e(e6VarQ)) {
                        e6VarQ = o9Var.Q();
                    }
                    if (e6VarN == null || (o9Var.N() != null && o9Var.N().d(e6VarN))) {
                        e6VarN = o9Var.N();
                    }
                }
                if (this.f305995i.f() && e6VarQ != null && this.f305987a.e(e6VarQ)) {
                    b0(e6VarQ);
                }
                if (this.f305995i.e() && e6VarN != null && ((e6Var2 = this.f305988b) == null || e6Var2.d(e6VarN))) {
                    C(e6VarN);
                }
            }
            Throwable th2 = this.f305991e;
            if (th2 != null) {
                this.f305992f.n(th2, this, this.f305990d.getName());
            }
            s9 s9Var = this.f305996j;
            if (s9Var != null) {
                s9Var.a(this);
            }
            this.f305993g = true;
        }
    }

    @Override // io.sentry.p1
    public boolean n0() {
        return false;
    }

    @Override // io.sentry.p1
    @Nullable
    public fa o() {
        return this.f305989c.l();
    }

    @Override // io.sentry.p1
    public void p(@NotNull String str) {
        this.f305989c.t(str);
    }

    @Override // io.sentry.p1
    @NotNull
    public io.sentry.protocol.c q() {
        return this.f305999m;
    }

    @Override // io.sentry.p1
    @NotNull
    public m1 q0() {
        return j3.a();
    }

    @Override // io.sentry.p1
    @Nullable
    public x9 t() {
        return this.f305989c.n();
    }

    @Override // io.sentry.p1
    public void u() {
        E(this.f305989c.n());
    }

    @Override // io.sentry.p1
    @Nullable
    public String v(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f305989c.o().get(str);
    }

    @Override // io.sentry.p1
    public void w(@Nullable String str) {
        this.f305989c.r(str);
    }

    @Override // io.sentry.p1
    public void y(@NotNull String str, @NotNull Number number) {
        if (isFinished()) {
            this.f305992f.b().getLogger().c(y7.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f305998l.put(str, new io.sentry.protocol.i(number, null));
        if (this.f305990d.j0() != this) {
            this.f305990d.u0(str, number);
        }
    }

    public o9(@NotNull ga gaVar, @NotNull d9 d9Var, @NotNull i1 i1Var, @NotNull w9 w9Var) {
        p9 p9Var = (p9) io.sentry.util.y.c(gaVar, "context is required");
        this.f305989c = p9Var;
        p9Var.u(w9Var.a());
        this.f305990d = (d9) io.sentry.util.y.c(d9Var, "sentryTracer is required");
        this.f305992f = (i1) io.sentry.util.y.c(i1Var, "scopes are required");
        this.f305996j = null;
        e6 e6VarC = w9Var.c();
        if (e6VarC != null) {
            this.f305987a = e6VarC;
        } else {
            this.f305987a = i1Var.b().getDateProvider().a();
        }
        this.f305995i = w9Var;
    }
}
