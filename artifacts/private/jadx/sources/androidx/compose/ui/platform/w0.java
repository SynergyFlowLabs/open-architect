package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(29)
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w0 f40919a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40920b = 0;

    private w0() {
    }

    public final int a(@NotNull AccessibilityManager accessibilityManager, int i10, int i11) {
        return accessibilityManager.getRecommendedTimeoutMillis(i10, i11);
    }
}
