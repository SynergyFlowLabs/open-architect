package androidx.compose.ui.text.font;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(31)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x0 f41768a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41769b = 0;

    private x0() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(31)
    public final int a(@NotNull Context context) {
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }
}
