package androidx.compose.animation.core;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.h6;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.w6;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2168:1\n85#2:2169\n117#2,2:2170\n85#2:2172\n117#2,2:2173\n85#2:2181\n117#2,2:2182\n85#2:2184\n117#2,2:2185\n85#2:2201\n85#2:2332\n79#3:2175\n112#3,2:2176\n79#3:2178\n112#3,2:2179\n103#4:2187\n35#4,5:2188\n104#4:2193\n103#4:2194\n35#4,5:2195\n104#4:2200\n35#4,5:2202\n35#4,5:2207\n35#4,5:2212\n35#4,5:2217\n35#4,5:2222\n35#4,5:2227\n35#4,5:2232\n35#4,5:2237\n35#4,5:2268\n35#4,5:2273\n35#4,5:2278\n35#4,5:2283\n35#4,5:2288\n35#4,5:2293\n35#4,5:2298\n35#4,5:2303\n35#4,5:2308\n35#4,5:2313\n270#4,2:2318\n35#4,5:2320\n272#4:2325\n35#4,5:2326\n1282#5,6:2242\n1282#5,3:2255\n1285#5,3:2259\n1282#5,6:2262\n607#6:2248\n604#6,6:2249\n605#7:2258\n1#8:2331\n66#9,5:2333\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n923#1:2169\n923#1:2170,2\n930#1:2172\n930#1:2173,2\n960#1:2181\n960#1:2182,2\n976#1:2184\n976#1:2185,2\n1003#1:2201\n1187#1:2332\n937#1:2175\n937#1:2176,2\n957#1:2178\n957#1:2179,2\n992#1:2187\n992#1:2188,5\n992#1:2193\n993#1:2194\n993#1:2195,5\n993#1:2200\n1007#1:2202,5\n1008#1:2207,5\n1041#1:2212,5\n1050#1:2217,5\n1088#1:2222,5\n1126#1:2227,5\n1139#1:2232,5\n1173#1:2237,5\n1230#1:2268,5\n1231#1:2273,5\n1246#1:2278,5\n1247#1:2283,5\n1255#1:2288,5\n1256#1:2293,5\n1261#1:2298,5\n1262#1:2303,5\n1272#1:2308,5\n1273#1:2313,5\n1277#1:2318,2\n1277#1:2320,5\n1277#1:2325\n1286#1:2326,5\n1187#1:2242,6\n1195#1:2255,3\n1195#1:2259,3\n1196#1:2262,6\n1195#1:2248\n1195#1:2249,6\n1195#1:2258\n1212#1:2333,5\n*E\n"})
public final class l3<S> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f13139n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x3<S> f13140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final l3<?> f13141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f13142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.m3 f13145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.m3 f13146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final SnapshotStateList<l3<S>.d<?, ?>> f13148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final SnapshotStateList<l3<?>> f13149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f13151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final n7 f13152m;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2168:1\n85#2:2169\n117#2,2:2170\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n1626#1:2169\n1626#1:2170,2\n*E\n"})
    public final class a<T, V extends w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final z3<T, V> f13153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f13154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.n3 f13155c = d7.g(null, null, 2, null);

        /* JADX INFO: renamed from: androidx.compose.animation.core.l3$a$a, reason: collision with other inner class name */
        public final class C0060a<T, V extends w> implements n7<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final l3<S>.d<T, V> f13157a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private Function1<? super b<S>, ? extends y0<T>> f13158b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private Function1<? super S, ? extends T> f13159c;

            public C0060a(@NotNull l3<S>.d<T, V> dVar, @NotNull Function1<? super b<S>, ? extends y0<T>> function1, Function1<? super S, ? extends T> function2) {
                this.f13157a = dVar;
                this.f13158b = function1;
                this.f13159c = function2;
            }

            @NotNull
            public final l3<S>.d<T, V> a() {
                return this.f13157a;
            }

            @NotNull
            public final Function1<S, T> b() {
                return this.f13159c;
            }

            @NotNull
            public final Function1<b<S>, y0<T>> d() {
                return this.f13158b;
            }

            public final void g(@NotNull Function1<? super S, ? extends T> function1) {
                this.f13159c = function1;
            }

            @Override // androidx.compose.runtime.n7
            public T getValue() {
                p(l3.this.w());
                return this.f13157a.getValue();
            }

            public final void h(@NotNull Function1<? super b<S>, ? extends y0<T>> function1) {
                this.f13158b = function1;
            }

            public final void p(@NotNull b<S> bVar) {
                T tInvoke = this.f13159c.invoke(bVar.j());
                if (!l3.this.E()) {
                    this.f13157a.W(tInvoke, this.f13158b.invoke(bVar));
                } else {
                    this.f13157a.U(this.f13159c.invoke(bVar.l()), tInvoke, this.f13158b.invoke(bVar));
                }
            }
        }

        public a(@NotNull z3<T, V> z3Var, String str) {
            this.f13153a = z3Var;
            this.f13154b = str;
        }

        @NotNull
        public final n7<T> a(@NotNull Function1<? super b<S>, ? extends y0<T>> function1, @NotNull Function1<? super S, ? extends T> function2) {
            l3<S>.C0060a<T, V>.C0000a<T, V> c0060aB = b();
            if (c0060aB == null) {
                l3<S> l3Var = l3.this;
                c0060aB = new C0060a<>(l3Var.new d(function2.invoke(l3Var.p()), r.i(this.f13153a, function2.invoke(l3.this.p())), this.f13153a, this.f13154b), function1, function2);
                l3<S> l3Var2 = l3.this;
                e(c0060aB);
                l3Var2.f(c0060aB.a());
            }
            l3<S> l3Var3 = l3.this;
            c0060aB.g(function2);
            c0060aB.h(function1);
            c0060aB.p(l3Var3.w());
            return c0060aB;
        }

        @Nullable
        public final l3<S>.C0060a<T, V>.C0000a<T, V> b() {
            return (C0060a) this.f13155c.getValue();
        }

        @NotNull
        public final String c() {
            return this.f13154b;
        }

        @NotNull
        public final z3<T, V> d() {
            return this.f13153a;
        }

        public final void e(@Nullable l3<S>.C0060a<T, V>.C0000a<T, V> c0060a) {
            this.f13155c.setValue(c0060a);
        }

        public final void f() {
            l3<S>.C0060a<T, V>.C0000a<T, V> c0060aB = b();
            if (c0060aB != null) {
                l3<S> l3Var = l3.this;
                c0060aB.a().U(c0060aB.b().invoke(l3Var.w().l()), c0060aB.b().invoke(l3Var.w().j()), c0060aB.d().invoke(l3Var.w()));
            }
        }
    }

    public interface b<S> {

        public static final class a {
            @Deprecated
            public static <S> boolean a(@NotNull b<S> bVar, S s10, S s11) {
                return b.super.f(s10, s11);
            }
        }

        default boolean f(S s10, S s11) {
            return Intrinsics.areEqual(s10, l()) && Intrinsics.areEqual(s11, j());
        }

        S j();

        S l();
    }

    private static final class c<S> implements b<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S f13161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final S f13162b;

        public c(S s10, S s11) {
            this.f13161a = s10;
            this.f13162b = s11;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Intrinsics.areEqual(l(), bVar.l()) && Intrinsics.areEqual(j(), bVar.j())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            S sL = l();
            int iHashCode = (sL != null ? sL.hashCode() : 0) * 31;
            S sJ = j();
            return iHashCode + (sJ != null ? sJ.hashCode() : 0);
        }

        @Override // androidx.compose.animation.core.l3.b
        public S j() {
            return this.f13162b;
        }

        @Override // androidx.compose.animation.core.l3.b
        public S l() {
            return this.f13161a;
        }
    }

    @k7
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,2168:1\n85#2:2169\n117#2,2:2170\n85#2:2172\n117#2,2:2173\n85#2:2175\n117#2,2:2176\n85#2:2178\n117#2,2:2179\n85#2:2184\n117#2,2:2185\n81#3:2181\n114#3,2:2182\n79#4:2187\n112#4,2:2188\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n1310#1:2169\n1310#1:2170,2\n1318#1:2172\n1318#1:2173,2\n1326#1:2175\n1326#1:2176,2\n1340#1:2178\n1340#1:2179,2\n1353#1:2184\n1353#1:2185,2\n1341#1:2181\n1341#1:2182,2\n1357#1:2187\n1357#1:2188,2\n*E\n"})
    public final class d<T, V extends w> implements n7<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final z3<T, V> f13163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f13164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.n3 f13165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final q2<T> f13166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.n3 f13167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.n3 f13168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private k2.b f13169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private g3<T, V> f13170h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.n3 f13171i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.k3 f13172j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f13173k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.n3 f13174l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private V f13175m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.m3 f13176n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f13177o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        private final y0<T> f13178s;

        public d(@NotNull T t10, @NotNull V v10, @NotNull z3<T, V> z3Var, String str) {
            T tInvoke;
            this.f13163a = z3Var;
            this.f13164b = str;
            this.f13165c = d7.g(t10, null, 2, null);
            q2<T> q2VarR = p.r(0.0f, 0.0f, null, 7, null);
            this.f13166d = q2VarR;
            this.f13167e = d7.g(q2VarR, null, 2, null);
            this.f13168f = d7.g(new g3(d(), z3Var, t10, t(), v10), null, 2, null);
            this.f13171i = d7.g(Boolean.TRUE, null, 2, null);
            this.f13172j = androidx.compose.runtime.g4.b(-1.0f);
            this.f13174l = d7.g(t10, null, 2, null);
            this.f13175m = v10;
            this.f13176n = h6.b(b().e());
            Float f10 = j5.i().get(z3Var);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                V vInvoke = z3Var.a().invoke(t10);
                int iB = vInvoke.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    vInvoke.e(i10, fFloatValue);
                }
                tInvoke = this.f13163a.b().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.f13178s = p.r(0.0f, 0.0f, tInvoke, 3, null);
        }

        private final void J(g3<T, V> g3Var) {
            this.f13168f.setValue(g3Var);
        }

        private final void K(y0<T> y0Var) {
            this.f13167e.setValue(y0Var);
        }

        private final void Q(T t10) {
            this.f13165c.setValue(t10);
        }

        private final void S(T t10, boolean z10) {
            g3<T, V> g3Var = this.f13170h;
            if (Intrinsics.areEqual(g3Var != null ? g3Var.c() : null, t())) {
                J(new g3<>(this.f13178s, this.f13163a, t10, t10, x.g(this.f13175m)));
                this.f13173k = true;
                L(b().e());
                return;
            }
            o oVarD = (!z10 || this.f13177o || (d() instanceof q2)) ? d() : this.f13178s;
            if (l3.this.v() > 0) {
                oVarD = p.c(oVarD, l3.this.v());
            }
            J(new g3<>(oVarD, this.f13163a, t10, t(), this.f13175m));
            L(b().e());
            this.f13173k = false;
            l3.this.F();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void T(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.S(obj, z10);
        }

        private final T t() {
            return this.f13165c.getValue();
        }

        @NotNull
        public final z3<T, V> A() {
            return this.f13163a;
        }

        public final boolean E() {
            return ((Boolean) this.f13171i.getValue()).booleanValue();
        }

        public final void F(long j10, boolean z10) {
            if (z10) {
                j10 = b().e();
            }
            R(b().g(j10));
            this.f13175m = (V) b().i(j10);
            if (b().d(j10)) {
                M(true);
            }
        }

        public final void G() {
            P(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void H(float f10) {
            if (f10 != -4.0f && f10 != -5.0f) {
                P(f10);
                return;
            }
            g3<T, V> g3Var = this.f13170h;
            if (g3Var != null) {
                b().n(g3Var.c());
                this.f13169g = null;
                this.f13170h = null;
            }
            Object objK = f10 == -4.0f ? b().k() : b().c();
            b().n(objK);
            b().o(objK);
            R(objK);
            L(b().e());
        }

        public final void I(long j10) {
            if (s() == -1.0f) {
                this.f13177o = true;
                if (Intrinsics.areEqual(b().c(), b().k())) {
                    R(b().c());
                } else {
                    R(b().g(j10));
                    this.f13175m = (V) b().i(j10);
                }
            }
        }

        public final void L(long j10) {
            this.f13176n.C(j10);
        }

        public final void M(boolean z10) {
            this.f13171i.setValue(Boolean.valueOf(z10));
        }

        public final void N(@NotNull k2.b bVar) {
            if (!Intrinsics.areEqual(b().c(), b().k())) {
                this.f13170h = b();
                this.f13169g = bVar;
            }
            J(new g3<>(this.f13178s, this.f13163a, getValue(), getValue(), x.g(this.f13175m)));
            L(b().e());
            this.f13173k = true;
        }

        public final void O(@Nullable k2.b bVar) {
            this.f13169g = bVar;
        }

        public final void P(float f10) {
            this.f13172j.q(f10);
        }

        public void R(T t10) {
            this.f13174l.setValue(t10);
        }

        public final void U(T t10, T t11, @NotNull y0<T> y0Var) {
            Q(t11);
            K(y0Var);
            if (Intrinsics.areEqual(b().k(), t10) && Intrinsics.areEqual(b().c(), t11)) {
                return;
            }
            T(this, t10, false, 2, null);
        }

        public final void V() {
            g3<T, V> g3Var;
            k2.b bVar = this.f13169g;
            if (bVar == null || (g3Var = this.f13170h) == null) {
                return;
            }
            long jM0 = kotlin.math.b.M0(bVar.c() * ((double) bVar.g()));
            T tG = g3Var.g(jM0);
            if (this.f13173k) {
                b().o(tG);
            }
            b().n(tG);
            L(b().e());
            if (s() == -2.0f || this.f13173k) {
                R(tG);
            } else {
                I(l3.this.v());
            }
            if (jM0 < bVar.c()) {
                bVar.k(false);
            } else {
                this.f13169g = null;
                this.f13170h = null;
            }
        }

        public final void W(T t10, @NotNull y0<T> y0Var) {
            if (this.f13173k) {
                g3<T, V> g3Var = this.f13170h;
                if (Intrinsics.areEqual(t10, g3Var != null ? g3Var.c() : null)) {
                    return;
                }
            }
            if (Intrinsics.areEqual(t(), t10) && s() == -1.0f) {
                return;
            }
            Q(t10);
            K(y0Var);
            S(s() == -3.0f ? t10 : getValue(), !E());
            M(s() == -3.0f);
            if (s() >= 0.0f) {
                R(b().g((long) (b().e() * s())));
            } else if (s() == -3.0f) {
                R(t10);
            }
            this.f13173k = false;
            P(-1.0f);
        }

        public final void a() {
            this.f13170h = null;
            this.f13169g = null;
            this.f13173k = false;
        }

        @NotNull
        public final g3<T, V> b() {
            return (g3) this.f13168f.getValue();
        }

        @NotNull
        public final y0<T> d() {
            return (y0) this.f13167e.getValue();
        }

        public final long g() {
            return this.f13176n.e();
        }

        @Override // androidx.compose.runtime.n7
        public T getValue() {
            return this.f13174l.getValue();
        }

        @Nullable
        public final k2.b h() {
            return this.f13169g;
        }

        @NotNull
        public final String p() {
            return this.f13164b;
        }

        public final float s() {
            return this.f13172j.V0();
        }

        @NotNull
        public String toString() {
            return "current value: " + getValue() + ", target: " + t() + ", spec: " + d();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", i = {0, 0}, l = {1202}, m = "invokeSuspend", n = {"$this$launch", "durationScale"}, s = {"L$0", "F$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f13180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f13182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l3<S> f13183d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l3<S> l3Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f13183d = l3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(l3 l3Var, float f10, long j10) {
            if (!l3Var.E()) {
                l3Var.H(j10, f10);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f13183d, dVar);
            eVar.f13182c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            final float fJ;
            kotlinx.coroutines.s0 s0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13181b;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) this.f13182c;
                fJ = f3.J(s0Var2.getCoroutineContext());
                s0Var = s0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fJ = this.f13180a;
                s0Var = (kotlinx.coroutines.s0) this.f13182c;
                ResultKt.m(obj);
            }
            while (kotlinx.coroutines.t0.k(s0Var)) {
                final l3<S> l3Var = this.f13183d;
                Function1 function1 = new Function1() { // from class: androidx.compose.animation.core.m3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return l3.e.m(l3Var, fJ, ((Long) obj2).longValue());
                    }
                };
                this.f13182c = s0Var;
                this.f13180a = fJ;
                this.f13181b = 1;
                if (androidx.compose.runtime.d3.f(function1, this) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n1#1,69:1\n1212#2:70\n*E\n"})
    public static final class f implements androidx.compose.runtime.u1 {
        @Override // androidx.compose.runtime.u1
        public void dispose() {
        }
    }

    public l3(@NotNull x3<S> x3Var, @Nullable l3<?> l3Var, @Nullable String str) {
        this.f13140a = x3Var;
        this.f13141b = l3Var;
        this.f13142c = str;
        this.f13143d = d7.g(p(), null, 2, null);
        this.f13144e = d7.g(new c(p(), p()), null, 2, null);
        this.f13145f = h6.b(0L);
        this.f13146g = h6.b(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f13147h = d7.g(bool, null, 2, null);
        this.f13148i = w6.g();
        this.f13149j = w6.g();
        this.f13150k = d7.g(bool, null, 2, null);
        this.f13152m = w6.e(new Function0() { // from class: androidx.compose.animation.core.k3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(l3.a0(this.f13130a));
            }
        });
        x3Var.g(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean B() {
        return ((Boolean) this.f13147h.getValue()).booleanValue();
    }

    private final long C() {
        return this.f13145f.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        Y(true);
        if (E()) {
            SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                l3<S>.d<?, ?> dVar = snapshotStateList.get(i10);
                jMax = Math.max(jMax, dVar.g());
                dVar.I(this.f13151l);
            }
            Y(false);
        }
    }

    private final void V(b<S> bVar) {
        this.f13144e.setValue(bVar);
    }

    private final void Y(boolean z10) {
        this.f13147h.setValue(Boolean.valueOf(z10));
    }

    private final void Z(long j10) {
        this.f13145f.C(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a0(l3 l3Var) {
        return l3Var.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(l3 l3Var) {
        return !Intrinsics.areEqual(l3Var.y(), l3Var.p()) || l3Var.D() || l3Var.B();
    }

    private static final boolean j(n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 k(kotlinx.coroutines.s0 s0Var, l3 l3Var, androidx.compose.runtime.v1 v1Var) {
        kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new e(l3Var, null), 1, null);
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(l3 l3Var, Object obj, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        l3Var.h(obj, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private final long m() {
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, snapshotStateList.get(i10).g());
        }
        SnapshotStateList<l3<?>> snapshotStateList2 = this.f13149j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i11).m());
        }
        return jMax;
    }

    @o1
    public static /* synthetic */ void r() {
    }

    @NotNull
    public final List<l3<?>> A() {
        return this.f13149j;
    }

    public final boolean D() {
        return x() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final boolean E() {
        return ((Boolean) this.f13150k.getValue()).booleanValue();
    }

    public final void G() {
        J();
        this.f13140a.h();
    }

    public final void H(long j10, float f10) {
        if (x() == Long.MIN_VALUE) {
            K(j10);
        }
        long jX = j10 - x();
        if (f10 != 0.0f) {
            jX = kotlin.math.b.M0(jX / ((double) f10));
        }
        T(jX);
        I(jX, f10 == 0.0f);
    }

    public final void I(long j10, boolean z10) {
        boolean z11 = true;
        if (x() == Long.MIN_VALUE) {
            K(j10);
        } else if (!this.f13140a.c()) {
            this.f13140a.e(true);
        }
        Y(false);
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l3<S>.d<?, ?> dVar = snapshotStateList.get(i10);
            if (!dVar.E()) {
                dVar.F(j10, z10);
            }
            if (!dVar.E()) {
                z11 = false;
            }
        }
        SnapshotStateList<l3<?>> snapshotStateList2 = this.f13149j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            l3<?> l3Var = snapshotStateList2.get(i11);
            if (!Intrinsics.areEqual(l3Var.y(), l3Var.p())) {
                l3Var.I(j10, z10);
            }
            if (!Intrinsics.areEqual(l3Var.y(), l3Var.p())) {
                z11 = false;
            }
        }
        if (z11) {
            J();
        }
    }

    public final void J() {
        W(Long.MIN_VALUE);
        x3<S> x3Var = this.f13140a;
        if (x3Var instanceof w1) {
            ((w1) x3Var).d(y());
        }
        T(0L);
        this.f13140a.e(false);
        SnapshotStateList<l3<?>> snapshotStateList = this.f13149j;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).J();
        }
    }

    public final void K(long j10) {
        W(j10);
        this.f13140a.e(true);
    }

    public final void L(@NotNull l3<S>.a<?, ?> aVar) {
        l3<S>.d<?, ?> dVarA;
        l3<S>.C0060a<?, ?>.C0000a<?, V> c0060aB = aVar.b();
        if (c0060aB == 0 || (dVarA = c0060aB.a()) == null) {
            return;
        }
        M(dVarA);
    }

    public final void M(@NotNull l3<S>.d<?, ?> dVar) {
        this.f13148i.remove(dVar);
    }

    public final boolean N(@NotNull l3<?> l3Var) {
        return this.f13149j.remove(l3Var);
    }

    public final void O(float f10) {
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).H(f10);
        }
        SnapshotStateList<l3<?>> snapshotStateList2 = this.f13149j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).O(f10);
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @oj.i(name = "seek")
    public final void P(S s10, S s11, long j10) {
        W(Long.MIN_VALUE);
        this.f13140a.e(false);
        if (!E() || !Intrinsics.areEqual(p(), s10) || !Intrinsics.areEqual(y(), s11)) {
            if (!Intrinsics.areEqual(p(), s10)) {
                x3<S> x3Var = this.f13140a;
                if (x3Var instanceof w1) {
                    ((w1) x3Var).d(s10);
                }
            }
            X(s11);
            U(true);
            V(new c(s10, s11));
        }
        SnapshotStateList<l3<?>> snapshotStateList = this.f13149j;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l3<?> l3Var = snapshotStateList.get(i10);
            Intrinsics.checkNotNull(l3Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (l3Var.E()) {
                l3Var.P(l3Var.p(), l3Var.y(), j10);
            }
        }
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList2 = this.f13148i;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).I(j10);
        }
        this.f13151l = j10;
    }

    public final void Q(long j10) {
        if (x() == Long.MIN_VALUE) {
            W(j10);
        }
        T(j10);
        Y(false);
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).I(j10);
        }
        SnapshotStateList<l3<?>> snapshotStateList2 = this.f13149j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            l3<?> l3Var = snapshotStateList2.get(i11);
            if (!Intrinsics.areEqual(l3Var.y(), l3Var.p())) {
                l3Var.Q(j10);
            }
        }
    }

    public final void R(@NotNull k2.b bVar) {
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).N(bVar);
        }
        SnapshotStateList<l3<?>> snapshotStateList2 = this.f13149j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).R(bVar);
        }
    }

    public final void S(long j10) {
        this.f13151l = j10;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final void T(long j10) {
        if (this.f13141b == null) {
            Z(j10);
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final void U(boolean z10) {
        this.f13150k.setValue(Boolean.valueOf(z10));
    }

    public final void W(long j10) {
        this.f13146g.C(j10);
    }

    public final void X(S s10) {
        this.f13143d.setValue(s10);
    }

    public final void b0() {
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).V();
        }
        SnapshotStateList<l3<?>> snapshotStateList2 = this.f13149j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).b0();
        }
    }

    public final void c0(S s10) {
        if (Intrinsics.areEqual(y(), s10)) {
            return;
        }
        V(new c(y(), s10));
        if (!Intrinsics.areEqual(p(), y())) {
            this.f13140a.d(y());
        }
        X(s10);
        if (!D()) {
            Y(true);
        }
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).G();
        }
    }

    public final boolean f(@NotNull l3<S>.d<?, ?> dVar) {
        return this.f13148i.add(dVar);
    }

    public final boolean g(@NotNull l3<?> l3Var) {
        return this.f13149j.add(l3Var);
    }

    @androidx.compose.runtime.o
    public final void h(final S s10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(s10) : c0VarR.k0(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(this) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1180)");
            }
            if (E()) {
                c0VarR.E(467781377);
                c0VarR.A();
            } else {
                c0VarR.E(466120769);
                c0(s10);
                int i12 = i11 & com.planner5d.library.engine.input.f.b.B;
                boolean z10 = i12 == 32;
                Object objI0 = c0VarR.i0();
                if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = w6.e(new Function0() { // from class: androidx.compose.animation.core.h3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(l3.i(this.f12996a));
                        }
                    });
                    c0VarR.Y(objI0);
                }
                if (j((n7) objI0)) {
                    c0VarR.E(466528884);
                    Object objI1 = c0VarR.i0();
                    androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI1;
                    boolean zK0 = c0VarR.k0(s0Var) | (i12 == 32);
                    Object objI2 = c0VarR.i0();
                    if (zK0 || objI2 == aVar.a()) {
                        objI2 = new Function1() { // from class: androidx.compose.animation.core.i3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return l3.k(s0Var, this, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.b2.c(s0Var, this, (Function1) objI2, c0VarR, i12);
                    c0VarR.A();
                } else {
                    c0VarR.E(467771457);
                    c0VarR.A();
                }
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.animation.core.j3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l3.l(this.f13051a, s10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void n() {
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).a();
        }
        SnapshotStateList<l3<?>> snapshotStateList2 = this.f13149j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).n();
        }
    }

    @NotNull
    public final List<l3<S>.d<?, ?>> o() {
        return this.f13148i;
    }

    public final S p() {
        return this.f13140a.a();
    }

    public final boolean q() {
        SnapshotStateList<l3<S>.d<?, ?>> snapshotStateList = this.f13148i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (snapshotStateList.get(i10).h() != null) {
                return true;
            }
        }
        SnapshotStateList<l3<?>> snapshotStateList2 = this.f13149j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (snapshotStateList2.get(i11).q()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String s() {
        return this.f13142c;
    }

    public final long t() {
        return this.f13151l;
    }

    @NotNull
    public String toString() {
        List<l3<S>.d<?, ?>> listO = o();
        int size = listO.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + listO.get(i10) + ", ";
        }
        return str;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @Nullable
    public final l3<?> u() {
        return this.f13141b;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final long v() {
        l3<?> l3Var = this.f13141b;
        return l3Var != null ? l3Var.v() : C();
    }

    @NotNull
    public final b<S> w() {
        return (b) this.f13144e.getValue();
    }

    public final long x() {
        return this.f13146g.e();
    }

    public final S y() {
        return (S) this.f13143d.getValue();
    }

    public final long z() {
        return ((Number) this.f13152m.getValue()).longValue();
    }

    public /* synthetic */ l3(x3 x3Var, l3 l3Var, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(x3Var, l3Var, (i10 & 4) != 0 ? null : str);
    }

    public /* synthetic */ l3(x3 x3Var, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(x3Var, (i10 & 2) != 0 ? null : str);
    }

    @kotlin.a1
    public l3(@NotNull x3<S> x3Var, @Nullable String str) {
        this(x3Var, null, str);
    }

    public l3(S s10, @Nullable String str) {
        this(new w1(s10), null, str);
    }

    public /* synthetic */ l3(w1 w1Var, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(w1Var, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.a1
    public l3(@NotNull w1<S> w1Var, @Nullable String str) {
        this(w1Var, null, str);
        Intrinsics.checkNotNull(w1Var, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }
}
