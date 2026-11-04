package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(30)
final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x0 f40951a = new x0();

    private x0() {
    }

    @androidx.annotation.u
    public final boolean a(@NotNull View view) {
        return view.isShowingLayoutBounds();
    }
}
