package androidx.compose.ui.graphics;

import androidx.compose.runtime.m5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class p1 implements m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o1 f38100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.layer.c f38101b;

    public p1(@NotNull o1 o1Var) {
        this.f38100a = o1Var;
        this.f38101b = o1Var.b();
    }

    @NotNull
    public final androidx.compose.ui.graphics.layer.c a() {
        return this.f38101b;
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        this.f38100a.c(this.f38101b);
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        this.f38100a.c(this.f38101b);
    }
}
