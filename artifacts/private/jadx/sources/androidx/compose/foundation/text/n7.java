package androidx.compose.foundation.text;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
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
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextLinkScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,382:1\n85#2:383\n117#2,2:384\n30#3:386\n53#4,3:387\n150#5:390\n75#6:391\n35#7,3:392\n39#7:431\n35#7,5:432\n1282#8,6:395\n1282#8,6:401\n1282#8,6:407\n1282#8,6:413\n1282#8,6:419\n1282#8,6:425\n1282#8,6:437\n66#9,5:443\n*S KotlinDebug\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n*L\n66#1:383\n66#1:384,2\n180#1:386\n180#1:387,3\n180#1:390\n216#1:391\n219#1:392,3\n219#1:431\n307#1:432,5\n221#1:395,6\n225#1:401,6\n235#1:407,6\n244#1:413,6\n247#1:419,6\n257#1:425,6\n317#1:437,6\n319#1:443,5\n*E\n"})
public final class n7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f20716e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f20717a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.f f20719c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f20718b = androidx.compose.runtime.d7.g(null, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final SnapshotStateList<Function1<e5, Unit>> f20720d = androidx.compose.runtime.w6.g();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.Q1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h4 f20722b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h4 h4Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f20722b = h4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f20722b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20721a;
            if (i10 == 0) {
                ResultKt.m(obj);
                h4 h4Var = this.f20722b;
                this.f20721a = 1;
                if (h4Var.e(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n*L\n1#1,69:1\n319#2:70\n*E\n"})
    public static final class b implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f20724b;

        public b(Function1 function1) {
            this.f20724b = function1;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            n7.this.f20720d.remove(this.f20724b);
        }
    }

    public static final class c implements androidx.compose.ui.graphics.q3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.k2 f20725a;

        c(androidx.compose.ui.graphics.k2 k2Var) {
            this.f20725a = k2Var;
        }

        @Override // androidx.compose.ui.graphics.q3
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public androidx.compose.ui.graphics.f2 mo0createOutlinePq9zytI(long j10, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar) {
            return new androidx.compose.ui.graphics.f2.a(this.f20725a);
        }
    }

    public n7(@NotNull androidx.compose.ui.text.f fVar) {
        this.f20717a = fVar;
        int i10 = 0 & 2;
        this.f20719c = fVar.b(new Function1() { // from class: androidx.compose.foundation.text.g7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n7.w((androidx.compose.ui.text.f.e) obj);
            }
        });
    }

    private final androidx.compose.ui.a0 A(androidx.compose.ui.a0 a0Var, final androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar) {
        return androidx.compose.ui.graphics.q1.a(a0Var, new Function1() { // from class: androidx.compose.foundation.text.a7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n7.B(this.f18765a, eVar, (androidx.compose.ui.graphics.r1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(n7 n7Var, androidx.compose.ui.text.f.e eVar, androidx.compose.ui.graphics.r1 r1Var) {
        androidx.compose.ui.graphics.q3 q3VarL = n7Var.L(eVar);
        if (q3VarL != null) {
            r1Var.Q3(q3VarL);
            r1Var.O(true);
        }
        return Unit.f312394a;
    }

    private final void G(androidx.compose.ui.text.b0 b0Var, androidx.compose.ui.platform.h4 h4Var) {
        androidx.compose.ui.text.c0 c0VarA;
        if (b0Var instanceof androidx.compose.ui.text.b0.b) {
            androidx.compose.ui.text.c0 c0VarA2 = ((androidx.compose.ui.text.b0.b) b0Var).a();
            if (c0VarA2 != null) {
                c0VarA2.a(b0Var);
            } else {
                try {
                    h4Var.a(((androidx.compose.ui.text.b0.b) b0Var).e());
                } catch (IllegalArgumentException unused) {
                }
            }
        } else if ((b0Var instanceof androidx.compose.ui.text.b0.a) && (c0VarA = ((androidx.compose.ui.text.b0.a) b0Var).a()) != null) {
            c0VarA.a(b0Var);
        }
    }

    private final androidx.compose.ui.text.c3 H(androidx.compose.ui.text.c3 c3Var, androidx.compose.ui.text.c3 c3Var2) {
        androidx.compose.ui.text.c3 c3VarE;
        return (c3Var == null || (c3VarE = c3Var.E(c3Var2)) == null) ? c3Var2 : c3VarE;
    }

    private final androidx.compose.ui.graphics.k2 I(androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar) {
        androidx.compose.ui.text.p3 p3VarF;
        androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVarZ;
        if (!D().invoke().booleanValue() || (p3VarF = F()) == null || (eVarZ = z(eVar, p3VarF)) == null) {
            return null;
        }
        androidx.compose.ui.graphics.k2 k2VarA = p3VarF.A(eVarZ.i(), eVarZ.g());
        n0.j jVarD = p3VarF.d(eVarZ.i());
        k2VarA.m(n0.g.g(n0.g.g((((long) Float.floatToRawIntBits(p3VarF.r(eVarZ.i()) == p3VarF.r(eVarZ.g() + (-1)) ? Math.min(p3VarF.d(eVarZ.g() - 1).t(), jVarD.t()) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(jVarD.B())) & com.rabbitmq.client.k0.f265952a)) ^ (-9223372034707292160L)));
        return k2VarA;
    }

    private final androidx.compose.ui.graphics.q3 L(androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar) {
        androidx.compose.ui.graphics.k2 k2VarI = I(eVar);
        if (k2VarI != null) {
            return new c(k2VarI);
        }
        return null;
    }

    private final androidx.compose.ui.a0 M(androidx.compose.ui.a0 a0Var, final androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar) {
        return a0Var.B2(new u7(new v7() { // from class: androidx.compose.foundation.text.m7
            @Override // androidx.compose.foundation.text.v7
            public final s7 a(t7 t7Var) {
                return n7.N(this.f20515a, eVar, t7Var);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s7 N(n7 n7Var, androidx.compose.ui.text.f.e eVar, t7 t7Var) {
        androidx.compose.ui.text.p3 p3VarF = n7Var.F();
        if (p3VarF == null) {
            return t7Var.a(0, 0, new Function0() { // from class: androidx.compose.foundation.text.b7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n7.O();
                }
            });
        }
        androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVarZ = n7Var.z(eVar, p3VarF);
        if (eVarZ == null) {
            return t7Var.a(0, 0, new Function0() { // from class: androidx.compose.foundation.text.c7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n7.P();
                }
            });
        }
        final androidx.compose.ui.unit.s sVarE = androidx.compose.ui.unit.t.e(p3VarF.A(eVarZ.i(), eVarZ.g()).getBounds());
        return t7Var.a(sVarE.G(), sVarE.r(), new Function0() { // from class: androidx.compose.foundation.text.d7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n7.Q(sVarE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.q O() {
        return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f42709b.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.q P() {
        return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f42709b.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.q Q(androidx.compose.ui.unit.s sVar) {
        return androidx.compose.ui.unit.q.c(sVar.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.d0<Unit> d0VarZ = androidx.compose.ui.semantics.z.f41190a.z();
        Unit unit = Unit.f312394a;
        e0Var.c(d0VarZ, unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(n7 n7Var, androidx.compose.ui.text.f.e eVar, androidx.compose.ui.platform.h4 h4Var) {
        n7Var.G((androidx.compose.ui.text.b0) eVar.h(), h4Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(n7 n7Var, androidx.compose.ui.text.f.e eVar, h4 h4Var, e5 e5Var) {
        androidx.compose.ui.text.q3 q3VarB;
        androidx.compose.ui.text.q3 q3VarB2;
        androidx.compose.ui.text.q3 q3VarB3;
        androidx.compose.ui.text.q3 q3VarB4 = ((androidx.compose.ui.text.b0) eVar.h()).b();
        androidx.compose.ui.text.c3 c3VarC = null;
        androidx.compose.ui.text.c3 c3VarH = n7Var.H(n7Var.H(q3VarB4 != null ? q3VarB4.d() : null, (!h4Var.f() || (q3VarB3 = ((androidx.compose.ui.text.b0) eVar.h()).b()) == null) ? null : q3VarB3.a()), (!h4Var.g() || (q3VarB2 = ((androidx.compose.ui.text.b0) eVar.h()).b()) == null) ? null : q3VarB2.b());
        if (h4Var.h() && (q3VarB = ((androidx.compose.ui.text.b0) eVar.h()).b()) != null) {
            c3VarC = q3VarB.c();
        }
        e5Var.c(eVar, n7Var.H(c3VarH, c3VarC));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(n7 n7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        n7Var.n(c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private final void s(final Object[] objArr, final Function1<? super e5, Unit> function1, androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2083052099);
        int i11 = (i10 & 48) == 0 ? (c0VarR.k0(function1) ? 32 : 16) | i10 : i10;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(this) ? 256 : 128;
        }
        c0VarR.m0(-358305778, Integer.valueOf(objArr.length));
        int i12 = i11 | (c0VarR.K(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i12 |= c0VarR.k0(obj) ? 4 : 0;
        }
        c0VarR.v0();
        if ((i12 & 14) == 0) {
            i12 |= 2;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2083052099, i12, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            kotlin.jvm.internal.p1 p1Var = new kotlin.jvm.internal.p1(2);
            p1Var.a(function1);
            p1Var.b(objArr);
            Object[] objArrD = p1Var.d(new Object[p1Var.c()]);
            boolean zK0 = c0VarR.k0(this) | ((i12 & com.planner5d.library.engine.input.f.b.B) == 32);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.e7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return n7.t(this.f19209a, function1, (androidx.compose.runtime.v1) obj2);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.f(objArrD, (Function1) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.f7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return n7.u(this.f19235a, objArr, function1, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 t(n7 n7Var, Function1 function1, androidx.compose.runtime.v1 v1Var) {
        n7Var.f20720d.add(function1);
        return n7Var.new b(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(n7 n7Var, Object[] objArr, Function1 function1, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        n7Var.s(objArr, function1, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(n7 n7Var) {
        androidx.compose.ui.text.o3 o3VarL;
        androidx.compose.ui.text.f fVar = n7Var.f20719c;
        androidx.compose.ui.text.p3 p3VarF = n7Var.F();
        return Intrinsics.areEqual(fVar, (p3VarF == null || (o3VarL = p3VarF.l()) == null) ? null : o3VarL.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w(androidx.compose.ui.text.f.e eVar) {
        androidx.compose.ui.text.c3 c3Var;
        if (eVar.h() instanceof androidx.compose.ui.text.b0) {
            Object objH = eVar.h();
            Intrinsics.checkNotNull(objH, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
            if (!o7.b(((androidx.compose.ui.text.b0) objH).b())) {
                Object objH2 = eVar.h();
                Intrinsics.checkNotNull(objH2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                androidx.compose.ui.text.q3 q3VarB = ((androidx.compose.ui.text.b0) objH2).b();
                if (q3VarB == null || (c3Var = q3VarB.d()) == null) {
                    c3Var = new androidx.compose.ui.text.c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65535, (DefaultConstructorMarker) null);
                }
                return CollectionsKt.arrayListOf(eVar, new androidx.compose.ui.text.f.e(c3Var, eVar.i(), eVar.g()));
            }
        }
        return CollectionsKt.arrayListOf(eVar);
    }

    private final androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> z(androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar, androidx.compose.ui.text.p3 p3Var) {
        int iQ = androidx.compose.ui.text.p3.q(p3Var, p3Var.o() - 1, false, 2, null);
        if (eVar.i() < iQ) {
            return androidx.compose.ui.text.f.e.f(eVar, null, 0, Math.min(eVar.g(), iQ), null, 11, null);
        }
        return null;
    }

    @NotNull
    public final androidx.compose.ui.text.f C() {
        return this.f20717a;
    }

    @NotNull
    public final Function0<Boolean> D() {
        return new Function0() { // from class: androidx.compose.foundation.text.l7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(n7.v(this.f20478a));
            }
        };
    }

    @NotNull
    public final androidx.compose.ui.text.f E() {
        return this.f20719c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final androidx.compose.ui.text.p3 F() {
        return (androidx.compose.ui.text.p3) this.f20718b.getValue();
    }

    public final void J(@NotNull androidx.compose.ui.text.f fVar) {
        this.f20719c = fVar;
    }

    public final void K(@Nullable androidx.compose.ui.text.p3 p3Var) {
        this.f20718b.setValue(p3Var);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void n(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1154651354);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = 1;
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1154651354, i11, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            final androidx.compose.ui.platform.h4 h4Var = (androidx.compose.ui.platform.h4) c0VarR.W(androidx.compose.ui.platform.q1.C());
            androidx.compose.ui.text.f fVar = this.f20719c;
            List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0>> listF = fVar.f(0, fVar.length());
            int size = listF.size();
            int i13 = 0;
            while (i13 < size) {
                final androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar = listF.get(i13);
                if (eVar.i() != eVar.g()) {
                    c0VarR.E(725478935);
                    Object objI0 = c0VarR.i0();
                    androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) objI0;
                    androidx.compose.ui.a0 a0VarA = A(androidx.compose.ui.a0.E, eVar);
                    Object objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.text.h7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return n7.o((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarB = androidx.compose.ui.input.pointer.y.b(androidx.compose.foundation.n2.b(M(androidx.compose.ui.semantics.t.f(a0VarA, false, (Function1) objI1, i12, null), eVar), jVar, false, 2, null), androidx.compose.ui.input.pointer.x.f39142a.c(), false, 2, null);
                    boolean zK0 = c0VarR.k0(this) | c0VarR.D(eVar) | c0VarR.k0(h4Var);
                    Object objI2 = c0VarR.i0();
                    if (zK0 || objI2 == aVar.a()) {
                        objI2 = new Function0() { // from class: androidx.compose.foundation.text.i7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return n7.p(this.f19390a, eVar, h4Var);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.foundation.layout.x.b(androidx.compose.foundation.i1.o(a0VarB, jVar, null, false, null, null, null, null, null, false, (Function0) objI2, androidx.constraintlayout.core.motion.utils.v.g.f44096p, null), c0VarR, 0);
                    if (o7.b(eVar.h().b())) {
                        c0VarR.E(728331710);
                        c0VarR.A();
                    } else {
                        c0VarR.E(726303039);
                        Object objI3 = c0VarR.i0();
                        if (objI3 == aVar.a()) {
                            objI3 = new h4(jVar);
                            c0VarR.Y(objI3);
                        }
                        final h4 h4Var2 = (h4) objI3;
                        Unit unit = Unit.f312394a;
                        Object objI4 = c0VarR.i0();
                        if (objI4 == aVar.a()) {
                            objI4 = new a(h4Var2, null);
                            c0VarR.Y(objI4);
                        }
                        androidx.compose.runtime.b2.i(unit, (Function2) objI4, c0VarR, 6);
                        Boolean boolValueOf = Boolean.valueOf(h4Var2.g());
                        Boolean boolValueOf2 = Boolean.valueOf(h4Var2.f());
                        Boolean boolValueOf3 = Boolean.valueOf(h4Var2.h());
                        androidx.compose.ui.text.q3 q3VarB = eVar.h().b();
                        androidx.compose.ui.text.c3 c3VarD = q3VarB != null ? q3VarB.d() : null;
                        androidx.compose.ui.text.q3 q3VarB2 = eVar.h().b();
                        androidx.compose.ui.text.c3 c3VarA = q3VarB2 != null ? q3VarB2.a() : null;
                        androidx.compose.ui.text.q3 q3VarB3 = eVar.h().b();
                        androidx.compose.ui.text.c3 c3VarB = q3VarB3 != null ? q3VarB3.b() : null;
                        androidx.compose.ui.text.q3 q3VarB4 = eVar.h().b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, c3VarD, c3VarA, c3VarB, q3VarB4 != null ? q3VarB4.c() : null};
                        boolean zK1 = c0VarR.k0(this) | c0VarR.D(eVar);
                        Object objI5 = c0VarR.i0();
                        if (zK1 || objI5 == aVar.a()) {
                            objI5 = new Function1() { // from class: androidx.compose.foundation.text.j7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return n7.q(this.f20361a, eVar, h4Var2, (e5) obj);
                                }
                            };
                            c0VarR.Y(objI5);
                        }
                        s(objArr, (Function1) objI5, c0VarR, (i11 << 6) & 896);
                        c0VarR.A();
                    }
                    c0VarR.A();
                } else {
                    c0VarR.E(728345598);
                    c0VarR.A();
                }
                i13++;
                i12 = 1;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.k7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n7.r(this.f20412a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public final androidx.compose.ui.text.f y() {
        androidx.compose.ui.text.f fVarB;
        if (this.f20720d.isEmpty()) {
            fVarB = this.f20719c;
        } else {
            e5 e5Var = new e5(this.f20719c);
            SnapshotStateList<Function1<e5, Unit>> snapshotStateList = this.f20720d;
            int size = snapshotStateList.size();
            for (int i10 = 0; i10 < size; i10++) {
                snapshotStateList.get(i10).invoke(e5Var);
            }
            fVarB = e5Var.b();
        }
        this.f20719c = fVarB;
        return fVarB;
    }
}
