package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.q3;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,69:1\n1282#2,6:70\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n32#1:70,6\n*E\n"})
public final class f2 {

    @SourceDebugExtension({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt$rememberLazyGridSemanticState$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,69:1\n59#2:70\n54#2:72\n90#3:71\n85#3:73\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt$rememberLazyGridSemanticState$1$1\n*L\n60#1:70\n62#1:72\n60#1:71\n62#1:73\n*E\n"})
    public static final class a implements androidx.compose.foundation.lazy.layout.q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x1 f16799a;

        a(x1 x1Var) {
            this.f16799a = x1Var;
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public float b() {
            return androidx.compose.foundation.lazy.layout.r1.b(this.f16799a.F(), this.f16799a.G());
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public int c() {
            return this.f16799a.L().f() + this.f16799a.L().b();
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public Object d(int i10, kotlin.coroutines.d<? super Unit> dVar) {
            Object objI0 = x1.i0(this.f16799a, i10, 0, dVar, 2, null);
            return objI0 == kotlin.coroutines.intrinsics.b.l() ? objI0 : Unit.f312394a;
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public float e() {
            return androidx.compose.foundation.lazy.layout.r1.a(this.f16799a.F(), this.f16799a.G(), this.f16799a.f());
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public androidx.compose.ui.semantics.b f() {
            return new androidx.compose.ui.semantics.b(-1, -1);
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public int g() {
            return (int) (this.f16799a.L().getOrientation() == q3.Vertical ? this.f16799a.L().a() & com.rabbitmq.client.k0.f265952a : this.f16799a.L().a() >> 32);
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.lazy.layout.q1 a(@NotNull x1 x1Var, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1247008005, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(x1Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.G(z10)) || (i10 & 48) == 32);
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new a(x1Var);
            c0Var.Y(objI0);
        }
        a aVar = (a) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return aVar;
    }
}
