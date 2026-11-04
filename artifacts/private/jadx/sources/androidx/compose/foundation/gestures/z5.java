package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
final class z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z5 f15489a = new z5();

    private z5() {
    }

    public final float a(@NotNull ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public final float b(@NotNull ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
