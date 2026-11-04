package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.f3;
import androidx.compose.animation.core.g0;
import androidx.compose.animation.core.r;
import androidx.compose.animation.core.s;
import androidx.compose.animation.n1;
import androidx.compose.foundation.gestures.e5;
import androidx.compose.foundation.gestures.z3;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.ui.platform.q1;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,476:1\n472#1,4:484\n472#1,4:488\n472#1,4:492\n75#2:477\n1282#3,6:478\n113#4:496\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n325#1:484,4\n370#1:488,4\n446#1:492,4\n232#1:477\n234#1:478,6\n432#1:496\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f15084a = androidx.compose.ui.unit.h.r(400);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f15085b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f15086c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f15087d = false;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {308}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f15088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f15091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15092e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15091d = obj;
            this.f15092e |= Integer.MIN_VALUE;
            return m.f(null, 0.0f, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {349}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f15093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f15094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f15097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f15098f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15097e = obj;
            this.f15098f |= Integer.MIN_VALUE;
            int i10 = 2 | 0;
            return m.i(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object f(final z3 z3Var, final float f10, androidx.compose.animation.core.q<Float, s> qVar, g0<Float> g0Var, final Function1<? super Float, Unit> function1, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, s>> dVar) {
        a aVar;
        i1.e eVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f15092e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f15092e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f15091d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f15092e;
        if (i11 == 0) {
            ResultKt.m(obj);
            final i1.e eVar2 = new i1.e();
            boolean z10 = qVar.g().floatValue() == 0.0f;
            Function1 function2 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return m.h(f10, eVar2, z3Var, function1, (androidx.compose.animation.core.n) obj2);
                }
            };
            aVar.f15089b = qVar;
            aVar.f15090c = eVar2;
            aVar.f15088a = f10;
            aVar.f15092e = 1;
            if (f3.y(qVar, g0Var, !z10, function2, aVar) == objL) {
                return objL;
            }
            eVar = eVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = aVar.f15088a;
            eVar = (i1.e) aVar.f15090c;
            qVar = (androidx.compose.animation.core.q) aVar.f15089b;
            ResultKt.m(obj);
        }
        return new androidx.compose.foundation.gestures.snapping.a(kotlin.coroutines.jvm.internal.b.e(f10 - eVar.f312748a), qVar);
    }

    private static final void g(androidx.compose.animation.core.n<Float, s> nVar, z3 z3Var, Function1<? super Float, Unit> function1, float f10) {
        float f11;
        try {
            f11 = z3Var.f(f10);
        } catch (CancellationException unused) {
            nVar.a();
            f11 = 0.0f;
        }
        function1.invoke(Float.valueOf(f11));
        if (Math.abs(f10 - f11) > 0.5f) {
            nVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(float f10, i1.e eVar, z3 z3Var, Function1 function1, androidx.compose.animation.core.n nVar) {
        if (Math.abs(((Number) nVar.g()).floatValue()) >= Math.abs(f10)) {
            float fN = n(((Number) nVar.g()).floatValue(), f10);
            g(nVar, z3Var, function1, fN - eVar.f312748a);
            nVar.a();
            eVar.f312748a = fN;
        } else {
            g(nVar, z3Var, function1, ((Number) nVar.g()).floatValue() - eVar.f312748a);
            eVar.f312748a = ((Number) nVar.g()).floatValue();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final Object i(final z3 z3Var, float f10, final float f11, androidx.compose.animation.core.q<Float, s> qVar, androidx.compose.animation.core.o<Float> oVar, final Function1<? super Float, Unit> function1, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, s>> dVar) {
        b bVar;
        float f12;
        androidx.compose.animation.core.q<Float, s> qVar2;
        i1.e eVar;
        float f13;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f15098f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f15098f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f15097e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar2.f15098f;
        if (i11 == 0) {
            ResultKt.m(obj);
            final i1.e eVar2 = new i1.e();
            float fFloatValue = qVar.g().floatValue();
            Float fE = kotlin.coroutines.jvm.internal.b.e(f10);
            boolean z10 = qVar.g().floatValue() == 0.0f;
            Function1 function2 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return m.j(f11, eVar2, z3Var, function1, (androidx.compose.animation.core.n) obj2);
                }
            };
            bVar2.f15095c = qVar;
            bVar2.f15096d = eVar2;
            f12 = f10;
            bVar2.f15093a = f12;
            bVar2.f15094b = fFloatValue;
            bVar2.f15098f = 1;
            if (f3.C(qVar, fE, oVar, !z10, function2, bVar2) == objL) {
                return objL;
            }
            qVar2 = qVar;
            eVar = eVar2;
            f13 = fFloatValue;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f13 = bVar2.f15094b;
            float f14 = bVar2.f15093a;
            eVar = (i1.e) bVar2.f15096d;
            androidx.compose.animation.core.q<Float, s> qVar3 = (androidx.compose.animation.core.q) bVar2.f15095c;
            ResultKt.m(obj);
            f12 = f14;
            qVar2 = qVar3;
        }
        return new androidx.compose.foundation.gestures.snapping.a(kotlin.coroutines.jvm.internal.b.e(f12 - eVar.f312748a), r.g(qVar2, 0.0f, n(qVar2.g().floatValue(), f13), 0L, 0L, false, 29, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(float f10, i1.e eVar, z3 z3Var, Function1 function1, androidx.compose.animation.core.n nVar) {
        float f11;
        float fN = n(((Number) nVar.g()).floatValue(), f10);
        float f12 = fN - eVar.f312748a;
        try {
            f11 = z3Var.f(f12);
        } catch (CancellationException unused) {
            nVar.a();
            f11 = 0.0f;
        }
        function1.invoke(Float.valueOf(f11));
        if (Math.abs(f12 - f11) > 0.5f || fN != ((Number) nVar.g()).floatValue()) {
            nVar.a();
        }
        eVar.f312748a += f11;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(z3 z3Var, float f10, float f11, androidx.compose.foundation.gestures.snapping.b<Float, s> bVar, Function1<? super Float, Unit> function1, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, s>> dVar) {
        return bVar.a(z3Var, kotlin.coroutines.jvm.internal.b.e(f10), kotlin.coroutines.jvm.internal.b.e(f11), function1, dVar);
    }

    public static final float l(int i10, float f10, float f11) {
        d.a aVar = d.f15039b;
        if (d.g(i10, aVar.a())) {
            if (Math.abs(f11) <= Math.abs(f10)) {
                f10 = f11;
            }
        } else if (d.g(i10, aVar.b())) {
            f10 = f11;
        } else if (!d.g(i10, aVar.c())) {
            f10 = 0.0f;
        }
        if (m(f10)) {
            return f10;
        }
        return 0.0f;
    }

    private static final boolean m(float f10) {
        return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    private static final float n(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? kotlin.ranges.r.A(f10, f11) : kotlin.ranges.r.t(f10, f11);
    }

    private static final <T extends Comparable<? super T>> T o(kotlin.ranges.f<T> fVar) {
        return fVar.u();
    }

    private static final <T extends Comparable<? super T>> T p(kotlin.ranges.f<T> fVar) {
        return fVar.i();
    }

    private static final void q(Function0<String> function0) {
    }

    public static final float r() {
        return f15084a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final e5 s(@NotNull n nVar, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-1921733134, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:230)");
        }
        Object obj = (androidx.compose.ui.unit.d) c0Var.W(q1.m());
        g0 g0VarB = n1.b(c0Var, 0);
        boolean zD = c0Var.D(g0VarB) | ((((i10 & 14) ^ 6) > 4 && c0Var.D(nVar)) || (i10 & 6) == 4) | c0Var.D(obj);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = t(nVar, g0VarB, androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null));
            c0Var.Y(objI0);
        }
        e5 e5Var = (e5) objI0;
        if (m0.l0()) {
            m0.z0();
        }
        return e5Var;
    }

    @NotNull
    public static final e5 t(@NotNull n nVar, @NotNull g0<Float> g0Var, @NotNull androidx.compose.animation.core.o<Float> oVar) {
        return new h(nVar, g0Var, oVar);
    }
}
