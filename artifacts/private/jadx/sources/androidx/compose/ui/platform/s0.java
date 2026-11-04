package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(34)
final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s0 f40877a = new s0();

    private s0() {
    }

    public final float a(@NotNull ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public final float b(@NotNull ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }
}
