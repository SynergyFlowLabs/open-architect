package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.r;
import androidx.compose.animation.core.s;
import androidx.compose.foundation.gestures.z3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class q implements b<Float, s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f15105a;

    public q(@NotNull androidx.compose.animation.core.o<Float> oVar) {
        this.f15105a = oVar;
    }

    @Override // androidx.compose.foundation.gestures.snapping.b
    public /* bridge */ /* synthetic */ Object a(z3 z3Var, Float f10, Float f11, Function1<? super Float, Unit> function1, kotlin.coroutines.d dVar) {
        return b(z3Var, f10.floatValue(), f11.floatValue(), function1, dVar);
    }

    @Nullable
    public Object b(@NotNull z3 z3Var, float f10, float f11, @NotNull Function1<? super Float, Unit> function1, @NotNull kotlin.coroutines.d<? super a<Float, s>> dVar) {
        Object objI = m.i(z3Var, Math.abs(f10) * Math.signum(f11), f10, r.c(0.0f, f11, 0L, 0L, false, 28, null), this.f15105a, function1, dVar);
        return objI == kotlin.coroutines.intrinsics.b.l() ? objI : (a) objI;
    }
}
