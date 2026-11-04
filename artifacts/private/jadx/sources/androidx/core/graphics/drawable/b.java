package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    @NotNull
    public static final ColorDrawable a(@androidx.annotation.l int i10) {
        return new ColorDrawable(i10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    @NotNull
    public static final ColorDrawable b(@NotNull Color color) {
        return new ColorDrawable(color.toArgb());
    }
}
