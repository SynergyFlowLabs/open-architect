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
public final class BlockInnerShadowElement extends e1<c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37219e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q3 f37220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<s, Unit> f37221d;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockInnerShadowElement(@NotNull q3 q3Var, @NotNull Function1<? super s, Unit> function1) {
        this.f37220c = q3Var;
        this.f37221d = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockInnerShadowElement)) {
            return false;
        }
        BlockInnerShadowElement blockInnerShadowElement = (BlockInnerShadowElement) obj;
        return Intrinsics.areEqual(this.f37220c, blockInnerShadowElement.f37220c) && this.f37221d == blockInnerShadowElement.f37221d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f37220c.hashCode() * 31) + this.f37221d.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("innerShadow");
        t2Var.b().c("shape", this.f37220c);
        t2Var.b().c("block", this.f37221d);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.f37220c, this.f37221d);
    }

    @NotNull
    public final Function1<s, Unit> m() {
        return this.f37221d;
    }

    @NotNull
    public final q3 n() {
        return this.f37220c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull c cVar) {
        cVar.z9(this.f37220c, this.f37221d);
    }
}
