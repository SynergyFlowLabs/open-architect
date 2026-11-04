package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(26)
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i0 f40508a = new i0();

    private i0() {
    }

    @androidx.annotation.w0(26)
    @NotNull
    public final Typeface a(@NotNull Context context, int i10) {
        return context.getResources().getFont(i10);
    }
}
