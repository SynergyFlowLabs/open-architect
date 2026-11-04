package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.lazy.layout.q1;
import androidx.compose.foundation.lazy.layout.r1;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,67:1\n1282#2,6:68\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n*L\n32#1:68,6\n*E\n"})
public final class t0 {

    @SourceDebugExtension({"SMAP\nLazyStaggeredGridSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,67:1\n59#2:68\n54#2:70\n90#3:69\n85#3:71\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1\n*L\n58#1:68\n60#1:70\n58#1:69\n60#1:71\n*E\n"})
    public static final class a implements q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a1 f18011a;

        a(a1 a1Var) {
            this.f18011a = a1Var;
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public float b() {
            return r1.b(this.f18011a.E(), this.f18011a.F());
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public int c() {
            return this.f18011a.L().f() + this.f18011a.L().b();
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public Object d(int i10, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG0 = a1.g0(this.f18011a, i10, 0, dVar, 2, null);
            return objG0 == kotlin.coroutines.intrinsics.b.l() ? objG0 : Unit.f312394a;
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public float e() {
            return r1.a(this.f18011a.E(), this.f18011a.F(), this.f18011a.f());
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public androidx.compose.ui.semantics.b f() {
            return new androidx.compose.ui.semantics.b(-1, -1);
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public int g() {
            return (int) (this.f18011a.L().getOrientation() == q3.Vertical ? this.f18011a.L().a() & com.rabbitmq.client.k0.f265952a : this.f18011a.L().a() >> 32);
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final q1 a(@NotNull a1 a1Var, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1629354903, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:31)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(a1Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.G(z10)) || (i10 & 48) == 32);
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new a(a1Var);
            c0Var.Y(objI0);
        }
        a aVar = (a) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return aVar;
    }
}
