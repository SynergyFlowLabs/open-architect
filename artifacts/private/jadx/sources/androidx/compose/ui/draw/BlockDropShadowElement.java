package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class BlockDropShadowElement extends e1<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37216e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q3 f37217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<q, Unit> f37218d;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockDropShadowElement(@NotNull q3 q3Var, @NotNull Function1<? super q, Unit> function1) {
        this.f37217c = q3Var;
        this.f37218d = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockDropShadowElement)) {
            return false;
        }
        BlockDropShadowElement blockDropShadowElement = (BlockDropShadowElement) obj;
        return Intrinsics.areEqual(this.f37217c, blockDropShadowElement.f37217c) && this.f37218d == blockDropShadowElement.f37218d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f37217c.hashCode() * 31) + this.f37218d.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("dropShadow");
        t2Var.b().c("shape", this.f37217c);
        t2Var.b().c("block", this.f37218d);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this.f37217c, this.f37218d);
    }

    @NotNull
    public final Function1<q, Unit> m() {
        return this.f37218d;
    }

    @NotNull
    public final q3 n() {
        return this.f37217c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull b bVar) {
        bVar.z9(this.f37217c, this.f37218d);
    }
}
