package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(28)
final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o0 f41414a = new o0();

    private o0() {
    }

    @oj.n
    public static final void a(@NotNull StaticLayout.Builder builder, boolean z10) {
        builder.setUseLineSpacingFromFallbacks(z10);
    }
}
