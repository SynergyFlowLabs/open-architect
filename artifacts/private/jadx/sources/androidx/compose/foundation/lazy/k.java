package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.q3;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    @SourceDebugExtension({"SMAP\nLazyLayoutSemanticState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemanticState.kt\nandroidx/compose/foundation/lazy/LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,68:1\n59#2:69\n54#2:71\n90#3:70\n85#3:72\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemanticState.kt\nandroidx/compose/foundation/lazy/LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1\n*L\n60#1:69\n62#1:71\n60#1:70\n62#1:72\n*E\n"})
    public static final class a implements androidx.compose.foundation.lazy.layout.q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1 f17214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f17215b;

        a(j1 j1Var, boolean z10) {
            this.f17214a = j1Var;
            this.f17215b = z10;
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public float b() {
            return androidx.compose.foundation.lazy.layout.r1.b(this.f17214a.E(), this.f17214a.F());
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public int c() {
            return this.f17214a.K().f() + this.f17214a.K().b();
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public Object d(int i10, kotlin.coroutines.d<? super Unit> dVar) {
            Object objF0 = j1.f0(this.f17214a, i10, 0, dVar, 2, null);
            return objF0 == kotlin.coroutines.intrinsics.b.l() ? objF0 : Unit.f312394a;
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public float e() {
            return androidx.compose.foundation.lazy.layout.r1.a(this.f17214a.E(), this.f17214a.F(), this.f17214a.f());
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public androidx.compose.ui.semantics.b f() {
            return this.f17215b ? new androidx.compose.ui.semantics.b(this.f17214a.K().c(), 1) : new androidx.compose.ui.semantics.b(1, this.f17214a.K().c());
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public int g() {
            return (int) (this.f17214a.K().getOrientation() == q3.Vertical ? this.f17214a.K().a() & com.rabbitmq.client.k0.f265952a : this.f17214a.K().a() >> 32);
        }
    }

    @NotNull
    public static final androidx.compose.foundation.lazy.layout.q1 a(@NotNull j1 j1Var, boolean z10) {
        return new a(j1Var, z10);
    }
}
