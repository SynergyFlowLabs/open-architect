package androidx.compose.animation.core;

import androidx.compose.animation.core.l3.a;
import androidx.compose.animation.core.l3.d;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.w6;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2168:1\n1839#1,7:2280\n1846#1,2:2300\n1841#1,19:2302\n1839#1,7:2321\n1846#1,2:2341\n1841#1,19:2343\n1839#1,7:2362\n1846#1,2:2382\n1841#1,19:2384\n1839#1,7:2403\n1846#1,2:2423\n1841#1,19:2425\n1839#1,7:2444\n1846#1,2:2464\n1841#1,19:2466\n1839#1,7:2485\n1846#1,2:2505\n1841#1,19:2507\n1839#1,7:2526\n1846#1,2:2546\n1841#1,19:2548\n1839#1,7:2567\n1846#1,2:2587\n1841#1,19:2589\n1282#2,6:2169\n1282#2,6:2175\n1282#2,3:2181\n1285#2,3:2191\n1282#2,6:2194\n1282#2,6:2200\n1282#2,6:2206\n1282#2,6:2212\n1282#2,6:2218\n1282#2,6:2224\n1282#2,6:2230\n1282#2,3:2236\n1285#2,3:2246\n1282#2,6:2249\n1282#2,6:2255\n1282#2,3:2261\n1285#2,3:2271\n1282#2,6:2274\n1282#2,3:2287\n1285#2,3:2297\n1282#2,3:2328\n1285#2,3:2338\n1282#2,3:2369\n1285#2,3:2379\n1282#2,3:2410\n1285#2,3:2420\n1282#2,3:2451\n1285#2,3:2461\n1282#2,3:2492\n1285#2,3:2502\n1282#2,3:2533\n1285#2,3:2543\n1282#2,3:2574\n1285#2,3:2584\n604#3,7:2184\n604#3,7:2239\n604#3,7:2264\n604#3,7:2290\n604#3,7:2331\n604#3,7:2372\n604#3,7:2413\n604#3,7:2454\n604#3,7:2495\n604#3,7:2536\n604#3,7:2577\n66#4,5:2608\n66#4,5:2614\n66#4,5:2619\n66#4,5:2624\n66#4,5:2629\n1#5:2613\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1952#1:2280,7\n1952#1:2300,2\n1952#1:2302,19\n1982#1:2321,7\n1982#1:2341,2\n1982#1:2343,19\n2012#1:2362,7\n2012#1:2382,2\n2012#1:2384,19\n2042#1:2403,7\n2042#1:2423,2\n2042#1:2425,19\n2076#1:2444,7\n2076#1:2464,2\n2076#1:2466,19\n2106#1:2485,7\n2106#1:2505,2\n2106#1:2507,19\n2137#1:2526,7\n2137#1:2546,2\n2137#1:2548,19\n2167#1:2567,7\n2167#1:2587,2\n2167#1:2589,19\n89#1:2169,6\n91#1:2175,6\n807#1:2181,3\n807#1:2191,3\n815#1:2194,6\n826#1:2200,6\n1740#1:2206,6\n1741#1:2212,6\n1769#1:2218,6\n1783#1:2224,6\n1787#1:2230,6\n1845#1:2236,3\n1845#1:2246,3\n1856#1:2249,6\n1857#1:2255,6\n1872#1:2261,3\n1872#1:2271,3\n1892#1:2274,6\n1952#1:2287,3\n1952#1:2297,3\n1982#1:2328,3\n1982#1:2338,3\n2012#1:2369,3\n2012#1:2379,3\n2042#1:2410,3\n2042#1:2420,3\n2076#1:2451,3\n2076#1:2461,3\n2106#1:2492,3\n2106#1:2502,3\n2137#1:2533,3\n2137#1:2543,3\n2167#1:2574,3\n2167#1:2584,3\n812#1:2184,7\n1845#1:2239,7\n1877#1:2264,7\n1952#1:2290,7\n1982#1:2331,7\n2012#1:2372,7\n2042#1:2413,7\n2076#1:2454,7\n2106#1:2495,7\n2137#1:2536,7\n2167#1:2577,7\n92#1:2608,5\n827#1:2614,5\n1741#1:2619,5\n1789#1:2624,5\n1894#1:2629,5\n*E\n"})
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13352a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<k2<?>, Unit> f13353b = new Function1() { // from class: androidx.compose.animation.core.q3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return w3.l((k2) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0 f13354c = kotlin.g0.b(kotlin.j0.NONE, new Function0() { // from class: androidx.compose.animation.core.r3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return w3.j();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f13355d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f13356e = -2.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f13357f = -3.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f13358g = -4.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f13359h = -5.0f;

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class a<S> implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<androidx.compose.ui.unit.h>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13360a = new a();

        @androidx.compose.runtime.o
        public final q2<androidx.compose.ui.unit.h> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1953972046);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1953972046, i10, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1977)");
            }
            q2<androidx.compose.ui.unit.h> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, androidx.compose.ui.unit.h.o(j5.a(androidx.compose.ui.unit.h.f42689b)), 3, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ q2<androidx.compose.ui.unit.h> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class b<S> implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13361a = new b();

        @androidx.compose.runtime.o
        public final q2<Float> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-985243360);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-985243360, i10, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1947)");
            }
            q2<Float> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ q2<Float> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class c<S> implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f13362a = new c();

        @androidx.compose.runtime.o
        public final q2<Integer> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(2109424115);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2109424115, i10, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2101)");
            }
            q2<Integer> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, 1, 3, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ q2<Integer> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,2168:1\n32#2:2169\n80#3:2170\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n*L\n2071#1:2169\n2071#1:2170\n*E\n"})
    public static final class d<S> implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<androidx.compose.ui.unit.q>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f13363a = new d();

        @androidx.compose.runtime.o
        public final q2<androidx.compose.ui.unit.q> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-428458074);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-428458074, i10, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2070)");
            }
            long j10 = 1;
            q2<androidx.compose.ui.unit.q> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32))), 3, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ q2<androidx.compose.ui.unit.q> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntSize$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,2168:1\n30#2:2169\n80#3:2170\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntSize$1\n*L\n2133#1:2169\n2133#1:2170\n*E\n"})
    public static final class e<S> implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<androidx.compose.ui.unit.u>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f13364a = new e();

        @androidx.compose.runtime.o
        public final q2<androidx.compose.ui.unit.u> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(811932052);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(811932052, i10, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2132)");
            }
            long j10 = 1;
            q2<androidx.compose.ui.unit.u> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32))), 3, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ q2<androidx.compose.ui.unit.u> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class f<S> implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<n0.g>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f13365a = new f();

        @androidx.compose.runtime.o
        public final q2<n0.g> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1662821959);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1662821959, i10, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:2007)");
            }
            q2<n0.g> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, n0.g.d(j5.f(n0.g.f332700b)), 3, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ q2<n0.g> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class g<S> implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<n0.j>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f13366a = new g();

        @androidx.compose.runtime.o
        public final q2<n0.j> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(946173386);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(946173386, i10, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2162)");
            }
            q2<n0.j> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, j5.h(n0.j.f332705e), 3, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ q2<n0.j> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class h<S> implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<n0.n>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f13367a = new h();

        @androidx.compose.runtime.o
        public final q2<n0.n> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(493329511);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(493329511, i10, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2037)");
            }
            q2<n0.n> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, n0.n.c(j5.g(n0.n.f332724b)), 3, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ q2<n0.n> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S, T] */
    public static final class i<S, T> implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f13368a = new i();

        @androidx.compose.runtime.o
        public final q2<T> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-2137771706);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2137771706, i10, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1834)");
            }
            q2<T> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class j<S> implements Function0<l3.b<S>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<S> f13369a;

        public j(l3<S> l3Var) {
            this.f13369a = l3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l3.b<S> invoke() {
            return this.f13369a.w();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class k<S> implements Function0<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3<S> f13370a;

        public k(l3<S> l3Var) {
            this.f13370a = l3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final S invoke() {
            return this.f13370a.y();
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,69:1\n1789#2:70\n*E\n"})
    public static final class l implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3 f13371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3 f13372b;

        public l(l3 l3Var, l3 l3Var2) {
            this.f13371a = l3Var;
            this.f13372b = l3Var2;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f13371a.N(this.f13372b);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,69:1\n1741#2:70\n*E\n"})
    public static final class m implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3 f13373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3.a f13374b;

        public m(l3 l3Var, l3.a aVar) {
            this.f13373a = l3Var;
            this.f13374b = aVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f13373a.L(this.f13374b);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,69:1\n1894#2:70\n*E\n"})
    public static final class n implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3 f13375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3.d f13376b;

        public n(l3 l3Var, l3.d dVar) {
            this.f13375a = l3Var;
            this.f13376b = dVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f13375a.M(this.f13376b);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", i = {0}, l = {2173}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2168:1\n116#2,10:2169\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n*L\n817#1:2169,10\n*E\n"})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f13377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f13378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x3<T> f13380d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(x3<T> x3Var, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.f13380d = x3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new o(this.f13380d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.sync.a aVar;
            x3 x3Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13379c;
            if (i10 == 0) {
                ResultKt.m(obj);
                ((k2) this.f13380d).O();
                kotlinx.coroutines.sync.a aVarK = ((k2) this.f13380d).K();
                x3 x3Var2 = this.f13380d;
                this.f13377a = aVarK;
                this.f13378b = x3Var2;
                this.f13379c = 1;
                if (aVarK.h(null, this) == objL) {
                    return objL;
                }
                aVar = aVarK;
                x3Var = x3Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x3Var = (x3) this.f13378b;
                aVar = (kotlinx.coroutines.sync.a) this.f13377a;
                ResultKt.m(obj);
            }
            try {
                ((k2) x3Var).W(((k2) x3Var).b());
                kotlinx.coroutines.n nVarJ = ((k2) x3Var).J();
                if (nVarJ != null) {
                    Result.a aVar2 = Result.Companion;
                    nVarJ.resumeWith(Result.m785constructorimpl(((k2) x3Var).b()));
                }
                ((k2) x3Var).X(null);
                Unit unit = Unit.f312394a;
                aVar.i(null);
                return unit;
            } catch (Throwable th2) {
                aVar.i(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,69:1\n830#2,2:70\n*E\n"})
    public static final class p implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3 f13381a;

        public p(l3 l3Var) {
            this.f13381a = l3Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f13381a.G();
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,69:1\n95#2,2:70\n*E\n"})
    public static final class q implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3 f13382a;

        public q(l3 l3Var) {
            this.f13382a = l3Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f13382a.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 A(l3 l3Var, l3 l3Var2, androidx.compose.runtime.v1 v1Var) {
        l3Var.g(l3Var2);
        return new l(l3Var, l3Var2);
    }

    @androidx.compose.runtime.o
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @NotNull
    public static final <S, T, V extends w> l3<S>.a<T, V> B(@NotNull final l3<S> l3Var, @NotNull z3<T, V> z3Var, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1738)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && c0Var.D(l3Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = l3Var.new a(z3Var, str);
            c0Var.Y(objI0);
        }
        final l3<S>.a<T, V> aVar = (l3.a) objI0;
        if ((i12 <= 4 || !c0Var.D(l3Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zK0 = c0Var.k0(aVar) | z10;
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function1() { // from class: androidx.compose.animation.core.p3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w3.C(l3Var, aVar, (androidx.compose.runtime.v1) obj);
                }
            };
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.d(aVar, (Function1) objI1, c0Var, 0);
        if (l3Var.E()) {
            aVar.f();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 C(l3 l3Var, l3.a aVar, androidx.compose.runtime.v1 v1Var) {
        return new m(l3Var, aVar);
    }

    @androidx.compose.runtime.o
    @kotlin.a1
    @NotNull
    public static final <S, T, V extends w> n7<T> D(@NotNull final l3<S> l3Var, T t10, T t11, @NotNull y0<T> y0Var, @NotNull z3<T, V> z3Var, @NotNull String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.runtime.snapshots.m mVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1869)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z10 = (i12 > 4 && c0Var.D(l3Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                mVar = mVarM;
                try {
                    Object dVar = l3Var.new d(t10, r.i(z3Var, t11), z3Var, str);
                    aVar.x(mVarG, mVar, function1L);
                    c0Var.Y(dVar);
                    objI0 = dVar;
                } catch (Throwable th2) {
                    th = th2;
                    aVar.x(mVarG, mVar, function1L);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                mVar = mVarM;
            }
        }
        final l3.d dVar2 = (l3.d) objI0;
        int i13 = (i10 >> 3) & 8;
        int i14 = i10 << 3;
        m(l3Var, dVar2, t10, t11, y0Var, c0Var, (i13 << 9) | (i13 << 6) | i11 | (i14 & 896) | (i14 & 7168) | (57344 & i14));
        boolean zD = c0Var.D(dVar2) | ((i12 > 4 && c0Var.D(l3Var)) || (i10 & 6) == 4);
        Object objI1 = c0Var.i0();
        if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function1() { // from class: androidx.compose.animation.core.s3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w3.E(l3Var, dVar2, (androidx.compose.runtime.v1) obj);
                }
            };
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.d(dVar2, (Function1) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return dVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 E(l3 l3Var, l3.d dVar, androidx.compose.runtime.v1 v1Var) {
        l3Var.f(dVar);
        return new n(l3Var, dVar);
    }

    @NotNull
    public static final androidx.compose.runtime.snapshots.q0 F() {
        return (androidx.compose.runtime.snapshots.q0) f13354c.getValue();
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> l3<T> G(@NotNull x3<T> x3Var, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1643203617, i10, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:804)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && c0Var.D(x3Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                Object l3Var = new l3((x3) x3Var, str);
                aVar.x(mVarG, mVarM, function1L);
                c0Var.Y(l3Var);
                objI0 = l3Var;
            } catch (Throwable th2) {
                aVar.x(mVarG, mVarM, function1L);
                throw th2;
            }
        }
        final l3<T> l3Var2 = (l3) objI0;
        if (x3Var instanceof k2) {
            c0Var.E(-1357588631);
            k2 k2Var = (k2) x3Var;
            Object objA = k2Var.a();
            Object objB = k2Var.b();
            if ((i12 <= 4 || !c0Var.D(x3Var)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objI1 = c0Var.i0();
            if (z10 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new o(x3Var, null);
                c0Var.Y(objI1);
            }
            androidx.compose.runtime.b2.h(objA, objB, (Function2) objI1, c0Var, 0);
            c0Var.A();
        } else {
            c0Var.E(-1357127072);
            l3Var2.h(x3Var.b(), c0Var, 0);
            c0Var.A();
        }
        boolean zD = c0Var.D(l3Var2);
        Object objI2 = c0Var.i0();
        if (zD || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
            objI2 = new Function1() { // from class: androidx.compose.animation.core.n3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w3.H(l3Var2, (androidx.compose.runtime.v1) obj);
                }
            };
            c0Var.Y(objI2);
        }
        androidx.compose.runtime.b2.d(l3Var2, (Function1) objI2, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return l3Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 H(l3 l3Var, androidx.compose.runtime.v1 v1Var) {
        return new p(l3Var);
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = "Use rememberTransition() instead", replaceWith = @kotlin.b1(expression = "rememberTransition(transitionState, label)", imports = {}))
    @NotNull
    public static final <T> l3<T> I(@NotNull w1<T> w1Var, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(882913843, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:863)");
        }
        l3<T> l3VarG = G(w1Var, str, c0Var, i10 & okhttp3.internal.ws.g.f334652s, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return l3VarG;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> l3<T> J(T t10, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:87)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = new l3(t10, str);
            c0Var.Y(objI0);
        }
        final l3<T> l3Var = (l3) objI0;
        l3Var.h(t10, c0Var, (i10 & 8) | 48 | (i10 & 14));
        Object objI1 = c0Var.i0();
        if (objI1 == aVar.a()) {
            objI1 = new Function1() { // from class: androidx.compose.animation.core.u3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w3.K(l3Var, (androidx.compose.runtime.v1) obj);
                }
            };
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.d(l3Var, (Function1) objI1, c0Var, 54);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return l3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 K(l3 l3Var, androidx.compose.runtime.v1 v1Var) {
        return new q(l3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.snapshots.q0 j() {
        androidx.compose.runtime.snapshots.q0 q0Var = new androidx.compose.runtime.snapshots.q0(new Function1() { // from class: androidx.compose.animation.core.t3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w3.k((Function0) obj);
            }
        });
        q0Var.t();
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function0 function0) {
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(k2 k2Var) {
        k2Var.P();
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final <S, T, V extends w> void m(final l3<S> l3Var, final l3<S>.d<T, V> dVar, final T t10, final T t11, final y0<T> y0Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(867041821);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(l3Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(dVar) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= (i10 & 512) == 0 ? c0VarR.D(t10) : c0VarR.k0(t10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? c0VarR.D(t11) : c0VarR.k0(t11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? c0VarR.D(y0Var) : c0VarR.k0(y0Var) ? 16384 : 8192;
        }
        if (c0VarR.h((i11 & 9363) != 9362, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(867041821, i11, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1907)");
            }
            if (l3Var.E()) {
                dVar.U(t10, t11, y0Var);
            } else {
                dVar.W(t11, y0Var);
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.animation.core.v3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w3.n(l3Var, dVar, t10, t11, y0Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(l3 l3Var, l3.d dVar, Object obj, Object obj2, y0 y0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        m(l3Var, dVar, obj, obj2, y0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> n7<androidx.compose.ui.unit.h> p(@NotNull l3<S> l3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<androidx.compose.ui.unit.h>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, androidx.compose.ui.unit.h> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        if ((i11 & 1) != 0) {
            nVar = a.f13360a;
        }
        if ((i11 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        z3<androidx.compose.ui.unit.h, s> z3VarL = t4.L(androidx.compose.ui.unit.h.f42689b);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i14 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i15 = (i14 >> 9) & com.planner5d.library.engine.input.f.b.B;
        androidx.compose.ui.unit.h hVarInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i15));
        int i16 = i14 & 14;
        int i17 = i16 ^ 6;
        boolean z11 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = w6.e(new k(l3Var));
            c0Var.Y(objI0);
        }
        androidx.compose.ui.unit.h hVarInvoke2 = nVar2.invoke((Object) ((n7) objI0).getValue(), c0Var, Integer.valueOf(i15));
        boolean z12 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new j(l3Var));
            c0Var.Y(objI1);
        }
        return D(l3Var, hVarInvoke, hVarInvoke2, nVar.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf((i14 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3VarL, str2, c0Var, i16 | ((i14 << 6) & 458752));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> n7<Float> q(@NotNull l3<S> l3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<Float>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, Float> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        if ((i11 & 1) != 0) {
            nVar = b.f13361a;
        }
        if ((i11 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        z3<Float, s> z3VarP = t4.P(kotlin.jvm.internal.z.f312833a);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i14 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i15 = (i14 >> 9) & com.planner5d.library.engine.input.f.b.B;
        Float fInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i15));
        int i16 = i14 & 14;
        int i17 = i16 ^ 6;
        boolean z11 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = w6.e(new k(l3Var));
            c0Var.Y(objI0);
        }
        Float fInvoke2 = nVar2.invoke((Object) ((n7) objI0).getValue(), c0Var, Integer.valueOf(i15));
        boolean z12 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new j(l3Var));
            c0Var.Y(objI1);
        }
        return D(l3Var, fInvoke, fInvoke2, nVar.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf((i14 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3VarP, str2, c0Var, i16 | ((i14 << 6) & 458752));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> n7<Integer> r(@NotNull l3<S> l3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<Integer>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, Integer> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        if ((i11 & 1) != 0) {
            nVar = c.f13362a;
        }
        if ((i11 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        z3<Integer, s> z3VarQ = t4.Q(kotlin.jvm.internal.i0.f312739a);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i14 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i15 = (i14 >> 9) & com.planner5d.library.engine.input.f.b.B;
        Integer numInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i15));
        int i16 = i14 & 14;
        int i17 = i16 ^ 6;
        boolean z11 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = w6.e(new k(l3Var));
            c0Var.Y(objI0);
        }
        Integer numInvoke2 = nVar2.invoke((Object) ((n7) objI0).getValue(), c0Var, Integer.valueOf(i15));
        boolean z12 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new j(l3Var));
            c0Var.Y(objI1);
        }
        return D(l3Var, numInvoke, numInvoke2, nVar.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf((i14 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3VarQ, str2, c0Var, i16 | ((i14 << 6) & 458752));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> n7<androidx.compose.ui.unit.q> s(@NotNull l3<S> l3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<androidx.compose.ui.unit.q>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, androidx.compose.ui.unit.q> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        if ((i11 & 1) != 0) {
            nVar = d.f13363a;
        }
        if ((i11 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        z3<androidx.compose.ui.unit.q, t> z3VarN = t4.N(androidx.compose.ui.unit.q.f42709b);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i14 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i15 = (i14 >> 9) & com.planner5d.library.engine.input.f.b.B;
        androidx.compose.ui.unit.q qVarInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i15));
        int i16 = i14 & 14;
        int i17 = i16 ^ 6;
        boolean z11 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = w6.e(new k(l3Var));
            c0Var.Y(objI0);
        }
        androidx.compose.ui.unit.q qVarInvoke2 = nVar2.invoke((Object) ((n7) objI0).getValue(), c0Var, Integer.valueOf(i15));
        boolean z12 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new j(l3Var));
            c0Var.Y(objI1);
        }
        return D(l3Var, qVarInvoke, qVarInvoke2, nVar.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf((i14 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3VarN, str2, c0Var, i16 | ((i14 << 6) & 458752));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> n7<androidx.compose.ui.unit.u> t(@NotNull l3<S> l3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<androidx.compose.ui.unit.u>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, androidx.compose.ui.unit.u> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        if ((i11 & 1) != 0) {
            nVar = e.f13364a;
        }
        if ((i11 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        z3<androidx.compose.ui.unit.u, t> z3VarO = t4.O(androidx.compose.ui.unit.u.f42720b);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i14 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i15 = (i14 >> 9) & com.planner5d.library.engine.input.f.b.B;
        androidx.compose.ui.unit.u uVarInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i15));
        int i16 = i14 & 14;
        int i17 = i16 ^ 6;
        boolean z11 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = w6.e(new k(l3Var));
            c0Var.Y(objI0);
        }
        androidx.compose.ui.unit.u uVarInvoke2 = nVar2.invoke((Object) ((n7) objI0).getValue(), c0Var, Integer.valueOf(i15));
        boolean z12 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new j(l3Var));
            c0Var.Y(objI1);
        }
        return D(l3Var, uVarInvoke, uVarInvoke2, nVar.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf((i14 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3VarO, str2, c0Var, i16 | ((i14 << 6) & 458752));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> n7<n0.g> u(@NotNull l3<S> l3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<n0.g>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, n0.g> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        if ((i11 & 1) != 0) {
            nVar = f.f13365a;
        }
        if ((i11 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        z3<n0.g, t> z3VarR = t4.R(n0.g.f332700b);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i14 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i15 = (i14 >> 9) & com.planner5d.library.engine.input.f.b.B;
        n0.g gVarInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i15));
        int i16 = i14 & 14;
        int i17 = i16 ^ 6;
        boolean z11 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = w6.e(new k(l3Var));
            c0Var.Y(objI0);
        }
        n0.g gVarInvoke2 = nVar2.invoke((Object) ((n7) objI0).getValue(), c0Var, Integer.valueOf(i15));
        boolean z12 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new j(l3Var));
            c0Var.Y(objI1);
        }
        return D(l3Var, gVarInvoke, gVarInvoke2, nVar.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf((i14 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3VarR, str2, c0Var, i16 | ((i14 << 6) & 458752));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> n7<n0.j> v(@NotNull l3<S> l3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<n0.j>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, n0.j> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        if ((i11 & 1) != 0) {
            nVar = g.f13366a;
        }
        if ((i11 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        z3<n0.j, v> z3VarS = t4.S(n0.j.f332705e);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i14 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i15 = (i14 >> 9) & com.planner5d.library.engine.input.f.b.B;
        n0.j jVarInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i15));
        int i16 = i14 & 14;
        int i17 = i16 ^ 6;
        boolean z11 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = w6.e(new k(l3Var));
            c0Var.Y(objI0);
        }
        n0.j jVarInvoke2 = nVar2.invoke((Object) ((n7) objI0).getValue(), c0Var, Integer.valueOf(i15));
        boolean z12 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new j(l3Var));
            c0Var.Y(objI1);
        }
        return D(l3Var, jVarInvoke, jVarInvoke2, nVar.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf((i14 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3VarS, str2, c0Var, i16 | ((i14 << 6) & 458752));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> n7<n0.n> w(@NotNull l3<S> l3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<n0.n>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, n0.n> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        if ((i11 & 1) != 0) {
            nVar = h.f13367a;
        }
        if ((i11 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        z3<n0.n, t> z3VarT = t4.T(n0.n.f332724b);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i14 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i15 = (i14 >> 9) & com.planner5d.library.engine.input.f.b.B;
        n0.n nVarInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i15));
        int i16 = i14 & 14;
        int i17 = i16 ^ 6;
        boolean z11 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = w6.e(new k(l3Var));
            c0Var.Y(objI0);
        }
        n0.n nVarInvoke2 = nVar2.invoke((Object) ((n7) objI0).getValue(), c0Var, Integer.valueOf(i15));
        boolean z12 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new j(l3Var));
            c0Var.Y(objI1);
        }
        return D(l3Var, nVarInvoke, nVarInvoke2, nVar.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf((i14 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3VarT, str2, c0Var, i16 | ((i14 << 6) & 458752));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S, T, V extends w> n7<T> x(@NotNull l3<S> l3Var, @NotNull z3<T, V> z3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<T>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, ? extends T> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends y0<T>> nVar3 = (i11 & 2) != 0 ? i.f13368a : nVar;
        String str2 = (i11 & 4) != 0 ? "ValueAnimation" : str;
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i10 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i12 = (i10 >> 9) & com.planner5d.library.engine.input.f.b.B;
        T tInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i12));
        int i13 = i10 & 14;
        int i14 = i13 ^ 6;
        boolean z11 = (i14 > 4 && c0Var.D(l3Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = w6.e(new k(l3Var));
            c0Var.Y(objI0);
        }
        T tInvoke2 = nVar2.invoke((Object) ((n7) objI0).getValue(), c0Var, Integer.valueOf(i12));
        boolean z12 = (i14 > 4 && c0Var.D(l3Var)) || (i10 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new j(l3Var));
            c0Var.Y(objI1);
        }
        return D(l3Var, tInvoke, tInvoke2, nVar3.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf((i10 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3Var, str2, c0Var, (57344 & (i10 << 9)) | i13 | (458752 & (i10 << 6)));
    }

    @x0
    @NotNull
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final <S, T> l3<T> y(@NotNull l3<S> l3Var, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, ? extends T> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = 7 << 4;
        if (((i12 ^ 6) <= 4 || !c0Var.D(l3Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = l3Var.p();
            c0Var.Y(objI0);
        }
        if (l3Var.E()) {
            objI0 = l3Var.p();
        }
        int i14 = (i10 >> 3) & com.planner5d.library.engine.input.f.b.B;
        return z(l3Var, nVar.invoke(objI0, c0Var, Integer.valueOf(i14)), nVar.invoke(l3Var.y(), c0Var, Integer.valueOf(i14)), str2, c0Var, i12 | ((i10 << 6) & 7168));
    }

    @androidx.compose.runtime.o
    @kotlin.a1
    @NotNull
    public static final <S, T> l3<T> z(@NotNull final l3<S> l3Var, T t10, T t11, @NotNull String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1780)");
        }
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && c0Var.D(l3Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new l3(new w1(t10), l3Var, l3Var.s() + " > " + str);
            c0Var.Y(objI0);
        }
        final l3<T> l3Var2 = (l3) objI0;
        if ((i11 <= 4 || !c0Var.D(l3Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zD = c0Var.D(l3Var2) | z10;
        Object objI1 = c0Var.i0();
        if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function1() { // from class: androidx.compose.animation.core.o3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w3.A(l3Var, l3Var2, (androidx.compose.runtime.v1) obj);
                }
            };
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.d(l3Var2, (Function1) objI1, c0Var, 0);
        if (l3Var.E()) {
            l3Var2.P(t10, t11, l3Var.t());
        } else {
            l3Var2.c0(t11);
            l3Var2.U(false);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return l3Var2;
    }
}
