package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.pager.b1;
import androidx.compose.foundation.pager.h0;
import androidx.compose.foundation.pager.i0;
import androidx.compose.foundation.pager.i1;
import androidx.compose.ui.unit.w;
import com.rabbitmq.client.k0;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPagerSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n222#1,4:313\n222#1,4:318\n222#1,4:322\n222#1,4:326\n222#1,4:330\n65#2:307\n69#2:310\n60#3:308\n70#3:311\n22#4:309\n22#4:312\n1#5:317\n*S KotlinDebug\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n*L\n250#1:313,4\n272#1:318,4\n282#1:322,4\n288#1:326,4\n292#1:330,4\n216#1:307\n218#1:310\n216#1:308\n218#1:311\n216#1:309\n218#1:312\n*E\n"})
public final class g {

    @SourceDebugExtension({"SMAP\nPagerSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,306:1\n51#2,4:307\n222#3,4:311\n222#3,4:315\n222#3,4:319\n222#3,4:323\n222#3,4:327\n222#3,4:331\n222#3,4:335\n222#3,4:340\n222#3,4:344\n1#4:339\n35#5,5:348\n*S KotlinDebug\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n53#1:307,4\n61#1:311,4\n71#1:315,4\n87#1:319,4\n96#1:323,4\n102#1:327,4\n116#1:331,4\n122#1:335,4\n135#1:340,4\n142#1:344,4\n146#1:348,5\n*E\n"})
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f15048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<Float, Float, Float, Float> f15049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b1 f15050c;

        /* JADX WARN: Multi-variable type inference failed */
        a(i1 i1Var, pj.n<? super Float, ? super Float, ? super Float, Float> nVar, b1 b1Var) {
            this.f15048a = i1Var;
            this.f15049b = nVar;
            this.f15050c = b1Var;
        }

        private final Pair<Float, Float> e(o oVar, float f10) {
            float f11;
            List<androidx.compose.foundation.pager.o> listW1 = c().w1();
            i1 i1Var = this.f15048a;
            int size = listW1.size();
            int i10 = 0;
            float f12 = Float.NEGATIVE_INFINITY;
            float f13 = Float.POSITIVE_INFINITY;
            while (true) {
                f11 = 0.0f;
                if (i10 >= size) {
                    break;
                }
                androidx.compose.foundation.pager.o oVar2 = listW1.get(i10);
                float fA = p.a(i0.a(c()), c().f(), c().b(), c().t1(), oVar2.getOffset(), oVar2.getIndex(), oVar, i1Var.V());
                if (fA <= 0.0f && fA > f12) {
                    f12 = fA;
                }
                if (fA >= 0.0f && fA < f13) {
                    f13 = fA;
                }
                i10++;
            }
            if (f12 == Float.NEGATIVE_INFINITY) {
                f12 = f13;
            }
            if (f13 == Float.POSITIVE_INFINITY) {
                f13 = f12;
            }
            if (!this.f15048a.f()) {
                if (g.f(this.f15048a, f10)) {
                    f12 = 0.0f;
                    f13 = 0.0f;
                } else {
                    f13 = 0.0f;
                }
            }
            if (this.f15048a.k()) {
                f11 = f12;
            } else if (!g.f(this.f15048a, f10)) {
                f13 = 0.0f;
            }
            return TuplesKt.to(Float.valueOf(f11), Float.valueOf(f13));
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float a(float f10) {
            Pair<Float, Float> pairE = e(this.f15048a.M().u1(), f10);
            float fFloatValue = pairE.component1().floatValue();
            float fFloatValue2 = pairE.component2().floatValue();
            float fFloatValue3 = this.f15049b.invoke(Float.valueOf(f10), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
            if (!(fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f)) {
                androidx.compose.foundation.internal.e.i("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
            }
            if (d(fFloatValue3)) {
                return fFloatValue3;
            }
            return 0.0f;
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float b(float f10, float f11) {
            int iW = this.f15048a.W() + this.f15048a.Y();
            if (iW == 0) {
                return 0.0f;
            }
            int iH = f10 < 0.0f ? this.f15048a.H() + 1 : this.f15048a.H();
            int iU = r.u(Math.abs((r.I(this.f15050c.a(iH, r.I(((int) (f11 / iW)) + iH, 0, this.f15048a.V()), f10, this.f15048a.W(), this.f15048a.Y()), 0, this.f15048a.V()) - iH) * iW) - iW, 0);
            return iU == 0 ? iU : iU * Math.signum(f10);
        }

        public final h0 c() {
            return this.f15048a.M();
        }

        public final boolean d(float f10) {
            return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    @NotNull
    public static final n a(@NotNull i1 i1Var, @NotNull b1 b1Var, @NotNull pj.n<? super Float, ? super Float, ? super Float, Float> nVar) {
        return new a(i1Var, nVar, b1Var);
    }

    public static final float c(@NotNull i1 i1Var, @NotNull w wVar, float f10, float f11, float f12, float f13) {
        boolean zF = f(i1Var, f11);
        if (i1Var.M().getOrientation() != q3.Vertical && wVar != w.Ltr) {
            zF = !zF;
        }
        int iT1 = i1Var.M().t1();
        float fE = iT1 == 0 ? 0.0f : e(i1Var) / iT1;
        float f14 = fE - ((int) fE);
        int iC = f.c(i1Var.G(), f11);
        d.a aVar = d.f15039b;
        if (d.g(iC, aVar.a())) {
            return Math.abs(f14) <= f10 ? f13 : f13;
        }
        if (!d.g(iC, aVar.b())) {
            if (!d.g(iC, aVar.c())) {
                return 0.0f;
            }
            return f12;
        }
    }

    private static final void d(Function0<String> function0) {
    }

    private static final float e(i1 i1Var) {
        return i1Var.M().getOrientation() == q3.Horizontal ? Float.intBitsToFloat((int) (i1Var.l0() >> 32)) : Float.intBitsToFloat((int) (i1Var.l0() & k0.f265952a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(i1 i1Var, float f10) {
        boolean zI = i1Var.M().i();
        boolean z10 = (i1Var.n0() ? -f10 : e(i1Var)) > 0.0f;
        return (z10 && zI) || !(z10 || zI);
    }
}
