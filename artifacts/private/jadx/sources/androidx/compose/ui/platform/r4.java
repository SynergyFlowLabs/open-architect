package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(28)
final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r4 f40819a = new r4();

    private r4() {
    }

    public final void a(@NotNull View view, int i10) {
        view.setOutlineAmbientShadowColor(i10);
    }

    public final void b(@NotNull View view, int i10) {
        view.setOutlineSpotShadowColor(i10);
    }
}
