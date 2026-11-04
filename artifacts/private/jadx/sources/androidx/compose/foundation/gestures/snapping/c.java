package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.g0;
import androidx.compose.animation.core.r;
import androidx.compose.animation.core.s;
import androidx.compose.foundation.gestures.z3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class c implements b<Float, s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g0<Float> f15038a;

    public c(@NotNull g0<Float> g0Var) {
        this.f15038a = g0Var;
    }

    @Override // androidx.compose.foundation.gestures.snapping.b
    public /* bridge */ /* synthetic */ Object a(z3 z3Var, Float f10, Float f11, Function1<? super Float, Unit> function1, kotlin.coroutines.d dVar) {
        return b(z3Var, f10.floatValue(), f11.floatValue(), function1, dVar);
    }

    @Nullable
    public Object b(@NotNull z3 z3Var, float f10, float f11, @NotNull Function1<? super Float, Unit> function1, @NotNull kotlin.coroutines.d<? super a<Float, s>> dVar) {
        Object objF = m.f(z3Var, f10, r.c(0.0f, f11, 0L, 0L, false, 28, null), this.f15038a, function1, dVar);
        return objF == kotlin.coroutines.intrinsics.b.l() ? objF : (a) objF;
    }
}
