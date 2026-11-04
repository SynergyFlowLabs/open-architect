package androidx.compose.ui.semantics;

import android.graphics.Region;
import androidx.compose.ui.graphics.c3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Region f41141a = new Region();

    @Override // androidx.compose.ui.semantics.f0
    public boolean a(@NotNull f0 f0Var) {
        Region region = this.f41141a;
        Intrinsics.checkNotNull(f0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticRegionImpl");
        return region.op(((m) f0Var).f41141a, Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.semantics.f0
    public boolean b(@NotNull androidx.compose.ui.unit.s sVar) {
        return this.f41141a.op(sVar.t(), sVar.B(), sVar.x(), sVar.j(), Region.Op.DIFFERENCE);
    }

    @Override // androidx.compose.ui.semantics.f0
    public void c(@NotNull androidx.compose.ui.unit.s sVar) {
        this.f41141a.set(sVar.t(), sVar.B(), sVar.x(), sVar.j());
    }

    @NotNull
    public final Region d() {
        return this.f41141a;
    }

    @Override // androidx.compose.ui.semantics.f0
    @NotNull
    public androidx.compose.ui.unit.s getBounds() {
        return c3.d(this.f41141a.getBounds());
    }

    @Override // androidx.compose.ui.semantics.f0
    public boolean isEmpty() {
        return this.f41141a.isEmpty();
    }
}
