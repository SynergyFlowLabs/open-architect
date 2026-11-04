package com.google.firebase.perf.config;

import android.content.Context;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.perf.util.m;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f123867d = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f123868e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RemoteConfigManager f123869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.firebase.perf.util.e f123870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f123871c;

    @l1
    public a(@p0 RemoteConfigManager remoteConfigManager, @p0 com.google.firebase.perf.util.e eVar, @p0 e eVar2) {
        this.f123869a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f123870b = eVar == null ? new com.google.firebase.perf.util.e() : eVar;
        this.f123871c = eVar2 == null ? e.h() : eVar2;
    }

    private boolean K(long j10) {
        if (j10 < 0) {
            return false;
        }
        int i10 = 7 & 1;
        return true;
    }

    private boolean L(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(com.google.firebase.perf.a.f123833e)) {
                return true;
            }
        }
        return false;
    }

    private boolean M(long j10) {
        return j10 >= 0;
    }

    private boolean O(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private boolean P(long j10) {
        return j10 > 0;
    }

    private boolean Q(long j10) {
        return j10 > 0;
    }

    @l1
    public static void a() {
        f123868e = null;
    }

    private com.google.firebase.perf.util.f<Boolean> c(c<Boolean> cVar) {
        return this.f123871c.e(cVar.c());
    }

    private com.google.firebase.perf.util.f<Double> d(c<Double> cVar) {
        return this.f123871c.f(cVar.c());
    }

    private com.google.firebase.perf.util.f<Long> e(c<Long> cVar) {
        return this.f123871c.i(cVar.c());
    }

    private com.google.firebase.perf.util.f<String> f(c<String> cVar) {
        return this.f123871c.j(cVar.c());
    }

    public static synchronized a h() {
        try {
            if (f123868e == null) {
                f123868e = new a(null, null, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f123868e;
    }

    private boolean l() {
        b.k kVarG = b.k.g();
        com.google.firebase.perf.util.f<Boolean> fVarC = c(kVarG);
        com.google.firebase.perf.util.f<Boolean> fVarV = v(kVarG);
        if (!fVarV.d()) {
            return fVarC.d() ? fVarC.c().booleanValue() : kVarG.a().booleanValue();
        }
        if (this.f123869a.isLastFetchFailed()) {
            return false;
        }
        Boolean boolC = fVarV.c();
        if (fVarC == null || !fVarC.d() || fVarC.c() != boolC) {
            this.f123871c.o(kVarG.c(), boolC.booleanValue());
        }
        return boolC.booleanValue();
    }

    private boolean m() {
        b.j jVarG = b.j.g();
        com.google.firebase.perf.util.f<String> fVarF = f(jVarG);
        com.google.firebase.perf.util.f<String> fVarY = y(jVarG);
        if (!fVarY.d()) {
            return fVarF.d() ? L(fVarF.c()) : L(jVarG.a());
        }
        String strC = fVarY.c();
        if (fVarF == null || !fVarF.d() || !fVarF.c().equals(strC)) {
            this.f123871c.n(jVarG.c(), strC);
        }
        return L(strC);
    }

    private com.google.firebase.perf.util.f<Boolean> o(c<Boolean> cVar) {
        return this.f123870b.b(cVar.d());
    }

    private com.google.firebase.perf.util.f<Double> p(c<Double> cVar) {
        return this.f123870b.c(cVar.d());
    }

    private com.google.firebase.perf.util.f<Long> q(c<Long> cVar) {
        return this.f123870b.e(cVar.d());
    }

    private com.google.firebase.perf.util.f<Boolean> v(c<Boolean> cVar) {
        return this.f123869a.getBoolean(cVar.e());
    }

    private com.google.firebase.perf.util.f<Double> w(c<Double> cVar) {
        return this.f123869a.getDouble(cVar.e());
    }

    private com.google.firebase.perf.util.f<Long> x(c<Long> cVar) {
        return this.f123869a.getLong(cVar.e());
    }

    private com.google.firebase.perf.util.f<String> y(c<String> cVar) {
        return this.f123869a.getString(cVar.e());
    }

    private Long z(c<Long> cVar) {
        String strE = cVar.e();
        return strE == null ? cVar.a() : (Long) this.f123869a.getRemoteConfigValueOrDefault(strE, cVar.a());
    }

    public long A() {
        b.l lVarG = b.l.g();
        com.google.firebase.perf.util.f<Long> fVarQ = q(lVarG);
        if (fVarQ.d() && M(fVarQ.c().longValue())) {
            return fVarQ.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarX = x(lVarG);
        if (fVarX.d() && M(fVarX.c().longValue())) {
            this.f123871c.m(lVarG.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(lVarG);
        return (fVarE.d() && M(fVarE.c().longValue())) ? fVarE.c().longValue() : lVarG.a().longValue();
    }

    public long B() {
        b.m mVarH = b.m.h();
        com.google.firebase.perf.util.f<Long> fVarQ = q(mVarH);
        if (fVarQ.d() && M(fVarQ.c().longValue())) {
            return fVarQ.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarX = x(mVarH);
        if (fVarX.d() && M(fVarX.c().longValue())) {
            this.f123871c.m(mVarH.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(mVarH);
        if (fVarE.d() && M(fVarE.c().longValue())) {
            return fVarE.c().longValue();
        }
        return this.f123869a.isLastFetchFailed() ? mVarH.b().longValue() : mVarH.a().longValue();
    }

    public long C() {
        b.n nVarG = b.n.g();
        com.google.firebase.perf.util.f<Long> fVarQ = q(nVarG);
        if (fVarQ.d() && P(fVarQ.c().longValue())) {
            return fVarQ.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarX = x(nVarG);
        if (fVarX.d() && P(fVarX.c().longValue())) {
            this.f123871c.m(nVarG.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(nVarG);
        return (fVarE.d() && P(fVarE.c().longValue())) ? fVarE.c().longValue() : nVarG.a().longValue();
    }

    public long D() {
        b.o oVarG = b.o.g();
        com.google.firebase.perf.util.f<Long> fVarQ = q(oVarG);
        if (fVarQ.d() && M(fVarQ.c().longValue())) {
            return fVarQ.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarX = x(oVarG);
        if (fVarX.d() && M(fVarX.c().longValue())) {
            this.f123871c.m(oVarG.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(oVarG);
        return (fVarE.d() && M(fVarE.c().longValue())) ? fVarE.c().longValue() : oVarG.a().longValue();
    }

    public long E() {
        b.p pVarH = b.p.h();
        com.google.firebase.perf.util.f<Long> fVarQ = q(pVarH);
        if (fVarQ.d() && M(fVarQ.c().longValue())) {
            return fVarQ.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarX = x(pVarH);
        if (fVarX.d() && M(fVarX.c().longValue())) {
            this.f123871c.m(pVarH.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(pVarH);
        if (fVarE.d() && M(fVarE.c().longValue())) {
            return fVarE.c().longValue();
        }
        return this.f123869a.isLastFetchFailed() ? pVarH.b().longValue() : pVarH.a().longValue();
    }

    public double F() {
        b.q qVarH = b.q.h();
        com.google.firebase.perf.util.f<Double> fVarP = p(qVarH);
        if (fVarP.d()) {
            double dDoubleValue = fVarP.c().doubleValue() / 100.0d;
            if (O(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        com.google.firebase.perf.util.f<Double> fVarW = w(qVarH);
        if (fVarW.d() && O(fVarW.c().doubleValue())) {
            this.f123871c.l(qVarH.c(), fVarW.c().doubleValue());
            return fVarW.c().doubleValue();
        }
        com.google.firebase.perf.util.f<Double> fVarD = d(qVarH);
        if (fVarD.d() && O(fVarD.c().doubleValue())) {
            return fVarD.c().doubleValue();
        }
        return this.f123869a.isLastFetchFailed() ? qVarH.b().doubleValue() : qVarH.a().doubleValue();
    }

    public long G() {
        b.r rVarG = b.r.g();
        com.google.firebase.perf.util.f<Long> fVarX = x(rVarG);
        if (fVarX.d() && K(fVarX.c().longValue())) {
            this.f123871c.m(rVarG.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(rVarG);
        return (fVarE.d() && K(fVarE.c().longValue())) ? fVarE.c().longValue() : rVarG.a().longValue();
    }

    public long H() {
        b.s sVarG = b.s.g();
        com.google.firebase.perf.util.f<Long> fVarX = x(sVarG);
        if (fVarX.d() && K(fVarX.c().longValue())) {
            this.f123871c.m(sVarG.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(sVarG);
        return (fVarE.d() && K(fVarE.c().longValue())) ? fVarE.c().longValue() : sVarG.a().longValue();
    }

    public double I() {
        b.t tVarH = b.t.h();
        com.google.firebase.perf.util.f<Double> fVarW = w(tVarH);
        if (fVarW.d() && O(fVarW.c().doubleValue())) {
            this.f123871c.l(tVarH.c(), fVarW.c().doubleValue());
            return fVarW.c().doubleValue();
        }
        com.google.firebase.perf.util.f<Double> fVarD = d(tVarH);
        if (fVarD.d() && O(fVarD.c().doubleValue())) {
            return fVarD.c().doubleValue();
        }
        return this.f123869a.isLastFetchFailed() ? tVarH.b().doubleValue() : tVarH.a().doubleValue();
    }

    public boolean J() {
        return c(b.C1178b.g()).d() || v(b.k.g()).d();
    }

    public boolean N() {
        Boolean boolK = k();
        return (boolK == null || boolK.booleanValue()) && n();
    }

    public void R(Context context) {
        f123867d.i(m.c(context));
        this.f123871c.k(context);
    }

    public void S(Context context) {
        R(context.getApplicationContext());
    }

    @l1
    public void T(e eVar) {
        this.f123871c = eVar;
    }

    public void U(Boolean bool) {
        String strC;
        if (j().booleanValue() || (strC = b.C1178b.g().c()) == null) {
            return;
        }
        if (bool != null) {
            this.f123871c.o(strC, Boolean.TRUE.equals(bool));
        } else {
            this.f123871c.b(strC);
        }
    }

    public void V(com.google.firebase.perf.util.e eVar) {
        this.f123870b = eVar;
    }

    public String b() {
        String strH;
        b.e eVarG = b.e.g();
        if (com.google.firebase.perf.a.f123832d.booleanValue()) {
            return eVarG.a();
        }
        String strE = eVarG.e();
        long jLongValue = strE != null ? ((Long) this.f123869a.getRemoteConfigValueOrDefault(strE, -1L)).longValue() : -1L;
        String strC = eVarG.c();
        if (!b.e.i(jLongValue) || (strH = b.e.h(jLongValue)) == null) {
            com.google.firebase.perf.util.f<String> fVarF = f(eVarG);
            return fVarF.d() ? fVarF.c() : eVarG.a();
        }
        this.f123871c.n(strC, strH);
        return strH;
    }

    public double g() {
        b.d dVarG = b.d.g();
        com.google.firebase.perf.util.f<Double> fVarP = p(dVarG);
        if (fVarP.d()) {
            double dDoubleValue = fVarP.c().doubleValue() / 100.0d;
            if (O(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        com.google.firebase.perf.util.f<Double> fVarW = w(dVarG);
        if (fVarW.d() && O(fVarW.c().doubleValue())) {
            this.f123871c.l(dVarG.c(), fVarW.c().doubleValue());
            return fVarW.c().doubleValue();
        }
        com.google.firebase.perf.util.f<Double> fVarD = d(dVarG);
        return (fVarD.d() && O(fVarD.c().doubleValue())) ? fVarD.c().doubleValue() : dVarG.a().doubleValue();
    }

    public boolean i() {
        b.c cVarG = b.c.g();
        com.google.firebase.perf.util.f<Boolean> fVarO = o(cVarG);
        if (fVarO.d()) {
            return fVarO.c().booleanValue();
        }
        com.google.firebase.perf.util.f<Boolean> fVarV = v(cVarG);
        if (fVarV.d()) {
            this.f123871c.o(cVarG.c(), fVarV.c().booleanValue());
            return fVarV.c().booleanValue();
        }
        com.google.firebase.perf.util.f<Boolean> fVarC = c(cVarG);
        return fVarC.d() ? fVarC.c().booleanValue() : cVarG.a().booleanValue();
    }

    @p0
    public Boolean j() {
        b.a aVarG = b.a.g();
        com.google.firebase.perf.util.f<Boolean> fVarO = o(aVarG);
        return fVarO.d() ? fVarO.c() : aVarG.a();
    }

    @p0
    public Boolean k() {
        if (j().booleanValue()) {
            return Boolean.FALSE;
        }
        b.C1178b c1178bG = b.C1178b.g();
        com.google.firebase.perf.util.f<Boolean> fVarC = c(c1178bG);
        if (fVarC.d()) {
            return fVarC.c();
        }
        com.google.firebase.perf.util.f<Boolean> fVarO = o(c1178bG);
        if (fVarO.d()) {
            return fVarO.c();
        }
        return null;
    }

    public boolean n() {
        return l() && !m();
    }

    public long r() {
        b.f fVarG = b.f.g();
        com.google.firebase.perf.util.f<Long> fVarX = x(fVarG);
        if (fVarX.d() && K(fVarX.c().longValue())) {
            this.f123871c.m(fVarG.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(fVarG);
        return (fVarE.d() && K(fVarE.c().longValue())) ? fVarE.c().longValue() : fVarG.a().longValue();
    }

    public long s() {
        b.g gVarG = b.g.g();
        com.google.firebase.perf.util.f<Long> fVarX = x(gVarG);
        if (fVarX.d() && K(fVarX.c().longValue())) {
            this.f123871c.m(gVarG.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(gVarG);
        return (fVarE.d() && K(fVarE.c().longValue())) ? fVarE.c().longValue() : gVarG.a().longValue();
    }

    public double t() {
        b.h hVarH = b.h.h();
        com.google.firebase.perf.util.f<Double> fVarW = w(hVarH);
        if (fVarW.d() && O(fVarW.c().doubleValue())) {
            this.f123871c.l(hVarH.c(), fVarW.c().doubleValue());
            return fVarW.c().doubleValue();
        }
        com.google.firebase.perf.util.f<Double> fVarD = d(hVarH);
        if (fVarD.d() && O(fVarD.c().doubleValue())) {
            return fVarD.c().doubleValue();
        }
        return this.f123869a.isLastFetchFailed() ? hVarH.b().doubleValue() : hVarH.a().doubleValue();
    }

    public long u() {
        b.i iVarG = b.i.g();
        com.google.firebase.perf.util.f<Long> fVarX = x(iVarG);
        if (fVarX.d() && Q(fVarX.c().longValue())) {
            this.f123871c.m(iVarG.c(), fVarX.c().longValue());
            return fVarX.c().longValue();
        }
        com.google.firebase.perf.util.f<Long> fVarE = e(iVarG);
        return (fVarE.d() && Q(fVarE.c().longValue())) ? fVarE.c().longValue() : iVarG.a().longValue();
    }
}
