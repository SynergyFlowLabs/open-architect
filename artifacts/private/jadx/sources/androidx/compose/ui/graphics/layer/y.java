package androidx.compose.ui.graphics.layer;

import android.view.View;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(28)
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y f38029a = new y();

    private y() {
    }

    public final void a(@NotNull View view) {
        view.resetPivot();
    }

    public final void b(@NotNull View view, int i10) {
        view.setOutlineAmbientShadowColor(i10);
    }

    public final void c(@NotNull View view, int i10) {
        view.setOutlineSpotShadowColor(i10);
    }
}
