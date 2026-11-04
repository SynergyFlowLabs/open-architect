package androidx.compose.ui;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class SensitiveNodeElement extends e1<f0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36926c;

    public SensitiveNodeElement(boolean z10) {
        this.f36926c = z10;
    }

    public static /* synthetic */ SensitiveNodeElement n(SensitiveNodeElement sensitiveNodeElement, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = sensitiveNodeElement.f36926c;
        }
        return sensitiveNodeElement.m(z10);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveNodeElement) && this.f36926c == ((SensitiveNodeElement) obj).f36926c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return Boolean.hashCode(this.f36926c);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("sensitiveContent");
        t2Var.b().c("isContentSensitive", Boolean.valueOf(this.f36926c));
    }

    public final boolean l() {
        return this.f36926c;
    }

    @NotNull
    public final SensitiveNodeElement m(boolean z10) {
        return new SensitiveNodeElement(z10);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f0 a() {
        return new f0(this.f36926c);
    }

    public final boolean p() {
        return this.f36926c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f0 f0Var) {
        f0Var.z9(this.f36926c);
    }

    @NotNull
    public String toString() {
        return "SensitiveNodeElement(isContentSensitive=" + this.f36926c + ')';
    }
}
