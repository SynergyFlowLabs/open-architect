package klipper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final a f312244w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f312245x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f312246y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f312247z = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private klipper.a f312248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private s f312249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private b0 f312250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final List<m> f312251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private Comparator<m> f312252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f312253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private w f312254p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private w f312255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final List<o> f312256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final List<o> f312257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f312258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f312259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f312260v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: klipper.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C2247b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f312261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f312262b;

        static {
            int[] iArr = new int[w.values().length];
            iArr[w.EvenOdd.ordinal()] = 1;
            iArr[w.NonZero.ordinal()] = 2;
            iArr[w.Positive.ordinal()] = 3;
            iArr[w.Negative.ordinal()] = 4;
            f312261a = iArr;
            int[] iArr2 = new int[klipper.a.values().length];
            iArr2[klipper.a.Intersection.ordinal()] = 1;
            iArr2[klipper.a.Union.ordinal()] = 2;
            iArr2[klipper.a.Difference.ordinal()] = 3;
            iArr2[klipper.a.Xor.ordinal()] = 4;
            f312262b = iArr2;
        }
    }

    public b() {
        this(0, 1, null);
    }

    private final boolean C0(long j10, long j11, long j12, long j13) {
        if (j10 > j11) {
            j11 = j10;
            j10 = j11;
        }
        if (j12 <= j13) {
            j13 = j12;
            j12 = j13;
        }
        return j10 < j12 && j13 < j11;
    }

    private final void D0(b0 b0Var, b0 b0Var2) {
        b0 b0VarH = h();
        if (b0VarH == null) {
            b0Var.F(null);
            b0Var.z(null);
            z(b0Var);
            return;
        }
        if (b0Var2 == null && a0(b0VarH, b0Var)) {
            b0Var.F(null);
            b0Var.z(b0VarH);
            b0VarH.F(b0Var);
            z(b0Var);
            return;
        }
        if (b0Var2 == null) {
            b0Var2 = b0VarH;
        }
        while (true) {
            Intrinsics.checkNotNull(b0Var2);
            b0 b0VarF = b0Var2.f();
            if (!(b0VarF != null ? !a0(b0VarF, b0Var) : false)) {
                break;
            } else {
                b0Var2 = b0Var2.f();
            }
        }
        b0Var.z(b0Var2.f());
        b0 b0VarF2 = b0Var2.f();
        if (b0VarF2 != null) {
            b0VarF2.F(b0Var);
        }
        b0Var.F(b0Var2);
        b0Var2.z(b0Var);
    }

    private final void E0(long j10) {
        while (true) {
            r rVarT = t(j10);
            if (rVarT == null) {
                return;
            }
            Intrinsics.checkNotNull(rVarT);
            b0 b0VarG = rVarT.g();
            b0 b0VarI = rVarT.i();
            u uVarO = null;
            if (b0VarG == null) {
                Intrinsics.checkNotNull(b0VarI);
                D0(b0VarI, null);
                c1(b0VarI);
                if (I0(b0VarI)) {
                    uVarO = P(b0VarI, b0VarI.a());
                }
            } else if (b0VarI == null) {
                D0(b0VarG, null);
                c1(b0VarG);
                uVarO = I0(b0VarG) ? P(b0VarG, b0VarG.a()) : null;
                r(b0VarG.o().f());
            } else {
                D0(b0VarG, null);
                D0(b0VarI, b0VarG);
                c1(b0VarG);
                b0VarI.I(b0VarG.p());
                b0VarI.J(b0VarG.q());
                uVarO = I0(b0VarG) ? O(b0VarG, b0VarI, b0VarG.a()) : null;
                r(b0VarG.o().f());
            }
            u uVar = uVarO;
            if (b0VarI != null) {
                if (b0VarI.u()) {
                    b0 b0VarG2 = b0VarI.g();
                    if (b0VarG2 != null) {
                        r(b0VarG2.o().f());
                    }
                    K(b0VarI);
                } else {
                    r(b0VarI.o().f());
                }
            }
            if (b0VarG != null && b0VarI != null) {
                if (uVar != null && b0VarI.u() && !this.f312257s.isEmpty() && b0VarI.r() != 0) {
                    for (o oVar : this.f312257s) {
                        u uVarG = oVar.g();
                        Intrinsics.checkNotNull(uVarG);
                        if (C0(uVarG.h().e(), oVar.f().e(), b0VarI.a().e(), b0VarI.o().e())) {
                            M(oVar.g(), uVar, oVar.f());
                        }
                    }
                }
                b0 b0VarL = b0VarG.l();
                if (b0VarG.i() >= 0 && b0VarL != null && b0VarL.b().e() == b0VarG.a().e() && b0VarL.i() >= 0 && q.O(b0VarL.b(), b0VarL.o(), b0VarG.b(), b0VarG.o(), p()) && b0VarG.r() != 0 && b0VarL.r() != 0) {
                    M(uVar, P(b0VarL, b0VarG.a()), b0VarG.o());
                }
                if (!Intrinsics.areEqual(b0VarG.f(), b0VarI)) {
                    b0 b0VarL2 = b0VarI.l();
                    Intrinsics.checkNotNull(b0VarL2);
                    if (b0VarI.i() >= 0 && b0VarL2.i() >= 0 && q.O(b0VarL2.b(), b0VarL2.o(), b0VarI.b(), b0VarI.o(), p()) && b0VarI.r() != 0 && b0VarL2.r() != 0) {
                        M(uVar, P(b0VarL2, b0VarI.a()), b0VarI.o());
                    }
                    b0 b0VarF = b0VarG.f();
                    if (b0VarF != null) {
                        while (!Intrinsics.areEqual(b0VarF, b0VarI)) {
                            Intrinsics.checkNotNull(b0VarF);
                            G0(b0VarI, b0VarF, b0VarG.b());
                            b0VarF = b0VarF.f();
                        }
                    }
                }
            }
        }
    }

    private final void F0(long j10) {
        int i10 = 4 << 0;
        s sVar = new s(0L, null, null, 7, null);
        sVar.k(j10);
        s sVarF = this.f312249k;
        if (sVarF == null) {
            this.f312249k = sVar;
            return;
        }
        if (j10 < sVarF.h()) {
            sVar.i(sVarF);
            this.f312249k = sVar;
            return;
        }
        while (true) {
            Intrinsics.checkNotNull(sVarF);
            if (sVarF.f() == null) {
                break;
            }
            s sVarF2 = sVarF.f();
            Intrinsics.checkNotNull(sVarF2);
            if (j10 < sVarF2.h()) {
                break;
            } else {
                sVarF = sVarF.f();
            }
        }
        if (j10 == sVarF.h()) {
            return;
        }
        sVar.i(sVarF.f());
        sVar.j(sVarF);
        s sVarF3 = sVarF.f();
        if (sVarF3 != null) {
            sVarF3.j(sVar);
        }
        sVarF.i(sVar);
    }

    private final void G0(b0 b0Var, b0 b0Var2, k kVar) {
        w wVar;
        w wVar2;
        w wVar3;
        w wVar4;
        int iP;
        int iP2;
        int iQ;
        int iQ2;
        boolean z10 = b0Var.i() >= 0;
        boolean z11 = b0Var2.i() >= 0;
        if (b0Var.r() == 0 || b0Var2.r() == 0) {
            if (b0Var.r() == 0 && b0Var2.r() == 0) {
                return;
            }
            if (b0Var.j() == b0Var2.j() && b0Var.r() != b0Var2.r() && this.f312248j == klipper.a.Union) {
                if (b0Var.r() == 0) {
                    if (z11) {
                        P(b0Var, kVar);
                        if (z10) {
                            b0Var.C(-1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (z10) {
                    P(b0Var2, kVar);
                    if (z11) {
                        b0Var2.C(-1);
                        return;
                    }
                    return;
                }
                return;
            }
            if (b0Var.j() != b0Var2.j()) {
                if (b0Var.r() == 0 && Math.abs(b0Var2.p()) == 1 && (this.f312248j != klipper.a.Union || b0Var2.q() == 0)) {
                    P(b0Var, kVar);
                    if (z10) {
                        b0Var.C(-1);
                        return;
                    }
                    return;
                }
                if (b0Var2.r() == 0 && Math.abs(b0Var.p()) == 1) {
                    if (this.f312248j != klipper.a.Union || b0Var.q() == 0) {
                        P(b0Var2, kVar);
                        if (z11) {
                            b0Var2.C(-1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (b0Var.j() != b0Var2.j()) {
            if (K0(b0Var2)) {
                b0Var.J(b0Var.q() == 0 ? 1 : 0);
            } else {
                b0Var.J(b0Var.q() + b0Var2.r());
            }
            if (K0(b0Var)) {
                b0Var2.J(b0Var2.q() == 0 ? 1 : 0);
            } else {
                b0Var2.J(b0Var2.q() - b0Var.r());
            }
        } else if (K0(b0Var)) {
            int iP3 = b0Var.p();
            b0Var.I(b0Var2.p());
            b0Var2.I(iP3);
        } else {
            if (b0Var.p() + b0Var2.r() == 0) {
                b0Var.I(-b0Var.p());
            } else {
                b0Var.I(b0Var.p() + b0Var2.r());
            }
            if (b0Var2.p() - b0Var.r() == 0) {
                b0Var2.I(-b0Var2.p());
            } else {
                b0Var2.I(b0Var2.p() - b0Var.r());
            }
        }
        z zVarJ = b0Var.j();
        z zVar = z.Subject;
        if (zVarJ == zVar) {
            wVar = this.f312255q;
            wVar2 = this.f312254p;
        } else {
            wVar = this.f312254p;
            wVar2 = this.f312255q;
        }
        if (b0Var2.j() == zVar) {
            wVar3 = this.f312255q;
            wVar4 = this.f312254p;
        } else {
            wVar3 = this.f312254p;
            wVar4 = this.f312255q;
        }
        int i10 = wVar == null ? -1 : C2247b.f312261a[wVar.ordinal()];
        if (i10 != 3) {
            iP = i10 != 4 ? Math.abs(b0Var.p()) : -b0Var.p();
        } else {
            iP = b0Var.p();
        }
        int i11 = wVar3 == null ? -1 : C2247b.f312261a[wVar3.ordinal()];
        if (i11 != 3) {
            iP2 = i11 != 4 ? Math.abs(b0Var2.p()) : -b0Var2.p();
        } else {
            iP2 = b0Var2.p();
        }
        if (z10 && z11) {
            if ((iP != 0 && iP != 1) || ((iP2 != 0 && iP2 != 1) || (b0Var.j() != b0Var2.j() && this.f312248j != klipper.a.Xor))) {
                N(b0Var, b0Var2, kVar);
                return;
            }
            P(b0Var, kVar);
            P(b0Var2, kVar);
            q.T(b0Var, b0Var2);
            q.S(b0Var, b0Var2);
            return;
        }
        if (z10) {
            if (iP2 == 0 || iP2 == 1) {
                P(b0Var, kVar);
                q.T(b0Var, b0Var2);
                q.S(b0Var, b0Var2);
                return;
            }
            return;
        }
        if (z11) {
            if (iP == 0 || iP == 1) {
                P(b0Var2, kVar);
                q.T(b0Var, b0Var2);
                q.S(b0Var, b0Var2);
                return;
            }
            return;
        }
        if (iP == 0 || iP == 1) {
            if (iP2 == 0 || iP2 == 1) {
                int i12 = wVar2 == null ? -1 : C2247b.f312261a[wVar2.ordinal()];
                if (i12 != 3) {
                    iQ = i12 != 4 ? Math.abs(b0Var.q()) : -b0Var.q();
                } else {
                    iQ = b0Var.q();
                }
                int i13 = wVar4 == null ? -1 : C2247b.f312261a[wVar4.ordinal()];
                if (i13 != 3) {
                    iQ2 = i13 != 4 ? Math.abs(b0Var2.q()) : -b0Var2.q();
                } else {
                    iQ2 = b0Var2.q();
                }
                if (b0Var.j() != b0Var2.j()) {
                    O(b0Var, b0Var2, kVar);
                    return;
                }
                if (iP != 1 || iP2 != 1) {
                    q.T(b0Var, b0Var2);
                    return;
                }
                klipper.a aVar = this.f312248j;
                int i14 = aVar != null ? C2247b.f312262b[aVar.ordinal()] : -1;
                if (i14 == 1) {
                    if (iQ <= 0 || iQ2 <= 0) {
                        return;
                    }
                    O(b0Var, b0Var2, kVar);
                    return;
                }
                if (i14 == 2) {
                    if (iQ > 0 || iQ2 > 0) {
                        return;
                    }
                    O(b0Var, b0Var2, kVar);
                    return;
                }
                if (i14 != 3) {
                    if (i14 != 4) {
                        return;
                    }
                    O(b0Var, b0Var2, kVar);
                } else {
                    if ((b0Var.j() != z.Clip || iQ <= 0 || iQ2 <= 0) && (b0Var.j() != zVar || iQ > 0 || iQ2 > 0)) {
                        return;
                    }
                    O(b0Var, b0Var2, kVar);
                }
            }
        }
    }

    private final k H0(b0 b0Var, b0 b0Var2) {
        long J;
        long J2;
        k kVar = new k(0L, 0L, 3, null);
        if (b0Var.d() == b0Var2.d()) {
            kVar.l(b0Var.b().f());
            kVar.k(q.U(b0Var, kVar.f()));
            return kVar;
        }
        if (0 == b0Var.c().e()) {
            kVar.k(b0Var.a().e());
            if (b0Var2.u()) {
                J2 = b0Var2.a().f();
            } else {
                J2 = q.J((kVar.e() / b0Var2.d()) + (b0Var2.a().f() - (b0Var2.a().e() / b0Var2.d())));
            }
            kVar.l(J2);
        } else if (0 == b0Var2.c().e()) {
            kVar.k(b0Var2.a().e());
            if (b0Var.u()) {
                J = b0Var.a().f();
            } else {
                J = q.J((kVar.e() / b0Var.d()) + (b0Var.a().f() - (b0Var.a().e() / b0Var.d())));
            }
            kVar.l(J);
        } else {
            double dE = b0Var.a().e() - (b0Var.a().f() * b0Var.d());
            double dE2 = b0Var2.a().e() - (b0Var2.a().f() * b0Var2.d());
            double d10 = (dE2 - dE) / (b0Var.d() - b0Var2.d());
            kVar.l(q.J(d10));
            kVar.k(Math.abs(b0Var.d()) < Math.abs(b0Var2.d()) ? q.J((b0Var.d() * d10) + dE) : q.J((b0Var2.d() * d10) + dE2));
        }
        if (kVar.f() < b0Var.o().f() || kVar.f() < b0Var2.o().f()) {
            kVar.l((b0Var.o().f() > b0Var2.o().f() ? b0Var.o() : b0Var2.o()).f());
            double dAbs = Math.abs(b0Var.d());
            double dAbs2 = Math.abs(b0Var2.d());
            long jF = kVar.f();
            kVar.k(dAbs < dAbs2 ? q.U(b0Var, jF) : q.U(b0Var2, jF));
        }
        if (kVar.f() > b0Var.b().f()) {
            kVar.l(b0Var.b().f());
            kVar.k(Math.abs(b0Var.d()) > Math.abs(b0Var2.d()) ? q.U(b0Var2, kVar.f()) : q.U(b0Var, kVar.f()));
        }
        return kVar;
    }

    private final boolean I0(b0 b0Var) {
        w wVar;
        w wVar2;
        z zVarJ = b0Var.j();
        z zVar = z.Subject;
        if (zVarJ == zVar) {
            wVar = this.f312255q;
            Intrinsics.checkNotNull(wVar);
            wVar2 = this.f312254p;
            Intrinsics.checkNotNull(wVar2);
        } else {
            wVar = this.f312254p;
            Intrinsics.checkNotNull(wVar);
            wVar2 = this.f312255q;
            Intrinsics.checkNotNull(wVar2);
        }
        int[] iArr = C2247b.f312261a;
        int i10 = iArr[wVar.ordinal()];
        int i11 = 4 | (-1);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (b0Var.p() != -1) {
                        return false;
                    }
                } else if (b0Var.p() != 1) {
                    return false;
                }
            } else if (Math.abs(b0Var.p()) != 1) {
                return false;
            }
        } else if (b0Var.r() == 0 && b0Var.p() != 1) {
            return false;
        }
        klipper.a aVar = this.f312248j;
        int i12 = aVar != null ? C2247b.f312262b[aVar.ordinal()] : -1;
        if (i12 == 1) {
            int i13 = iArr[wVar2.ordinal()];
            if (i13 == 1 || i13 == 2) {
                return b0Var.q() != 0;
            }
            if (i13 != 3) {
                return b0Var.q() < 0;
            }
            return b0Var.q() > 0;
        }
        if (i12 == 2) {
            int i14 = iArr[wVar2.ordinal()];
            if (i14 == 1 || i14 == 2) {
                return b0Var.q() == 0;
            }
            if (i14 != 3) {
                return b0Var.q() >= 0;
            }
            return b0Var.q() <= 0;
        }
        if (i12 != 3) {
            if (i12 != 4 || b0Var.r() != 0) {
                return true;
            }
            int i15 = iArr[wVar2.ordinal()];
            if (i15 == 1 || i15 == 2) {
                return b0Var.q() == 0;
            }
            if (i15 != 3) {
                return b0Var.q() >= 0;
            }
            return b0Var.q() <= 0;
        }
        if (b0Var.j() == zVar) {
            int i16 = iArr[wVar2.ordinal()];
            if (i16 == 1 || i16 == 2) {
                return b0Var.q() == 0;
            }
            if (i16 != 3) {
                return b0Var.q() >= 0;
            }
            return b0Var.q() <= 0;
        }
        int i17 = iArr[wVar2.ordinal()];
        if (i17 == 1 || i17 == 2) {
            return b0Var.q() != 0;
        }
        if (i17 != 3) {
            return b0Var.q() < 0;
        }
        return b0Var.q() > 0;
    }

    private final boolean J0(b0 b0Var) {
        if (b0Var.j() == z.Subject) {
            return this.f312254p == w.EvenOdd;
        }
        return this.f312255q == w.EvenOdd;
    }

    private final void K(b0 b0Var) {
        b0 b0Var2 = this.f312250l;
        if (b0Var2 == null) {
            b0Var.G(null);
            b0Var.B(null);
        } else {
            b0Var.B(b0Var2);
            b0Var.G(null);
            b0Var2.G(b0Var);
        }
        this.f312250l = b0Var;
    }

    private final boolean K0(b0 b0Var) {
        if (b0Var.j() == z.Subject) {
            return this.f312255q == w.EvenOdd;
        }
        return this.f312254p == w.EvenOdd;
    }

    private final void L(u uVar, k kVar) {
        this.f312257s.add(new o(uVar, null, kVar, 2, null));
    }

    private final boolean L0(b0 b0Var, long j10) {
        return b0Var.o().f() == j10 && b0Var.g() != null;
    }

    private final void M(u uVar, u uVar2, k kVar) {
        this.f312256r.add(new o(uVar, uVar2, kVar));
    }

    private final boolean M0(b0 b0Var, long j10) {
        return b0Var != null && b0Var.o().f() == j10 && b0Var.g() == null;
    }

    private final void N(b0 b0Var, b0 b0Var2, k kVar) {
        P(b0Var, kVar);
        if (b0Var2.r() == 0) {
            P(b0Var2, kVar);
        }
        if (b0Var.i() == b0Var2.i()) {
            b0Var.C(-1);
            b0Var2.C(-1);
        } else if (b0Var.i() < b0Var2.i()) {
            Q(b0Var, b0Var2);
        } else {
            Q(b0Var2, b0Var);
        }
    }

    private final boolean N0(b0 b0Var) {
        return (b0Var == null || Intrinsics.areEqual(b0Var.k().g(), b0Var) || Intrinsics.areEqual(b0Var.e().g(), b0Var)) ? false : true;
    }

    private final u O(b0 b0Var, b0 b0Var2, k kVar) {
        u uVarP;
        b0 b0VarL;
        if (b0Var2.u() || b0Var.d() > b0Var2.d()) {
            uVarP = P(b0Var, kVar);
            b0Var2.C(b0Var.i());
            b0Var.H(h.Left);
            b0Var2.H(h.Right);
            b0 b0VarL2 = Intrinsics.areEqual(b0Var.l(), b0Var2) ? b0Var2.l() : b0Var.l();
            b0Var2 = b0Var;
            b0VarL = b0VarL2;
        } else {
            uVarP = P(b0Var2, kVar);
            b0Var.C(b0Var2.i());
            b0Var.H(h.Right);
            b0Var2.H(h.Left);
            b0VarL = Intrinsics.areEqual(b0Var2.l(), b0Var) ? b0Var.l() : b0Var2.l();
        }
        if (b0VarL != null && b0VarL.i() >= 0 && b0VarL.o().f() < kVar.f() && b0Var2.o().f() < kVar.f()) {
            long jU = q.U(b0VarL, kVar.f());
            long jU2 = q.U(b0Var2, kVar.f());
            if (jU == jU2 && b0Var2.r() != 0 && b0VarL.r() != 0 && q.O(new k(jU, kVar.f()), b0VarL.o(), new k(jU2, kVar.f()), b0Var2.o(), p())) {
                M(uVarP, P(b0VarL, kVar), b0Var2.o());
            }
        }
        return uVarP;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    private final void O0() {
        v vVarU0;
        u uVarF;
        u uVarF2;
        for (o oVar : this.f312256r) {
            u uVarG = oVar.g();
            Intrinsics.checkNotNull(uVarG);
            v vVarY0 = y0(uVarG.e());
            u uVarH = oVar.h();
            Intrinsics.checkNotNull(uVarH);
            v vVarY1 = y0(uVarH.e());
            if (vVarY0.f() != null && vVarY1.f() != null && !vVarY0.h() && !vVarY1.h()) {
                if (Intrinsics.areEqual(vVarY0, vVarY1)) {
                    vVarU0 = vVarY0;
                } else if (vVarY0.i(vVarY1)) {
                    vVarU0 = vVarY1;
                } else if (vVarY1.i(vVarY0)) {
                    vVarU0 = vVarY0;
                } else {
                    vVarU0 = u0(vVarY0, vVarY1);
                }
                if (Q0(oVar, vVarY0, vVarY1)) {
                    if (Intrinsics.areEqual(vVarY0, vVarY1)) {
                        vVarY0.p(oVar.g());
                        vVarY0.j(null);
                        v vVarD = d();
                        vVarD.p(oVar.h());
                        vVarD.q();
                        u uVarF3 = vVarY0.f();
                        Intrinsics.checkNotNull(uVarF3);
                        u uVarF4 = vVarD.f();
                        Intrinsics.checkNotNull(uVarF4);
                        if (uVarF3.c(uVarF4)) {
                            vVarD.l(!vVarY0.g());
                            vVarD.k(vVarY0);
                            if (this.f312258t) {
                                l0(vVarD, vVarY0);
                            }
                            if ((vVarD.g() ^ this.f312259u) == (vVarD.a() > 0.0d) && (uVarF = vVarD.f()) != null) {
                                uVarF.j();
                            }
                        } else {
                            u uVarF5 = vVarD.f();
                            Intrinsics.checkNotNull(uVarF5);
                            u uVarF6 = vVarY0.f();
                            Intrinsics.checkNotNull(uVarF6);
                            if (uVarF5.c(uVarF6)) {
                                vVarD.l(vVarY0.g());
                                vVarY0.l(!vVarD.g());
                                vVarD.k(vVarY0.c());
                                vVarY0.k(vVarD);
                                if (this.f312258t) {
                                    l0(vVarY0, vVarD);
                                }
                                if ((vVarY0.g() ^ this.f312259u) == (vVarY0.a() > 0.0d) && (uVarF2 = vVarY0.f()) != null) {
                                    uVarF2.j();
                                }
                            } else {
                                vVarD.l(vVarY0.g());
                                vVarD.k(vVarY0.c());
                                if (this.f312258t) {
                                    k0(vVarY0, vVarD);
                                }
                            }
                        }
                    } else {
                        vVarY1.p(null);
                        vVarY1.j(null);
                        vVarY1.m(vVarY0.d());
                        vVarY0.l(vVarU0.g());
                        if (Intrinsics.areEqual(vVarU0, vVarY1)) {
                            vVarY0.k(vVarY1.c());
                        }
                        vVarY1.k(vVarY0);
                        if (this.f312258t) {
                            m0(vVarY1, vVarY0);
                        }
                    }
                }
            }
        }
    }

    private final u P(b0 b0Var, k kVar) {
        if (b0Var.i() < 0) {
            v vVarD = d();
            vVarD.n(b0Var.r() == 0);
            u uVar = new u(vVarD.d(), kVar);
            uVar.l(uVar);
            uVar.m(uVar);
            vVarD.p(uVar);
            if (!vVarD.h()) {
                Y0(b0Var, vVarD);
            }
            b0Var.C(vVarD.d());
            return uVar;
        }
        v vVar = m().get(b0Var.i());
        u uVarF = vVar.f();
        Intrinsics.checkNotNull(uVarF);
        boolean z10 = b0Var.n() == h.Left;
        if (z10 && Intrinsics.areEqual(kVar, uVarF.h())) {
            return uVarF;
        }
        if (!z10 && Intrinsics.areEqual(kVar, uVarF.g().h())) {
            return uVarF.g();
        }
        u uVar2 = new u(vVar.d(), kVar);
        uVar2.l(uVarF);
        uVar2.m(uVarF.g());
        uVar2.g().l(uVar2);
        uVarF.m(uVar2);
        if (z10) {
            vVar.p(uVar2);
        }
        return uVar2;
    }

    private final void Q(b0 b0Var, b0 b0Var2) {
        v vVar = m().get(b0Var.i());
        v vVar2 = m().get(b0Var2.i());
        v vVarU0 = vVar.i(vVar2) ? vVar2 : vVar2.i(vVar) ? vVar : u0(vVar, vVar2);
        u uVarF = vVar.f();
        Intrinsics.checkNotNull(uVarF);
        u uVarG = uVarF.g();
        u uVarF2 = vVar2.f();
        Intrinsics.checkNotNull(uVarF2);
        u uVarG2 = uVarF2.g();
        h hVarN = b0Var.n();
        h hVar = h.Left;
        if (hVarN == hVar) {
            if (b0Var2.n() == hVar) {
                uVarF2.j();
                uVarF2.l(uVarF);
                uVarF.m(uVarF2);
                uVarG.l(uVarG2);
                uVarG2.m(uVarG);
                vVar.p(uVarG2);
            } else {
                uVarG2.l(uVarF);
                uVarF.m(uVarG2);
                uVarF2.m(uVarG);
                uVarG.l(uVarF2);
                vVar.p(uVarF2);
            }
        } else if (b0Var2.n() == h.Right) {
            uVarF2.j();
            uVarG.l(uVarG2);
            uVarG2.m(uVarG);
            uVarF2.l(uVarF);
            uVarF.m(uVarF2);
        } else {
            uVarG.l(uVarF2);
            uVarF2.m(uVarG);
            uVarF.m(uVarG2);
            uVarG2.l(uVarF);
        }
        vVar.j(null);
        if (Intrinsics.areEqual(vVarU0, vVar2)) {
            v vVarC = vVar2.c();
            if (!Intrinsics.areEqual(vVarC, vVar)) {
                vVar.k(vVarC);
            }
            vVar.l(vVar2.g());
        }
        vVar2.p(null);
        vVar2.j(null);
        vVar2.k(vVar);
        int i10 = b0Var.i();
        int i11 = b0Var2.i();
        b0Var.C(-1);
        b0Var2.C(-1);
        for (b0 b0VarH = h(); b0VarH != null; b0VarH = b0VarH.f()) {
            if (b0VarH.i() == i11) {
                b0VarH.C(i10);
                b0VarH.H(b0Var.n());
                break;
            }
        }
        vVar2.m(vVar.d());
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0266  */
    private final boolean Q0(o oVar, v vVar, v vVar2) {
        u uVarG = oVar.g();
        Intrinsics.checkNotNull(uVarG);
        u uVarH = oVar.h();
        Intrinsics.checkNotNull(uVarH);
        boolean z10 = true;
        boolean z11 = uVarG.h().f() == oVar.f().f();
        if (z11 && Intrinsics.areEqual(oVar.f(), uVarG.h()) && Intrinsics.areEqual(oVar.f(), uVarH.h())) {
            if (!Intrinsics.areEqual(vVar, vVar2)) {
                return false;
            }
            u uVarF = uVarG.f();
            while (!Intrinsics.areEqual(uVarF, uVarG) && Intrinsics.areEqual(uVarF.h(), oVar.f())) {
                uVarF = uVarF.f();
            }
            boolean z12 = uVarF.h().f() > oVar.f().f();
            u uVarF2 = uVarH.f();
            while (!Intrinsics.areEqual(uVarF2, uVarH) && Intrinsics.areEqual(uVarF2.h(), oVar.f())) {
                uVarF2 = uVarF2.f();
            }
            if (z12 == (uVarF2.h().f() > oVar.f().f())) {
                return false;
            }
            if (z12) {
                u uVarZ = Z(uVarG, false);
                u uVarZ2 = Z(uVarH, true);
                uVarG.m(uVarH);
                uVarH.l(uVarG);
                uVarZ.l(uVarZ2);
                uVarZ2.m(uVarZ);
                oVar.j(uVarG);
                oVar.k(uVarZ);
                return true;
            }
            u uVarZ3 = Z(uVarG, true);
            u uVarZ4 = Z(uVarH, false);
            uVarG.l(uVarH);
            uVarH.m(uVarG);
            uVarZ3.m(uVarZ4);
            uVarZ4.l(uVarZ3);
            oVar.j(uVarG);
            oVar.k(uVarZ3);
            return true;
        }
        if (!z11) {
            u uVarF3 = uVarG.f();
            while (Intrinsics.areEqual(uVarF3.h(), uVarG.h()) && !Intrinsics.areEqual(uVarF3, uVarG)) {
                uVarF3 = uVarF3.f();
            }
            boolean z13 = uVarF3.h().f() > uVarG.h().f() || !q.P(uVarG.h(), uVarF3.h(), oVar.f(), p());
            if (z13) {
                uVarF3 = uVarG.g();
                while (Intrinsics.areEqual(uVarF3.h(), uVarG.h()) && !Intrinsics.areEqual(uVarF3, uVarG)) {
                    uVarF3 = uVarF3.g();
                }
                if (uVarF3.h().f() > uVarG.h().f() || !q.P(uVarG.h(), uVarF3.h(), oVar.f(), p())) {
                    return false;
                }
            }
            u uVarF4 = uVarH.f();
            while (Intrinsics.areEqual(uVarF4.h(), uVarH.h()) && !Intrinsics.areEqual(uVarF4, uVarH)) {
                uVarF4 = uVarF4.f();
            }
            boolean z14 = uVarF4.h().f() > uVarH.h().f() || !q.P(uVarH.h(), uVarF4.h(), oVar.f(), p());
            if (z14) {
                uVarF4 = uVarH.g();
                while (Intrinsics.areEqual(uVarF4.h(), uVarH.h()) && !Intrinsics.areEqual(uVarF4, uVarH)) {
                    uVarF4 = uVarF4.g();
                }
                if (uVarF4.h().f() > uVarH.h().f() || !q.P(uVarH.h(), uVarF4.h(), oVar.f(), p())) {
                    return false;
                }
            }
            if (Intrinsics.areEqual(uVarF3, uVarG) || Intrinsics.areEqual(uVarF4, uVarH) || Intrinsics.areEqual(uVarF3, uVarF4) || (Intrinsics.areEqual(vVar, vVar2) && z13 == z14)) {
                return false;
            }
            if (z13) {
                u uVarZ5 = Z(uVarG, false);
                u uVarZ6 = Z(uVarH, true);
                uVarG.m(uVarH);
                uVarH.l(uVarG);
                uVarZ5.l(uVarZ6);
                uVarZ6.m(uVarZ5);
                oVar.j(uVarG);
                oVar.k(uVarZ5);
                return true;
            }
            u uVarZ7 = Z(uVarG, true);
            u uVarZ8 = Z(uVarH, false);
            uVarG.l(uVarH);
            uVarH.m(uVarG);
            uVarZ7.m(uVarZ8);
            uVarZ8.l(uVarZ7);
            oVar.j(uVarG);
            oVar.k(uVarZ7);
            return true;
        }
        u uVarG2 = uVarG;
        while (uVarG2.g().h().f() == uVarG2.h().f() && !Intrinsics.areEqual(uVarG2.g(), uVarG) && !Intrinsics.areEqual(uVarG2.g(), uVarH)) {
            uVarG2 = uVarG2.g();
        }
        u uVarF5 = uVarG;
        while (uVarF5.f().h().f() == uVarF5.h().f() && !Intrinsics.areEqual(uVarF5.f(), uVarG2) && !Intrinsics.areEqual(uVarF5.f(), uVarH)) {
            uVarF5 = uVarF5.f();
        }
        if (!Intrinsics.areEqual(uVarF5.f(), uVarG2) && !Intrinsics.areEqual(uVarF5.f(), uVarH)) {
            u uVarG3 = uVarH;
            while (uVarG3.g().h().f() == uVarG3.h().f() && !Intrinsics.areEqual(uVarG3.g(), uVarH) && !Intrinsics.areEqual(uVarG3.g(), uVarF5)) {
                uVarG3 = uVarG3.g();
            }
            u uVarF6 = uVarH;
            while (uVarF6.f().h().f() == uVarF6.h().f() && !Intrinsics.areEqual(uVarF6.f(), uVarG3) && !Intrinsics.areEqual(uVarF6.f(), uVarG2)) {
                uVarF6 = uVarF6.f();
            }
            if (!Intrinsics.areEqual(uVarF6.f(), uVarG3) && !Intrinsics.areEqual(uVarF6.f(), uVarG2)) {
                Pair<Long, Long> pairZ0 = z0(uVarG2.h().e(), uVarF5.h().e(), uVarG3.h().e(), uVarF6.h().e());
                long jLongValue = pairZ0.getFirst().longValue();
                long jLongValue2 = pairZ0.getSecond().longValue();
                if (jLongValue > jLongValue2) {
                    return false;
                }
                k kVar = new k(0L, 0L, 3, null);
                long jE = uVarG2.h().e();
                if (jLongValue > jE || jE > jLongValue2) {
                    long jE2 = uVarG3.h().e();
                    if (jLongValue > jE2 || jE2 > jLongValue2) {
                        long jE3 = uVarF5.h().e();
                        if (jLongValue > jE3 || jE3 > jLongValue2) {
                            kVar.j(uVarF6.h());
                            if (uVarF6.h().e() <= uVarG3.h().e()) {
                                z10 = false;
                            }
                        } else {
                            kVar.j(uVarF5.h());
                            if (uVarF5.h().e() <= uVarG2.h().e()) {
                                z10 = false;
                            }
                        }
                    } else {
                        kVar.j(uVarG3.h());
                        if (uVarG3.h().e() <= uVarF6.h().e()) {
                            z10 = false;
                        }
                    }
                } else {
                    kVar.j(uVarG2.h());
                    if (uVarG2.h().e() <= uVarF5.h().e()) {
                        z10 = false;
                    }
                }
                boolean z15 = z10;
                oVar.j(uVarG2);
                oVar.k(uVarG3);
                return P0(uVarG2, uVarF5, uVarG3, uVarF6, kVar, z15);
            }
        }
        return false;
    }

    private final void R(long j10) {
        boolean z10;
        if (h() == null) {
            return;
        }
        b0 b0VarH = h();
        this.f312250l = b0VarH;
        while (b0VarH != null) {
            b0VarH.G(b0VarH.l());
            b0VarH.B(b0VarH.f());
            b0VarH.b().k(q.U(b0VarH, j10));
            b0VarH = b0VarH.f();
        }
        for (boolean z11 = true; z11 && h() != null; z11 = z10) {
            b0 b0VarH2 = h();
            z10 = false;
            while (true) {
                Intrinsics.checkNotNull(b0VarH2);
                if (b0VarH2.h() == null) {
                    break;
                }
                b0 b0VarH3 = b0VarH2.h();
                Intrinsics.checkNotNull(b0VarH3);
                if (b0VarH2.b().e() > b0VarH3.b().e()) {
                    k kVarH0 = H0(b0VarH2, b0VarH3);
                    if (kVarH0.f() < j10) {
                        kVarH0 = new k(q.U(b0VarH2, j10), j10);
                    }
                    this.f312251m.add(new m(b0VarH2, b0VarH3, kVarH0));
                    d1(b0VarH2, b0VarH3);
                    z10 = true;
                } else {
                    b0VarH2 = b0VarH3;
                }
            }
            b0 b0VarM = b0VarH2.m();
            if (b0VarM == null) {
                break;
            }
            b0VarM.B(null);
        }
        this.f312250l = null;
    }

    private final int R0(u uVar) {
        int i10 = 0;
        if (uVar == null) {
            return 0;
        }
        u uVarF = uVar;
        do {
            i10++;
            uVarF = uVarF.f();
        } while (!Intrinsics.areEqual(uVarF, uVar));
        return i10;
    }

    private final void S(List<List<k>> list) {
        u uVarG;
        int iR0;
        list.clear();
        Iterator<v> it = m().iterator();
        while (it.hasNext()) {
            u uVarF = it.next().f();
            if (uVarF != null && (uVarG = uVarF.g()) != null && (iR0 = R0(uVarG)) >= 2) {
                List<k> listA = q.a(iR0);
                int i10 = iR0 - 1;
                if (i10 >= 0) {
                    int i11 = 0;
                    while (true) {
                        listA.add(uVarG.h());
                        uVarG = uVarG.g();
                        if (i11 == i10) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                list.add(listA);
            }
        }
    }

    private final void T(y yVar) {
        Unit unit;
        x xVarE;
        yVar.n();
        for (v vVar : m()) {
            int iR0 = R0(vVar.f());
            if (!vVar.h() || iR0 >= 2) {
                if (vVar.h() || iR0 >= 3) {
                    j0(vVar);
                    x xVar = new x(null, null);
                    yVar.o().add(xVar);
                    vVar.o(xVar);
                    u uVarF = vVar.f();
                    Intrinsics.checkNotNull(uVarF);
                    u uVarG = uVarF.g();
                    for (int i10 = 0; i10 < iR0; i10++) {
                        xVar.d().add(uVarG.h());
                        uVarG = uVarG.g();
                    }
                }
            }
        }
        for (v vVar2 : m()) {
            x xVarE2 = vVar2.e();
            if (xVarE2 != null) {
                if (vVar2.h()) {
                    xVarE2.l(true);
                    yVar.a(xVarE2);
                } else {
                    v vVarC = vVar2.c();
                    if (vVarC == null || (xVarE = vVarC.e()) == null) {
                        unit = null;
                    } else {
                        xVarE.a(xVarE2);
                        unit = Unit.f312394a;
                    }
                    if (unit == null) {
                        yVar.a(xVarE2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    private final void T0(long j10) throws d {
        b0 b0VarH = h();
        while (b0VarH != null) {
            boolean zM0 = M0(b0VarH, j10);
            if (zM0) {
                b0 b0VarW0 = w0(b0VarH);
                zM0 = b0VarW0 == null || !b0VarW0.u();
            }
            if (zM0) {
                if (this.f312260v) {
                    F0(b0VarH.o().e());
                }
                b0 b0VarL = b0VarH.l();
                X(b0VarH);
                b0VarH = b0VarL == null ? h() : b0VarL.f();
            } else {
                if (L0(b0VarH, j10)) {
                    b0 b0VarG = b0VarH.g();
                    Intrinsics.checkNotNull(b0VarG);
                    if (b0VarG.u()) {
                        b0VarH = J(b0VarH);
                        if (b0VarH.i() >= 0) {
                            P(b0VarH, b0VarH.a());
                        }
                        K(b0VarH);
                    } else {
                        b0VarH.b().k(q.U(b0VarH, j10));
                        b0VarH.b().l(j10);
                    }
                } else {
                    b0VarH.b().k(q.U(b0VarH, j10));
                    b0VarH.b().l(j10);
                }
                if (this.f312260v) {
                    b0 b0VarL2 = b0VarH.l();
                    if (b0VarH.i() >= 0 && b0VarH.r() != 0 && b0VarL2 != null && b0VarL2.i() >= 0 && b0VarL2.b().e() == b0VarH.b().e() && b0VarL2.r() != 0) {
                        k kVarB = b0VarH.b();
                        M(P(b0VarL2, kVarB), P(b0VarH, kVarB), kVarB);
                    }
                }
                b0VarH = b0VarH.f();
            }
        }
        V0();
        this.f312249k = null;
        b0 b0VarH2 = h();
        while (b0VarH2 != null) {
            if (L0(b0VarH2, j10)) {
                u uVarP = b0VarH2.i() >= 0 ? P(b0VarH2, b0VarH2.o()) : null;
                b0VarH2 = J(b0VarH2);
                b0 b0VarL3 = b0VarH2.l();
                b0 b0VarF = b0VarH2.f();
                if (b0VarL3 != null && b0VarL3.b().e() == b0VarH2.a().e() && b0VarL3.b().f() == b0VarH2.a().f() && uVarP != null && b0VarL3.i() >= 0 && b0VarL3.b().f() > b0VarL3.o().f() && q.O(b0VarH2.b(), b0VarH2.o(), b0VarL3.b(), b0VarL3.o(), p()) && b0VarH2.r() != 0 && b0VarL3.r() != 0) {
                    M(uVarP, P(b0VarL3, b0VarH2.a()), b0VarH2.o());
                } else if (b0VarF != null && b0VarF.b().e() == b0VarH2.a().e() && b0VarF.b().f() == b0VarH2.a().f() && uVarP != null && b0VarF.i() >= 0 && b0VarF.b().f() > b0VarF.o().f() && q.O(b0VarH2.b(), b0VarH2.o(), b0VarF.b(), b0VarF.o(), p()) && b0VarH2.r() != 0 && b0VarF.r() != 0) {
                    M(uVarP, P(b0VarF, b0VarH2.a()), b0VarH2.o());
                }
            }
            b0VarH2 = b0VarH2.f();
        }
    }

    private final void U() {
        b0 b0VarH = h();
        this.f312250l = b0VarH;
        while (b0VarH != null) {
            b0VarH.G(b0VarH.l());
            b0VarH.B(b0VarH.f());
            b0VarH = b0VarH.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    private final void U0(b0 b0Var) {
        s sVar;
        boolean z10;
        b0 b0Var2;
        s sVar2;
        boolean z11;
        b0 b0Var3;
        b0 b0Var4;
        boolean z12 = b0Var.r() == 0;
        j jVarR0 = r0(b0Var);
        f fVarF = jVarR0.f();
        long jG = jVarR0.g();
        long jH = jVarR0.h();
        b0 b0VarG = b0Var;
        while (true) {
            b0 b0VarG2 = b0VarG.g();
            if (!(b0VarG2 != null ? b0VarG2.u() : false)) {
                break;
            }
            b0VarG = b0VarG.g();
            Intrinsics.checkNotNull(b0VarG);
        }
        u uVar = null;
        b0 b0VarV0 = b0VarG.g() == null ? v0(b0VarG) : null;
        s sVarG = this.f312249k;
        if (sVarG != null) {
            if (fVarF == f.LeftToRight) {
                while (sVarG != null && sVarG.h() <= b0Var.a().e()) {
                    sVarG = sVarG.f();
                }
                if (sVarG != null && sVarG.h() >= b0VarG.o().e()) {
                    sVarG = null;
                }
            } else {
                while (true) {
                    Intrinsics.checkNotNull(sVarG);
                    s sVarF = sVarG.f();
                    if (!(sVarF != null && sVarF.h() < b0Var.a().e())) {
                        break;
                    } else {
                        sVarG = sVarG.f();
                    }
                }
                if (sVarG.h() <= b0VarG.o().e()) {
                    sVarG = null;
                }
            }
        }
        b0 b0VarJ = b0Var;
        f fVarF2 = fVarF;
        long jG2 = jG;
        long jH2 = jH;
        while (true) {
            boolean zAreEqual = Intrinsics.areEqual(b0VarJ, b0VarG);
            Intrinsics.checkNotNull(fVarF2);
            b0 b0VarX0 = x0(b0VarJ, fVarF2);
            while (b0VarX0 != null) {
                if (sVarG != null) {
                    if (fVarF2 == f.LeftToRight) {
                        while (sVarG != null && sVarG.h() < b0VarX0.b().e()) {
                            if (b0VarJ.i() >= 0 && !z12) {
                                P(b0VarJ, new k(sVarG.h(), b0VarJ.a().f()));
                            }
                            sVarG = sVarG.f();
                        }
                    } else {
                        while (sVarG != null && sVarG.h() > b0VarX0.b().e()) {
                            if (b0VarJ.i() >= 0 && !z12) {
                                P(b0VarJ, new k(sVarG.h(), b0VarJ.a().f()));
                            }
                            sVarG = sVarG.g();
                        }
                    }
                }
                s sVar3 = sVarG;
                if ((fVarF2 != f.LeftToRight || b0VarX0.b().e() <= jH2) && (fVarF2 != f.RightToLeft || b0VarX0.b().e() >= jG2)) {
                    if (b0VarX0.b().e() == b0VarJ.o().e()) {
                        b0 b0VarG3 = b0VarJ.g();
                        if (b0VarG3 != null && b0VarX0.d() < b0VarG3.d()) {
                        }
                    }
                    if (b0VarJ.i() < 0 || z12) {
                        sVar = sVar3;
                        z10 = z12;
                        b0Var2 = b0VarX0;
                    } else {
                        u uVarP = P(b0VarJ, b0VarX0.b());
                        b0 b0VarH = this.f312250l;
                        while (b0VarH != null) {
                            if (b0VarH.i() >= 0) {
                                sVar2 = sVar3;
                                b0Var4 = b0VarX0;
                                boolean z13 = z12;
                                b0Var3 = b0VarH;
                                z11 = z13;
                                if (C0(b0VarJ.a().e(), b0VarJ.o().e(), b0VarH.a().e(), b0VarH.o().e())) {
                                    M(t0(b0Var3), uVarP, b0Var3.o());
                                }
                            } else {
                                sVar2 = sVar3;
                                z11 = z12;
                                b0Var3 = b0VarH;
                                b0Var4 = b0VarX0;
                            }
                            b0VarH = b0Var3.h();
                            b0VarX0 = b0Var4;
                            z12 = z11;
                            sVar3 = sVar2;
                        }
                        sVar = sVar3;
                        z10 = z12;
                        b0Var2 = b0VarX0;
                        L(uVarP, b0VarJ.a());
                        uVar = uVarP;
                    }
                    if (Intrinsics.areEqual(b0Var2, b0VarV0) && zAreEqual) {
                        if (b0VarJ.i() >= 0) {
                            N(b0VarJ, b0VarV0, b0VarJ.o());
                        }
                        e(b0VarJ);
                        e(b0VarV0);
                        return;
                    }
                    if (fVarF2 == f.LeftToRight) {
                        G0(b0VarJ, b0Var2, new k(b0Var2.b().e(), b0VarJ.b().f()));
                    } else {
                        G0(b0Var2, b0VarJ, new k(b0Var2.b().e(), b0VarJ.b().f()));
                    }
                    b0VarX0 = x0(b0Var2, fVarF2);
                    I(b0VarJ, b0Var2);
                    sVarG = sVar;
                    z12 = z10;
                }
                sVarG = sVar3;
                break;
            }
            boolean z14 = z12;
            b0 b0VarG4 = b0VarJ.g();
            if (!(b0VarG4 != null ? b0VarG4.u() : false)) {
                if (b0VarJ.i() >= 0 && uVar == null) {
                    u uVarT0 = t0(b0VarJ);
                    for (b0 b0VarH2 = this.f312250l; b0VarH2 != null; b0VarH2 = b0VarH2.h()) {
                        if (b0VarH2.i() >= 0 && C0(b0VarJ.a().e(), b0VarJ.o().e(), b0VarH2.a().e(), b0VarH2.o().e())) {
                            M(t0(b0VarH2), uVarT0, b0VarH2.o());
                        }
                    }
                    L(uVarT0, b0VarJ.o());
                }
                if (b0VarJ.g() == null) {
                    if (b0VarJ.i() >= 0) {
                        P(b0VarJ, b0VarJ.o());
                    }
                    e(b0VarJ);
                    return;
                }
                if (b0VarJ.i() < 0) {
                    J(b0VarJ);
                    return;
                }
                u uVarP2 = P(b0VarJ, b0VarJ.o());
                b0 b0VarJ2 = J(b0VarJ);
                if (b0VarJ2.r() == 0) {
                    return;
                }
                b0 b0VarL = b0VarJ2.l();
                b0 b0VarF = b0VarJ2.f();
                if (b0VarL != null && b0VarL.b().e() == b0VarJ2.a().e() && b0VarL.b().f() == b0VarJ2.a().f() && b0VarL.r() != 0 && b0VarL.i() >= 0 && b0VarL.b().f() > b0VarL.o().f() && q.Q(b0VarJ2, b0VarL, p())) {
                    M(uVarP2, P(b0VarL, b0VarJ2.a()), b0VarJ2.o());
                    return;
                }
                if (b0VarF == null || b0VarF.b().e() != b0VarJ2.a().e() || b0VarF.b().f() != b0VarJ2.a().f() || b0VarF.r() == 0 || b0VarF.i() < 0 || b0VarF.b().f() <= b0VarF.o().f() || !q.Q(b0VarJ2, b0VarF, p())) {
                    return;
                }
                M(uVarP2, P(b0VarF, b0VarJ2.a()), b0VarJ2.o());
                return;
            }
            b0VarJ = J(b0VarJ);
            if (b0VarJ.i() >= 0) {
                P(b0VarJ, b0VarJ.a());
            }
            j jVarR1 = r0(b0VarJ);
            fVarF2 = jVarR1.f();
            jG2 = jVarR1.g();
            jH2 = jVarR1.h();
            z12 = z14;
        }
    }

    private final void V(b0 b0Var) {
        b0 b0VarM = b0Var.m();
        b0 b0VarH = b0Var.h();
        if (b0VarM == null && b0VarH == null && !Intrinsics.areEqual(b0Var, this.f312250l)) {
            return;
        }
        if (b0VarM != null) {
            b0VarM.B(b0VarH);
        } else {
            this.f312250l = b0VarH;
        }
        if (b0VarH != null) {
            b0VarH.G(b0VarM);
        }
        b0Var.B(null);
        b0Var.G(null);
    }

    private final void V0() {
        Unit unit;
        b0 b0Var = null;
        while (true) {
            b0 b0VarS0 = S0();
            if (b0VarS0 != null) {
                unit = Unit.f312394a;
            } else {
                b0VarS0 = b0Var;
                unit = null;
            }
            if (unit == null) {
                return;
            }
            Intrinsics.checkNotNull(b0VarS0);
            U0(b0VarS0);
            b0Var = b0VarS0;
        }
    }

    private final void W() {
        m().clear();
    }

    private final void W0() {
        for (m mVar : this.f312251m) {
            G0(mVar.a(), mVar.b(), mVar.c());
            I(mVar.a(), mVar.b());
        }
        this.f312251m.clear();
    }

    private final void X(b0 b0Var) throws d {
        b0 b0VarW0 = w0(b0Var);
        if (b0VarW0 == null) {
            if (b0Var.i() >= 0) {
                P(b0Var, b0Var.o());
            }
            e(b0Var);
            return;
        }
        b0 b0VarF = b0Var.f();
        while (b0VarF != null && !Intrinsics.areEqual(b0VarF, b0VarW0)) {
            G0(b0Var, b0VarF, b0Var.o());
            I(b0Var, b0VarF);
            b0VarF = b0Var.f();
        }
        if (b0Var.i() == -1 && b0VarW0.i() == -1) {
            e(b0Var);
            e(b0VarW0);
            return;
        }
        if (b0Var.i() >= 0 && b0VarW0.i() >= 0) {
            if (b0Var.i() >= 0) {
                N(b0Var, b0VarW0, b0Var.o());
            }
            e(b0Var);
            e(b0VarW0);
            return;
        }
        if (b0Var.r() != 0) {
            throw new d("DoMaxima error");
        }
        if (b0Var.i() >= 0) {
            P(b0Var, b0Var.o());
            b0Var.C(-1);
        }
        e(b0Var);
        if (b0VarW0.i() >= 0) {
            P(b0VarW0, b0Var.o());
            b0VarW0.C(-1);
        }
        e(b0VarW0);
    }

    private final boolean X0(long j10) throws d {
        if (h() == null) {
            return true;
        }
        try {
            R(j10);
            if (this.f312251m.isEmpty()) {
                return true;
            }
            if (this.f312251m.size() != 1 && !n0()) {
                return false;
            }
            W0();
            this.f312250l = null;
            return true;
        } catch (Exception unused) {
            this.f312250l = null;
            this.f312251m.clear();
            throw new d("ProcessIntersections error");
        }
    }

    private final void Y() {
        int i10 = 0;
        while (i10 < m().size()) {
            v vVar = m().get(i10);
            i10++;
            u uVarF = vVar.f();
            if (uVarF != null && !vVar.h()) {
                do {
                    Intrinsics.checkNotNull(uVarF);
                    u uVarF2 = uVarF.f();
                    while (!Intrinsics.areEqual(uVarF2, vVar.f())) {
                        if (Intrinsics.areEqual(uVarF.h(), uVarF2.h()) && !Intrinsics.areEqual(uVarF2.f(), uVarF) && !Intrinsics.areEqual(uVarF2.g(), uVarF)) {
                            u uVarG = uVarF.g();
                            u uVarG2 = uVarF2.g();
                            uVarF.m(uVarG2);
                            uVarG2.l(uVarF);
                            uVarF2.m(uVarG);
                            uVarG.l(uVarF2);
                            vVar.p(uVarF);
                            v vVarD = d();
                            vVarD.p(uVarF2);
                            vVarD.q();
                            u uVarF3 = vVar.f();
                            Intrinsics.checkNotNull(uVarF3);
                            u uVarF4 = vVarD.f();
                            Intrinsics.checkNotNull(uVarF4);
                            if (uVarF3.c(uVarF4)) {
                                vVarD.l(!vVar.g());
                                vVarD.k(vVar);
                                if (this.f312258t) {
                                    l0(vVarD, vVar);
                                }
                            } else {
                                u uVarF5 = vVarD.f();
                                Intrinsics.checkNotNull(uVarF5);
                                u uVarF6 = vVar.f();
                                Intrinsics.checkNotNull(uVarF6);
                                if (uVarF5.c(uVarF6)) {
                                    vVarD.l(vVar.g());
                                    vVar.l(!vVarD.g());
                                    vVarD.k(vVar.c());
                                    vVar.k(vVarD);
                                    if (this.f312258t) {
                                        l0(vVar, vVarD);
                                    }
                                } else {
                                    vVarD.l(vVar.g());
                                    vVarD.k(vVar.c());
                                    if (this.f312258t) {
                                        k0(vVar, vVarD);
                                    }
                                }
                            }
                            uVarF2 = uVarF;
                        }
                        uVarF2 = uVarF2.f();
                    }
                    uVarF = uVarF.f();
                } while (!Intrinsics.areEqual(uVarF, vVar.f()));
            }
        }
    }

    private final void Y0(b0 b0Var, v vVar) {
        b0 b0Var2 = null;
        for (b0 b0VarL = b0Var.l(); b0VarL != null; b0VarL = b0VarL.l()) {
            if (b0VarL.i() >= 0 && b0VarL.r() != 0) {
                if (b0Var2 == null) {
                    b0Var2 = b0VarL;
                } else if (b0Var2.i() == b0VarL.i()) {
                    b0Var2 = null;
                }
            }
        }
        if (b0Var2 == null) {
            vVar.k(null);
            vVar.l(false);
        } else {
            v vVar2 = m().get(b0Var2.i());
            vVar.k(vVar2);
            vVar.l(!vVar2.g());
        }
    }

    private final boolean a0(b0 b0Var, b0 b0Var2) {
        if (b0Var2.b().e() != b0Var.b().e()) {
            return b0Var2.b().e() < b0Var.b().e();
        }
        if (b0Var2.o().f() > b0Var.o().f()) {
            return b0Var2.o().e() < q.U(b0Var, b0Var2.o().f());
        }
        return b0Var.o().e() > q.U(b0Var2, b0Var.o().f());
    }

    private final void c1(b0 b0Var) {
        int iP;
        int iR;
        int iP2;
        b0 b0VarF;
        int iR2;
        b0 b0VarL = b0Var.l();
        while (b0VarL != null && (b0VarL.j() != b0Var.j() || b0VarL.r() == 0)) {
            b0VarL = b0VarL.l();
        }
        if (b0VarL == null) {
            b0Var.I(b0Var.r() == 0 ? (b0Var.j() == z.Subject ? this.f312255q : this.f312254p) == w.Negative ? -1 : 1 : b0Var.r());
            b0Var.J(0);
            b0VarF = h();
        } else if (b0Var.r() == 0 && this.f312248j != klipper.a.Union) {
            b0Var.I(1);
            b0Var.J(b0VarL.q());
            b0VarF = b0VarL.f();
        } else if (K0(b0Var)) {
            if (b0Var.r() == 0) {
                boolean z10 = true;
                for (b0 b0VarL2 = b0VarL.l(); b0VarL2 != null; b0VarL2 = b0VarL2.l()) {
                    if (b0VarL2.j() == b0VarL.j() && b0VarL2.r() != 0) {
                        z10 = !z10;
                    }
                }
                iR2 = z10 ? 0 : 1;
            } else {
                iR2 = b0Var.r();
            }
            b0Var.I(iR2);
            b0Var.J(b0VarL.q());
            b0VarF = b0VarL.f();
        } else {
            if (b0VarL.p() * b0VarL.r() < 0) {
                if (Math.abs(b0VarL.p()) <= 1) {
                    iP2 = b0Var.r() == 0 ? 1 : b0Var.r();
                } else if (b0VarL.r() * b0Var.r() < 0) {
                    iP2 = b0VarL.p();
                } else {
                    iP = b0VarL.p();
                    iR = b0Var.r();
                    iP2 = iP + iR;
                }
            } else if (b0Var.r() == 0) {
                iP2 = b0VarL.p() < 0 ? b0VarL.p() - 1 : b0VarL.p() + 1;
            } else if (b0VarL.r() * b0Var.r() < 0) {
                iP2 = b0VarL.p();
            } else {
                iP = b0VarL.p();
                iR = b0Var.r();
                iP2 = iP + iR;
            }
            b0Var.I(iP2);
            b0Var.J(b0VarL.q());
            b0VarF = b0VarL.f();
        }
        if (J0(b0Var)) {
            while (!Intrinsics.areEqual(b0VarF, b0Var)) {
                Intrinsics.checkNotNull(b0VarF);
                if (b0VarF.r() != 0) {
                    b0Var.J(b0Var.q() == 0 ? 1 : 0);
                }
                b0VarF = b0VarF.f();
            }
            return;
        }
        while (!Intrinsics.areEqual(b0VarF, b0Var)) {
            int iQ = b0Var.q();
            Intrinsics.checkNotNull(b0VarF);
            b0Var.J(iQ + b0VarF.r());
            b0VarF = b0VarF.f();
        }
    }

    private final void d1(b0 b0Var, b0 b0Var2) {
        if (b0Var.h() == null && b0Var.m() == null) {
            return;
        }
        if (b0Var2.h() == null && b0Var2.m() == null) {
            return;
        }
        if (Intrinsics.areEqual(b0Var.h(), b0Var2)) {
            b0 b0VarH = b0Var2.h();
            if (b0VarH != null) {
                b0VarH.G(b0Var);
            }
            b0 b0VarM = b0Var.m();
            if (b0VarM != null) {
                b0VarM.B(b0Var2);
            }
            b0Var2.G(b0VarM);
            b0Var2.B(b0Var);
            b0Var.G(b0Var2);
            b0Var.B(b0VarH);
        } else if (Intrinsics.areEqual(b0Var2.h(), b0Var)) {
            b0 b0VarH2 = b0Var.h();
            if (b0VarH2 != null) {
                b0VarH2.G(b0Var2);
            }
            b0 b0VarM2 = b0Var2.m();
            if (b0VarM2 != null) {
                b0VarM2.B(b0Var);
            }
            b0Var.G(b0VarM2);
            b0Var.B(b0Var2);
            b0Var2.G(b0Var);
            b0Var2.B(b0VarH2);
        } else {
            b0 b0VarH3 = b0Var.h();
            b0 b0VarM3 = b0Var.m();
            b0Var.B(b0Var2.h());
            b0 b0VarH4 = b0Var.h();
            if (b0VarH4 != null) {
                b0VarH4.G(b0Var);
            }
            b0Var.G(b0Var2.m());
            b0 b0VarM4 = b0Var.m();
            if (b0VarM4 != null) {
                b0VarM4.B(b0Var);
            }
            b0Var2.B(b0VarH3);
            b0 b0VarH5 = b0Var2.h();
            if (b0VarH5 != null) {
                b0VarH5.G(b0Var2);
            }
            b0Var2.G(b0VarM3);
            b0 b0VarM5 = b0Var2.m();
            if (b0VarM5 != null) {
                b0VarM5.B(b0Var2);
            }
        }
        if (b0Var.m() == null) {
            this.f312250l = b0Var;
        } else if (b0Var2.m() == null) {
            this.f312250l = b0Var2;
        }
    }

    public static /* synthetic */ boolean f0(b bVar, klipper.a aVar, List list, w wVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            wVar = w.EvenOdd;
        }
        return bVar.b0(aVar, list, wVar);
    }

    public static /* synthetic */ boolean g0(b bVar, klipper.a aVar, y yVar, w wVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            wVar = w.EvenOdd;
        }
        return bVar.d0(aVar, yVar, wVar);
    }

    private final boolean h0() {
        Unit unit;
        u uVarF;
        try {
            y();
            this.f312250l = null;
            this.f312249k = null;
            i1.g gVar = new i1.g();
            i1.g gVar2 = new i1.g();
            Long lU = u();
            if (lU != null) {
                long jLongValue = lU.longValue();
                gVar.f312750a = jLongValue;
                E0(jLongValue);
                while (true) {
                    Long lU2 = u();
                    if (lU2 != null) {
                        gVar2.f312750a = lU2.longValue();
                        unit = Unit.f312394a;
                    } else {
                        unit = null;
                    }
                    if (unit == null && !s()) {
                        Iterator<v> it = m().iterator();
                        while (true) {
                            boolean z10 = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            v next = it.next();
                            if (next.f() != null && !next.h()) {
                                boolean zG = next.g() ^ this.f312259u;
                                if (next.a() <= 0.0d) {
                                    z10 = false;
                                }
                                if (zG == z10 && (uVarF = next.f()) != null) {
                                    uVarF.j();
                                }
                            }
                        }
                        O0();
                        for (v vVar : m()) {
                            if (vVar.f() != null) {
                                if (vVar.h()) {
                                    p0(vVar);
                                } else {
                                    o0(vVar);
                                }
                            }
                        }
                        if (this.f312260v) {
                            Y();
                        }
                        this.f312256r.clear();
                        this.f312257s.clear();
                        return true;
                    }
                    V0();
                    this.f312257s.clear();
                    if (X0(gVar2.f312750a)) {
                        T0(gVar2.f312750a);
                        long j10 = gVar2.f312750a;
                        gVar.f312750a = j10;
                        E0(j10);
                    }
                }
            }
            this.f312256r.clear();
            this.f312257s.clear();
            return false;
        } catch (Throwable th2) {
            this.f312256r.clear();
            this.f312257s.clear();
            throw th2;
        }
    }

    private final boolean i0(u uVar, u uVar2) {
        u uVarG = uVar.g();
        while (Intrinsics.areEqual(uVarG.h(), uVar.h()) && !Intrinsics.areEqual(uVarG, uVar)) {
            uVarG = uVarG.g();
        }
        double dAbs = Math.abs(q.u(uVar.h(), uVarG.h()));
        u uVarF = uVar.f();
        while (Intrinsics.areEqual(uVarF.h(), uVar.h()) && !Intrinsics.areEqual(uVarF, uVar)) {
            uVarF = uVarF.f();
        }
        double dAbs2 = Math.abs(q.u(uVar.h(), uVarF.h()));
        u uVarG2 = uVar2.g();
        while (Intrinsics.areEqual(uVarG2.h(), uVar2.h()) && !Intrinsics.areEqual(uVarG2, uVar2)) {
            uVarG2 = uVarG2.g();
        }
        double dAbs3 = Math.abs(q.u(uVar2.h(), uVarG2.h()));
        u uVarF2 = uVar2.f();
        while (Intrinsics.areEqual(uVarF2.h(), uVar2.h()) && !Intrinsics.areEqual(uVarF2, uVar2)) {
            uVarF2 = uVarF2.f();
        }
        double dAbs4 = Math.abs(q.u(uVar2.h(), uVarF2.h()));
        if (Math.max(dAbs, dAbs2) == Math.max(dAbs3, dAbs4) && Math.min(dAbs, dAbs2) == Math.min(dAbs3, dAbs4)) {
            return uVar.a() > 0.0d;
        }
        return (dAbs >= dAbs3 && dAbs >= dAbs4) || (dAbs2 >= dAbs3 && dAbs2 >= dAbs4);
    }

    private final void k0(v vVar, v vVar2) {
        for (v vVar3 : m()) {
            v vVarF = q.F(vVar3.c());
            if (vVar3.f() != null && Intrinsics.areEqual(vVarF, vVar)) {
                u uVarF = vVar2.f();
                Intrinsics.checkNotNull(uVarF);
                u uVarF2 = vVar3.f();
                Intrinsics.checkNotNull(uVarF2);
                if (uVarF.c(uVarF2)) {
                    vVar3.k(vVar2);
                }
            }
        }
    }

    private final void l0(v vVar, v vVar2) {
        v vVarC = vVar2.c();
        for (v vVar3 : m()) {
            if (vVar3.f() != null && !Intrinsics.areEqual(vVar3, vVar2) && !Intrinsics.areEqual(vVar3, vVar)) {
                v vVarF = q.F(vVar3.c());
                if (Intrinsics.areEqual(vVarF, vVarC) || Intrinsics.areEqual(vVarF, vVar) || Intrinsics.areEqual(vVarF, vVar2)) {
                    u uVarF = vVar.f();
                    Intrinsics.checkNotNull(uVarF);
                    u uVarF2 = vVar3.f();
                    Intrinsics.checkNotNull(uVarF2);
                    if (uVarF.c(uVarF2)) {
                        vVar3.k(vVar);
                    } else {
                        u uVarF3 = vVar2.f();
                        Intrinsics.checkNotNull(uVarF3);
                        u uVarF4 = vVar3.f();
                        Intrinsics.checkNotNull(uVarF4);
                        if (uVarF3.c(uVarF4)) {
                            vVar3.k(vVar2);
                        } else if (Intrinsics.areEqual(vVar3.c(), vVar) || Intrinsics.areEqual(vVar3.c(), vVar2)) {
                            vVar3.k(vVarC);
                        }
                    }
                }
            }
        }
    }

    private final void m0(v vVar, v vVar2) {
        for (v vVar3 : m()) {
            v vVarF = q.F(vVar3.c());
            if (vVar3.f() != null && Intrinsics.areEqual(vVarF, vVar)) {
                vVar3.k(vVar2);
            }
        }
    }

    private final boolean n0() {
        CollectionsKt.sortWith(this.f312251m, this.f312252n);
        U();
        int size = this.f312251m.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!q.v(this.f312251m.get(i10))) {
                int i11 = i10 + 1;
                while (i11 < size && !q.v(this.f312251m.get(i11))) {
                    i11++;
                }
                if (i11 == size) {
                    return false;
                }
                m mVar = this.f312251m.get(i10);
                List<m> list = this.f312251m;
                list.set(i10, list.get(i11));
                this.f312251m.set(i11, mVar);
            }
            d1(this.f312251m.get(i10).a(), this.f312251m.get(i10).b());
        }
        return true;
    }

    private final void o0(v vVar) {
        vVar.j(null);
        u uVarF = vVar.f();
        Intrinsics.checkNotNull(uVarF);
        boolean z10 = n() || this.f312260v;
        loop0: while (true) {
            u uVar = null;
            while (!Intrinsics.areEqual(uVarF.g(), uVarF) && !Intrinsics.areEqual(uVarF.g(), uVarF.f())) {
                if (!Intrinsics.areEqual(uVarF.h(), uVarF.f().h()) && !Intrinsics.areEqual(uVarF.h(), uVarF.g().h()) && (!q.P(uVarF.g().h(), uVarF.h(), uVarF.f().h(), p()) || (z10 && q.H(uVarF.g().h(), uVarF.h(), uVarF.f().h())))) {
                    if (Intrinsics.areEqual(uVarF, uVar)) {
                        vVar.p(uVarF);
                        return;
                    } else {
                        if (uVar == null) {
                            uVar = uVarF;
                        }
                        uVarF = uVarF.f();
                    }
                }
                uVarF.g().l(uVarF.f());
                uVarF.f().m(uVarF.g());
                uVarF = uVarF.g();
            }
        }
        vVar.p(null);
    }

    private final void p0(v vVar) {
        u uVarF = vVar.f();
        Intrinsics.checkNotNull(uVarF);
        u uVarG = uVarF.g();
        while (!Intrinsics.areEqual(uVarF, uVarG)) {
            uVarF = uVarF.f();
            if (Intrinsics.areEqual(uVarF.h(), uVarF.g().h())) {
                if (Intrinsics.areEqual(uVarF, uVarG)) {
                    uVarG = uVarF.g();
                }
                u uVarG2 = uVarF.g();
                uVarG2.l(uVarF.f());
                uVarF.f().m(uVarG2);
                uVarF = uVarG2;
            }
        }
        if (Intrinsics.areEqual(uVarF, uVarF.g())) {
            vVar.p(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    private final u q0(u uVar) {
        u uVarF = uVar.f();
        u uVarF2 = null;
        while (!Intrinsics.areEqual(uVarF, uVar)) {
            if (uVarF.h().f() > uVar.h().f()) {
                uVar = uVarF;
                uVarF2 = null;
            } else if (uVarF.h().f() == uVar.h().f() && uVarF.h().e() <= uVar.h().e()) {
                if (uVarF.h().e() < uVar.h().e()) {
                    uVar = uVarF;
                    uVarF2 = null;
                } else if (!Intrinsics.areEqual(uVarF.f(), uVar) && !Intrinsics.areEqual(uVarF.g(), uVar)) {
                    uVarF2 = uVarF;
                }
            }
            uVarF = uVarF.f();
        }
        if (uVarF2 != null) {
            while (!Intrinsics.areEqual(uVarF2, uVarF)) {
                if (!i0(uVarF, uVarF2)) {
                    uVar = uVarF2;
                }
                uVarF2 = uVarF2.f();
                while (true) {
                    Intrinsics.checkNotNull(uVarF2);
                    if (!Intrinsics.areEqual(uVarF2.h(), uVar.h())) {
                        uVarF2 = uVarF2.f();
                    }
                }
            }
        }
        return uVar;
    }

    private final u t0(b0 b0Var) {
        if (b0Var.n() == h.Left) {
            u uVarF = m().get(b0Var.i()).f();
            Intrinsics.checkNotNull(uVarF);
            return uVarF;
        }
        u uVarF2 = m().get(b0Var.i()).f();
        Intrinsics.checkNotNull(uVarF2);
        return uVarF2.g();
    }

    private final v u0(v vVar, v vVar2) {
        if (vVar.b() == null) {
            u uVarF = vVar.f();
            Intrinsics.checkNotNull(uVarF);
            vVar.j(q0(uVarF));
        }
        if (vVar2.b() == null) {
            u uVarF2 = vVar2.f();
            Intrinsics.checkNotNull(uVarF2);
            vVar2.j(q0(uVarF2));
        }
        u uVarB = vVar.b();
        Intrinsics.checkNotNull(uVarB);
        u uVarB2 = vVar2.b();
        Intrinsics.checkNotNull(uVarB2);
        return (uVarB.h().f() <= uVarB2.h().f() && (uVarB.h().f() < uVarB2.h().f() || (uVarB.h().e() >= uVarB2.h().e() && (uVarB.h().e() > uVarB2.h().e() || Intrinsics.areEqual(uVarB.f(), uVarB) || !(Intrinsics.areEqual(uVarB2.f(), uVarB2) || i0(uVarB, uVarB2)))))) ? vVar2 : vVar;
    }

    private final b0 x0(b0 b0Var, f fVar) {
        return fVar == f.LeftToRight ? b0Var.f() : b0Var.l();
    }

    private final v y0(int i10) {
        v vVar = m().get(i10);
        while (!Intrinsics.areEqual(vVar, m().get(vVar.d()))) {
            vVar = m().get(vVar.d());
        }
        return vVar;
    }

    public final boolean A0() {
        return this.f312259u;
    }

    public final boolean B0() {
        return this.f312260v;
    }

    public final boolean P0(@NotNull u point1a, @NotNull u point1b, @NotNull u point2a, @NotNull u point2b, @NotNull k pt, boolean z10) {
        u uVarZ;
        u uVarZ2;
        u uVarZ3;
        u uVarZ4;
        Intrinsics.checkNotNullParameter(point1a, "point1a");
        Intrinsics.checkNotNullParameter(point1b, "point1b");
        Intrinsics.checkNotNullParameter(point2a, "point2a");
        Intrinsics.checkNotNullParameter(point2b, "point2b");
        Intrinsics.checkNotNullParameter(pt, "pt");
        f fVar = point1a.h().e() > point1b.h().e() ? f.RightToLeft : f.LeftToRight;
        f fVar2 = point2a.h().e() > point2b.h().e() ? f.RightToLeft : f.LeftToRight;
        if (fVar == fVar2) {
            return false;
        }
        if (fVar == f.LeftToRight) {
            while (point1a.f().h().e() <= pt.e() && point1a.f().h().e() >= point1a.h().e() && point1a.f().h().f() == pt.f()) {
                point1a = point1a.f();
            }
            if (z10 && point1a.h().e() != pt.e()) {
                point1a = point1a.f();
            }
            uVarZ = Z(point1a, !z10);
            if (!Intrinsics.areEqual(uVarZ.h(), pt)) {
                uVarZ.h().j(pt);
                uVarZ2 = Z(uVarZ, !z10);
                u uVar = uVarZ;
                uVarZ = uVarZ2;
                point1a = uVar;
            }
        } else {
            while (point1a.f().h().e() >= pt.e() && point1a.f().h().e() <= point1a.h().e() && point1a.f().h().f() == pt.f()) {
                point1a = point1a.f();
            }
            if (!z10 && point1a.h().e() != pt.e()) {
                point1a = point1a.f();
            }
            uVarZ = Z(point1a, z10);
            if (!Intrinsics.areEqual(uVarZ.h(), pt)) {
                uVarZ.h().j(pt);
                uVarZ2 = Z(uVarZ, z10);
                u uVar2 = uVarZ;
                uVarZ = uVarZ2;
                point1a = uVar2;
            }
        }
        if (fVar2 == f.LeftToRight) {
            while (point2a.f().h().e() <= pt.e() && point2a.f().h().e() >= point2a.h().e() && point2a.f().h().f() == pt.f()) {
                point2a = point2a.f();
            }
            if (z10 && point2a.h().e() != pt.e()) {
                point2a = point2a.f();
            }
            uVarZ3 = Z(point2a, !z10);
            if (!Intrinsics.areEqual(uVarZ3.h(), pt)) {
                uVarZ3.h().j(pt);
                uVarZ4 = Z(uVarZ3, !z10);
                point2a = uVarZ3;
                uVarZ3 = uVarZ4;
            }
        } else {
            while (point2a.f().h().e() >= pt.e() && point2a.f().h().e() <= point2a.h().e() && point2a.f().h().f() == pt.f()) {
                point2a = point2a.f();
            }
            if (!z10 && point2a.h().e() != pt.e()) {
                point2a = point2a.f();
            }
            uVarZ3 = Z(point2a, z10);
            if (!Intrinsics.areEqual(uVarZ3.h(), pt)) {
                uVarZ3.h().j(pt);
                uVarZ4 = Z(uVarZ3, z10);
                point2a = uVarZ3;
                uVarZ3 = uVarZ4;
            }
        }
        if ((fVar == f.LeftToRight) == z10) {
            point1a.m(point2a);
            point2a.l(point1a);
            uVarZ.l(uVarZ3);
            uVarZ3.m(uVarZ);
        } else {
            point1a.l(point2a);
            point2a.m(point1a);
            uVarZ.m(uVarZ3);
            uVarZ3.l(uVarZ);
        }
        return true;
    }

    @Nullable
    public final b0 S0() {
        b0 b0Var = this.f312250l;
        if (b0Var == null) {
            return null;
        }
        b0 b0VarH = b0Var.h();
        this.f312250l = b0VarH;
        if (b0VarH != null) {
            b0VarH.G(null);
        }
        b0Var.B(null);
        b0Var.G(null);
        return b0Var;
    }

    @NotNull
    public final u Z(@NotNull u outPt, boolean z10) {
        Intrinsics.checkNotNullParameter(outPt, "outPt");
        u uVar = new u(outPt.e(), outPt.h());
        if (z10) {
            uVar.l(outPt.f());
            uVar.m(outPt);
            outPt.f().m(uVar);
            outPt.l(uVar);
            return uVar;
        }
        uVar.m(outPt.g());
        uVar.l(outPt);
        outPt.g().l(uVar);
        outPt.m(uVar);
        return uVar;
    }

    public final void Z0(@NotNull Comparator<m> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "<set-?>");
        this.f312252n = comparator;
    }

    public final void a1(boolean z10) {
        this.f312259u = z10;
    }

    public final boolean b0(@NotNull klipper.a clipType, @NotNull List<List<k>> solution, @NotNull w fillType) {
        Intrinsics.checkNotNullParameter(clipType, "clipType");
        Intrinsics.checkNotNullParameter(solution, "solution");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        return c0(clipType, solution, fillType, fillType);
    }

    public final void b1(boolean z10) {
        this.f312260v = z10;
    }

    public final boolean c0(@NotNull klipper.a clipType, @NotNull List<List<k>> solution, @NotNull w subjFillType, @NotNull w clipFillType) {
        Intrinsics.checkNotNullParameter(clipType, "clipType");
        Intrinsics.checkNotNullParameter(solution, "solution");
        Intrinsics.checkNotNullParameter(subjFillType, "subjFillType");
        Intrinsics.checkNotNullParameter(clipFillType, "clipFillType");
        if (this.f312253o) {
            return false;
        }
        if (k()) {
            throw new d("Error: PolyTree struct is needed for open path clipping.");
        }
        this.f312253o = true;
        solution.clear();
        this.f312255q = subjFillType;
        this.f312254p = clipFillType;
        this.f312248j = clipType;
        this.f312258t = false;
        try {
            boolean zH0 = h0();
            if (zH0) {
                S(solution);
            }
            W();
            this.f312253o = false;
            return zH0;
        } catch (Throwable th2) {
            W();
            this.f312253o = false;
            throw th2;
        }
    }

    public final boolean d0(@NotNull klipper.a clipType, @NotNull y polyTree, @NotNull w fillType) {
        Intrinsics.checkNotNullParameter(clipType, "clipType");
        Intrinsics.checkNotNullParameter(polyTree, "polyTree");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        return e0(clipType, polyTree, fillType, fillType);
    }

    public final boolean e0(@NotNull klipper.a clipType, @NotNull y polytree, @NotNull w subjFillType, @NotNull w clipFillType) {
        Intrinsics.checkNotNullParameter(clipType, "clipType");
        Intrinsics.checkNotNullParameter(polytree, "polytree");
        Intrinsics.checkNotNullParameter(subjFillType, "subjFillType");
        Intrinsics.checkNotNullParameter(clipFillType, "clipFillType");
        if (this.f312253o) {
            return false;
        }
        this.f312253o = true;
        this.f312255q = subjFillType;
        this.f312254p = clipFillType;
        this.f312248j = clipType;
        this.f312258t = true;
        try {
            boolean zH0 = h0();
            if (zH0) {
                T(polytree);
            }
            W();
            this.f312253o = false;
            return zH0;
        } catch (Throwable th2) {
            W();
            this.f312253o = false;
            throw th2;
        }
    }

    public final void j0(@NotNull v outRec) {
        Intrinsics.checkNotNullParameter(outRec, "outRec");
        v vVarC = outRec.c();
        if (vVarC != null) {
            if (outRec.g() == vVarC.g() || vVarC.f() == null) {
                while (vVarC != null && (vVarC.g() == outRec.g() || vVarC.f() == null)) {
                    vVarC = vVarC.c();
                }
                outRec.k(vVarC);
            }
        }
    }

    @NotNull
    public final j r0(@NotNull b0 horzEdge) {
        Intrinsics.checkNotNullParameter(horzEdge, "horzEdge");
        return horzEdge.a().e() < horzEdge.o().e() ? new j(horzEdge.a().e(), horzEdge.o().e(), f.LeftToRight) : new j(horzEdge.o().e(), horzEdge.a().e(), f.RightToLeft);
    }

    @NotNull
    public final Comparator<m> s0() {
        return this.f312252n;
    }

    @Nullable
    public final b0 v0(@NotNull b0 e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (Intrinsics.areEqual(e10.e().o(), e10.o()) && e10.e().g() == null) {
            return e10.e();
        }
        if (Intrinsics.areEqual(e10.k().o(), e10.o()) && e10.k().g() == null) {
            return e10.k();
        }
        return null;
    }

    @Nullable
    public final b0 w0(@NotNull b0 e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        b0 b0VarV0 = v0(e10);
        if (b0VarV0 == null || b0VarV0.i() == -2 || (Intrinsics.areEqual(b0VarV0.f(), b0VarV0.l()) && !b0VarV0.u())) {
            return null;
        }
        return b0VarV0;
    }

    @NotNull
    public final Pair<Long, Long> z0(long j10, long j11, long j12, long j13) {
        long jMax;
        long jMin;
        long jMin2;
        long jMax2;
        if (j10 >= j11) {
            if (j12 < j13) {
                jMax = Math.max(j11, j12);
                jMin = Math.min(j10, j13);
            } else {
                jMax = Math.max(j11, j13);
                jMin = Math.min(j10, j12);
            }
            jMin2 = jMin;
            jMax2 = jMax;
        } else if (j12 < j13) {
            jMax2 = Math.max(j10, j12);
            jMin2 = Math.min(j11, j13);
        } else {
            jMax2 = Math.max(j10, j13);
            jMin2 = Math.min(j11, j12);
        }
        return new Pair<>(Long.valueOf(jMax2), Long.valueOf(jMin2));
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public b(int i10) {
        this.f312251m = new ArrayList();
        this.f312252n = n.f312334a;
        this.f312256r = new ArrayList();
        this.f312257s = new ArrayList();
        this.f312259u = (i10 & 1) != 0;
        this.f312260v = (i10 & 2) != 0;
        F((i10 & 4) != 0);
    }
}
