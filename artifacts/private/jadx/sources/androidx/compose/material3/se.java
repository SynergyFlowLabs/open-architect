package androidx.compose.material3;

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
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/EnterAlwaysSearchBarScrollBehavior\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,2758:1\n81#2:2759\n114#2,2:2760\n59#3:2762\n90#4:2763\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/EnterAlwaysSearchBarScrollBehavior\n*L\n898#1:2759\n898#1:2760,2\n916#1:2762\n916#1:2763\n*E\n"})
final class se implements sv {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f32888h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f32889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f32891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.g0<Float> f32892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.k3 f32893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f32894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.nestedscroll.a f32895g = new b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(androidx.compose.runtime.saveable.g0 g0Var, se seVar) {
            return CollectionsKt.listOf(Float.valueOf(seVar.b()), Float.valueOf(seVar.f()), Boolean.valueOf(seVar.p()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final se e(Function0 function0, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, List list) {
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue2 = ((Float) obj2).floatValue();
            int i10 = 3 ^ 2;
            Object obj3 = list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new se(fFloatValue, fFloatValue2, function0, ((Boolean) obj3).booleanValue(), oVar, g0Var);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<se, ?> c(@NotNull final Function0<Boolean> function0, @NotNull final androidx.compose.animation.core.o<Float> oVar, @NotNull final androidx.compose.animation.core.g0<Float> g0Var) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.qe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return se.a.d((androidx.compose.runtime.saveable.g0) obj, (se) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.re
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return se.a.e(function0, oVar, g0Var, (List) obj);
                }
            });
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/EnterAlwaysSearchBarScrollBehavior$nestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,2758:1\n69#2:2759\n69#2:2762\n69#2:2765\n69#2:2768\n70#3:2760\n70#3:2763\n70#3:2766\n70#3:2769\n22#4:2761\n22#4:2764\n22#4:2767\n22#4:2770\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/EnterAlwaysSearchBarScrollBehavior$nestedScrollConnection$1\n*L\n924#1:2759\n942#1:2762\n945#1:2765\n948#1:2768\n924#1:2760\n942#1:2763\n945#1:2766\n948#1:2769\n924#1:2761\n942#1:2764\n945#1:2767\n948#1:2770\n*E\n"})
    public static final class b implements androidx.compose.ui.input.nestedscroll.a {
        b() {
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            return !se.this.n().invoke().booleanValue() ? androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.f42681b.a()) : se.this.v(androidx.compose.ui.unit.c0.n(j11), dVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long G7(long j10, int i10) {
            if (!se.this.n().invoke().booleanValue()) {
                return n0.g.f332700b.e();
            }
            float fB = se.this.b();
            se seVar = se.this;
            seVar.e(seVar.b() + Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10)));
            return (se.this.p() || fB == se.this.b()) ? n0.g.f332700b.e() : n0.g.i(j10, 0.0f, 0.0f, 2, null);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            if (!se.this.n().invoke().booleanValue()) {
                return n0.g.f332700b.e();
            }
            if (se.this.p()) {
                int i11 = (int) (j11 & com.rabbitmq.client.k0.f265952a);
                if (Float.intBitsToFloat(i11) > 0.0f) {
                    se seVar = se.this;
                    seVar.e(seVar.b() + Float.intBitsToFloat(i11));
                    int i12 = 0 & 2;
                    return n0.g.i(j11, 0.0f, 0.0f, 2, null);
                }
            }
            if (!se.this.p()) {
                se seVar2 = se.this;
                seVar2.e(seVar2.b() + Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
            }
            return n0.g.f332700b.e();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2", f = "SearchBar.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.b.f43997n}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ float f32898b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(s0Var, f10.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32897a;
            if (i10 == 0) {
                ResultKt.m(obj);
                float f10 = this.f32898b;
                se seVar = se.this;
                this.f32897a = 1;
                if (seVar.v(f10, this) == objL) {
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

        public final Object k(kotlinx.coroutines.s0 s0Var, float f10, kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = se.this.new c(dVar);
            cVar.f32898b = f10;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior", f = "SearchBar.kt", i = {0, 0, 1}, l = {972, 986}, m = "settleSearchBar-OhffZ5M", n = {"remainingVelocity", "scrollFraction", "remainingVelocity"}, s = {"L$0", "F$0", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f32900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32902c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f32904e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32902c = obj;
            this.f32904e |= Integer.MIN_VALUE;
            return se.this.v(0.0f, this);
        }
    }

    public se(float f10, float f11, @NotNull Function0<Boolean> function0, boolean z10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull androidx.compose.animation.core.g0<Float> g0Var) {
        this.f32889a = function0;
        this.f32890b = z10;
        this.f32891c = oVar;
        this.f32892d = g0Var;
        this.f32893e = androidx.compose.runtime.g4.b(f10);
        this.f32894f = androidx.compose.runtime.g4.b(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(se seVar, float f10) {
        seVar.e(seVar.b() + f10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 s(se seVar, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        final int iL0 = kotlin.math.b.L0(seVar.b());
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), kotlin.ranges.r.u(i2VarP0.c1() + iL0, 0), null, new Function1() { // from class: androidx.compose.material3.me
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return se.t(i2VarP0, iL0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.A0(aVar, i2Var, 0, i10, 0.0f, null, 12, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(se seVar, androidx.compose.ui.unit.u uVar) {
        seVar.c(-((int) (uVar.q() & com.rabbitmq.client.k0.f265952a)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final Object v(float f10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        d dVar2;
        float fB;
        final kotlin.jvm.internal.i1.e eVar;
        float f11;
        kotlin.jvm.internal.i1.e eVar2;
        androidx.compose.animation.core.q qVarC;
        float f12;
        Float fE;
        androidx.compose.animation.core.o<Float> oVar;
        Function1 function1;
        kotlin.jvm.internal.i1.e eVar3;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f32904e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f32904e = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        d dVar3 = dVar2;
        Object obj = dVar3.f32902c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar3.f32904e;
        if (i11 != 0) {
            if (i11 == 1) {
                f11 = dVar3.f32900a;
                eVar2 = (kotlin.jvm.internal.i1.e) dVar3.f32901b;
                ResultKt.m(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar3 = (kotlin.jvm.internal.i1.e) dVar3.f32901b;
                ResultKt.m(obj);
            }
            eVar = eVar3;
            return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.d0.a(0.0f, eVar.f312748a));
        }
        ResultKt.m(obj);
        fB = f() == 0.0f ? 0.0f : b() / f();
        if (fB < 0.01f || fB == 1.0f) {
            return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.f42681b.a());
        }
        eVar = new kotlin.jvm.internal.i1.e();
        eVar.f312748a = f10;
        if (Math.abs(f10) <= 1.0f) {
            if (f() < b() && b() < 0.0f) {
                qVarC = androidx.compose.animation.core.r.c(b(), 0.0f, 0L, 0L, false, 30, null);
                if (fB < 0.5f) {
                    f12 = 0.0f;
                } else {
                    f12 = f();
                }
                fE = kotlin.coroutines.jvm.internal.b.e(f12);
                oVar = this.f32891c;
                function1 = new Function1() { // from class: androidx.compose.material3.le
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return se.x(this.f30329a, (androidx.compose.animation.core.n) obj2);
                    }
                };
                dVar3.f32901b = eVar;
                dVar3.f32904e = 2;
                if (androidx.compose.animation.core.f3.D(qVarC, fE, oVar, false, function1, dVar3, 4, null) != objL) {
                    eVar3 = eVar;
                    eVar = eVar3;
                }
            }
            return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.d0.a(0.0f, eVar.f312748a));
        }
        final kotlin.jvm.internal.i1.e eVar4 = new kotlin.jvm.internal.i1.e();
        androidx.compose.animation.core.q qVarC2 = androidx.compose.animation.core.r.c(0.0f, f10, 0L, 0L, false, 28, null);
        androidx.compose.animation.core.g0<Float> g0Var = this.f32892d;
        Function1 function2 = new Function1() { // from class: androidx.compose.material3.ke
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return se.w(eVar4, this, eVar, (androidx.compose.animation.core.n) obj2);
            }
        };
        dVar3.f32901b = eVar;
        dVar3.f32900a = fB;
        dVar3.f32904e = 1;
        if (androidx.compose.animation.core.f3.z(qVarC2, g0Var, false, function2, dVar3, 2, null) != objL) {
            f11 = fB;
            eVar2 = eVar;
        }
        return objL;
        fB = f11;
        eVar = eVar2;
        if (f() < b()) {
            qVarC = androidx.compose.animation.core.r.c(b(), 0.0f, 0L, 0L, false, 30, null);
            if (fB < 0.5f) {
                f12 = 0.0f;
            } else {
                f12 = f();
            }
            fE = kotlin.coroutines.jvm.internal.b.e(f12);
            oVar = this.f32891c;
            function1 = new Function1() { // from class: androidx.compose.material3.le
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return se.x(this.f30329a, (androidx.compose.animation.core.n) obj2);
                }
            };
            dVar3.f32901b = eVar;
            dVar3.f32904e = 2;
            if (androidx.compose.animation.core.f3.D(qVarC, fE, oVar, false, function1, dVar3, 4, null) != objL) {
                eVar3 = eVar;
                eVar = eVar3;
            }
            return objL;
        }
        return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.d0.a(0.0f, eVar.f312748a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(kotlin.jvm.internal.i1.e eVar, se seVar, kotlin.jvm.internal.i1.e eVar2, androidx.compose.animation.core.n nVar) {
        float fFloatValue = ((Number) nVar.g()).floatValue() - eVar.f312748a;
        float fB = seVar.b();
        seVar.e(fB + fFloatValue);
        float fAbs = Math.abs(fB - seVar.b());
        eVar.f312748a = ((Number) nVar.g()).floatValue();
        eVar2.f312748a = ((Number) nVar.h()).floatValue();
        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
            nVar.a();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(se seVar, androidx.compose.animation.core.n nVar) {
        seVar.e(((Number) nVar.g()).floatValue());
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.sv
    @NotNull
    public androidx.compose.ui.input.nestedscroll.a a() {
        return this.f32895g;
    }

    @Override // androidx.compose.material3.sv
    public float b() {
        return this.f32893e.V0();
    }

    @Override // androidx.compose.material3.sv
    public void c(float f10) {
        this.f32894f.q(f10);
    }

    @Override // androidx.compose.material3.sv
    @NotNull
    public androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var) {
        int i10 = 3 << 0;
        return androidx.compose.ui.layout.y1.a(androidx.compose.ui.layout.q0.a(androidx.compose.ui.draw.j.b(androidx.compose.foundation.gestures.x2.i(a0Var, androidx.compose.foundation.gestures.x2.b(new Function1() { // from class: androidx.compose.material3.ne
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return se.r(this.f31020a, ((Float) obj).floatValue());
            }
        }), androidx.compose.foundation.gestures.q3.Vertical, this.f32889a.invoke().booleanValue(), null, false, null, new c(null), false, 184, null)), new pj.n() { // from class: androidx.compose.material3.oe
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return se.s(this.f31346a, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        }), new Function1() { // from class: androidx.compose.material3.pe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return se.u(this.f31741a, (androidx.compose.ui.unit.u) obj);
            }
        });
    }

    @Override // androidx.compose.material3.sv
    public void e(float f10) {
        this.f32893e.q(kotlin.ranges.r.H(f10, f(), 0.0f));
    }

    @Override // androidx.compose.material3.sv
    public float f() {
        return this.f32894f.V0();
    }

    @NotNull
    public final Function0<Boolean> n() {
        return this.f32889a;
    }

    @NotNull
    public final androidx.compose.animation.core.g0<Float> o() {
        return this.f32892d;
    }

    public final boolean p() {
        return this.f32890b;
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> q() {
        return this.f32891c;
    }
}
