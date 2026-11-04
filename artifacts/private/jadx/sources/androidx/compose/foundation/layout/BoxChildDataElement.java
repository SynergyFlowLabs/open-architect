package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends androidx.compose.ui.node.e1<u> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f15781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15783e;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(@NotNull androidx.compose.ui.e eVar, boolean z10, @NotNull Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15781c = eVar;
        this.f15782d = z10;
        this.f15783e = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && Intrinsics.areEqual(this.f15781c, boxChildDataElement.f15781c) && this.f15782d == boxChildDataElement.f15782d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f15781c.hashCode() * 31) + Boolean.hashCode(this.f15782d);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15783e.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public u a() {
        return new u(this.f15781c, this.f15782d);
    }

    @NotNull
    public final androidx.compose.ui.e m() {
        return this.f15781c;
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> n() {
        return this.f15783e;
    }

    public final boolean o() {
        return this.f15782d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull u uVar) {
        uVar.y9(this.f15781c);
        uVar.z9(this.f15782d);
    }
}
