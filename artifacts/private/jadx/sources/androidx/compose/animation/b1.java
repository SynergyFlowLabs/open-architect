package androidx.compose.animation;

import androidx.collection.k2;
import androidx.compose.animation.core.l3;
import androidx.compose.animation.core.t4;
import androidx.compose.animation.core.w1;
import androidx.compose.animation.core.w3;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.w6;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.layout.i2;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@i0
@k7
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1222:1\n85#2:1223\n117#2,2:1224\n1282#3,6:1226\n1282#3,6:1309\n385#4:1232\n357#4,4:1233\n329#4,6:1237\n339#4,3:1244\n342#4,9:1248\n361#4:1257\n386#4:1258\n357#4,4:1259\n329#4,6:1263\n339#4,3:1270\n342#4,9:1274\n361#4:1283\n357#4,4:1284\n329#4,6:1288\n339#4,3:1295\n342#4,9:1299\n361#4:1308\n1399#5:1243\n1270#5:1247\n1399#5:1269\n1270#5:1273\n1399#5:1294\n1270#5:1298\n1#6:1315\n1010#7,2:1316\n360#7,7:1323\n35#8,5:1318\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n673#1:1223\n673#1:1224,2\n875#1:1226,6\n993#1:1309,6\n887#1:1232\n887#1:1233,4\n887#1:1237,6\n887#1:1244,3\n887#1:1248,9\n887#1:1257\n887#1:1258\n891#1:1259,4\n891#1:1263,6\n891#1:1270,3\n891#1:1274,9\n891#1:1283\n894#1:1284,4\n894#1:1288,6\n894#1:1295,3\n894#1:1299,9\n894#1:1308\n887#1:1243\n887#1:1247\n891#1:1269\n891#1:1273\n894#1:1294\n894#1:1298\n1041#1:1316,2\n1071#1:1323,7\n1046#1:1318,5\n*E\n"})
public final class b1 implements a1, androidx.compose.ui.layout.w0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f12671l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.ui.layout.w0 f12673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f12674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12675c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.compose.ui.layout.g0 f12679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g0 f12680h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final b f12670k = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0<androidx.compose.runtime.snapshots.q0> f12672m = kotlin.g0.b(kotlin.j0.NONE, a.f12683a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f12676d = d7.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f12677e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<a1, Unit> f12678f = new m();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final SnapshotStateList<n0> f12681i = w6.g();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final k2<Object, x0> f12682j = new k2<>(0, 1, null);

    @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1222:1\n1#2:1223\n*E\n"})
    static final class a extends kotlin.jvm.internal.l0 implements Function0<androidx.compose.runtime.snapshots.q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12683a = new a();

        /* JADX INFO: renamed from: androidx.compose.animation.b1$a$a, reason: collision with other inner class name */
        static final class C0056a extends kotlin.jvm.internal.l0 implements Function1<Function0<? extends Unit>, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0056a f12684a = new C0056a();

            C0056a() {
                super(1);
            }

            public final void c(Function0<Unit> function0) {
                function0.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                c(function0);
                return Unit.f312394a;
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.q0 invoke() {
            androidx.compose.runtime.snapshots.q0 q0Var = new androidx.compose.runtime.snapshots.q0(C0056a.f12684a);
            q0Var.t();
            return q0Var;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final androidx.compose.runtime.snapshots.q0 b() {
            return (androidx.compose.runtime.snapshots.q0) b1.f12672m.getValue();
        }

        private b() {
        }
    }

    private static final class c implements a1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final q3 f12685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.graphics.k2 f12686b = androidx.compose.ui.graphics.u.a();

        public c(@NotNull q3 q3Var) {
            this.f12685a = q3Var;
        }

        @Override // androidx.compose.animation.a1.a
        @NotNull
        public androidx.compose.ui.graphics.k2 a(@NotNull a1.d dVar, @NotNull n0.j jVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar2) {
            this.f12686b.reset();
            g2.a(this.f12686b, this.f12685a.mo0createOutlinePq9zytI(jVar.z(), wVar, dVar2));
            this.f12686b.m(jVar.E());
            return this.f12686b;
        }

        @NotNull
        public final q3 b() {
            return this.f12685a;
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n1#1,102:1\n1042#2,3:103\n*E\n"})
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            n0 n0Var = (n0) t10;
            n0 n0Var2 = (n0) t11;
            return kotlin.comparisons.a.l(Float.valueOf((n0Var.b() == 0.0f && (n0Var instanceof y0) && ((y0) n0Var).a() == null) ? -1.0f : n0Var.b()), Float.valueOf((n0Var2.b() == 0.0f && (n0Var2 instanceof y0) && ((y0) n0Var2).a() == null) ? -1.0f : n0Var2.b()));
        }
    }

    @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1222:1\n385#2:1223\n357#2,4:1224\n329#2,6:1228\n339#2,3:1235\n342#2,9:1239\n361#2:1248\n386#2:1249\n1399#3:1234\n1270#3:1238\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1\n*L\n879#1:1223\n879#1:1224,4\n879#1:1228,6\n879#1:1235,3\n879#1:1239,9\n879#1:1248\n879#1:1249\n879#1:1234\n879#1:1238\n*E\n"})
    static final class e extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k2 k2Var = b1.this.f12682j;
            Object[] objArr = k2Var.f12131b;
            Object[] objArr2 = k2Var.f12132c;
            long[] jArr = k2Var.f12130a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            if (((x0) objArr2[i13]).o()) {
                                return;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.SharedTransitionScopeImpl$onStateRemoved$1$1", f = "SharedTransitionScope.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x0 f12689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(x0 x0Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f12689b = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f12689b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f12688a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.f12689b.h().isEmpty()) {
                this.f12689b.g().f12682j.l0(this.f12689b.e());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function1<z, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f12690a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z zVar) {
            return Boolean.valueOf(zVar == z.Visible);
        }
    }

    @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1222:1\n1282#2,6:1223\n1282#2,6:1229\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$2\n*L\n746#1:1223,6\n751#1:1229,6\n*E\n"})
    static final class h extends kotlin.jvm.internal.l0 implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.l f12691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f12692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f12693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a1.d f12694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a1.c f12695e;

        static final class a extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a1.d f12696a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a1.d dVar) {
                super(0);
                this.f12696a = dVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f12696a.f());
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a1.d f12697a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a1.d dVar) {
                super(0);
                this.f12697a = dVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f12697a.f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.animation.l lVar, d0 d0Var, f0 f0Var, a1.d dVar, a1.c cVar) {
            super(3);
            this.f12691a = lVar;
            this.f12692b = d0Var;
            this.f12693c = f0Var;
            this.f12694d = dVar;
            this.f12695e = cVar;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.ui.a0 a0VarB;
            c0Var.E(-419341573);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-419341573, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:736)");
            }
            l3<z> l3VarB = this.f12691a.b();
            d0 d0Var = this.f12692b;
            f0 f0Var = this.f12693c;
            boolean zK0 = c0Var.k0(this.f12694d);
            a1.d dVar = this.f12694d;
            Object objI0 = c0Var.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a(dVar);
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarG = b0.g(l3VarB, d0Var, f0Var, (Function0) objI0, "enter/exit for " + this.f12694d.c(), c0Var, 0, 0);
            if (this.f12695e instanceof u0) {
                c0Var.E(1455895917);
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                u0 u0Var = (u0) this.f12695e;
                boolean zK1 = c0Var.k0(this.f12694d);
                a1.d dVar2 = this.f12694d;
                Object objI1 = c0Var.i0();
                if (zK1 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new b(dVar2);
                    c0Var.Y(objI1);
                }
                a0VarB = j1.b(aVar, u0Var, (Function0) objI1);
                c0Var.A();
            } else {
                c0Var.E(1456513127);
                c0Var.A();
                a0VarB = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarB2 = a0VarG.B2(a0VarB);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1222:1\n1282#2,6:1223\n1282#2,6:1231\n1282#2,6:1240\n1282#2,6:1247\n1768#3,2:1229\n1770#3,3:1237\n1#4:1246\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1\n*L\n919#1:1223,6\n925#1:1231,6\n932#1:1240,6\n957#1:1247,6\n925#1:1229,2\n925#1:1237,3\n*E\n"})
    static final class i extends kotlin.jvm.internal.l0 implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a1.d f12698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3<T> f12699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f12700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b1 f12701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a1.b f12702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f12703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a1.a f12704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f12705h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f12706i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ s f12707j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(a1.d dVar, l3<T> l3Var, Function1<? super T, Boolean> function1, b1 b1Var, a1.b bVar, boolean z10, a1.a aVar, float f10, boolean z11, s sVar) {
            super(3);
            this.f12698a = dVar;
            this.f12699b = l3Var;
            this.f12700c = function1;
            this.f12701d = b1Var;
            this.f12702e = bVar;
            this.f12703f = z10;
            this.f12704g = aVar;
            this.f12705h = f10;
            this.f12706i = z11;
            this.f12707j = sVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            l3 l3VarG;
            c0Var.E(-1843478929);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1843478929, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:915)");
            }
            Object objC = this.f12698a.c();
            c0Var.m0(-2056718552, objC);
            b1 b1Var = this.f12701d;
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = b1Var.F(objC);
                c0Var.Y(objI0);
            }
            x0 x0Var = (x0) objI0;
            c0Var.m0(-2056714740, this.f12699b);
            boolean z10 = false;
            if (this.f12699b != 0) {
                c0Var.E(666402505);
                l3<T> l3Var = this.f12699b;
                String string = objC.toString();
                Function1<T, Boolean> function1 = this.f12700c;
                boolean zD = c0Var.D(l3Var);
                Object objI1 = c0Var.i0();
                if (zD || objI1 == aVar.a()) {
                    objI1 = l3Var.p();
                    c0Var.Y(objI1);
                }
                if (l3Var.E()) {
                    objI1 = l3Var.p();
                }
                c0Var.E(1329676753);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
                }
                Boolean boolInvoke = function1.invoke((T) objI1);
                boolInvoke.booleanValue();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var.A();
                Object objY = l3Var.y();
                c0Var.E(1329676753);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
                }
                Boolean boolInvoke2 = function1.invoke((T) objY);
                boolInvoke2.booleanValue();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var.A();
                l3VarG = w3.z(l3Var, boolInvoke, boolInvoke2, string, c0Var, 0);
                c0Var.A();
            } else {
                c0Var.E(666654225);
                Function1<T, Boolean> function2 = this.f12700c;
                Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
                Boolean bool = (Boolean) ((Function1) kotlin.jvm.internal.r1.q(function2, 1)).invoke(Unit.f312394a);
                boolean zBooleanValue = bool.booleanValue();
                Object objI2 = c0Var.i0();
                if (objI2 == aVar.a()) {
                    if (x0Var.h().isEmpty()) {
                        z10 = zBooleanValue;
                    } else if (!zBooleanValue) {
                        z10 = true;
                    }
                    objI2 = new w1(Boolean.valueOf(z10));
                    c0Var.Y(objI2);
                }
                w1 w1Var = (w1) objI2;
                w1Var.f(bool);
                l3VarG = w3.G(w1Var, null, c0Var, w1.f13348e, 2);
                c0Var.A();
            }
            c0Var.m0(-2056651003, Boolean.valueOf(this.f12701d.I()));
            l3<Boolean>.a<n0.j, androidx.compose.animation.core.v> aVarB = w3.B(l3VarG, t4.S(n0.j.f332705e), null, c0Var, 0, 2);
            c0Var.v0();
            boolean zD2 = c0Var.D(l3VarG);
            b1 b1Var2 = this.f12701d;
            s sVar = this.f12707j;
            Object objI3 = c0Var.i0();
            if (zD2 || objI3 == aVar.a()) {
                objI3 = new o(b1Var2, l3VarG, aVarB, sVar);
                c0Var.Y(objI3);
            }
            o oVar = (o) objI3;
            oVar.o(aVarB, this.f12707j);
            c0Var.v0();
            y0 y0VarV = this.f12701d.v(x0Var, oVar, this.f12702e, this.f12703f, this.f12698a, this.f12704g, this.f12705h, this.f12706i, c0Var, 0);
            c0Var.v0();
            androidx.compose.ui.a0 a0VarB2 = a0Var.B2(new SharedBoundsNodeElement(y0VarV));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function1<Unit, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f12708a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z10) {
            super(1);
            this.f12708a = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Unit unit) {
            return Boolean.valueOf(this.f12708a);
        }
    }

    static final class k extends kotlin.jvm.internal.l0 implements Function1<z, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f12709a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z zVar) {
            return Boolean.valueOf(zVar == z.Visible);
        }
    }

    static final class l extends kotlin.jvm.internal.l0 implements Function1<Unit, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f12710a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10) {
            super(1);
            this.f12710a = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Unit unit) {
            return Boolean.valueOf(this.f12710a);
        }
    }

    static final class m extends kotlin.jvm.internal.l0 implements Function1<a1, Unit> {
        m() {
            super(1);
        }

        public final void c(a1 a1Var) {
            b1.this.G();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a1 a1Var) {
            c(a1Var);
            return Unit.f312394a;
        }
    }

    public b1(@NotNull androidx.compose.ui.layout.w0 w0Var, @NotNull kotlinx.coroutines.s0 s0Var) {
        this.f12673a = w0Var;
        this.f12674b = s0Var;
    }

    private void A(boolean z10) {
        this.f12676d.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> androidx.compose.ui.a0 B(androidx.compose.ui.a0 a0Var, a1.d dVar, l3<T> l3Var, Function1<? super T, Boolean> function1, s sVar, a1.b bVar, boolean z10, boolean z11, float f10, a1.a aVar) {
        return androidx.compose.ui.m.k(a0Var, null, new i(dVar, l3Var, function1, this, bVar, z10, aVar, f10, z11, sVar), 1, null);
    }

    public static /* synthetic */ androidx.compose.ui.a0 E(b1 b1Var, androidx.compose.ui.a0 a0Var, a1.d dVar, boolean z10, s sVar, a1.b bVar, boolean z11, float f10, a1.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            sVar = d1.f13422d;
        }
        s sVar2 = sVar;
        if ((i10 & 8) != 0) {
            bVar = a1.b.f12604a.b();
        }
        return b1Var.D(a0Var, dVar, z10, sVar2, bVar, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? 0.0f : f10, (i10 & 64) != 0 ? d1.f13420b : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0 F(Object obj) {
        x0 x0VarP = this.f12682j.p(obj);
        if (x0VarP == null) {
            x0VarP = new x0(obj, this);
            this.f12682j.q0(obj, x0VarP);
        }
        return x0VarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:5:0x0022->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[LOOP:2: B:27:0x007c->B:37:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6 A[LOOP:4: B:42:0x00c7->B:52:0x00f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9 A[EDGE_INSN: B:61:0x00b9->B:39:0x00b9 BREAK  A[LOOP:2: B:27:0x007c->B:37:0x00af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[EDGE_INSN: B:62:0x00b9->B:39:0x00b9 BREAK  A[LOOP:2: B:27:0x007c->B:37:0x00af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9 A[EDGE_INSN: B:66:0x00f9->B:53:0x00f9 BREAK  A[LOOP:4: B:42:0x00c7->B:52:0x00f6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9 A[EDGE_INSN: B:67:0x00f9->B:53:0x00f9 BREAK  A[LOOP:4: B:42:0x00c7->B:52:0x00f6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ee A[SYNTHETIC] */
    public final void G() {
        long j10;
        long j11;
        boolean z10;
        char c10;
        long j12;
        Object[] objArr;
        Object[] objArr2;
        long[] jArr;
        int length;
        int i10;
        long j13;
        int i11;
        int i12;
        Object[] objArr3;
        Object[] objArr4;
        long[] jArr2;
        int length2;
        int i13;
        long j14;
        int i14;
        int i15;
        k2<Object, x0> k2Var = this.f12682j;
        Object[] objArr5 = k2Var.f12131b;
        Object[] objArr6 = k2Var.f12132c;
        long[] jArr3 = k2Var.f12130a;
        int length3 = jArr3.length - 2;
        char c11 = 7;
        long j15 = -9187201950435737472L;
        if (length3 >= 0) {
            int i16 = 0;
            j10 = 128;
            loop0: while (true) {
                long j16 = jArr3[i16];
                j11 = 255;
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length3)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j16 & 255) < 128) {
                            int i19 = (i16 << 3) + i18;
                            Object obj = objArr5[i19];
                            if (((x0) objArr6[i19]).o()) {
                                z10 = true;
                                break loop0;
                            }
                        }
                        j16 >>= 8;
                    }
                    if (i17 == 8) {
                        if (i16 != length3) {
                            i16++;
                        }
                    }
                } else if (i16 != length3) {
                    i16++;
                }
            }
            if (z10 != I()) {
                A(z10);
                if (z10) {
                    c10 = 7;
                    j12 = -9187201950435737472L;
                } else {
                    k2<Object, x0> k2Var2 = this.f12682j;
                    objArr3 = k2Var2.f12131b;
                    objArr4 = k2Var2.f12132c;
                    jArr2 = k2Var2.f12130a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i13 = 0;
                        while (true) {
                            j14 = jArr2[i13];
                            c10 = c11;
                            j12 = j15;
                            if ((((~j14) << c10) & j14 & j12) != j12) {
                                i14 = 8 - ((~(i13 - length2)) >>> 31);
                                for (i15 = 0; i15 < i14; i15++) {
                                    if ((j14 & j11) < j10) {
                                        int i20 = (i13 << 3) + i15;
                                        Object obj2 = objArr3[i20];
                                        ((x0) objArr4[i20]).r();
                                    }
                                    j14 >>= 8;
                                }
                                if (i14 == 8) {
                                    break;
                                }
                                if (i13 != length2) {
                                    break;
                                }
                                i13++;
                                c11 = c10;
                                j15 = j12;
                            } else if (i13 != length2) {
                                break;
                                break;
                            } else {
                                i13++;
                                c11 = c10;
                                j15 = j12;
                            }
                        }
                    } else {
                        c10 = 7;
                        j12 = -9187201950435737472L;
                    }
                }
            } else {
                c10 = 7;
                j12 = -9187201950435737472L;
            }
            k2<Object, x0> k2Var3 = this.f12682j;
            objArr = k2Var3.f12131b;
            objArr2 = k2Var3.f12132c;
            jArr = k2Var3.f12130a;
            length = jArr.length - 2;
            if (length >= 0) {
                i10 = 0;
                while (true) {
                    j13 = jArr[i10];
                    if ((((~j13) << c10) & j13 & j12) != j12) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (i12 = 0; i12 < i11; i12++) {
                            if ((j13 & j11) < j10) {
                                int i21 = (i10 << 3) + i12;
                                Object obj3 = objArr[i21];
                                ((x0) objArr2[i21]).A();
                            }
                            j13 >>= 8;
                        }
                        if (i11 == 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            o();
        }
        j10 = 128;
        j11 = 255;
        z10 = false;
        if (z10 != I()) {
            A(z10);
            if (z10) {
                k2<Object, x0> k2Var4 = this.f12682j;
                objArr3 = k2Var4.f12131b;
                objArr4 = k2Var4.f12132c;
                jArr2 = k2Var4.f12130a;
                length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    i13 = 0;
                    while (true) {
                        j14 = jArr2[i13];
                        c10 = c11;
                        j12 = j15;
                        if ((((~j14) << c10) & j14 & j12) != j12) {
                            i14 = 8 - ((~(i13 - length2)) >>> 31);
                            while (i15 < i14) {
                                if ((j14 & j11) < j10) {
                                    int i22 = (i13 << 3) + i15;
                                    Object obj4 = objArr3[i22];
                                    ((x0) objArr4[i22]).r();
                                }
                                j14 >>= 8;
                            }
                            if (i14 == 8) {
                                break;
                                break;
                            } else if (i13 != length2) {
                                break;
                                break;
                            } else {
                                i13++;
                                c11 = c10;
                                j15 = j12;
                            }
                        } else if (i13 != length2) {
                            break;
                            break;
                        } else {
                            i13++;
                            c11 = c10;
                            j15 = j12;
                        }
                    }
                } else {
                    c10 = 7;
                    j12 = -9187201950435737472L;
                }
            } else {
                c10 = 7;
                j12 = -9187201950435737472L;
            }
        } else {
            c10 = 7;
            j12 = -9187201950435737472L;
        }
        k2<Object, x0> k2Var5 = this.f12682j;
        objArr = k2Var5.f12131b;
        objArr2 = k2Var5.f12132c;
        jArr = k2Var5.f12130a;
        length = jArr.length - 2;
        if (length >= 0) {
            i10 = 0;
            while (true) {
                j13 = jArr[i10];
                if ((((~j13) << c10) & j13 & j12) != j12) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    i11 = 8 - ((~(i10 - length)) >>> 31);
                    while (i12 < i11) {
                        if ((j13 & j11) < j10) {
                            int i23 = (i10 << 3) + i12;
                            Object obj5 = objArr[i23];
                            ((x0) objArr2[i23]).A();
                        }
                        j13 >>= 8;
                    }
                    if (i11 == 8) {
                        break;
                        break;
                    } else {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        o();
    }

    private final void o() {
        if (!this.f12675c) {
            f12670k.b().m(this, this.f12678f, this.f12677e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public final y0 v(x0 x0Var, o oVar, a1.b bVar, boolean z10, a1.d dVar, a1.a aVar, float f10, boolean z11, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2066772852, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:992)");
        }
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new y0(x0Var, oVar, bVar, z10, aVar, z11, dVar, f10);
            c0Var.Y(objI0);
        }
        y0 y0Var = (y0) objI0;
        dVar.g(y0Var);
        y0Var.D(x0Var);
        y0Var.C(z10);
        y0Var.u(oVar);
        y0Var.A(bVar);
        y0Var.y(aVar);
        y0Var.F(f10);
        y0Var.B(z11);
        y0Var.E(dVar);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return y0Var;
    }

    @NotNull
    public final androidx.compose.ui.a0 D(@NotNull androidx.compose.ui.a0 a0Var, @NotNull a1.d dVar, boolean z10, @NotNull s sVar, @NotNull a1.b bVar, boolean z11, float f10, @NotNull a1.a aVar) {
        return B(a0Var, dVar, null, new j(z10), sVar, bVar, false, z11, f10, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.a1
    public boolean I() {
        return ((Boolean) this.f12676d.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.layout.w0
    @NotNull
    public androidx.compose.ui.layout.g0 K(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        return this.f12673a.K(g0Var);
    }

    @Override // androidx.compose.ui.layout.w0
    @NotNull
    public androidx.compose.ui.layout.g0 N(@NotNull i2.a aVar) {
        return this.f12673a.N(aVar);
    }

    @Override // androidx.compose.animation.a1
    @androidx.compose.runtime.o
    @NotNull
    public a1.d U(@NotNull Object obj, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(799702514);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(799702514, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:874)");
        }
        boolean zD = c0Var.D(obj);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new a1.d(obj);
            c0Var.Y(objI0);
        }
        a1.d dVar = (a1.d) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return dVar;
    }

    @Override // androidx.compose.animation.a1
    @NotNull
    public androidx.compose.ui.a0 V(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function0<Boolean> function0, float f10, @NotNull Function2<? super androidx.compose.ui.unit.w, ? super androidx.compose.ui.unit.d, ? extends androidx.compose.ui.graphics.k2> function2) {
        return a0Var.B2(new RenderInTransitionOverlayNodeElement(this, function0, f10, function2));
    }

    @Override // androidx.compose.animation.a1
    @NotNull
    public androidx.compose.ui.a0 W(@NotNull androidx.compose.ui.a0 a0Var, @NotNull a1.d dVar, @NotNull androidx.compose.animation.l lVar, @NotNull s sVar, @NotNull a1.b bVar, boolean z10, float f10, @NotNull a1.a aVar) {
        return B(a0Var, dVar, lVar.b(), k.f12709a, sVar, bVar, true, z10, f10, aVar);
    }

    @Override // androidx.compose.ui.layout.w0
    public long b0(@NotNull androidx.compose.ui.layout.g0 g0Var, @NotNull androidx.compose.ui.layout.g0 g0Var2, long j10, boolean z10) {
        return this.f12673a.b0(g0Var, g0Var2, j10, z10);
    }

    @Override // androidx.compose.animation.a1
    @NotNull
    public androidx.compose.ui.a0 e0(@NotNull androidx.compose.ui.a0 a0Var, @NotNull a1.d dVar, @NotNull androidx.compose.animation.l lVar, @NotNull d0 d0Var, @NotNull f0 f0Var, @NotNull s sVar, @NotNull a1.c cVar, @NotNull a1.b bVar, boolean z10, float f10, @NotNull a1.a aVar) {
        return androidx.compose.ui.m.k(B(a0Var, dVar, lVar.b(), g.f12690a, sVar, bVar, false, z10, f10, aVar), null, new h(lVar, d0Var, f0Var, dVar, cVar), 1, null);
    }

    public final void g(@NotNull Object obj) {
        f12670k.b().g(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.a1
    @NotNull
    public androidx.compose.ui.a0 g0(@NotNull androidx.compose.ui.a0 a0Var) {
        return a0Var.B2(new SkipToLookaheadElement(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    public final void h(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        SnapshotStateList<n0> snapshotStateList = this.f12681i;
        if (snapshotStateList.size() > 1) {
            CollectionsKt.sortWith(snapshotStateList, new d());
        }
        SnapshotStateList<n0> snapshotStateList2 = this.f12681i;
        int size = snapshotStateList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList2.get(i10).c(cVar);
        }
    }

    @NotNull
    public final kotlinx.coroutines.s0 i() {
        return this.f12674b;
    }

    public final boolean j() {
        return this.f12675c;
    }

    @NotNull
    public final androidx.compose.ui.layout.g0 k() {
        androidx.compose.ui.layout.g0 g0Var = this.f12680h;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 l() {
        return this.f12680h;
    }

    @Override // androidx.compose.animation.a1
    @NotNull
    public a1.a l0(@NotNull q3 q3Var) {
        return new c(q3Var);
    }

    @NotNull
    public final androidx.compose.runtime.snapshots.q0 m() {
        return f12670k.b();
    }

    @NotNull
    public final androidx.compose.ui.layout.g0 n() {
        androidx.compose.ui.layout.g0 g0Var = this.f12679g;
        if (g0Var != null) {
            return g0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("root");
        return null;
    }

    public final void p(@NotNull x0 x0Var, @NotNull Function1<? super x0, Unit> function1, @NotNull Function0<Unit> function0) {
        if (this.f12675c) {
            return;
        }
        f12670k.b().m(x0Var, function1, function0);
    }

    public final void q() {
        f12670k.b().g(this);
        this.f12675c = true;
    }

    public final void r(@NotNull n0 n0Var) {
        this.f12681i.add(n0Var);
    }

    public final void s(@NotNull n0 n0Var) {
        this.f12681i.remove(n0Var);
    }

    public final void t(@NotNull y0 y0Var) {
        x0 x0VarO = y0Var.o();
        x0VarO.b(y0Var);
        this.f12678f.invoke(this);
        x0VarO.g().o();
        Iterator<n0> it = this.f12681i.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            n0 next = it.next();
            y0 y0Var2 = next instanceof y0 ? (y0) next : null;
            if (Intrinsics.areEqual(y0Var2 != null ? y0Var2.o() : null, y0Var.o())) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != this.f12681i.size() - 1 && i10 != -1) {
            this.f12681i.add(i10 + 1, y0Var);
            return;
        }
        this.f12681i.add(y0Var);
    }

    public final void u(@NotNull y0 y0Var) {
        x0 x0VarO = y0Var.o();
        x0VarO.s(y0Var);
        this.f12678f.invoke(this);
        x0VarO.g().o();
        this.f12681i.remove(y0Var);
        if (x0VarO.h().isEmpty()) {
            int i10 = 0 >> 3;
            kotlinx.coroutines.k.f(x0VarO.g().f12674b, null, null, new f(x0VarO, null), 3, null);
        }
    }

    @Override // androidx.compose.animation.a1
    @NotNull
    public androidx.compose.ui.a0 x(@NotNull androidx.compose.ui.a0 a0Var, @NotNull a1.d dVar, boolean z10, @NotNull s sVar, @NotNull a1.b bVar, boolean z11, float f10, @NotNull a1.a aVar) {
        return B(a0Var, dVar, null, new l(z10), sVar, bVar, true, z11, f10, aVar);
    }

    public final void y(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f12680h = g0Var;
    }

    public final void z(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.f12679g = g0Var;
    }
}
