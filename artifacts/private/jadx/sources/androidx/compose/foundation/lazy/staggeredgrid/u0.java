package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n1#2:513\n*E\n"})
final class u0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.d, androidx.compose.ui.unit.b, v0> f18013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f18014b = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f18015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private v0 f18016d;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(@NotNull Function2<? super androidx.compose.ui.unit.d, ? super androidx.compose.ui.unit.b, v0> function2) {
        this.f18013a = function2;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.a
    @NotNull
    public v0 a(@NotNull androidx.compose.ui.unit.d dVar, long j10) {
        if (this.f18016d != null && androidx.compose.ui.unit.b.g(this.f18014b, j10) && this.f18015c == dVar.getDensity()) {
            v0 v0Var = this.f18016d;
            Intrinsics.checkNotNull(v0Var);
            return v0Var;
        }
        this.f18014b = j10;
        this.f18015c = dVar.getDensity();
        v0 v0VarInvoke = this.f18013a.invoke(dVar, androidx.compose.ui.unit.b.a(j10));
        this.f18016d = v0VarInvoke;
        return v0VarInvoke;
    }
}
