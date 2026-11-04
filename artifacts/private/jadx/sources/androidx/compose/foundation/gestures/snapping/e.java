package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.c3;
import androidx.compose.foundation.gestures.e5;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.lazy.grid.n0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.x1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import com.rabbitmq.client.k0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGridSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,144:1\n1282#2,6:145\n59#3:151\n54#3:153\n59#3:155\n54#3:157\n90#4:152\n85#4:154\n90#4:156\n85#4:158\n*S KotlinDebug\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt\n*L\n117#1:145,6\n124#1:151\n126#1:153\n131#1:155\n133#1:157\n124#1:152\n126#1:154\n131#1:156\n133#1:158\n*E\n"})
public final class e {

    @SourceDebugExtension({"SMAP\nLazyGridSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n35#2,5:145\n1#3:150\n*S KotlinDebug\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n69#1:145,5\n*E\n"})
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x1 f15044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f15045b;

        a(x1 x1Var, o oVar) {
            this.f15044a = x1Var;
            this.f15045b = oVar;
        }

        private final int c() {
            n0 n0VarD = d();
            int iF = 0;
            if (n0VarD.h().isEmpty()) {
                return 0;
            }
            int size = n0VarD.h().size();
            Iterator<T> it = n0VarD.h().iterator();
            while (it.hasNext()) {
                iF += e.f((x) it.next(), n0VarD.getOrientation());
            }
            return iF / size;
        }

        private final n0 d() {
            return this.f15044a.L();
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float a(float f10) {
            List<x> listH = d().h();
            o oVar = this.f15045b;
            int size = listH.size();
            float f11 = Float.NEGATIVE_INFINITY;
            float f12 = Float.POSITIVE_INFINITY;
            for (int i10 = 0; i10 < size; i10++) {
                x xVar = listH.get(i10);
                float fA = p.a(e.c(d()), d().f(), d().b(), e.f(xVar, d().getOrientation()), e.d(xVar, d().getOrientation()), xVar.getIndex(), oVar, d().c());
                if (fA <= 0.0f && fA > f11) {
                    f11 = fA;
                }
                if (fA >= 0.0f && fA < f12) {
                    f12 = fA;
                }
            }
            return m.l(f.c(this.f15044a.E(), f10), f11, f12);
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float b(float f10, float f11) {
            return r.t(Math.abs(f11) - c(), 0.0f) * Math.signum(f11);
        }
    }

    @NotNull
    public static final n a(@NotNull x1 x1Var, @NotNull o oVar) {
        return new a(x1Var, oVar);
    }

    public static /* synthetic */ n b(x1 x1Var, o oVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = o.a.f15099a;
        }
        return a(x1Var, oVar);
    }

    public static final int c(@NotNull n0 n0Var) {
        return (int) (n0Var.getOrientation() == q3.Vertical ? n0Var.a() & k0.f265952a : n0Var.a() >> 32);
    }

    public static final int d(@NotNull x xVar, @NotNull q3 q3Var) {
        return q3Var == q3.Vertical ? androidx.compose.ui.unit.q.p(xVar.g()) : androidx.compose.ui.unit.q.n(xVar.g());
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final c3 e(@NotNull x1 x1Var, @Nullable o oVar, @Nullable c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = o.a.f15099a;
        }
        if (m0.l0()) {
            m0.A0(-234434234, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyGridSnapLayoutInfoProvider.kt:114)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(x1Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == c0.f35327a.a()) {
            objI0 = a(x1Var, oVar);
            c0Var.Y(objI0);
        }
        e5 e5VarS = m.s((n) objI0, c0Var, 0);
        if (m0.l0()) {
            m0.z0();
        }
        return e5VarS;
    }

    public static final int f(@NotNull x xVar, @NotNull q3 q3Var) {
        return (int) (q3Var == q3.Vertical ? xVar.a() & k0.f265952a : xVar.a() >> 32);
    }
}
