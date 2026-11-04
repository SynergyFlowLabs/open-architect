package androidx.compose.material3.carousel;

import androidx.compose.animation.core.f3;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.gestures.z3;
import androidx.compose.foundation.lazy.layout.m1;
import androidx.compose.foundation.pager.i1;
import androidx.compose.material3.af;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCarouselState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,343:1\n1282#2,6:344\n1#3:350\n54#4:351\n59#4:353\n85#5:352\n90#5:354\n*S KotlinDebug\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselStateKt\n*L\n153#1:344,6\n266#1:351\n267#1:353\n266#1:352\n267#1:354\n*E\n"})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f26613a = -0.5f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f26614b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26615c = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(final m1 m1Var, i1 i1Var, int i10, float f10, androidx.compose.animation.core.o<Float> oVar, Function2<? super z3, ? super Integer, Unit> function2, kotlin.coroutines.d<? super Unit> dVar) {
        function2.invoke(m1Var, kotlin.coroutines.jvm.internal.b.f(i10));
        boolean z10 = i10 > m1Var.c();
        int iD = (m1Var.d() - m1Var.c()) + 1;
        if (((z10 && i10 > m1Var.d()) || (!z10 && i10 < m1Var.c())) && Math.abs(i10 - m1Var.c()) >= 3) {
            m1Var.e(z10 ? kotlin.ranges.r.u(i10 - iD, m1Var.c()) : kotlin.ranges.r.B(iD + i10, m1Var.c()), 0);
        }
        float f11 = f(i1Var, i1Var.E(), i10) + f10;
        final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
        Object objO = f3.o(0.0f, f11, 0.0f, oVar, new Function2() { // from class: androidx.compose.material3.carousel.m0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return n0.e(eVar, m1Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, dVar, 4, null);
        return objO == kotlin.coroutines.intrinsics.b.l() ? objO : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(kotlin.jvm.internal.i1.e eVar, m1 m1Var, float f10, float f11) {
        eVar.f312748a += m1Var.f(f10 - eVar.f312748a);
        return Unit.f312394a;
    }

    private static final float f(i1 i1Var, int i10, int i11) {
        int iA = (int) (i1Var.M().getOrientation() == q3.Horizontal ? i1Var.M().a() >> 32 : i1Var.M().a() & com.rabbitmq.client.k0.f265952a);
        return ((i11 - i10) * (i1Var.M().t1() + i1Var.M().x1())) + (i1Var.M().u1().a(iA, i1Var.M().t1(), i1Var.M().f(), i1Var.M().b(), i10, i1Var.V()) - i1Var.M().u1().a(iA, i1Var.M().t1(), i1Var.M().f(), i1Var.M().b(), i11, i1Var.V()));
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public static final j0 g(final int i10, @NotNull final Function0<Integer> function0, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-217285684, i11, -1, "androidx.compose.material3.carousel.rememberCarouselState (CarouselState.kt:151)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<j0, ?> c0VarA = j0.f26583b.a();
        boolean z11 = (((i11 & 14) ^ 6) > 4 && c0Var.K(i10)) || (i11 & 6) == 4;
        if ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.D(function0)) && (i11 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.material3.carousel.l0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n0.h(i10, function0);
                }
            };
            c0Var.Y(objI0);
        }
        j0 j0Var = (j0) androidx.compose.runtime.saveable.i.j(objArr, c0VarA, (Function0) objI0, c0Var, 0);
        j0Var.w().Y0().setValue(function0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 h(int i10, Function0 function0) {
        return new j0(i10, 0.0f, function0);
    }
}
