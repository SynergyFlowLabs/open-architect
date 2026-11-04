package io.sentry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f305810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g1 f305811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g1 f305812c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f305813a;

        static {
            int[] iArr = new int[x4.values().length];
            f305813a = iArr;
            try {
                iArr[x4.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f305813a[x4.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f305813a[x4.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f305813a[x4.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public l(@NotNull g1 g1Var, @NotNull g1 g1Var2, @NotNull g1 g1Var3) {
        this.f305810a = g1Var;
        this.f305811b = g1Var2;
        this.f305812c = g1Var3;
    }

    @NotNull
    private g1 i() {
        return w(null);
    }

    @Override // io.sentry.g1
    public void A(@NotNull io.sentry.protocol.v vVar) {
        i().A(vVar);
    }

    @Override // io.sentry.g1
    public void B(@Nullable String str, @Nullable Collection<?> collection) {
        i().B(str, collection);
    }

    @Override // io.sentry.g1
    @NotNull
    public Queue<f> C() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f305810a.C());
        arrayList.addAll(this.f305811b.C());
        arrayList.addAll(this.f305812c.C());
        Collections.sort(arrayList);
        Queue<f> queueI = t4.i(this.f305812c.b().getMaxBreadcrumbs());
        queueI.addAll(arrayList);
        return queueI;
    }

    @Override // io.sentry.g1
    @Nullable
    public k9 D(t4.b bVar) {
        return i().D(bVar);
    }

    @Override // io.sentry.g1
    @NotNull
    public Map<String, String> E() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f305810a.E());
        concurrentHashMap.putAll(this.f305811b.E());
        concurrentHashMap.putAll(this.f305812c.E());
        return concurrentHashMap;
    }

    @Override // io.sentry.g1
    public void F(@Nullable r1 r1Var) {
        i().F(r1Var);
    }

    @Override // io.sentry.g1
    @Nullable
    public io.sentry.protocol.g0 G() {
        io.sentry.protocol.g0 g0VarG = this.f305812c.G();
        if (g0VarG != null) {
            return g0VarG;
        }
        io.sentry.protocol.g0 g0VarG2 = this.f305811b.G();
        return g0VarG2 != null ? g0VarG2 : this.f305810a.G();
    }

    @Override // io.sentry.g1
    public void H(@Nullable String str, @Nullable Boolean bool) {
        i().H(str, bool);
    }

    @Override // io.sentry.g1
    public void I() {
        i().I();
    }

    @Override // io.sentry.g1
    public void J() {
        i().J();
    }

    @Override // io.sentry.g1
    public void K(@Nullable String str, @Nullable Character ch2) {
        i().K(str, ch2);
    }

    @Override // io.sentry.g1
    @Nullable
    public k9 L() {
        k9 k9VarL = this.f305812c.L();
        if (k9VarL != null) {
            return k9VarL;
        }
        k9 k9VarL2 = this.f305811b.L();
        return k9VarL2 != null ? k9VarL2 : this.f305810a.L();
    }

    @Override // io.sentry.g1
    public void M(@Nullable String str, @Nullable Object[] objArr) {
        i().M(str, objArr);
    }

    @Override // io.sentry.g1
    public void N(@Nullable String str) {
        i().N(str);
    }

    @Override // io.sentry.g1
    @NotNull
    public k1 O() {
        k1 k1VarO = this.f305812c.O();
        if (!(k1VarO instanceof l3)) {
            return k1VarO;
        }
        k1 k1VarO2 = this.f305811b.O();
        return !(k1VarO2 instanceof l3) ? k1VarO2 : this.f305810a.O();
    }

    @Override // io.sentry.g1
    public void P(@NotNull i0 i0Var) {
        i().P(i0Var);
    }

    @Override // io.sentry.g1
    public void Q(@NotNull o7 o7Var) {
        this.f305810a.Q(o7Var);
    }

    @Override // io.sentry.g1
    @NotNull
    public List<i0> R() {
        return io.sentry.util.g.a(W());
    }

    @Override // io.sentry.g1
    public void S(@Nullable String str, @Nullable Number number) {
        i().S(str, number);
    }

    @Override // io.sentry.g1
    public void T(@NotNull m4 m4Var) {
        i().T(m4Var);
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void U(@NotNull n8 n8Var) {
        this.f305810a.U(n8Var);
    }

    @Override // io.sentry.g1
    public void V(@Nullable String str, @Nullable String str2) {
        i().V(str, str2);
    }

    @Override // io.sentry.g1
    @NotNull
    public List<io.sentry.internal.eventprocessor.a> W() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f305810a.W());
        copyOnWriteArrayList.addAll(this.f305811b.W());
        copyOnWriteArrayList.addAll(this.f305812c.W());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.g1
    public void X(@Nullable String str, @Nullable Object obj) {
        i().X(str, obj);
    }

    @Override // io.sentry.g1
    @Nullable
    public String Y() {
        String strY = this.f305812c.Y();
        if (strY != null) {
            return strY;
        }
        String strY2 = this.f305811b.Y();
        return strY2 != null ? strY2 : this.f305810a.Y();
    }

    @Override // io.sentry.g1
    @NotNull
    public List<String> Z() {
        List<String> listZ = this.f305812c.Z();
        if (!listZ.isEmpty()) {
            return listZ;
        }
        List<String> listZ2 = this.f305811b.Z();
        return !listZ2.isEmpty() ? listZ2 : this.f305810a.Z();
    }

    @Override // io.sentry.g1
    public void a(@Nullable String str, @Nullable String str2) {
        i().a(str, str2);
    }

    @Override // io.sentry.g1
    @Nullable
    public String a0() {
        String strA0 = this.f305812c.a0();
        if (strA0 != null) {
            return strA0;
        }
        String strA1 = this.f305811b.a0();
        return strA1 != null ? strA1 : this.f305810a.a0();
    }

    @Override // io.sentry.g1
    @NotNull
    public n8 b() {
        return this.f305810a.b();
    }

    @Override // io.sentry.g1
    public void b0(@Nullable String str) {
        i().b0(str);
    }

    @Override // io.sentry.g1
    public void c(@Nullable String str) {
        i().c(str);
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public m4 c0() {
        return i().c0();
    }

    @Override // io.sentry.g1
    public void clear() {
        i().clear();
    }

    @Override // io.sentry.g1
    public void d(@Nullable String str, @Nullable String str2) {
        i().d(str, str2);
    }

    @Override // io.sentry.g1
    public void d0(@NotNull b bVar) {
        i().d0(bVar);
    }

    @Override // io.sentry.g1
    @Nullable
    public p1 e() {
        p1 p1VarE = this.f305812c.e();
        if (p1VarE != null) {
            return p1VarE;
        }
        p1 p1VarE2 = this.f305811b.e();
        return p1VarE2 != null ? p1VarE2 : this.f305810a.e();
    }

    @Override // io.sentry.g1
    @NotNull
    public List<b> e0() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f305810a.e0());
        copyOnWriteArrayList.addAll(this.f305811b.e0());
        copyOnWriteArrayList.addAll(this.f305812c.e0());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.g1
    public void f(@Nullable String str) {
        i().f(str);
    }

    @Override // io.sentry.g1
    public void f0() {
        i().f0();
    }

    @Override // io.sentry.g1
    @Nullable
    public y7 g() {
        y7 y7VarG = this.f305812c.g();
        if (y7VarG != null) {
            return y7VarG;
        }
        y7 y7VarG2 = this.f305811b.g();
        return y7VarG2 != null ? y7VarG2 : this.f305810a.g();
    }

    @Override // io.sentry.g1
    @NotNull
    public m4 g0(t4.a aVar) {
        return i().g0(aVar);
    }

    @Override // io.sentry.g1
    @NotNull
    public Map<String, Object> getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f305810a.getExtras());
        concurrentHashMap.putAll(this.f305811b.getExtras());
        concurrentHashMap.putAll(this.f305812c.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.g1
    @Nullable
    public io.sentry.protocol.m getRequest() {
        io.sentry.protocol.m request = this.f305812c.getRequest();
        if (request != null) {
            return request;
        }
        io.sentry.protocol.m request2 = this.f305811b.getRequest();
        return request2 != null ? request2 : this.f305810a.getRequest();
    }

    @Override // io.sentry.g1
    public void h(@Nullable y7 y7Var) {
        i().h(y7Var);
    }

    @Override // io.sentry.g1
    public void h0(t4.c cVar) {
        i().h0(cVar);
    }

    @Override // io.sentry.g1
    public void i0(@NotNull io.sentry.protocol.v vVar) {
        this.f305810a.i0(vVar);
        this.f305811b.i0(vVar);
        this.f305812c.i0(vVar);
    }

    @Override // io.sentry.g1
    public void j(@Nullable io.sentry.protocol.g0 g0Var) {
        i().j(g0Var);
    }

    @Override // io.sentry.g1
    public void k(@NotNull f fVar) {
        i().k(fVar);
    }

    @Override // io.sentry.g1
    public void l(@NotNull String str) {
        i().l(str);
    }

    @Override // io.sentry.g1
    public void m(@NotNull f fVar, @Nullable n0 n0Var) {
        i().m(fVar, n0Var);
    }

    @Override // io.sentry.g1
    public void n(@NotNull Throwable th2, @NotNull p1 p1Var, @NotNull String str) {
        this.f305810a.n(th2, p1Var, str);
    }

    @Override // io.sentry.g1
    public void o() {
        i().o();
    }

    @Override // io.sentry.g1
    @Nullable
    public r1 p() {
        r1 r1VarP = this.f305812c.p();
        if (r1VarP != null) {
            return r1VarP;
        }
        r1 r1VarP2 = this.f305811b.p();
        return r1VarP2 != null ? r1VarP2 : this.f305810a.p();
    }

    @Override // io.sentry.g1
    @NotNull
    public io.sentry.protocol.c q() {
        return new k(this.f305810a.q(), this.f305811b.q(), this.f305812c.q(), b().getDefaultScopeType());
    }

    @Override // io.sentry.g1
    public void r(@Nullable io.sentry.protocol.m mVar) {
        i().r(mVar);
    }

    @Override // io.sentry.g1
    public void s(@NotNull k1 k1Var) {
        i().s(k1Var);
    }

    @Override // io.sentry.g1
    @NotNull
    public io.sentry.protocol.v t() {
        io.sentry.protocol.v vVarT = this.f305812c.t();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        if (!vVar.equals(vVarT)) {
            return vVarT;
        }
        io.sentry.protocol.v vVarT2 = this.f305811b.t();
        return !vVar.equals(vVarT2) ? vVarT2 : this.f305810a.t();
    }

    @Override // io.sentry.g1
    @Nullable
    public t4.d u() {
        return i().u();
    }

    @Override // io.sentry.g1
    public void v(@NotNull List<String> list) {
        i().v(list);
    }

    g1 w(@Nullable x4 x4Var) {
        if (x4Var != null) {
            int i10 = a.f305813a[x4Var.ordinal()];
            if (i10 == 1) {
                return this.f305812c;
            }
            if (i10 == 2) {
                return this.f305811b;
            }
            if (i10 == 3) {
                return this.f305810a;
            }
            if (i10 == 4) {
                return this;
            }
        }
        int i11 = a.f305813a[b().getDefaultScopeType().ordinal()];
        if (i11 == 1) {
            return this.f305812c;
        }
        if (i11 != 2) {
            return i11 != 3 ? this.f305812c : this.f305810a;
        }
        return this.f305811b;
    }

    @Override // io.sentry.g1
    public void x(@Nullable p1 p1Var) {
        this.f305812c.x(p1Var);
    }

    @Override // io.sentry.g1
    @Nullable
    public k9 y() {
        return i().y();
    }

    @Override // io.sentry.g1
    @NotNull
    public io.sentry.protocol.v z() {
        return this.f305810a.z();
    }

    @Override // io.sentry.g1
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public g1 m781clone() {
        return new l(this.f305810a, this.f305811b.m784clone(), this.f305812c.m784clone());
    }
}
