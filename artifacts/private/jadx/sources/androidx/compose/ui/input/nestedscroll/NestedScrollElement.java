package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class NestedScrollElement extends e1<d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f38920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final b f38921d;

    public NestedScrollElement(@NotNull a aVar, @Nullable b bVar) {
        this.f38920c = aVar;
        this.f38921d = bVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return Intrinsics.areEqual(nestedScrollElement.f38920c, this.f38920c) && Intrinsics.areEqual(nestedScrollElement.f38921d, this.f38921d);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = this.f38920c.hashCode() * 31;
        b bVar = this.f38921d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("nestedScroll");
        t2Var.b().c("connection", this.f38920c);
        t2Var.b().c("dispatcher", this.f38921d);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(this.f38920c, this.f38921d);
    }

    @NotNull
    public final a m() {
        return this.f38920c;
    }

    @Nullable
    public final b n() {
        return this.f38921d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull d dVar) {
        dVar.H9(this.f38920c, this.f38921d);
    }
}
