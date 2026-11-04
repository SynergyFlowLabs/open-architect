package androidx.compose.ui.focus;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusPropertiesElement extends e1<e0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f37357c;

    public FocusPropertiesElement(@NotNull f0 f0Var) {
        this.f37357c = f0Var;
    }

    public static /* synthetic */ FocusPropertiesElement n(FocusPropertiesElement focusPropertiesElement, f0 f0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = focusPropertiesElement.f37357c;
        }
        return focusPropertiesElement.m(f0Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && Intrinsics.areEqual(this.f37357c, ((FocusPropertiesElement) obj).f37357c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f37357c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("focusProperties");
        t2Var.b().c("scope", this.f37357c);
    }

    @NotNull
    public final f0 l() {
        return this.f37357c;
    }

    @NotNull
    public final FocusPropertiesElement m(@NotNull f0 f0Var) {
        return new FocusPropertiesElement(f0Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e0 a() {
        return new e0(this.f37357c);
    }

    @NotNull
    public final f0 p() {
        return this.f37357c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull e0 e0Var) {
        e0Var.w9(this.f37357c);
    }

    @NotNull
    public String toString() {
        return "FocusPropertiesElement(scope=" + this.f37357c + ')';
    }
}
