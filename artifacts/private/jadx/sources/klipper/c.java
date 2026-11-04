package klipper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private r f312281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private r f312282b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private a0 f312284d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private b0 f312286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f312287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f312288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f312289i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private List<List<b0>> f312283c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private List<v> f312285e = new ArrayList();

    private final void f() {
        while (true) {
            r rVar = this.f312281a;
            if (rVar == null) {
                this.f312282b = null;
                return;
            } else {
                Intrinsics.checkNotNull(rVar);
                this.f312281a = rVar.h();
            }
        }
    }

    private final b0 g(b0 b0Var) {
        while (true) {
            if (!Intrinsics.areEqual(b0Var.a(), b0Var.k().a()) || Intrinsics.areEqual(b0Var.b(), b0Var.o())) {
                b0Var = b0Var.e();
            } else {
                if (b0Var.d() != -3.4E38d && b0Var.k().d() != -3.4E38d) {
                    return b0Var;
                }
                while (b0Var.k().d() == -3.4E38d) {
                    b0Var = b0Var.k();
                }
                b0 b0VarE = b0Var;
                while (b0VarE.d() == -3.4E38d) {
                    b0VarE = b0VarE.e();
                }
                if (b0VarE.o().f() != b0VarE.k().a().f()) {
                    return b0Var.k().a().e() < b0VarE.a().e() ? b0Var : b0VarE;
                }
                b0Var = b0VarE;
            }
        }
    }

    private final void q(r rVar) {
        if (this.f312281a == null) {
            this.f312281a = rVar;
            return;
        }
        long j10 = rVar.j();
        r rVar2 = this.f312281a;
        Intrinsics.checkNotNull(rVar2);
        if (j10 >= rVar2.j()) {
            rVar.l(this.f312281a);
            this.f312281a = rVar;
            return;
        }
        r rVarH = this.f312281a;
        while (true) {
            Intrinsics.checkNotNull(rVarH);
            if (rVarH.h() == null) {
                break;
            }
            long j11 = rVar.j();
            r rVarH2 = rVarH.h();
            Intrinsics.checkNotNull(rVarH2);
            if (j11 >= rVarH2.j()) {
                break;
            } else {
                rVarH = rVarH.h();
            }
        }
        rVar.l(rVarH.h());
        rVarH.l(rVar);
    }

    private final b0 v(b0 b0Var, boolean z10) {
        if (b0Var.i() == -2) {
            b0 b0VarE = b0Var;
            if (z10) {
                while (b0VarE.o().f() == b0VarE.e().a().f()) {
                    b0VarE = b0VarE.e();
                }
                while (!Intrinsics.areEqual(b0VarE, b0Var) && b0VarE.d() == -3.4E38d) {
                    b0VarE = b0VarE.k();
                }
            } else {
                while (b0VarE.o().f() == b0VarE.e().a().f()) {
                    b0VarE = b0VarE.k();
                }
                while (!Intrinsics.areEqual(b0VarE, b0Var) && b0VarE.d() == -3.4E38d) {
                    b0VarE = b0VarE.e();
                }
            }
            if (Intrinsics.areEqual(b0VarE, b0Var)) {
                return z10 ? b0VarE.e() : b0VarE.k();
            }
            b0 b0VarE2 = z10 ? b0Var.e() : b0Var.k();
            boolean z11 = false & false;
            r rVar = new r(0L, null, null, null, 15, null);
            rVar.l(null);
            rVar.n(b0VarE2.a().f());
            rVar.k(null);
            rVar.m(b0VarE2);
            b0VarE2.K(0);
            b0 b0VarV = v(b0VarE2, z10);
            q(rVar);
            return b0VarV;
        }
        if (b0Var.d() == -3.4E38d) {
            b0 b0VarK = z10 ? b0Var.k() : b0Var.e();
            if (b0VarK.d() == -3.4E38d) {
                if (b0VarK.a().e() != b0Var.a().e() && b0VarK.o().e() != b0Var.a().e()) {
                    b0Var.v();
                }
            } else if (b0VarK.a().e() != b0Var.a().e()) {
                b0Var.v();
            }
        }
        b0 b0VarE3 = b0Var;
        if (z10) {
            while (b0VarE3.o().f() == b0VarE3.e().a().f() && b0VarE3.e().i() != -2) {
                b0VarE3 = b0VarE3.e();
            }
            if (b0VarE3.d() == -3.4E38d && b0VarE3.e().i() != -2) {
                b0 b0VarK2 = b0VarE3;
                while (b0VarK2.k().d() == -3.4E38d) {
                    b0VarK2 = b0VarK2.k();
                }
                if (b0VarK2.k().o().e() > b0VarE3.e().o().e()) {
                    b0VarE3 = b0VarK2.k();
                }
            }
            b0 b0VarE4 = b0Var;
            while (!Intrinsics.areEqual(b0VarE4, b0VarE3)) {
                b0VarE4.A(b0VarE4.e());
                if (b0VarE4.d() == -3.4E38d && !Intrinsics.areEqual(b0VarE4, b0Var) && b0VarE4.a().e() != b0VarE4.k().o().e()) {
                    b0VarE4.v();
                }
                b0VarE4 = b0VarE4.e();
            }
            if (b0VarE4.d() == -3.4E38d && !Intrinsics.areEqual(b0VarE4, b0Var) && b0VarE4.a().e() != b0VarE4.k().o().e()) {
                b0VarE4.v();
            }
            return b0VarE3.e();
        }
        while (b0VarE3.o().f() == b0VarE3.k().a().f() && b0VarE3.k().i() != -2) {
            b0VarE3 = b0VarE3.k();
        }
        if (b0VarE3.d() == -3.4E38d && b0VarE3.k().i() != -2) {
            b0 b0VarE5 = b0VarE3;
            while (b0VarE5.e().d() == -3.4E38d) {
                b0VarE5 = b0VarE5.e();
            }
            if (b0VarE5.e().o().e() == b0VarE3.k().o().e() || b0VarE5.e().o().e() > b0VarE3.k().o().e()) {
                b0VarE3 = b0VarE5.e();
            }
        }
        b0 b0VarK3 = b0Var;
        while (!Intrinsics.areEqual(b0VarK3, b0VarE3)) {
            b0VarK3.A(b0VarK3.k());
            if (b0VarK3.d() == -3.4E38d && !Intrinsics.areEqual(b0VarK3, b0Var) && b0VarK3.a().e() != b0VarK3.e().o().e()) {
                b0VarK3.v();
            }
            b0VarK3 = b0VarK3.k();
        }
        if (b0VarK3.d() == -3.4E38d && !Intrinsics.areEqual(b0VarK3, b0Var) && b0VarK3.a().e() != b0VarK3.e().o().e()) {
            b0VarK3.v();
        }
        return b0VarE3.k();
    }

    public final void A(@Nullable r rVar) {
        this.f312282b = rVar;
    }

    public final void B(@NotNull List<List<b0>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f312283c = list;
    }

    public final void C(boolean z10) {
        this.f312288h = z10;
    }

    public final void D(@Nullable r rVar) {
        this.f312281a = rVar;
    }

    public final void E(@NotNull List<v> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f312285e = list;
    }

    public final void F(boolean z10) {
        this.f312289i = z10;
    }

    public final void G(@Nullable a0 a0Var) {
        this.f312284d = a0Var;
    }

    public final void H(boolean z10) {
        this.f312287g = z10;
    }

    public final void I(@NotNull b0 edge1, @NotNull b0 edge2) {
        Intrinsics.checkNotNullParameter(edge1, "edge1");
        Intrinsics.checkNotNullParameter(edge2, "edge2");
        if (!Intrinsics.areEqual(edge1.f(), edge1.l()) && !Intrinsics.areEqual(edge2.f(), edge2.l())) {
            b0 b0Var = null;
            if (Intrinsics.areEqual(edge1.f(), edge2)) {
                b0 b0VarF = edge2.f();
                if (b0VarF != null) {
                    b0VarF.F(edge1);
                } else {
                    b0VarF = null;
                }
                b0 b0VarL = edge1.l();
                if (b0VarL != null) {
                    b0VarL.z(edge2);
                    b0Var = b0VarL;
                }
                edge2.F(b0Var);
                edge2.z(edge1);
                edge1.F(edge2);
                edge1.z(b0VarF);
            } else if (Intrinsics.areEqual(edge2.f(), edge1)) {
                b0 b0VarF2 = edge1.f();
                if (b0VarF2 != null) {
                    b0VarF2.F(edge2);
                } else {
                    b0VarF2 = null;
                }
                b0 b0VarL2 = edge2.l();
                if (b0VarL2 != null) {
                    b0VarL2.z(edge1);
                    b0Var = b0VarL2;
                }
                edge1.F(b0Var);
                edge1.z(edge2);
                edge2.F(edge1);
                edge2.z(b0VarF2);
            } else {
                b0 b0VarF3 = edge1.f();
                b0 b0VarL3 = edge1.l();
                b0 b0VarF4 = edge2.f();
                if (b0VarF4 != null) {
                    b0VarF4.F(edge1);
                } else {
                    b0VarF4 = null;
                }
                edge1.z(b0VarF4);
                b0 b0VarL4 = edge2.l();
                if (b0VarL4 != null) {
                    b0VarL4.z(edge1);
                } else {
                    b0VarL4 = null;
                }
                edge1.F(b0VarL4);
                if (b0VarF3 != null) {
                    b0VarF3.F(edge2);
                } else {
                    b0VarF3 = null;
                }
                edge2.z(b0VarF3);
                if (b0VarL3 != null) {
                    b0VarL3.z(edge2);
                    b0Var = b0VarL3;
                }
                edge2.F(b0Var);
            }
            if (edge1.l() == null) {
                this.f312286f = edge1;
            } else if (edge2.l() == null) {
                this.f312286f = edge2;
            }
        }
    }

    @NotNull
    public final b0 J(@NotNull b0 edge) {
        Intrinsics.checkNotNullParameter(edge, "edge");
        b0 b0VarG = edge.g();
        if (b0VarG == null) {
            throw new d("UpdateEdgeIntoAEL: invalid call");
        }
        b0 b0VarL = edge.l();
        b0 b0VarF = edge.f();
        b0VarG.C(edge.i());
        if (b0VarL != null) {
            b0VarL.z(b0VarG);
        } else {
            this.f312286f = b0VarG;
        }
        if (b0VarF != null) {
            b0VarF.F(b0VarG);
        }
        b0VarG.H(edge.n());
        b0VarG.K(edge.r());
        b0VarG.I(edge.p());
        b0VarG.J(edge.q());
        b0VarG.b().j(b0VarG.a());
        b0VarG.F(b0VarL);
        b0VarG.z(b0VarF);
        if (!b0VarG.u()) {
            r(b0VarG.o().f());
        }
        return b0VarG;
    }

    public final boolean a(@NotNull List<k> pg2, @NotNull z polyType, boolean z10) {
        boolean z11;
        Intrinsics.checkNotNullParameter(pg2, "pg");
        Intrinsics.checkNotNullParameter(polyType, "polyType");
        if (!z10 && polyType == z.Clip) {
            throw new d("AddPath: Open paths must be subject.");
        }
        int size = pg2.size() - 1;
        if (z10) {
            while (size > 0 && Intrinsics.areEqual(pg2.get(size), pg2.get(0))) {
                size--;
            }
        }
        while (size > 0 && Intrinsics.areEqual(pg2.get(size), pg2.get(size - 1))) {
            size--;
        }
        if ((z10 && size < 2) || (!z10 && size < 1)) {
            return false;
        }
        ArrayList arrayList = new ArrayList(size + 1);
        IntIterator it = new IntRange(0, size).iterator();
        while (it.hasNext()) {
            it.next().intValue();
            arrayList.add(new b0());
        }
        ((b0) arrayList.get(1)).b().j(pg2.get(1));
        w(pg2.get(0), new t0(this) { // from class: klipper.c.a
            @Override // kotlin.jvm.internal.t0, kotlin.reflect.p
            @Nullable
            public Object get() {
                return Boolean.valueOf(((c) this.receiver).p());
            }

            @Override // kotlin.jvm.internal.t0, kotlin.reflect.k
            public void set(@Nullable Object obj) {
                ((c) this.receiver).H(((Boolean) obj).booleanValue());
            }
        });
        w(pg2.get(size), new t0(this) { // from class: klipper.c.b
            @Override // kotlin.jvm.internal.t0, kotlin.reflect.p
            @Nullable
            public Object get() {
                return Boolean.valueOf(((c) this.receiver).p());
            }

            @Override // kotlin.jvm.internal.t0, kotlin.reflect.k
            public void set(@Nullable Object obj) {
                ((c) this.receiver).H(((Boolean) obj).booleanValue());
            }
        });
        ((b0) arrayList.get(0)).t((b0) arrayList.get(1), (b0) arrayList.get(size), pg2.get(0));
        int i10 = size - 1;
        ((b0) arrayList.get(size)).t((b0) arrayList.get(0), (b0) arrayList.get(i10), pg2.get(size));
        IntIterator it2 = kotlin.ranges.r.k0(i10, 1).iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            w(pg2.get(iIntValue), new t0(this) { // from class: klipper.c.c
                @Override // kotlin.jvm.internal.t0, kotlin.reflect.p
                @Nullable
                public Object get() {
                    return Boolean.valueOf(((c) this.receiver).p());
                }

                @Override // kotlin.jvm.internal.t0, kotlin.reflect.k
                public void set(@Nullable Object obj) {
                    ((c) this.receiver).H(((Boolean) obj).booleanValue());
                }
            });
            ((b0) arrayList.get(iIntValue)).t((b0) arrayList.get(iIntValue + 1), (b0) arrayList.get(iIntValue - 1), pg2.get(iIntValue));
        }
        b0 b0VarE = (b0) arrayList.get(0);
        b0 b0VarE2 = b0VarE;
        b0 b0VarK = b0VarE2;
        while (true) {
            if (Intrinsics.areEqual(b0VarE.b(), b0VarE.e().b()) && (z10 || !Intrinsics.areEqual(b0VarE.e(), b0VarE2))) {
                if (Intrinsics.areEqual(b0VarE, b0VarE.e())) {
                    break;
                }
                if (Intrinsics.areEqual(b0VarE, b0VarE2)) {
                    b0VarE2 = b0VarE.e();
                }
                b0VarK = x(b0VarE);
                b0VarE = b0VarK;
            } else {
                if (Intrinsics.areEqual(b0VarE.k(), b0VarE.e())) {
                    break;
                }
                if (z10 && q.P(b0VarE.k().b(), b0VarE.b(), b0VarE.e().b(), this.f312287g) && (!this.f312289i || !q.H(b0VarE.k().b(), b0VarE.b(), b0VarE.e().b()))) {
                    if (Intrinsics.areEqual(b0VarE, b0VarE2)) {
                        b0VarE2 = b0VarE.e();
                    }
                    b0VarK = x(b0VarE).k();
                    b0VarE = b0VarK;
                } else {
                    b0VarE = b0VarE.e();
                    if (Intrinsics.areEqual(b0VarE, b0VarK) || (!z10 && Intrinsics.areEqual(b0VarE.e(), b0VarE2))) {
                        break;
                    }
                }
            }
        }
        if ((!z10 && Intrinsics.areEqual(b0VarE, b0VarE.e())) || (z10 && Intrinsics.areEqual(b0VarE.k(), b0VarE.e()))) {
            return false;
        }
        if (!z10) {
            this.f312288h = true;
            b0VarE2.k().C(-2);
        }
        b0 b0VarE3 = b0VarE2;
        boolean z12 = true;
        do {
            b0VarE3.s(polyType);
            b0VarE3 = b0VarE3.e();
            if (z12 && b0VarE3.b().f() != b0VarE2.b().f()) {
                z12 = false;
            }
        } while (!Intrinsics.areEqual(b0VarE3, b0VarE2));
        if (!z12) {
            this.f312283c.add(arrayList);
            if (Intrinsics.areEqual(b0VarE3.k().a(), b0VarE3.k().o())) {
                b0VarE3 = b0VarE3.e();
            }
            b0 b0Var = null;
            while (true) {
                b0 b0VarG = g(b0VarE3);
                if (Intrinsics.areEqual(b0VarG, b0Var)) {
                    return true;
                }
                if (b0Var == null) {
                    b0Var = b0VarG;
                }
                r rVar = new r(0L, null, null, null, 15, null);
                rVar.l(null);
                rVar.n(b0VarG.a().f());
                if (b0VarG.d() < b0VarG.k().d()) {
                    rVar.k(b0VarG.k());
                    rVar.m(b0VarG);
                    z11 = false;
                } else {
                    rVar.k(b0VarG);
                    rVar.m(b0VarG.k());
                    z11 = true;
                }
                b0 b0VarG2 = rVar.g();
                Intrinsics.checkNotNull(b0VarG2);
                b0VarG2.H(h.Left);
                b0 b0VarI = rVar.i();
                Intrinsics.checkNotNull(b0VarI);
                b0VarI.H(h.Right);
                if (z10) {
                    b0 b0VarG3 = rVar.g();
                    Intrinsics.checkNotNull(b0VarG3);
                    if (Intrinsics.areEqual(b0VarG3.e(), rVar.i())) {
                        b0 b0VarG4 = rVar.g();
                        Intrinsics.checkNotNull(b0VarG4);
                        b0VarG4.K(-1);
                    } else {
                        b0 b0VarG5 = rVar.g();
                        Intrinsics.checkNotNull(b0VarG5);
                        b0VarG5.K(1);
                    }
                } else {
                    b0 b0VarG6 = rVar.g();
                    Intrinsics.checkNotNull(b0VarG6);
                    b0VarG6.K(0);
                }
                b0 b0VarI2 = rVar.i();
                Intrinsics.checkNotNull(b0VarI2);
                b0 b0VarG7 = rVar.g();
                Intrinsics.checkNotNull(b0VarG7);
                b0VarI2.K(-b0VarG7.r());
                b0 b0VarG8 = rVar.g();
                Intrinsics.checkNotNull(b0VarG8);
                b0 b0VarV = v(b0VarG8, z11);
                if (b0VarV.i() == -2) {
                    b0VarV = v(b0VarV, z11);
                }
                b0 b0VarI3 = rVar.i();
                Intrinsics.checkNotNull(b0VarI3);
                b0 b0VarV2 = v(b0VarI3, !z11);
                if (b0VarV2.i() == -2) {
                    b0VarV2 = v(b0VarV2, !z11);
                }
                b0 b0VarG9 = rVar.g();
                Intrinsics.checkNotNull(b0VarG9);
                if (-2 == b0VarG9.i()) {
                    rVar.k(null);
                } else {
                    b0 b0VarI4 = rVar.i();
                    Intrinsics.checkNotNull(b0VarI4);
                    if (-2 == b0VarI4.i()) {
                        rVar.m(null);
                    }
                }
                if (!z11) {
                    b0VarV = b0VarV2;
                }
                q(rVar);
                b0VarE3 = b0VarV;
            }
        } else {
            if (z10) {
                return false;
            }
            b0VarE3.k().C(-2);
            r rVar2 = new r(0L, null, null, null, 15, null);
            rVar2.l(null);
            rVar2.n(b0VarE3.a().f());
            rVar2.k(null);
            b0VarE3.H(h.Right);
            b0VarE3.K(0);
            rVar2.m(b0VarE3);
            while (true) {
                if (b0VarE3.a().e() != b0VarE3.k().o().e()) {
                    b0VarE3.v();
                }
                if (b0VarE3.e().i() == -2) {
                    q(rVar2);
                    this.f312283c.add(arrayList);
                    return true;
                }
                b0VarE3.A(b0VarE3.e());
                b0VarE3 = b0VarE3.e();
            }
        }
    }

    public final boolean b(@NotNull List<List<k>> ppg, @NotNull z polyType, boolean z10) {
        Intrinsics.checkNotNullParameter(ppg, "ppg");
        Intrinsics.checkNotNullParameter(polyType, "polyType");
        Iterator<List<k>> it = ppg.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (a(it.next(), polyType, z10)) {
                z11 = true;
            }
        }
        return z11;
    }

    public void c() {
        f();
        Iterator<List<b0>> it = this.f312283c.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @NotNull
    public final v d() {
        v vVar = new v();
        this.f312285e.add(vVar);
        vVar.m(this.f312285e.size() - 1);
        return vVar;
    }

    public final void e(@NotNull b0 e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        b0 b0VarL = e10.l();
        b0 b0VarF = e10.f();
        if (b0VarL == null && b0VarF == null && !Intrinsics.areEqual(e10, this.f312286f)) {
            return;
        }
        if (b0VarL != null) {
            b0VarL.z(b0VarF);
        } else {
            this.f312286f = b0VarF;
        }
        if (b0VarF != null) {
            b0VarF.F(b0VarL);
        }
        e10.z(null);
        e10.F(null);
    }

    @Nullable
    public final b0 h() {
        return this.f312286f;
    }

    @Nullable
    public final r i() {
        return this.f312282b;
    }

    @NotNull
    public final List<List<b0>> j() {
        return this.f312283c;
    }

    public final boolean k() {
        return this.f312288h;
    }

    @Nullable
    public final r l() {
        return this.f312281a;
    }

    @NotNull
    public final List<v> m() {
        return this.f312285e;
    }

    public final boolean n() {
        return this.f312289i;
    }

    @Nullable
    public final a0 o() {
        return this.f312284d;
    }

    public final boolean p() {
        return this.f312287g;
    }

    public final void r(long j10) {
        a0 a0Var = this.f312284d;
        if (a0Var == null) {
            this.f312284d = new a0(j10, null);
            return;
        }
        Intrinsics.checkNotNull(a0Var);
        if (j10 > a0Var.f()) {
            this.f312284d = new a0(j10, this.f312284d);
            return;
        }
        a0 a0VarE = this.f312284d;
        Intrinsics.checkNotNull(a0VarE);
        while (a0VarE.e() != null) {
            a0 a0VarE2 = a0VarE.e();
            Intrinsics.checkNotNull(a0VarE2);
            if (j10 > a0VarE2.f()) {
                break;
            }
            a0VarE = a0VarE.e();
            Intrinsics.checkNotNull(a0VarE);
        }
        if (j10 == a0VarE.f()) {
            return;
        }
        a0VarE.g(new a0(j10, a0VarE.e()));
    }

    public final boolean s() {
        return this.f312282b != null;
    }

    @Nullable
    public final r t(long j10) {
        r rVar = this.f312282b;
        if (rVar != null) {
            Intrinsics.checkNotNull(rVar);
            if (rVar.j() == j10) {
                r rVar2 = this.f312282b;
                Intrinsics.checkNotNull(rVar2);
                this.f312282b = rVar2.h();
                return rVar;
            }
        }
        return null;
    }

    @Nullable
    public final Long u() {
        a0 a0Var = this.f312284d;
        if (a0Var == null) {
            return null;
        }
        Intrinsics.checkNotNull(a0Var);
        long jF = a0Var.f();
        a0 a0Var2 = this.f312284d;
        Intrinsics.checkNotNull(a0Var2);
        this.f312284d = a0Var2.e();
        return Long.valueOf(jF);
    }

    public final void w(@NotNull k pt, @NotNull kotlin.reflect.k<Boolean> useFullRangeRef) throws d {
        Intrinsics.checkNotNullParameter(pt, "pt");
        Intrinsics.checkNotNullParameter(useFullRangeRef, "useFullRangeRef");
        if (useFullRangeRef.get().booleanValue()) {
            if (pt.e() > 4611686018427387903L || pt.f() > 4611686018427387903L || (-pt.e()) > 4611686018427387903L || (-pt.f()) > 4611686018427387903L) {
                throw new d("Coordinate outside allowed range");
            }
            return;
        }
        if (pt.e() > 1073741823 || pt.f() > 1073741823 || (-pt.e()) > 1073741823 || (-pt.f()) > 1073741823) {
            useFullRangeRef.set(Boolean.TRUE);
            w(pt, useFullRangeRef);
        }
    }

    @NotNull
    public final b0 x(@NotNull b0 e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        e10.k().y(e10.e());
        e10.e().E(e10.k());
        return e10.e();
    }

    public void y() {
        r rVarH = this.f312281a;
        this.f312282b = rVarH;
        if (rVarH == null) {
            return;
        }
        this.f312284d = null;
        while (rVarH != null) {
            r(rVarH.j());
            b0 b0VarG = rVarH.g();
            if (b0VarG != null) {
                b0VarG.b().j(b0VarG.a());
                b0VarG.C(-1);
            }
            b0 b0VarI = rVarH.i();
            if (b0VarI != null) {
                b0VarI.b().j(b0VarI.a());
                b0VarI.C(-1);
            }
            rVarH = rVarH.h();
        }
        this.f312286f = null;
    }

    public final void z(@Nullable b0 b0Var) {
        this.f312286f = b0Var;
    }
}
