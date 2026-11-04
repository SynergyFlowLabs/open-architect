package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w0 f41762a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41763b = 0;

    private w0() {
    }

    public final int a(@NotNull Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return x0.f41768a.a(context);
        }
        return 0;
    }
}
