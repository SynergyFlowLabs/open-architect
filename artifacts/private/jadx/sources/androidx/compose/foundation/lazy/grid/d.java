package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridSlotCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,653:1\n1#2:654\n*E\n"})
final class d implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.d, androidx.compose.ui.unit.b, k1> f16785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16786b = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f16787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private k1 f16788d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Function2<? super androidx.compose.ui.unit.d, ? super androidx.compose.ui.unit.b, k1> function2) {
        this.f16785a = function2;
    }

    @Override // androidx.compose.foundation.lazy.grid.l1
    @NotNull
    public k1 a(@NotNull androidx.compose.ui.unit.d dVar, long j10) {
        if (this.f16788d != null && androidx.compose.ui.unit.b.g(this.f16786b, j10) && this.f16787c == dVar.getDensity()) {
            k1 k1Var = this.f16788d;
            Intrinsics.checkNotNull(k1Var);
            return k1Var;
        }
        this.f16786b = j10;
        this.f16787c = dVar.getDensity();
        k1 k1VarInvoke = this.f16785a.invoke(dVar, androidx.compose.ui.unit.b.a(j10));
        this.f16788d = k1VarInvoke;
        return k1VarInvoke;
    }
}
