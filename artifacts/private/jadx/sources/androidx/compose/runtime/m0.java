package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,5012:1\n4788#1,4:5014\n4802#1,4:5025\n4788#1,4:5029\n1#2:5013\n1#2:5037\n1#2:5045\n159#3,7:5018\n175#3,4:5033\n180#3,3:5038\n175#3,4:5041\n180#3,3:5046\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4536#1:5014,4\n4807#1:5025,4\n4809#1:5029,4\n4899#1:5037\n4959#1:5045\n4652#1:5018,7\n4899#1:5033,4\n4899#1:5038,3\n4959#1:5041,4\n4959#1:5046,3\n*E\n"})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private static h1 f36228a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f36229b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f36230c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f36231d = 125;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36232e = -127;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36233f = 200;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f36235h = 201;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f36237j = 202;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f36239l = 203;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f36241n = 204;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f36243p = 206;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f36245r = 207;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f36246s = -2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f36247t = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Object f36234g = new w3("provider");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Object f36236i = new w3("provider");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final Object f36238k = new w3("compositionLocalMap");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final Object f36240m = new w3("providerValues");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final Object f36242o = new w3("providers");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final Object f36244q = new w3(androidx.constraintlayout.core.motion.utils.v.b.f43991h);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final Comparator<t2> f36248u = new Comparator() { // from class: androidx.compose.runtime.k0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m0.d((t2) obj, (t2) obj2);
        }
    };

    public static final class a implements u4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l1 f36249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i3 f36250b;

        a(l1 l1Var, i3 i3Var) {
            this.f36249a = l1Var;
            this.f36250b = i3Var;
        }

        @Override // androidx.compose.runtime.u4
        public void a(Object obj) {
        }

        @Override // androidx.compose.runtime.u4
        public void c(s4 s4Var) {
        }

        @Override // androidx.compose.runtime.u4
        public u2 g(s4 s4Var, Object obj) {
            u2 u2VarG;
            l1 l1Var = this.f36249a;
            u4 u4Var = l1Var instanceof u4 ? (u4) l1Var : null;
            if (u4Var == null || (u2VarG = u4Var.g(s4Var, obj)) == null) {
                u2VarG = u2.IGNORED;
            }
            if (u2VarG != u2.IGNORED) {
                return u2VarG;
            }
            i3 i3Var = this.f36250b;
            i3Var.i(CollectionsKt.plus((Collection<? extends Pair>) i3Var.d(), TuplesKt.to(s4Var, obj)));
            return u2.SCHEDULED;
        }
    }

    public static final void A(@NotNull final z5 z5Var, @NotNull final l5 l5Var) {
        z5Var.b0(z5Var.h0(), new Function2() { // from class: androidx.compose.runtime.j0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m0.B(l5Var, z5Var, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    @w
    public static final void A0(int i10, int i11, int i12, @NotNull String str) {
        h1 h1Var = f36228a;
        if (h1Var != null) {
            h1Var.b(i10, i11, i12, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(l5 l5Var, z5 z5Var, int i10, Object obj) {
        if (obj instanceof x) {
            l5Var.b((x) obj);
        } else if (obj instanceof n5) {
            n5 n5Var = (n5) obj;
            if (!(n5Var.b() instanceof q5)) {
                q0(z5Var, i10, obj);
                l5Var.d(n5Var);
            }
        } else if (obj instanceof s4) {
            q0(z5Var, i10, obj);
            ((s4) obj).C();
        }
        return Unit.f312394a;
    }

    public static final void C(boolean z10) {
    }

    public static final <R> void C0(@NotNull z5 z5Var, @Nullable g gVar, @NotNull Function2<? super Integer, ? super Integer, ? extends R> function2) {
        int iE;
        int iM0;
        if (gVar == null || !gVar.b()) {
            iE = -1;
            iM0 = -1;
        } else {
            iE = z5Var.E(gVar);
            iM0 = z5Var.m0() - z5Var.x1(iE);
        }
        function2.invoke(Integer.valueOf(iE), Integer.valueOf(iM0));
    }

    public static final void D(boolean z10, @NotNull Function0<String> function0) {
    }

    private static final int E(v5 v5Var, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = v5Var.X(i10);
            i12++;
        }
        return i12;
    }

    @NotNull
    public static final h3 F(@NotNull l1 l1Var, @NotNull i3 i3Var, @NotNull z5 z5Var, @Nullable i<?> iVar) {
        int iT0;
        w5 w5Var = new w5();
        if (z5Var.g0()) {
            w5Var.p();
        }
        if (z5Var.f0()) {
            w5Var.n();
        }
        int iH0 = z5Var.h0();
        if (iVar != null && z5Var.T0(iH0) > 0) {
            int iK0 = z5Var.k0();
            while (iK0 > 0 && !z5Var.F0(iK0)) {
                iK0 = z5Var.V0(iK0);
            }
            if (iK0 >= 0 && z5Var.F0(iK0)) {
                Object objR0 = z5Var.R0(iK0);
                int i10 = iK0 + 1;
                int iT1 = iK0 + z5Var.t0(iK0);
                int iT2 = 0;
                while (i10 < iT1 && (iT0 = z5Var.t0(i10) + i10) <= iH0) {
                    iT2 += z5Var.F0(i10) ? 1 : z5Var.T0(i10);
                    i10 = iT0;
                }
                int iT3 = z5Var.F0(iH0) ? 1 : z5Var.T0(iH0);
                iVar.n(objR0);
                iVar.b(iT2, iT3);
                iVar.o();
            }
        }
        z5 z5VarA0 = w5Var.a0();
        try {
            z5VarA0.I();
            z5VarA0.F1(f3.f35774a, i3Var.c());
            z5.I0(z5VarA0, 0, 1, null);
            z5VarA0.N1(i3Var.g());
            List<g> listQ0 = z5Var.Q0(i3Var.a(), 1, z5VarA0);
            z5VarA0.r1();
            z5VarA0.V();
            z5VarA0.W();
            z5VarA0.M(true);
            h3 h3Var = new h3(w5Var);
            s4.a aVar = s4.f36369h;
            if (!aVar.b(w5Var, listQ0)) {
                return h3Var;
            }
            a aVar2 = new a(l1Var, i3Var);
            z5 z5VarA1 = w5Var.a0();
            try {
                aVar.a(z5VarA1, listQ0, aVar2);
                Unit unit = Unit.f312394a;
                z5VarA1.M(true);
                return h3Var;
            } catch (Throwable th2) {
                z5VarA1.M(false);
                throw th2;
            }
        } catch (Throwable th3) {
            z5VarA0.M(false);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int G(List<t2> list, int i10) {
        int iH = H(list, i10);
        return iH < 0 ? -(iH + 1) : iH;
    }

    private static final int H(List<t2> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        int i12 = 2 & 0;
        while (i11 <= size) {
            int i13 = (i11 + size) >>> 1;
            int iCompare = Intrinsics.compare(list.get(i13).b(), i10);
            if (iCompare < 0) {
                i11 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t2 I(List<t2> list, int i10, int i11) {
        int iG = G(list, i10);
        if (iG < list.size()) {
            t2 t2Var = list.get(iG);
            if (t2Var.b() < i11) {
                return t2Var;
            }
        }
        return null;
    }

    private static final void J(List<t2> list, int i10, int i11, Function1<? super t2, Unit> function1) {
        for (int iG = G(list, i10); iG < list.size(); iG++) {
            t2 t2Var = list.get(iG);
            if (t2Var.b() >= i11) {
                return;
            }
            function1.invoke(t2Var);
        }
    }

    public static final boolean K() {
        return f36229b;
    }

    @NotNull
    public static final Object L() {
        return f36238k;
    }

    @kotlin.a1
    public static /* synthetic */ void M() {
    }

    @kotlin.a1
    public static /* synthetic */ void N() {
    }

    private static /* synthetic */ void O() {
    }

    @NotNull
    public static final Object P() {
        return f36234g;
    }

    @kotlin.a1
    public static /* synthetic */ void Q() {
    }

    @kotlin.a1
    public static /* synthetic */ void R() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object S(w2 w2Var) {
        return w2Var.e() != null ? new v2(Integer.valueOf(w2Var.b()), w2Var.e()) : Integer.valueOf(w2Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object T(Object obj, Object obj2, Object obj3) {
        v2 v2Var = obj instanceof v2 ? (v2) obj : null;
        if (v2Var == null) {
            return null;
        }
        if (Intrinsics.areEqual(v2Var.e(), obj2) && Intrinsics.areEqual(v2Var.f(), obj3)) {
            return obj;
        }
        Object objT = T(v2Var.e(), obj2, obj3);
        if (objT == null) {
            objT = T(v2Var.f(), obj2, obj3);
        }
        return objT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(z5 z5Var) {
        return z5Var.h0() + z5Var.t0(z5Var.h0());
    }

    @NotNull
    public static final Object V() {
        return f36236i;
    }

    @kotlin.a1
    public static /* synthetic */ void W() {
    }

    @kotlin.a1
    public static /* synthetic */ void X() {
    }

    @NotNull
    public static final Object Y() {
        return f36242o;
    }

    @kotlin.a1
    public static /* synthetic */ void Z() {
    }

    @kotlin.a1
    public static /* synthetic */ void a0() {
    }

    @NotNull
    public static final Object b0() {
        return f36240m;
    }

    @kotlin.a1
    public static /* synthetic */ void c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(t2 t2Var, t2 t2Var2) {
        return Intrinsics.compare(t2Var.b(), t2Var2.b());
    }

    @kotlin.a1
    public static /* synthetic */ void d0() {
    }

    @NotNull
    public static final Object e0() {
        return f36244q;
    }

    @kotlin.a1
    public static /* synthetic */ void f0() {
    }

    @kotlin.a1
    public static /* synthetic */ void g0() {
    }

    @kotlin.a1
    public static /* synthetic */ void h0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(List<t2> list, int i10, s4 s4Var, Object obj) {
        int iH = H(list, i10);
        if (iH < 0) {
            int i11 = -(iH + 1);
            if (!(obj instanceof q1)) {
                obj = null;
            }
            list.add(i11, new t2(s4Var, i10, obj));
            return;
        }
        t2 t2Var = list.get(iH);
        if (!(obj instanceof q1)) {
            t2Var.e(null);
            return;
        }
        Object objA = t2Var.a();
        if (objA == null) {
            t2Var.e(obj);
        } else if (objA instanceof androidx.collection.l2) {
            ((androidx.collection.l2) objA).C(obj);
        } else {
            t2Var.e(androidx.collection.d3.d(objA, obj));
        }
    }

    public static final boolean j0(@NotNull v5 v5Var) {
        return v5Var.m() > v5Var.z() + 1;
    }

    public static final boolean k0(@NotNull z5 z5Var) {
        return z5Var.h0() > z5Var.k0() + 1;
    }

    @w
    public static final boolean l0() {
        h1 h1Var = f36228a;
        return h1Var != null && h1Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> androidx.collection.k2<Object, Object> m0(int i10) {
        return androidx.compose.runtime.collection.c.d(new androidx.collection.k2(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n0(v5 v5Var, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (v5Var.X(i10) == i11) {
                return i11;
            }
            if (v5Var.X(i11) != i10) {
                if (v5Var.X(i10) == v5Var.X(i11)) {
                    return v5Var.X(i10);
                }
                int iE = E(v5Var, i10, i12);
                int iE2 = E(v5Var, i11, i12);
                int i13 = iE - iE2;
                for (int i14 = 0; i14 < i13; i14++) {
                    i10 = v5Var.X(i10);
                }
                int i15 = iE2 - iE;
                for (int i16 = 0; i16 < i15; i16++) {
                    i11 = v5Var.X(i11);
                }
                while (i10 != i11) {
                    i10 = v5Var.X(i10);
                    i11 = v5Var.X(i11);
                }
                return i10;
            }
        }
        return i10;
    }

    public static final void o0(@NotNull z5 z5Var, @NotNull final l5 l5Var) {
        z5Var.b0(z5Var.h0(), new Function2() { // from class: androidx.compose.runtime.l0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m0.p0(l5Var, ((Integer) obj).intValue(), obj2);
            }
        });
        z5Var.g1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(l5 l5Var, int i10, Object obj) {
        if (obj instanceof x) {
            l5Var.f((x) obj);
        }
        if (obj instanceof n5) {
            l5Var.d((n5) obj);
        }
        if (obj instanceof s4) {
            ((s4) obj).C();
        }
        return Unit.f312394a;
    }

    private static final void q0(z5 z5Var, int i10, Object obj) {
        Object objK = z5Var.K(i10);
        if (obj == objK) {
            return;
        }
        y("Slot table is out of sync (expected " + obj + ", got " + objK + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t2 r0(List<t2> list, int i10) {
        int iH = H(list, i10);
        if (iH >= 0) {
            return list.remove(iH);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(List<t2> list, int i10, int i11) {
        int iG = G(list, i10);
        while (iG < list.size() && list.get(iG).b() < i11) {
            list.remove(iG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(int i10) {
        return i10 != 0;
    }

    public static final void t0(boolean z10) {
        if (z10) {
            return;
        }
        y("Check failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static final void u0(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        y(function0.invoke());
    }

    @w
    public static final <T> T v(@NotNull c0 c0Var, boolean z10, @NotNull Function0<? extends T> function0) {
        T t10 = (T) c0Var.i0();
        if (!z10 && t10 != c0.f35327a.a()) {
            return t10;
        }
        T tInvoke = function0.invoke();
        c0Var.Y(tInvoke);
        return tInvoke;
    }

    public static final void v0(boolean z10) {
        f36229b = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> w(w5 w5Var, g gVar) {
        ArrayList arrayList = new ArrayList();
        v5 v5VarY = w5Var.Y();
        try {
            x(v5VarY, arrayList, w5Var.k(gVar));
            Unit unit = Unit.f312394a;
            return arrayList;
        } finally {
            v5VarY.e();
        }
    }

    @w
    public static final void w0(@NotNull c0 c0Var, @NotNull String str) {
        c0Var.t(str);
    }

    private static final void x(v5 v5Var, List<Object> list, int i10) {
        if (v5Var.R(i10)) {
            list.add(v5Var.T(i10));
            return;
        }
        int iM = i10 + 1;
        int iM2 = i10 + v5Var.M(i10);
        while (iM < iM2) {
            x(v5Var, list, iM);
            iM += v5Var.M(iM);
        }
    }

    @w
    public static final void x0(@NotNull c0 c0Var) {
        c0Var.C();
    }

    public static final void y(@NotNull String str) {
        throw new z("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    @w
    public static final void y0(@NotNull c0 c0Var, int i10, @NotNull String str) {
        c0Var.w(i10, str);
    }

    @NotNull
    public static final Void z(@NotNull String str) {
        throw new z("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    @w
    public static final void z0() {
        h1 h1Var = f36228a;
        if (h1Var != null) {
            h1Var.c();
        }
    }
}
