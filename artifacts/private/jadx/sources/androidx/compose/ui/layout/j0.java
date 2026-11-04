package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class j0 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.a2, k0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f39381t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Object f39382s;

    public j0(@NotNull Object obj) {
        this.f39382s = obj;
    }

    @Override // androidx.compose.ui.layout.k0
    @NotNull
    public Object N6() {
        return this.f39382s;
    }

    @Override // androidx.compose.ui.node.a2
    @Nullable
    public Object V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
        return this;
    }

    public void v9(@NotNull Object obj) {
        this.f39382s = obj;
    }
}
