package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(31)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f40389a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40390b = 0;

    private d0() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(31)
    public final void a(@NotNull View view) {
        view.clearViewTranslationCallback();
    }

    @androidx.annotation.u
    @androidx.annotation.w0(31)
    public final void b(@NotNull View view) {
        view.setViewTranslationCallback(a0.a(z.f40983a));
    }
}
