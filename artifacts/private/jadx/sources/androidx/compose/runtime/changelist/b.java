package androidx.compose.runtime.changelist;

import androidx.compose.runtime.h3;
import androidx.compose.runtime.i0;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.internal.j0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.m7;
import androidx.compose.runtime.n5;
import androidx.compose.runtime.o0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.p2;
import androidx.compose.runtime.s4;
import androidx.compose.runtime.v5;
import androidx.compose.runtime.w5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposerChangeListWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Stack.kt\nandroidx/compose/runtime/IntStack\n*L\n1#1,476:1\n4788#2,4:477\n4788#2,4:481\n4788#2,4:485\n4788#2,4:490\n82#3:489\n*S KotlinDebug\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n*L\n162#1:477,4\n251#1:481,4\n309#1:485,4\n448#1:490,4\n448#1:489\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f35427m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f35428n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f35429o = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f35430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.changelist.a f35431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35432c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35436g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35441l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p2 f35433d = new p2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35434e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList<Object> f35437h = m7.d(null, 1, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35438i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35439j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35440k = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(@NotNull i0 i0Var, @NotNull androidx.compose.runtime.changelist.a aVar) {
        this.f35430a = i0Var;
        this.f35431b = aVar;
    }

    private final void D() {
        E();
    }

    private final void E() {
        int i10 = this.f35436g;
        if (i10 > 0) {
            this.f35431b.O(i10);
            this.f35436g = 0;
        }
        if (m7.j(this.f35437h)) {
            this.f35431b.n(m7.o(this.f35437h));
            m7.b(this.f35437h);
        }
    }

    private final void F() {
        L(this, false, 1, null);
        N();
    }

    private final void G(boolean z10) {
        K(z10);
    }

    static /* synthetic */ void H(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.G(z10);
    }

    private final void I(int i10, int i11, int i12) {
        D();
        this.f35431b.z(i10, i11, i12);
    }

    private final void J() {
        int i10 = this.f35441l;
        if (i10 > 0) {
            int i11 = this.f35438i;
            if (i11 >= 0) {
                M(i11, i10);
                this.f35438i = -1;
            } else {
                I(this.f35440k, this.f35439j, i10);
                this.f35439j = -1;
                this.f35440k = -1;
            }
            this.f35441l = 0;
        }
    }

    private final void K(boolean z10) {
        int iZ = z10 ? s().z() : s().m();
        int i10 = iZ - this.f35435f;
        if (!(i10 >= 0)) {
            m0.y("Tried to seek backward");
        }
        if (i10 > 0) {
            this.f35431b.h(i10);
            this.f35435f = iZ;
        }
    }

    static /* synthetic */ void L(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.K(z10);
    }

    private final void M(int i10, int i11) {
        D();
        this.f35431b.E(i10, i11);
    }

    private final void m(androidx.compose.runtime.g gVar) {
        H(this, false, 1, null);
        this.f35431b.s(gVar);
        this.f35432c = true;
    }

    private final void n() {
        if (this.f35432c || !this.f35434e) {
            return;
        }
        H(this, false, 1, null);
        this.f35431b.t();
        this.f35432c = true;
    }

    private final v5 s() {
        return this.f35430a.u1();
    }

    public static /* synthetic */ void u(b bVar, androidx.compose.runtime.changelist.a aVar, j0 j0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j0Var = null;
        }
        bVar.t(aVar, j0Var);
    }

    public final void A(int i10) {
        this.f35435f += i10 - s().m();
    }

    public final void B(int i10) {
        this.f35435f = i10;
    }

    public final void C() {
        J();
        if (m7.j(this.f35437h)) {
            m7.m(this.f35437h);
        } else {
            this.f35436g++;
        }
    }

    public final void N() {
        v5 v5VarS;
        int iZ;
        if (s().C() <= 0 || this.f35433d.i(-2) == (iZ = (v5VarS = s()).z())) {
            return;
        }
        n();
        if (iZ > 0) {
            androidx.compose.runtime.g gVarA = v5VarS.a(iZ);
            this.f35433d.k(iZ);
            m(gVarA);
        }
    }

    public final void O() {
        E();
        if (this.f35432c) {
            Z();
            l();
        }
    }

    public final void P(@NotNull l1 l1Var, @NotNull p0 p0Var, @NotNull i3 i3Var) {
        this.f35431b.A(l1Var, p0Var, i3Var);
    }

    public final void Q(@NotNull n5 n5Var) {
        this.f35431b.B(n5Var);
    }

    public final void R(@NotNull s4 s4Var) {
        this.f35431b.C(s4Var);
    }

    public final void S() {
        F();
        this.f35431b.D();
        this.f35435f += s().s();
    }

    public final void T(int i10, int i11) {
        boolean z10;
        if (i11 > 0) {
            if (i10 >= 0) {
                z10 = true;
                int i12 = 4 & 1;
            } else {
                z10 = false;
            }
            if (!z10) {
                m0.y("Invalid remove index " + i10);
            }
            if (this.f35438i == i10) {
                this.f35441l += i11;
                return;
            }
            J();
            this.f35438i = i10;
            this.f35441l = i11;
        }
    }

    public final void U() {
        this.f35431b.F();
    }

    public final void V() {
        this.f35432c = false;
        this.f35433d.a();
        this.f35435f = 0;
        this.f35434e = true;
        this.f35436g = 0;
        m7.b(this.f35437h);
        this.f35438i = -1;
        this.f35439j = -1;
        this.f35440k = -1;
        this.f35441l = 0;
    }

    public final void W(@NotNull androidx.compose.runtime.changelist.a aVar) {
        this.f35431b = aVar;
    }

    public final void X(boolean z10) {
        this.f35434e = z10;
    }

    public final void Y(@NotNull Function0<Unit> function0) {
        this.f35431b.G(function0);
    }

    public final void Z() {
        this.f35431b.H();
    }

    public final void a(@NotNull androidx.compose.runtime.g gVar, @Nullable Object obj) {
        this.f35431b.i(gVar, obj);
    }

    public final void a0(@NotNull s4 s4Var) {
        this.f35431b.I(s4Var);
    }

    public final void b(@NotNull List<? extends Object> list, @NotNull j0 j0Var) {
        this.f35431b.j(list, j0Var);
    }

    public final void b0(int i10) {
        if (i10 > 0) {
            F();
            this.f35431b.J(i10);
        }
    }

    public final void c(@Nullable h3 h3Var, @NotNull p0 p0Var, @NotNull i3 i3Var, @NotNull i3 i3Var2) {
        this.f35431b.k(h3Var, p0Var, i3Var, i3Var2);
    }

    public final void c0(@Nullable Object obj, @NotNull androidx.compose.runtime.g gVar, int i10) {
        this.f35431b.K(obj, gVar, i10);
    }

    public final void d() {
        H(this, false, 1, null);
        this.f35431b.l();
    }

    public final void d0(@Nullable Object obj) {
        H(this, false, 1, null);
        this.f35431b.L(obj);
    }

    public final void e(@NotNull j0 j0Var, @NotNull androidx.compose.runtime.g gVar) {
        E();
        this.f35431b.m(j0Var, gVar);
    }

    public final <T, V> void e0(V v10, @NotNull Function2<? super T, ? super V, Unit> function2) {
        D();
        this.f35431b.M(v10, function2);
    }

    public final void f(@NotNull Function1<? super o0, Unit> function1, @NotNull o0 o0Var) {
        this.f35431b.o(function1, o0Var);
    }

    public final void f0(@Nullable Object obj, int i10) {
        G(true);
        this.f35431b.N(obj, i10);
    }

    public final void g() {
        int iZ = s().z();
        if (!(this.f35433d.i(-1) <= iZ)) {
            m0.y("Missed recording an endGroup");
        }
        if (this.f35433d.i(-1) == iZ) {
            H(this, false, 1, null);
            this.f35433d.j();
            this.f35431b.p();
        }
    }

    public final void g0(@Nullable Object obj) {
        D();
        this.f35431b.P(obj);
    }

    public final void h() {
        this.f35431b.q();
        this.f35435f = 0;
    }

    public final void h0(@NotNull androidx.compose.runtime.changelist.a aVar, @NotNull Function0<Unit> function0) {
        androidx.compose.runtime.changelist.a aVarP = p();
        try {
            W(aVar);
            function0.invoke();
            h0.d(1);
            W(aVarP);
        } finally {
            h0.d(1);
            W(aVarP);
            h0.c(1);
        }
    }

    public final void i() {
        J();
    }

    public final void i0(@NotNull Function0<Unit> function0) {
        boolean zQ = q();
        try {
            X(false);
            function0.invoke();
        } finally {
            h0.d(1);
            X(zQ);
            h0.c(1);
        }
    }

    public final void j(int i10, int i11) {
        i();
        E();
        int iV = s().R(i11) ? 1 : s().V(i11);
        if (iV > 0) {
            T(i10, iV);
        }
    }

    public final void k(@NotNull s4 s4Var) {
        this.f35431b.r(s4Var);
    }

    public final void l() {
        if (this.f35432c) {
            H(this, false, 1, null);
            H(this, false, 1, null);
            this.f35431b.p();
            this.f35432c = false;
        }
    }

    public final void o() {
        E();
        if (this.f35433d.f36312b == 0) {
            return;
        }
        m0.y("Missed recording an endGroup()");
    }

    @NotNull
    public final androidx.compose.runtime.changelist.a p() {
        return this.f35431b;
    }

    public final boolean q() {
        return this.f35434e;
    }

    public final boolean r() {
        if (s().z() - this.f35435f >= 0) {
            return false;
        }
        int i10 = 3 & 1;
        return true;
    }

    public final void t(@NotNull androidx.compose.runtime.changelist.a aVar, @Nullable j0 j0Var) {
        this.f35431b.u(aVar, j0Var);
    }

    public final void v(@NotNull androidx.compose.runtime.g gVar, @NotNull w5 w5Var) {
        E();
        F();
        J();
        this.f35431b.w(gVar, w5Var);
    }

    public final void w(@NotNull androidx.compose.runtime.g gVar, @NotNull w5 w5Var, @NotNull c cVar) {
        E();
        F();
        J();
        this.f35431b.x(gVar, w5Var, cVar);
    }

    public final void x(int i10) {
        F();
        this.f35431b.y(i10);
    }

    public final void y(@Nullable Object obj) {
        J();
        m7.n(this.f35437h, obj);
    }

    public final void z(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f35441l;
            if (i13 > 0 && this.f35439j == i10 - i13 && this.f35440k == i11 - i13) {
                this.f35441l = i13 + i12;
                return;
            }
            J();
            this.f35439j = i10;
            this.f35440k = i11;
            this.f35441l = i12;
        }
    }
}
