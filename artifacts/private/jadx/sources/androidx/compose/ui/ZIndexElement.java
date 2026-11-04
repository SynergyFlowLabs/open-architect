package androidx.compose.ui;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class ZIndexElement extends e1<j0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36927d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f36928c;

    public ZIndexElement(float f10) {
        this.f36928c = f10;
    }

    public static /* synthetic */ ZIndexElement n(ZIndexElement zIndexElement, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = zIndexElement.f36928c;
        }
        return zIndexElement.m(f10);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ZIndexElement) && Float.compare(this.f36928c, ((ZIndexElement) obj).f36928c) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return Float.hashCode(this.f36928c);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("zIndex");
        t2Var.b().c("zIndex", Float.valueOf(this.f36928c));
    }

    public final float l() {
        return this.f36928c;
    }

    @NotNull
    public final ZIndexElement m(float f10) {
        return new ZIndexElement(f10);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public j0 a() {
        return new j0(this.f36928c);
    }

    public final float p() {
        return this.f36928c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull j0 j0Var) {
        j0Var.w9(this.f36928c);
    }

    @NotNull
    public String toString() {
        return "ZIndexElement(zIndex=" + this.f36928c + ')';
    }
}
