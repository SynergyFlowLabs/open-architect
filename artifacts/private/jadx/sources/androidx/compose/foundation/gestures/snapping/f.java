package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.c3;
import androidx.compose.foundation.gestures.e5;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.lazy.f0;
import androidx.compose.foundation.lazy.j1;
import androidx.compose.foundation.lazy.layout.y0;
import androidx.compose.foundation.lazy.v;
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
@SourceDebugExtension({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,145:1\n1282#2,6:146\n59#3:152\n54#3:154\n90#4:153\n85#4:155\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n118#1:146,6\n123#1:152\n123#1:154\n123#1:153\n123#1:155\n*E\n"})
public final class f {

    @SourceDebugExtension({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,145:1\n1#2:146\n35#3,5:147\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n69#1:147,5\n*E\n"})
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1 f15046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f15047b;

        a(j1 j1Var, o oVar) {
            this.f15046a = j1Var;
            this.f15047b = oVar;
        }

        private final int c() {
            f0 f0VarD = d();
            int size = 0;
            if (f0VarD.h().isEmpty()) {
                return 0;
            }
            int size2 = f0VarD.h().size();
            Iterator<T> it = f0VarD.h().iterator();
            while (it.hasNext()) {
                size += ((v) it.next()).getSize();
            }
            return size / size2;
        }

        private final f0 d() {
            return this.f15046a.K();
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float a(float f10) {
            List<v> listH = d().h();
            o oVar = this.f15047b;
            int size = listH.size();
            float f11 = Float.NEGATIVE_INFINITY;
            float f12 = Float.POSITIVE_INFINITY;
            for (int i10 = 0; i10 < size; i10++) {
                v vVar = listH.get(i10);
                y0 y0Var = vVar instanceof y0 ? (y0) vVar : null;
                if (y0Var == null || !y0Var.i()) {
                    float fA = p.a(f.d(d()), d().f(), d().b(), vVar.getSize(), vVar.getOffset(), vVar.getIndex(), oVar, d().c());
                    int i11 = 6 & 0;
                    if (fA <= 0.0f && fA > f11) {
                        f11 = fA;
                    }
                    if (fA >= 0.0f && fA < f12) {
                        f12 = fA;
                    }
                }
            }
            return m.l(f.c(this.f15046a.D(), f10), f11, f12);
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float b(float f10, float f11) {
            int i10 = 6 << 0;
            return r.t(Math.abs(f11) - c(), 0.0f) * Math.signum(f11);
        }
    }

    @NotNull
    public static final n a(@NotNull j1 j1Var, @NotNull o oVar) {
        return new a(j1Var, oVar);
    }

    public static /* synthetic */ n b(j1 j1Var, o oVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = o.a.f15099a;
        }
        return a(j1Var, oVar);
    }

    public static final int c(@NotNull androidx.compose.ui.unit.d dVar, float f10) {
        if (Math.abs(f10) < dVar.S7(m.r())) {
            return d.f15039b.a();
        }
        return f10 > 0.0f ? d.f15039b.b() : d.f15039b.c();
    }

    public static final int d(@NotNull f0 f0Var) {
        return (int) (f0Var.getOrientation() == q3.Vertical ? f0Var.a() & k0.f265952a : f0Var.a() >> 32);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final c3 e(@NotNull j1 j1Var, @Nullable o oVar, @Nullable c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = o.a.f15099a;
        }
        if (m0.l0()) {
            m0.A0(-338621290, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(j1Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == c0.f35327a.a()) {
            objI0 = a(j1Var, oVar);
            c0Var.Y(objI0);
        }
        e5 e5VarS = m.s((n) objI0, c0Var, 0);
        if (m0.l0()) {
            m0.z0();
        }
        return e5VarS;
    }
}
