package androidx.compose.material;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ud f25170a = new ud();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f25171b = 0;

    private ud() {
    }

    @NotNull
    public final androidx.compose.material.ripple.l a(long j10, boolean z10) {
        if (z10) {
            return ((double) androidx.compose.ui.graphics.s0.r(j10)) > 0.5d ? wd.f25388d : wd.f25389e;
        }
        return wd.f25390f;
    }

    public final long b(long j10, boolean z10) {
        return (z10 || ((double) androidx.compose.ui.graphics.s0.r(j10)) >= 0.5d) ? j10 : androidx.compose.ui.graphics.q0.f38131b.w();
    }
}
