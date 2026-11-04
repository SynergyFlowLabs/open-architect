package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(33)
final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v0 f41440a = new v0();

    private v0() {
    }

    @oj.n
    public static final boolean a(@NotNull StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    @oj.n
    public static final void b(@NotNull StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(u0.a().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
