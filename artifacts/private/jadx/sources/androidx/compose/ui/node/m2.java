package androidx.compose.ui.node;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class m2 extends androidx.compose.ui.a0.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f39912t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f39913s;

    public m2() {
        k9(0);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        this.f39913s = true;
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.f39913s = false;
    }

    @NotNull
    public String toString() {
        return "<tail>";
    }

    public final boolean v9() {
        return this.f39913s;
    }

    public final void w9(boolean z10) {
        this.f39913s = z10;
    }
}
