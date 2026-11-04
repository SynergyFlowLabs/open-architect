package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.lazy.layout.q1;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    @SourceDebugExtension({"SMAP\nLazyLayoutSemanticState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemanticState.kt\nandroidx/compose/foundation/pager/LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,56:1\n59#2:57\n54#2:59\n90#3:58\n85#3:60\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemanticState.kt\nandroidx/compose/foundation/pager/LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1\n*L\n48#1:57\n50#1:59\n48#1:58\n50#1:60\n*E\n"})
    public static final class a implements q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f18351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18352b;

        a(i1 i1Var, boolean z10) {
            this.f18351a = i1Var;
            this.f18352b = z10;
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public float b() {
            return y0.a(this.f18351a);
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public int c() {
            return this.f18351a.M().f() + this.f18351a.M().b();
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public Object d(int i10, kotlin.coroutines.d<? super Unit> dVar) {
            Object objX0 = i1.x0(this.f18351a, i10, 0.0f, dVar, 2, null);
            return objX0 == kotlin.coroutines.intrinsics.b.l() ? objX0 : Unit.f312394a;
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public float e() {
            return m1.l(this.f18351a.M(), this.f18351a.V());
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public androidx.compose.ui.semantics.b f() {
            return this.f18352b ? new androidx.compose.ui.semantics.b(this.f18351a.V(), 1) : new androidx.compose.ui.semantics.b(1, this.f18351a.V());
        }

        @Override // androidx.compose.foundation.lazy.layout.q1
        public int g() {
            return (int) (this.f18351a.M().getOrientation() == q3.Vertical ? this.f18351a.M().a() & com.rabbitmq.client.k0.f265952a : this.f18351a.M().a() >> 32);
        }
    }

    @NotNull
    public static final q1 a(@NotNull i1 i1Var, boolean z10) {
        return new a(i1Var, z10);
    }
}
