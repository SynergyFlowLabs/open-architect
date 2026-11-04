package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l2 f40642a = new l2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40643b = 0;

    private l2() {
    }

    public final boolean a(@NotNull Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }
}
